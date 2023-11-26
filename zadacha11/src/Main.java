import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Order baseOrder = new Order("Товар", 100.0);
        baseOrder.displayOrderDetails();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1.клонировать заказ с адресом ");
            System.out.println("2.изменить адрес");
            System.out.println("3.клонировать адрес ");
            System.out.println("4.просмотреть клонированные адреса");
            System.out.println("5.выход");

            System.out.print("ваще действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Order clonedOrder = baseOrder.clone();
                    clonedOrder.displayOrderDetails();
                    break;
                case 2:
                    System.out.print("введите новый адрес ");
                    String newAddress = scanner.nextLine();
                    baseOrder.setDeliveryAddress(newAddress);
                    System.out.println("адрес изменен");
                    break;
                case 3:
                    String clonedAddress = baseOrder.getDeliveryAddress();
                    baseOrder.addClonedAddress(clonedAddress);
                    System.out.println("адрес клонирован");
                    break;
                case 4:
                    System.out.println("прошлые адреса:");
                    baseOrder.displayClonedAddresses();
                    break;
                case 5:
                    System.out.println("выход ");
                    return;
                default:
                    System.out.println("неверно");
                    break;
            }
        }
    }
}