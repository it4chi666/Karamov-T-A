import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarBuilder carBuilder = new CarBuilder();

        while (true) {
            System.out.println("меню:");
            System.out.println("1. укажите марку автом");
            System.out.println("2. задайте модель авто");
            System.out.println("3. укажите цвет авто");
            System.out.println("4. добавть доп. опцию");
            System.out.println("5. посмотреть инфо. об авто");
            System.out.println("6. Выход");

            System.out.print("выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("введите марку авто: ");
                    String brand = scanner.nextLine();
                    carBuilder.setBrand(brand);
                    break;
                case 2:
                    System.out.print("введите модель авто: ");
                    String model = scanner.nextLine();
                    carBuilder.setModel(model);
                    break;
                case 3:
                    System.out.print("выберите цвет автомобиля: ");
                    String color = scanner.nextLine();
                    carBuilder.setColor(color);
                    break;
                case 4:
                    System.out.print("введите доп. опцию: ");
                    String option = scanner.nextLine();
                    carBuilder.addOption(option);
                    break;
                case 5:
                    Car car = carBuilder.build();
                    System.out.println("информация об авто:");
                    System.out.println(car);
                    break;
                case 6:
                    System.out.println("выход.");
                    return;
                default:
                    System.out.println("неверный выбор.");
            }
        }
    }
}