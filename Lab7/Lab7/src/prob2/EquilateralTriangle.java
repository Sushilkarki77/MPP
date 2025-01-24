package prob2;

public class EquilateralTriangle implements Polygon {
    double length;

    EquilateralTriangle(double length) {
        this.length = length;
    }

    @Override
    public double[] getSides() {
        double[] newArr = new double[1];
        newArr[0] = length;
        return newArr;
    }
}
