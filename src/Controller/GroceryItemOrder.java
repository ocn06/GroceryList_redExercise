package Controller;

/**
 * Created by Olivi on 11-09-2016.
 */
public class GroceryItemOrder {

    String name = "";
    int quantity = 1;
    double price = 0;


    //Getters and setters
    public GroceryItemOrder(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public GroceryItemOrder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCost () {
        return quantity*price;

    }

    //toString method
    @Override
    public String toString() {
        return "Controller.GroceryItemOrder{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
