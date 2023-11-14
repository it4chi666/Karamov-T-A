class Tablet extends MobileDevice {
    public Tablet(OS OS) {
        super(OS);
    }

    @Override
    void lock() {
        isLocked = true;
        System.out.println("планшет заблокирован");
    }

    @Override
    void unlock() {
        isLocked = false;
        System.out.println("планшет разблокирован");
    }
}