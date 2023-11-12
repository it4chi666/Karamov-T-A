import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class ChineseKitchen implements Kitchen {
    private List<Dish> dishes = new ArrayList<>();

    public ChineseKitchen() {
        dishes.add(new Dish("Вок", 250.0)); //блюдо которое будет всегда
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
        System.out.println("Китайские блюда:");
        for (int i = 0; i < dishes.size(); i++) {
            Dish dish = dishes.get(i);
            System.out.println(i + ": " + dish.getName() + " - руб. " + dish.getPrice());
        }
    }
}
