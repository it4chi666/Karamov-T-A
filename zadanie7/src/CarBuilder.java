import java.util.ArrayList;
import java.util.List;
class CarBuilder {
    private String brand;
    private String model;
    private String color;
    private List<String> additionalOptions;

    public CarBuilder() {
        this.additionalOptions = new ArrayList<>();
    }

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder addOption(String option) {
        additionalOptions.add(option);
        return this;
    }

    public Car build() {
        return new Car(brand, model, color, additionalOptions);
    }
}