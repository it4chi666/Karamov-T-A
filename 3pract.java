/*создать программу для
определения класса в некоторой предметной области. Описать свойства, конструктор,
методы геттеры/сеттеры, перекрыть метод toString() для вывода полной
информации об объекте в отформатированном виде. 
ссылка на доп. https://github.com/it4chi666/Karamov-T-A/blob/f6b48a6ac96c0431068b44f84d79d77c717ada2a/dlya3.java
7 вариант */
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

    public int getnam() {
        return name;
    }

    public void setname(int name) {
        this.name = name;
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
        return "Идентификатор " + name +
                "\n Код номера- " + room +
                "\n Количество человек - " + corps +
                "\n Комфортность - " + telephone +
                "\n Цена - " + namedean ;


    }


}
