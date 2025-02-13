package lv.rvt;

import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList<Packable> items;
    private double maxCapacity;

    public Box(double maxCapacity) {
        this.items = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    public void add(Packable Packable) {
        if (this.weight() + Packable.weight() <= this.maxCapacity) {
            this.items.add(Packable);
        }
    }

    public double weight() {
        double weight = 0;
        for (Packable items: this.items) {
            weight += items.weight();
        }

        return weight;
    }

    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}
