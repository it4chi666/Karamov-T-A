class AirConditioner extends Device {
    private int temperature;
    private boolean isOn;

    @Override
    void turnOn() {
        isOn = true;
        System.out.println("кондиционер активирован");
    }

    @Override
    void turnOff() {
        isOn = false;
        System.out.println("кондиционер выключен");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("температура установлена на " + temperature + "°C");
    }

    @Override
    void getStatus() {
        System.out.println("статус:");
        System.out.println("состояние кондиционера: " + (isOn ? "вкл" : "выкл"));
        System.out.println("температура: " + temperature + "°C");
    }
}