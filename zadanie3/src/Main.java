import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MobileDevice smartphoneIOS = new Smartphone(new IOS());
        MobileDevice tabletAndroid = new Tablet(new Android());
        MobileDevice smartphoneHarmonyOS = new Smartphone(new HarmonyOS());

        while (true) {
            System.out.println("Выберите устройство (1 - Смартфон iOS, 2 - Планшет Android, 3 - Смартфон HarmonyOS):");
            int choice = scanner.nextInt();

            MobileDevice mobileDevice = null;

            switch (choice) {
                case 1:
                    mobileDevice = smartphoneIOS;
                    break;
                case 2:
                    mobileDevice = tabletAndroid;
                    break;
                case 3:
                    mobileDevice = smartphoneHarmonyOS;
                    break;
                default:
                    System.out.println("неправильный выбор");
                    continue;
            }

            while (true) {
                mobileDevice.displayStatus();
                System.out.println("выберите действие (1 - заблокировать, 2 - разблокировать, 3 - Выйти):");
                int action = scanner.nextInt();

                switch (action) {
                    case 1:
                        mobileDevice.lock();
                        break;
                    case 2:
                        mobileDevice.unlock();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("неправильный выбор");
                }

                if (action == 3) {
                    break;
                }
            }

            System.out.println("продолжить управление другим устройством? (1 - да, 2 - нет):");
            int continueOption = scanner.nextInt();

            if (continueOption != 1) {
                break;
            }
        }
    }
}