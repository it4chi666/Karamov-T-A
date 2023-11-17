import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        Transport currentTransport = null;

        do {
            System.out.println("Выберите вид транспорта:");
            System.out.println("1. автомобиль");
            System.out.println("2. велосипед");
            System.out.println("3. поезд");
            System.out.println("0. выйти");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    currentTransport = new Car();
                    break;
                case 2:
                    currentTransport = new Bicycle();
                    break;
                case 3:
                    currentTransport = new Train();
                    break;
                case 0:
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Невозможно выполнить");
                    break;
            }

            if (currentTransport != null) {
                int actionChoice;
                do {
                    System.out.println("Выберите действие:");
                    System.out.println("1. начать движение");
                    System.out.println("2. ускорение");
                    System.out.println("3. остановиться");
                    System.out.println("4. статус");
                    System.out.println("0. выйти из текущего меню");

                    actionChoice = scanner.nextInt();

                    switch (actionChoice) {
                        case 1:
                            currentTransport.startEngine();
                            break;
                        case 2:
                            currentTransport.accelerate();
                            break;
                        case 3:
                            currentTransport.stop();
                            break;
                        case 4:
                            currentTransport.getStatus();
                            break;
                        case 0:
                            System.out.println("выход из текущего меню");
                            break;
                        default:
                            System.out.println("неверо");
                            break;
                    }
                } while (actionChoice != 0);
            }

        } while (choice != 0);

        scanner.close();
    }
}