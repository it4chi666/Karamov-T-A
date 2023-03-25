import java.util.Scanner;
public class UI {
    public UI() {
    }
    public void ui() {
        this.menu();
    }
    public void menu() {
        System.out.println("____KALKULATOR____");
        System.out.println("Proshlie vichisleniya -  1");
        System.out.println("Reshit'(Vvodit' 4erez probel) - 2");
        System.out.println("Viyti 3");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1 | n == 2 | n == 3) {
            if (n == 1) {
                Past PastCalc = new Past();
                PastCalc.pastUr();
            }
            if (n == 2) {
                EqCalc op = new EqCalc();
                op.enub();
            }
            if (n == 3) {
                System.out.println("bb");
                System.exit(0);
            }
        } else {
            System.out.println("takogo varianta net");
        }
    }
}
