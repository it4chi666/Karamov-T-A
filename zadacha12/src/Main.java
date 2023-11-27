import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        VideoPlayerManager manager = new VideoPlayerManager();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Меню:");
            System.out.println("1.создать новую папку");
            System.out.println("2.добавить файл в папку");
            System.out.println("3.просмотр папки");
            System.out.println("4.создать подпапку");
            System.out.println("5.просмотр всех папок и файлов");
            System.out.println("6.создать файл в папке");
            System.out.println("7.просмотр файлов в папке");
            System.out.println("8.выход");
            System.out.print("действие: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("введите название папки: ");
                    String folderName = scanner.next();
                    manager.createFolder(folderName);
                    break;
                case 2:
                    System.out.print("введите название файла: ");
                    String videoName = scanner.next();
                    System.out.print("введите название папки для добавления видео: ");
                    String folderToAdd = scanner.next();
                    manager.addVideoToFolder(videoName, folderToAdd);
                    break;
                case 3:
                    System.out.print("введите название папки для просмотра ее содержимого: ");
                    String folderToDisplay = scanner.next();
                    manager.displayFolderContents(folderToDisplay);
                    break;
                case 4:
                    System.out.print("введите название папки, в которой создается подпапка: ");
                    String parentFolder = scanner.next();
                    System.out.print("введите название подпапки: ");
                    String subFolder = scanner.next();
                    manager.createSubFolder(parentFolder, subFolder);
                    break;
                case 5:
                    manager.displayAllContents();
                    break;
                case 6:
                    System.out.print("введите название файла: ");
                    String fileName = scanner.next();
                    System.out.print("введите название папки для добавления файла: ");
                    String fileFolder = scanner.next();
                    manager.createFile(fileName, fileFolder);
                    break;
                case 7:
                    System.out.print("введите название папки для просмотра файлов: ");
                    String folderToDisplayFiles = scanner.next();
                    manager.displayFilesInFolder(folderToDisplayFiles);
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("неверно");
            }
        }

        scanner.close();
    }
}