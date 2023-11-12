import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Order {
    private List<Dish> dishes = new ArrayList<>();
    private double totalCost = 0.0;

    public void addDish(Dish dish) {
        if (dish != null) {
            dishes.add(dish);
            totalCost += dish.getPrice();
            System.out.println("Блюдо добавлено в заказ: " + dish.serve());
        }
    }

    public void showOrder() {
        System.out.println("Ваш заказ:");
        for (Dish dish : dishes) {
            System.out.println(dish.serve());
        }
        System.out.printf("Итоговая цена: %.2f\n", totalCost);
    }
}