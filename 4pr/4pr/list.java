package 4pr;
import opisanie.opisaniee;
import java.util.ArrayList;
public class CommodityList {
    private ArrayList<Opis1_1> listOfCommodities;
    public CommodityList(ArrayList<Opis1_1> listOfCommodities) {
        this.listOfCommodities = listOfCommodities;
    }
    public void addCommodity(Opis1_1 commodity) {
        listOfCommodities.add(commodity);
    }
    public ArrayList<Opis1_1> showCommodities() {
        return listOfCommodities;
    }
}