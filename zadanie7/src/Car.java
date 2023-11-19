import java.util.List;

class Car {
    private String brand;
    private String model;
    private String color;
    private List<String> additionalOptions;

    public Car(String brand, String model, String color, List<String> additionalOptions) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.additionalOptions = additionalOptions;
    }

    @Override
    public String toString() {
        StringBuilder options = new StringBuilder();
        for (String option : additionalOptions) {
            options.append("- ").append(option).append("\n");
        }
        return "Авто: " + brand + " " + model + ", Цвет: " + color + "\nДоп. функции:\n" + options;
    }
}