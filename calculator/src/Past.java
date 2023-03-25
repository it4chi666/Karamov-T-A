import java.util.ArrayList;
import java.util.Iterator;
public class Past {
    public static ArrayList<String> yravnenie = new ArrayList();
    public Past() {
    }
    public void uravneny(String n) {
        yravnenie.add(n);
    }
    public void pastUr() {
        System.out.println("Proslie vichisleniya");
        Iterator var = yravnenie.iterator();
        while(var.hasNext()) {
            String l = (String)var.next();
            System.out.println(l);
        }
        UI ui = new UI();
        ui.menu();
    }
}
