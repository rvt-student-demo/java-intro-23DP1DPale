package lv.rvt;

public class Agent {
    private String name;
    private String lastname;

    public Agent(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String toString() {
        return "My name is " + lastname + ", " + name + " " + lastname;
    }
}
