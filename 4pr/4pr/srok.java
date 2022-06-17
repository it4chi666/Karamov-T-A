package 4pr;
import opisanie.opisaniee;
public class time extends opisaniee {
    private double srok;
    public time(long id, int productCode, String name, int who, int retail, String description, double srok) {
        super(id, productCode, name, who, retail, description);
        this.srok = srok;
    }
    public double getsrok() {
        return srok;
    }
    public void setsrok(double srok) {
        this.srok = srok;
    }
    public String toString() {
        return "\n" + super.toString() +
                "\n srok godnosti " + srok;
    }
}