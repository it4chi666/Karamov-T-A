class Bicycle extends Transport {
    private boolean moving = false;

    @Override
    void startEngine() {
        System.out.println("У велосипеда нет двигателя");
    }

    @Override
    void accelerate() {
        if (!moving) {
            moving = true;
            System.out.println("Велосипед начал двигаться");
        } else {
            System.out.println("Велосипед уже движется");
        }
    }

    @Override
    void stop() {
        if (moving) {
            moving = false;
            System.out.println("Велосипед остановлен");
        } else {
            System.out.println("Велосипед уже остановлен");
        }
    }

    @Override
    void getStatus() {
        System.out.println("Статус :");
        System.out.println("Движется: " + moving);
    }
}