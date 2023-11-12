import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class RussianKitchen implements Kitchen {
    private List<Dish> dishes = new ArrayList<>();

    public RussianKitchen() {
        dishes.add(new Dish("Борщ", 300)); //блюдо которое будет всегда
    }

    @Override
    public void addDish(String name, double price) {
        dishes.add(new Dish(name, price));
    }

    @Override
    public Dish getDish(int index) {
        return index >= 0 && index < dishes.size() ? dishes.get(index) : null;
    }

    @Override
    public void displayDishes() {
        System.out.println("Русские блюда:");
        for (int i = 0; i < dishes.size(); i++) {
            Dish dish = dishes.get(i);
            System.out.println(i + ": " + dish.getName() + " - руб. " + dish.getPrice());
        }
    }
}