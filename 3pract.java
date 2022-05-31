/*создать программу для
определения класса в некоторой предметной области. Описать свойства, конструктор,
методы геттеры/сеттеры, перекрыть метод toString() для вывода полной
информации об объекте в отформатированном виде.
гостиница */
package hotel;
public class Room {
    private int id;
    private  int codeNumbers;
    private int numberPeople;
    private  String comfortType;
    private  int price;


    public Room(int id, int codeNumbers, int numberPeople, String comfortType, int price) {
        this.id = id;
        this.codeNumbers = codeNumbers;
        this.numberPeople = numberPeople;
        this.comfortType = comfortType;
        this.price = price;

    }

    public int getnamefaculty() {
        return namefaculty;
    }

    public void setnamefaculty(int namefaculty) {
        this.namefaculty = namefaculty;
    }

    public int getroom() {
        return room;
    }

    public void setroom(int room) {
        this.room = room;
    }

    public int getcorps() {
        return corps;
    }

    public void setcorps(int corps) {
        this.corps = corps;
    }

    public String gettelephone() {
        return telephone;
    }

    public void settelephone(String telephone) {
        this.telephone = telephone;
    }
    public int getnamedean(){
        return namedean;
    }
    public void setnamedean(int namedean){
        this.namedean=namedean;
    }
    public String tostring(){
        return "Идентификатор " + namefaculty +
                "\n Код номера- " + room +
                "\n Количество человек - " + corps +
                "\n Комфортность - " + telephone +
                "\n Цена - " + namedean ;


    }


}