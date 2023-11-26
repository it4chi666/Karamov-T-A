import java.util.ArrayList;
import java.util.List;


class Order implements Cloneable {
    private String itemName;
    private double price;
    private String deliveryAddress;
    private List<String> clonedAddresses;

    public Order(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.deliveryAddress = "дефолтный адрес ";
        this.clonedAddresses = new ArrayList<>();
    }

    public void setDeliveryAddress(String address) {
        this.deliveryAddress = address;
    }

    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public void displayOrderDetails() {
        System.out.println("заказ: " + itemName + ", стоимость: " + price + ", адрес : " + deliveryAddress);
    }

    public void addClonedAddress(String address) {
        clonedAddresses.add(address);
    }

    public void displayClonedAddresses() {
        if (clonedAddresses.isEmpty()) {
            System.out.println("нет клонированных ");
        } else {
            System.out.println("клонированные ");
            for (String address : clonedAddresses) {
                System.out.println("- " + address);
            }
        }
    }

    @Override
    public Order clone() {
        Order clonedOrder = new Order(this.itemName, this.price);
        clonedOrder.setDeliveryAddress(this.deliveryAddress);
        clonedOrder.clonedAddresses.addAll(this.clonedAddresses);
        return clonedOrder;
    }
}
