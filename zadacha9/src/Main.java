import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ResourceManager resourceManager = ResourceManager.getInstance();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1.загрузить файл");
            System.out.println("2.получить файл");
            System.out.println("3.Выход");

            System.out.print("выберать действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("введите ключ для файла: ");
                    String key = scanner.nextLine();
                    System.out.println("выбрать тип файла: 1 - звук, 2 - шрифт, 3 - изображение");
                    int resourceType = scanner.nextInt();
                    scanner.nextLine();
                    if (resourceType == 1) {
                        System.out.print("введите название звука: ");
                        String soundName = scanner.nextLine();
                        byte[] soundData = {1, 2, 3};
                        Sound sound = new Sound(soundName, soundData);
                        resourceManager.loadResource(key, sound);
                    } else if (resourceType == 2) {
                        System.out.print("введите название шрифта: ");
                        String fontName = scanner.nextLine();
                        System.out.print("введите размер шрифта: ");
                        int fontSize = scanner.nextInt();
                        Font font = new Font(fontName, fontSize);
                        resourceManager.loadResource(key, font);
                    } else if (resourceType == 3) {
                        System.out.print("введите название изображения: ");
                        String imageName = scanner.nextLine();
                        byte[] imageData = {4, 5, 6};
                        Image image = new Image(imageName, imageData);
                        resourceManager.loadResource(key, image);
                    } else {
                        System.out.println("неверный выбор.");
                    }
                    break;
                case 2:
                    System.out.print("введите ключ для получения файла: ");
                    String getResourceKey = scanner.nextLine();
                    Object resource = resourceManager.getResource(getResourceKey);
                    if (resource != null) {
                        if (resource instanceof Sound) {
                            System.out.println("это звук: " + ((Sound) resource).getSoundName());
                        } else if (resource instanceof Font) {
                            System.out.println("это шрифт: " + ((Font) resource).getFontName());
                        } else if (resource instanceof Image) {
                            System.out.println("это изображение: " + ((Image) resource).getImageName());
                        } else {
                            System.out.println("неизвестный тип файла.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("выход");
                    return;
                default:
                    System.out.println("неверный выбор.");
                    break;
            }
        }
    }
}