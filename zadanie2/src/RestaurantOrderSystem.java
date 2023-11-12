import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class RestaurantOrderSystem {
    private Menu menu;
    private Order currentOrder;

    public RestaurantOrderSystem() {
        menu = new Menu();
        currentOrder = new Order();
    }

    public void startOrderingProcess(Scanner scanner) {
        while (true) {
            System.out.println("1: Показать меню, 2: Добавить блюдо, 3: Добавить блюдо в заказ, 99: Перейти в корзину");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showFullMenu();
                    break;
                case 2:
                    addDishToKitchen(scanner);
                    break;
                case 3:
                    orderDish(scanner);
                    break;
                case 99:
                    currentOrder.showOrder();
                    return;
            }
        }
    }
    private void showFullMenu() {
        menu.displayMenu();
        int kitchenChoice = new Scanner(System.in).nextInt();
        Kitchen kitchen = menu.getKitchen(kitchenChoice);
        if (kitchen != null) {
            kitchen.displayDishes();
        }
    }

    private void addDishToKitchen(Scanner scanner) {
        menu.displayMenu();
        System.out.println("Выберите кухню для добавления:");
        int kitchenChoice = scanner.nextInt();
        Kitchen kitchen = menu.getKitchen(kitchenChoice);

        if (kitchen != null) {
            System.out.println("Выберите название:");
            String name = scanner.next();
            System.out.println("Укажите цену:");
            double price = scanner.nextDouble();
            kitchen.addDish(name, price);
        }
    }

    private void orderDish(Scanner scanner) {
        menu.displayMenu();
        System.out.println("Выберите кухню, из которой вы хотите заказать блюдо:");
        int kitchenChoice = scanner.nextInt();
        Kitchen kitchen = menu.getKitchen(kitchenChoice);

        if (kitchen != null) {
            kitchen.displayDishes();
            System.out.println("Выберите блюдо для заказа:");
            int dishChoice = scanner.nextInt();
            Dish dish = kitchen.getDish(dishChoice);
            if (dish != null) {
                currentOrder.addDish(dish);
            }
        }
    }
}
