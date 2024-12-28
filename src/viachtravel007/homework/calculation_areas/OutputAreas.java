package viachtravel007.homework.calculation_areas;

public class OutputAreas {
    public static void main(String[] args) {
        ShapeCreator shapeFactory = new ShapeCreator();

        Shape[] shapes = new Shape[3];

        shapes[0] = shapeFactory.createCircle();
        shapes[1] = shapeFactory.createTriangle();
        shapes[2] = shapeFactory.createSquare();

        System.out.println("\nAreas of each figure:");
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
        }

        System.out.println("\nTotal area of all figures: " + getTotalArea(shapes));
    }

    public static double getTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}