package lv.rvt;

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }

    public void add(double status) {
        this.changeHistory.add(status);
    }

    public void  clear() {
        this.changeHistory.clear();
    }

    public String toString() {
        return String.valueOf(this.changeHistory);
    }

    public double maxValue() {
        Double max = this.changeHistory.get(0);
        for (Double history: this.changeHistory) {
            if (history > max) {
                max = history;
            }
        }
        return max;
    }

    public double minValue() {
        Double min = this.changeHistory.get(0);
        for (Double history: this.changeHistory) {
            if (history < min) {
                min = history;
            }
        }

        return min;
    }

    public double average() {
        Double sum = 0.0;
        for (Double history: this.changeHistory) {
            sum += history;
        }

        return sum/this.changeHistory.size();

    }
}
