import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ProductFactory clothingFactory = new ClothingFactory();
        ProductFactory electronicsFactory = new ElectronicsFactory();
        ProductFactory footwearFactory = new FootwearFactory();

        Order order = new Order();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Добавить одежду");
            System.out.println("2. Добавить технику");
            System.out.println("3. Добавить обувь");
            System.out.println("4. Просмотреть продукты");
            System.out.println("5. Удалить продукт");
            System.out.println("6. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем перевод строки после числа

            switch (choice) {
                case 1:
                    System.out.println("Введите название одежды: ");
                    String clothingName = scanner.nextLine();

                    System.out.println("Введите цену одежды: ");
                    double clothingPrice = scanner.nextDouble();
                    scanner.nextLine(); // Считываем перевод строки после числа

                    order.addProduct(clothingFactory.createProduct(clothingName, clothingPrice));
                    break;
                case 2:
                    System.out.println("Введите название техники: ");
                    String electronicsName = scanner.nextLine();

                    System.out.println("Введите цену техники: ");
                    double electronicsPrice = scanner.nextDouble();
                    scanner.nextLine(); // Считываем перевод строки после числа

                    order.addProduct(electronicsFactory.createProduct(electronicsName, electronicsPrice));
                    break;
                case 3:
                    System.out.println("Введите название обуви: ");
                    String footwearName = scanner.nextLine();

                    System.out.println("Введите цену обуви: ");
                    double footwearPrice = scanner.nextDouble();
                    scanner.nextLine(); // Считываем перевод строки после числа

                    order.addProduct(footwearFactory.createProduct(footwearName, footwearPrice));
                    break;
                case 4:
                    order.displayProducts();
                    break;
                case 5:
                    System.out.println("Введите индекс продукта для удаления: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Считываем перевод строки после числа
                    order.removeProduct(index - 1); // Индексы начинаются с 1
                    break;
                case 6:
                    System.out.println("Total Price: " + order.getTotalPrice());
                    System.exit(0);
                default:
                    System.out.println("Некорректный выбор.");
            }
        }
    }
}