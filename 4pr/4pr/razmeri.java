package 4pr;
import opisanie.opisaniee;
public class razmeri extends Opis1_1 {
    private double h;
    private double w;
    private double l;
    public Gaboriti(long id, int productCode, String name, int who, int retail, String description, double h, double l, double w) {
        super(id, productCode, name, who, retail, description);
        this.h = h;
        this.l = l;
        this.w = w;
    }
    public double getl() {
        return l;
    }
    public void setl(double l) {
        this.l = l;
    }
    public double getw() {
        return w;
    }
    public void setw(double w) {
        this.w = w;
    }
    public double geth() {
        return h;
    }
    public void seth(double h) {
        this.h = h;
    }
    public String toString() {
        return "\n" + super.toString() +
                "\n visota - " + h +
                "\n shirina - " + w +
                "\n dlinna - " + l;
    }
}