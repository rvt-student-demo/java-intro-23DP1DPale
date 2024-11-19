package lv.rvt;

public class Product {
    private String name;
    private Double price;
    private int quantity;
    private String location;
    private int weight;

    public Product(String Name, double Price, int Quantity, String location, int weight) {
        this.name = Name;
        this.price = Price;
        this.quantity = Quantity;
        this.location = location;
        this.weight = weight;
    }

    public Product(String name) {
        this(name, 0, 0, "shelf", 1);
    }

    public Product(String name, String location) {
        this(name, 0, 0, location, 1);
    }

    public Product(String name, int weight) {
        this(name, 0, 0, "shelf", weight);
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }

    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}
