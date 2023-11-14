abstract class MobileDevice {
    protected OS mobileOS;
    protected boolean isLocked = false;

    public MobileDevice(OS mobileOS) {
        this.mobileOS = mobileOS;
    }


    abstract void lock();

    abstract void unlock();

    boolean isLocked() {
        return isLocked;
    }

    void setLocked(boolean locked) {
        isLocked = locked;
    }

    void displayStatus() {
        System.out.println("устройство: " + (isLocked ? "заблокировано" : "разблокировано"));
    }
}