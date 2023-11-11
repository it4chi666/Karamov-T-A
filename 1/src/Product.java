class Product {
    private String type;
    private String name;
    private double price;

    public Product(String type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Тип: " + type + ", Название: " + name + ", Цена: " + price;
    }
}
