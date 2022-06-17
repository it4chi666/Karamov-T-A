package opisaniee;
public class opisanie {
    private long id;
    private int productCode;
    private String name;
    private int who;
    private int retail;
    private String description;
    public opisanie(long id, int productCode, String name, int who, int retail, String description) {
        this.id = id;
        this.productCode = productCode;
        this.name = name;
        this.who = who;
        this.retail = retail;
        this.description = description;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getProductCode() {
        return productCode;
    }
    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getwho() {
        return who;
    }
    public void setwho(int who) {
        this.who = who;
    }
    public int getretail() {
        return retail;
    }
    public void setretail(int retail) {
        this.retail = retail;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String toString() {
        return "Tovar c indetificatorom " + id +
                "\n Kod - " + productCode +
                "\n Naimenovanie - " + name +
                "\n Optovaya - " + who +
                "\n Roznichnaya cena - " + retail +
                "\n Opisanie - " + description;
    }

}