import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RestaurantOrderSystem orderSystem = new RestaurantOrderSystem();
        orderSystem.startOrderingProcess(scanner);
        scanner.close();
    }
}