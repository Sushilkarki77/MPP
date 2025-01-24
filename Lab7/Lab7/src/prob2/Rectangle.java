package prob2;

public final class Rectangle implements Polygon {
	final private double width;
	final private double length;

	@Override
	public double[] getSides() {
		double[] sides =  new double[4];
		sides[0] = width;
		sides[1] = width;
		sides[2] = length;
		sides[3] = length;
		return sides;

	}

	public Rectangle(double width, double length) {	
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
}
