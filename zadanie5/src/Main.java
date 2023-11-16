import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        EmailSender sender = new EmailSender();
        EmailSubscriber subscriber1 = new EmailSubscriber("Наблюдатель 1");
        EmailSubscriber subscriber2 = new EmailSubscriber("Наблюдатель 2");

        sender.addObserver(subscriber1);
        sender.addObserver(subscriber2);

        while (true) {
            System.out.println("\n----- Система уведомлений -----");
            System.out.println("1. Отправить письмо");
            System.out.println("2. Просмотреть отправленные письма");
            System.out.println("3. Выход");
            System.out.print("Выберите опцию: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите адрес получателя: ");
                    String recipientEmail = scanner.nextLine();
                    System.out.print("Содержание письма: ");
                    String content = scanner.nextLine();
                    sender.sendEmail(recipientEmail, content);
                    break;
                case 2:
                    sender.printEmailHistory();
                    break;
                case 3:
                    System.out.println("Заверщение программы");
                    return;
                default:
                    System.out.println("Неверный выбор");
                    break;
            }
        }
    }
}
