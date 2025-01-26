package Question2;

public interface Polygon extends ClosedCurve {
    double[] getSides();

    default double computePerimeter(){
        double perimiter = 0.0;

        for(double x : getSides()){
            perimiter += x;
        }
        return perimiter;
    }
}
