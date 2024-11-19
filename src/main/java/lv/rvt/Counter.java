package lv.rvt;

public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this(0);
    }

    public int Value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void increase(int increaseBy) {
        this.value += increaseBy;
    }

    public void decrease() {
        this.value--;
    }

    public void decrease(int decreaseBy) {
        this.value -= decreaseBy;
    }
}
