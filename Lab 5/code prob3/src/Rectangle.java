public final class Rectangle implements Shape {
    private final double length;
    private final double breadth;


    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double computeArea() {
        return length * breadth;
    }
}
