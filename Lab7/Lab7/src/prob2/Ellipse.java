package prob2;

public class Ellipse implements ClosedCurve{

    double semiMajorLength;
    double semiMinorAxis;

    Ellipse(double semiMajorLength, double semiMinorAxis){
        this.semiMajorLength = semiMajorLength;
        this.semiMinorAxis = semiMinorAxis;
    }


    @Override
    public double computePerimeter() {
        return 4 * semiMinorAxis * semiMajorLength;
    }
}
