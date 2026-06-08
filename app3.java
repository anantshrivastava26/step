/*
Rectangles, squares and triangles all have a perimeter, but each computes it from different
measurements. Build a Shape base class and three subclasses that override perimeter() and
name(), then process a mixed list polymorphically.
Implement the hierarchy from scratch and total the perimeters in a single loop that never asks
which shape it is holding.
 */
import java.util.*;
public class app3 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the number of shapes:");
        int n = in.nextInt();
        List<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter shape type (rectangle/square/triangle):");
            String type = in.next();
            if (type.equalsIgnoreCase("rectangle")) {
                System.out.println("Enter width and height:");
                double width = in.nextDouble();
                double height = in.nextDouble();
                shapes.add(new Rectangle(width, height));
            } else if (type.equalsIgnoreCase("square")) {
                System.out.println("Enter side length:");
                double side = in.nextDouble();
                shapes.add(new Square(side));
            } else if (type.equalsIgnoreCase("triangle")) {
                System.out.println("Enter the lengths of the three sides:");
                double a = in.nextDouble();
                double b = in.nextDouble();
                double c = in.nextDouble();
                shapes.add(new Triangle(a, b, c));
            }
        }

        double totalPerimeter = 0.0;
        for (Shape shape : shapes) {
            System.out.println(shape.name() + " perimeter: " + shape.perimeter());
            totalPerimeter += shape.perimeter();
        }

        System.out.println("Total perimeter: " + totalPerimeter);
        in.close();
    }
}

abstract class Shape {
    public abstract double perimeter();

    public abstract String name();
}

class Rectangle extends Shape {
    private final double width;
    private final double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String name() {
        return "rectangle";
    }
}

class Square extends Shape {
    private final double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String name() {
        return "square";
    }
}

class Triangle extends Shape {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String name() {
        return "triangle";
    }
}