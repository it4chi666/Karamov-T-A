import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Dish {
    private String name;
    private double price;

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String serve() {
        return name + " стоимость Руб." + price;
    }
}
