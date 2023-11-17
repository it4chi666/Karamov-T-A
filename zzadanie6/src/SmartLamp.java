class SmartLamp extends Device {
    private int brightness;
    private boolean isOn;

    @Override
    void turnOn() {
        isOn = true;
        System.out.println("лампа вкл");
    }

    @Override
    void turnOff() {
        isOn = false;
        System.out.println("лампа выкл");
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println("яркость состовляет " + brightness + "%");
    }

    @Override
    void getStatus() {
        System.out.println("статус:");
        System.out.println("состояние: " + (isOn ? "вкл" : "выкл"));
        System.out.println("яркость: " + brightness);
    }
}