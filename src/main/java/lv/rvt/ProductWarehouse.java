package lv.rvt;

public class ProductWarehouse extends Warehouse{
    private String wareHouseName;

    public ProductWarehouse(String name, double capacility) {
        super(capacility);
        this.wareHouseName = name;
    }

    public String getName() {
        return this.wareHouseName;
    }

    public void setName(String newName) {
        this.wareHouseName = newName;
    }

    public String toString() {
        return this.wareHouseName + ": " + super.toString();
    }
}
