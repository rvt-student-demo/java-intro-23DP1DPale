package lv.rvt;

public class Box {
    private double width;
    private double height;
    private double length;
    private double side;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double side) {
        this.side = side;
    }

    public Box(Box oldBox) {
        new Box(oldBox.width, oldBox.height, oldBox.length);
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }

    public Box biggerBox(Box oldBox) {
        return new Box(1.25*oldBox.width(), 1.25*oldBox.height(), 1.25*oldBox.length());
    }

    public Box smallerBox(Box oldBox) {
        return new Box(0.75*oldBox.width(), 0.75*oldBox.height(), 0.75*oldBox.length());
    }

    public boolean nests(Box outsideBox) {
        if (this.width < outsideBox.width && this.height < outsideBox.height && this.length < outsideBox.length) {
            return true;
        } else {
            return false;
        }
    }

    public double volume() {
        return length * width * height;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    public double width() {
        return width;
    }

    public double height() {
        return height;
    }

    public double length() {
        return length;
    }

    private double faceArea() {
        return width * height;
    }

    private double topArea() {
        return width * length;
    }

    private double sideArea() {
        return length * height;
    }

    public double getTopArea() {
        return topArea();
    }
}
