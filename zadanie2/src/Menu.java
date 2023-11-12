import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Menu {
    private List<Kitchen> kitchens = new ArrayList<>();

    public Menu() {
        kitchens.add(new RussianKitchen());
        kitchens.add(new ChineseKitchen());
        kitchens.add(new JapaneseKitchen());
    }

    public Kitchen getKitchen(int choice) {
        return choice >= 0 && choice < kitchens.size() ? kitchens.get(choice) : null;
    }

    public void displayMenu() {
        System.out.println("Kitchens:");
        if (kitchens.size() > 0) System.out.println("0: Русская кухня");
        if (kitchens.size() > 1) System.out.println("1: Китайская кухня");
        if (kitchens.size() > 2) System.out.println("2: Японская кухня");
    }
}
