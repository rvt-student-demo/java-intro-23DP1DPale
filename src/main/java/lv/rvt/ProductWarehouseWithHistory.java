package lv.rvt;

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        history = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        history.add(initialBalance);
    }

    public String history() {
        return history.toString();
    }

    public void addToWarehouse(double amount) {
        history.add(super.getBalance() + amount);
        super.addToWarehouse(amount);
    }

    public double takeFromWarehouse(double amount) {
        history.add(super.getBalance() - amount);
        return super.takeFromWarehouse(amount);
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName() + "\nHistory: " + history.toString() + "\nLargest amount of product: " + history.maxValue() + "\nSmallest amount of product: " + history.minValue() + "\nAverage:" + history.average());
    }
}
