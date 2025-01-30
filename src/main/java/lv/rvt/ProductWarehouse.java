package lv.rvt;

public class ProductWarehouse extends Warehouse{
    private String productName;

    public ProductWarehouse(String productName, double capacility) {
        super(capacility);
        this.productName = productName;
    }

    public String getName() {
        return this.productName;
    }

    public void setName(String newName) {
        this.productName = newName;
    }

    public String toString() {
        return this.productName + ": " + super.toString();
    }
}
