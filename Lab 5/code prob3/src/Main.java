import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Shape triangle = new Triangle(5, 10);
        Shape rectangle = new Rectangle(4, 6);
        Shape circle = new Circle(7);


        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(rectangle);
        shapes.add(circle);


        double sum = 0;


        for (Shape shape : shapes) {
            sum += shape.computeArea();
        }

        System.out.println("Sum of Areas = " + sum);

    }
}