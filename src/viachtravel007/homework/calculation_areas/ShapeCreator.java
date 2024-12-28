package viachtravel007.homework.calculation_areas;

import java.util.Scanner;

public class ShapeCreator {
    private Scanner scanner;

    public ShapeCreator() {
        scanner = new Scanner(System.in);
    }

    public Circle createCircle() {
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        return new Circle(radius);
    }

    public Triangle createTriangle() {
        System.out.println("Enter the base of the triangle:");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle:");
        double height = scanner.nextDouble();
        return new Triangle(base, height);
    }

    public Square createSquare() {
        System.out.println("Enter the side of the square:");
        double side = scanner.nextDouble();
        return new Square(side);
    }
}