class SmartLock extends Device {
    private boolean isLocked;
    private boolean isOn;

    @Override
    void turnOn() {
        isOn = true;
        System.out.println("умный замок активен");
    }

    @Override
    void turnOff() {
        isOn = false;
        System.out.println("умный замок выключен");
    }

    public void lock() {
        isLocked = true;
        System.out.println("дверь закрыта");
    }

    public void unlock() {
        isLocked = false;
        System.out.println("дверь открыта");
    }

    @Override
    void getStatus() {
        System.out.println("статус:");
        System.out.println("состояние замка: " + (isLocked ? "заперто" : "разблокировано"));
        System.out.println("состояние устройства: " + (isOn ? "включено" : "выключено"));
    }
}