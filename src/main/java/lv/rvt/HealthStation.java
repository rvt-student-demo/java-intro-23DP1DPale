package lv.rvt;

public class HealthStation {
    private int weigh_num;

    public int weigh(Person person) {
        this.weigh_num++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int number = person.getWeight();
        number++;
        person.setWeight(number);
    }

    public int weighings() {
        return weigh_num;
    }
}
