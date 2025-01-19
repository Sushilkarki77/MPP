public final class Circle implements Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius(){
        return radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}
