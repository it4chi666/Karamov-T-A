class Car extends Transport {
    private boolean engineStarted = false;
    private boolean moving = false;

    @Override
    void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
            System.out.println("Двигатель автомобиля включен");
        } else {
            System.out.println("Двигатель уже включен");
        }
    }
    @Override
    void accelerate() {
        if (engineStarted) {
            if (!moving) {
                moving = true;
                System.out.println("автомобиль движется");
            } else {
                System.out.println("Автомобиль уже движется");
            }
        } else {
            System.out.println("Для ускорения нужно запустить двигатель");
        }
    }

    @Override
    void stop() {
        if (moving) {
            moving = false;
            System.out.println("Автомобиль остановлен");
        } else {
            System.out.println("Автомобиль уже остановлен");
        }
    }

    @Override
    void getStatus() {
        System.out.println("Статус :");
        System.out.println("Двигатель включен: " + engineStarted);
        System.out.println("Движется: " + moving);
    }
}