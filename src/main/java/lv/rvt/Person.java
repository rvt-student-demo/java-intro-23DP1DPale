package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    // All args class constructor
    public Person(String Name, int Age, int Height, int Weight) {
        this.age = Age;
        this.weight = Weight;
        this.height = Height;
        this.name = Name;
    }

    // Second constructor woth only one parameter
    public Person(String name) {
        this(name, 0, 0, 0);
    }

    public Person() {
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }

    public double maximumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }

    public String toString() {
        return "Name: " + this.name + ", age: " + this.age + ", weight: " + this.weight + ", height: " + this.height;
    }

    public void printPerson() {
        System.out.println(this.name + ", age: " + this.age + " years, " + "weight: " + this.weight + ", height: " + this.height);
    }

    public void growOlder() {
        if (this.age < 30) {
            this.age++;
        }
    }

    public int returnAge() {
        return this.age;
    }

    public boolean isOfLegalAge() {
        return this.age >= 18;
    }
    
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getHeight() {
        return this.height;
    }

    public String toCsvRow() {
        return this.name + ", " + this.age + ", " + this.weight + ", " + this.height;
    }
}
