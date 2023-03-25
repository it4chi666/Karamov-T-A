import java.util.Scanner;
public class EqCalc {
    public static String yravnenie;
    public EqCalc() {
    }
    public void enub() {
        System.out.println("vvedite yravnenie :");
        Scanner scanner = new Scanner(System.in);
        yravnenie = scanner.nextLine();
        Calcul calculations = new Calcul();
        calculations.analiz(yravnenie);
        String nub = String.valueOf(calculations.calc());
        System.out.println(yravnenie + " = " + nub);
        String n = yravnenie + " = " + nub;
        Past past = new Past();
        past.uravneny(n);
        UI ui = new UI();
        ui.menu();
    }
}
