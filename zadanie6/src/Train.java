class Train extends Transport {
    private boolean engineStarted = false;
    private boolean moving = false;

    @Override
    void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
            System.out.println("Поезд поехал");
        } else {
            System.out.println("Двигатель поезда уже запущен");
        }
    }

    @Override
    void accelerate() {
        if (engineStarted) {
            if (!moving) {
                moving = true;
                System.out.println("Поезд ускоряется");
            } else {
                System.out.println("Поезд уже движется");
            }
        } else {
            System.out.println("Для ускорения нужно запустить двигатель");
        }
    }

    @Override
    void stop() {
        if (moving) {
            moving = false;
            System.out.println("Поезд остановлен");
        } else {
            System.out.println("Поезд уже остановлен");
        }
    }

    @Override
    void getStatus() {
        System.out.println("поезд:");
        System.out.println("Двигатель включен: " + engineStarted);
        System.out.println("Движется: " + moving);
    }
}