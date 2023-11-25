import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelFacade hotelFacade = new HotelFacade();

        while (true) {
            System.out.println("Меню:");
            System.out.println("1.проверить номера");
            System.out.println("2.забронировать номер");
            System.out.println("3.оплата");
            System.out.println("4.выход");

            System.out.print("выбрать действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("введите номер: ");
                    int roomNumber = scanner.nextInt();
                    scanner.nextLine();
                    hotelFacade.checkRoomAvailability(roomNumber);
                    break;
                case 2:
                    System.out.print("введите номер для брони: ");
                    int roomToBook = scanner.nextInt();
                    scanner.nextLine();
                    hotelFacade.bookRoom(roomToBook);
                    break;
                case 3:
                    System.out.println("способ оплаты: 1 - наличными, 2 - картой");
                    int paymentOption = scanner.nextInt();
                    scanner.nextLine();
                    hotelFacade.payForStay(paymentOption);
                    break;
                case 4:
                    System.out.println("выхти");
                    return;
                default:
                    System.out.println("неверно");
                    break;
            }
        }
    }
}