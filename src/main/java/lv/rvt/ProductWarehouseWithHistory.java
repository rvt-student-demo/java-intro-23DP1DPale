package lv.rvt;

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        this.history.add(initialBalance);
    }

    public String history() {
        return this.history.toString();
    }

    public void addToWarehouse(double amount) {
        this.history.add(super.getBalance() + amount);
        super.addToWarehouse(amount);
    }

    public double takeFromWarehouse(double amount) {
        this.history.add(super.getBalance() - amount);
        return super.takeFromWarehouse(amount);
    }

    public void printAnalysis() {
        System.out.println(
            "Product: " + super.getName() +
            "\nHistory: " + this.history.toString() +
            "\nLargest amount of product: " + this.history.maxValue() +
            "\nSmallest amount of product: " + this.history.minValue() +
            "\nAverage:" + this.history.average()
            );
    }
}
