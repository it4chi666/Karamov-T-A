package 4pr;
import opisanie.opisaniee;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Opis1_1> listOfCommodities = new ArrayList<>();
        CommodityList commodityList = new CommodityList(listOfCommodities);
        long monitorId = 1;
        int monitorProductCode = 765;
        String monitorName = "monitor";
        int monitorwho = 250;
        int monitorretail = 123;
        String monitorDescription = "bol'shoy";
        double monitorFragilityFactor = 1;
        res = new res(monitorId, monitorProductCode, monitorName, monitorwho, monitorretail, monitorDescription, monitorFragilityFactor);
        commodityList.addCommodity(glass);
        long molokoId = 2;
        int molokoProductCode = 342;
        String molokoName = "moloko";
        int molokowho = 100;
        int molokoretail = 30;
        String molokoDescription = "natyralnoe";
        double molokoStoragesrok = 31;
        srok moloko = new srok(molokoId, molokoProductCode, molokoName, molokowho, molokoretail, molokoDescription, molokoStoragesrok);
        commodityList.addCommodity(moloko);
        commodityList.addCommodity(box);
        System.out.println(commodityList.showCommodities());