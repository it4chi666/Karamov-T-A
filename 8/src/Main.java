import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameSettings gameSettings = new GameSettings();
        SettingsCaretaker caretaker = new SettingsCaretaker();
        Scanner scanner = new Scanner(System.in);

        boolean exitMenu = false;

        while (!exitMenu) {
            GameMenu.mainMenu();
            System.out.print("действие: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    gameSettings.setGraphicsSettings("высокие");
                    System.out.println("гастройки установлены на высокие.");
                    break;

                case 2:
                    gameSettings.setGraphicsSettings("Средние");
                    System.out.println("настройки установлены на средние");
                    break;

                case 3:
                    gameSettings.setGraphicsSettings("Низкие");
                    System.out.println("настройки графики установлены на низкие");
                    break;

                case 4:
                    caretaker.addMemento(gameSettings.createMemento());
                    System.out.println("настройки сохранены.");
                    break;

                case 5:
                    if (caretaker.getMementos().isEmpty()) {
                        System.out.println("для начала сохраните настройки");
                    } else {
                        gameSettings.restoreFromMemento(caretaker.getMemento(caretaker.getMementos().size() - 1));
                        System.out.println("настройки успешно загружены.");
                    }
                    break;

                case 6:
                    exitMenu = true;
                    System.out.println("выход");
                    break;

                default:
                    System.out.println("некорректный выбор");
                    break;
            }
        }

        scanner.close();
    }
}