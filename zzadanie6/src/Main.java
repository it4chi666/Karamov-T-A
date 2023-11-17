import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        Device currentDevice = null;

        do {
            System.out.println("Выберите устройство:");
            System.out.println("1. лампа");
            System.out.println("2. кондиционер");
            System.out.println("3. умный замок");
            System.out.println("0. Выйти");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    currentDevice = new SmartLamp();
                    break;
                case 2:
                    currentDevice = new AirConditioner();
                    break;
                case 3:
                    currentDevice = new SmartLock();
                    break;
                case 0:
                    System.out.println("выход");
                    break;
                default:
                    System.out.println("неверно");
                    break;
            }

            if (currentDevice != null) {
                if (currentDevice instanceof SmartLamp) {
                    int actionChoice;
                    do {
                        System.out.println("выберите действие для лампы:");
                        System.out.println("1. Вклю устройство");
                        System.out.println("2. Выкл устройство");
                        System.out.println("3. Установить яркость");
                        System.out.println("4. статус");
                        System.out.println("0. Выйти из текущего меню");

                        actionChoice = scanner.nextInt();

                        switch (actionChoice) {
                            case 1:
                                currentDevice.turnOn();
                                break;
                            case 2:
                                currentDevice.turnOff();
                                break;
                            case 3:
                                System.out.println("Уточните яркость (от 0 до 100):");
                                int brightness = scanner.nextInt();
                                ((SmartLamp) currentDevice).setBrightness(brightness);
                                break;
                            case 4:
                                currentDevice.getStatus();
                                break;
                            case 0:
                                System.out.println("Выход из меню");
                                break;
                            default:
                                System.out.println("неверно");
                                break;
                        }
                    } while (actionChoice != 0);
                } else if (currentDevice instanceof AirConditioner) {
                    int actionChoice;
                    do {
                        System.out.println("Выберите действие для кондиционера:");
                        System.out.println("1. Вкл устройство");
                        System.out.println("2. Выкл устройство");
                        System.out.println("3. Выбрать температуру");
                        System.out.println("4. статус");
                        System.out.println("0. Выйти из текущего меню");

                        actionChoice = scanner.nextInt();

                        switch (actionChoice) {
                            case 1:
                                currentDevice.turnOn();
                                break;
                            case 2:
                                currentDevice.turnOff();
                                break;
                            case 3:
                                System.out.println("введите температуру:");
                                int temperature = scanner.nextInt();
                                ((AirConditioner) currentDevice).setTemperature(temperature);
                                break;
                            case 4:
                                currentDevice.getStatus();
                                break;
                            case 0:
                                System.out.println("выход из текущего устройства");
                                break;
                            default:
                                System.out.println("Неверо");
                                break;
                        }
                    } while (actionChoice != 0);
                } else if (currentDevice instanceof SmartLock) {
                    int actionChoice;
                    do {
                        System.out.println("выберите действие для замка:");
                        System.out.println("1. Вкл устройство");
                        System.out.println("2. Выкл устройство");
                        System.out.println("3. Закрыть дверь");
                        System.out.println("4. Открыть дверь");
                        System.out.println("5. статус");
                        System.out.println("0. Выйти из текущего меню");

                        actionChoice = scanner.nextInt();

                        switch (actionChoice) {
                            case 1:
                                currentDevice.turnOn();
                                break;
                            case 2:
                                currentDevice.turnOff();
                                break;
                            case 3:
                                ((SmartLock) currentDevice).lock();
                                break;
                            case 4:
                                ((SmartLock) currentDevice).unlock();
                                break;
                            case 5:
                                currentDevice.getStatus();
                                break;
                            case 0:
                                System.out.println("выход из текущего меню");
                                break;
                            default:
                                System.out.println("Неверно");
                                break;
                        }
                    } while (actionChoice != 0);
                }
            }

        } while (choice != 0);

        scanner.close();
    }
}