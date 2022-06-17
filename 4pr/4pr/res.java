package 4pr;
import opisanie.opisaniee;
public class res extends opisaniee {
    private double resolution;
    public res(long id, int productCode, String name, int who, int retail, String description, double resolution) {
        super(id, productCode, name, who, retail, description);
        this.resolution = resolution;
    }
    public double getresolution() {
        return resolution;
    }
    public void setresolution(double resolution) {
        this.resolution = resolution;
    }
    public String toString() {
        return "\n" + super.toString() +
                "\n Resolution " + resolution;
    }
}