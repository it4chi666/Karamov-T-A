import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NetworkProtocol httpAdapter = new HTTPAdapter();
        NetworkProtocol ftpAdapter = new FTPAdapter();
        NetworkProtocol smtpAdapter = new SMTPAdapter();

        while (true) {
            System.out.println("Выберите протокол:");
            System.out.println("1. HTTP");
            System.out.println("2. FTP");
            System.out.println("3. SMTP");
            System.out.println("4. Выйти");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    operateProtocol(httpAdapter, scanner);
                    break;
                case 2:
                    operateProtocol(ftpAdapter, scanner);
                    break;
                case 3:
                    operateProtocol(smtpAdapter, scanner);
                    break;
                case 4:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("неверный выбор");
            }
        }
    }

    private static void operateProtocol(NetworkProtocol protocol, Scanner scanner) {
        System.out.println("хост (например, pr.com):");
        String host = scanner.next();
        System.out.println("порт (например, 80):");
        int port = scanner.nextInt();

        protocol.connect(host, port);

        System.out.println("введите данные:");
        String data = scanner.next();

        protocol.send(data);

        protocol.disconnect();
    }

    private static void operateSMTPProtocol(NetworkProtocol protocol, Scanner scanner) {
        System.out.println("введите хост SMTP:");
        String host = scanner.next();
        System.out.println("введите порт SMTP(например, 25):");
        int port = scanner.nextInt();

        protocol.connect(host, port);

        System.out.println("введите адрес электронной почты отправителя :");
        String senderEmail = scanner.next();

        System.out.println("введите адрес электронной почты получателя :");
        String recipientEmail = scanner.next();

        System.out.println("введите тему письма:");
        String subject = scanner.next();

        System.out.println("введите текст письма:");
        String body = scanner.next();

        String emailData = senderEmail + ":" + recipientEmail + ":" + subject + ":" + body;
        protocol.send(emailData);

        protocol.disconnect();
    }
}