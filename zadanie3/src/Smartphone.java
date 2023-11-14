class Smartphone extends MobileDevice {
    public Smartphone(OS OS) {
        super(OS);
    }
    @Override
    void lock() {
        isLocked = true;
        System.out.println("смартфон заблокирован");
    }

    @Override
    void unlock() {
        isLocked = false;
        System.out.println("смартфон разблокирован");
    }
}