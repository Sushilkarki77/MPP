public final class Triangle implements Shape {
    private final double height;
    private final double base;

    Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }


    public double computeArea() {
        return 0.5 * base * height;
    }
}
