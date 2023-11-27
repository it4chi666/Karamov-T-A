import java.util.Scanner;
public class VideoPlayerManager {
    private final VideoComponent rootFolder;
    private final Scanner scanner;

    public VideoPlayerManager() {
        rootFolder = new VideoFolder("файлы");
        scanner = new Scanner(System.in);
    }

    public void playVideos() {
        rootFolder.play();
    }

    public void createFolder(String folderName) {
        VideoFolder newFolder = new VideoFolder(folderName);
        rootFolder.add(newFolder);
        System.out.println("папка '" + folderName + "' создана.");
    }

    public void addVideoToFolder(String videoName, String folderName) {
        VideoFile newVideo = new VideoFile(videoName);
        traverseAndAdd(rootFolder, folderName, newVideo);
    }

    public void createFile(String fileName, String folderName) {
        VideoFile newFile = new VideoFile(fileName);
        traverseAndAdd(rootFolder, folderName, newFile);
        System.out.println("файл '" + fileName + "' создан в папке '" + folderName + "'.");
    }

    private void traverseAndAdd(VideoComponent component, String folderName, VideoComponent videoComponent) {
        if (component instanceof VideoFolder) {
            VideoFolder folder = (VideoFolder) component;
            if (folder.getName().equals(folderName)) {
                folder.add(videoComponent);
                return;
            }
            for (VideoComponent child : folder.getComponents()) {
                traverseAndAdd(child, folderName, videoComponent);
            }
        }
    }

    public void displayFolderContents(String folderName) {
        traverseAndDisplay(rootFolder, folderName);
    }

    private void traverseAndDisplay(VideoComponent component, String folderName) {
        if (component instanceof VideoFolder) {
            VideoFolder folder = (VideoFolder) component;
            if (folder.getName().equals(folderName)) {
                folder.displayContents();
                return;
            }
            for (VideoComponent child : folder.getComponents()) {
                traverseAndDisplay(child, folderName);
            }
        }
    }

    public void displayAllContents() {
        System.out.println("содержимое всех папок и файлов:");
        rootFolder.displayContents();
    }

    public void closeScanner() {
        scanner.close();
    }

    public void displayFilesInFolder(String folderName) {
        traverseAndDisplayFiles(rootFolder, folderName);
    }

    private void traverseAndDisplayFiles(VideoComponent component, String folderName) {
        if (component instanceof VideoFolder) {
            VideoFolder folder = (VideoFolder) component;
            if (folder.getName().equals(folderName)) {
                System.out.println("файлы в папке '" + folderName + "':");
                for (VideoComponent child : folder.getComponents()) {
                    child.displayContents();
                }
                return;
            }
            for (VideoComponent child : folder.getComponents()) {
                traverseAndDisplayFiles(child, folderName);
            }
        }
    }

    public void createSubFolder(String folderName, String subFolderName) {
        traverseAndCreateSubFolder(rootFolder, folderName, subFolderName);
    }

    private void traverseAndCreateSubFolder(VideoComponent component, String folderName, String subFolderName) {
        if (component instanceof VideoFolder) {
            VideoFolder folder = (VideoFolder) component;
            if (folder.getName().equals(folderName)) {
                VideoFolder newSubFolder = new VideoFolder(subFolderName);
                folder.add(newSubFolder);
                System.out.println("подпапка '" + subFolderName + "' создана в папке '" + folderName + "'.");
                return;
            }
            for (VideoComponent child : folder.getComponents()) {
                traverseAndCreateSubFolder(child, folderName, subFolderName);
            }
        }
    }
}