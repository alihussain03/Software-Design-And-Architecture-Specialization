package Structural.DecoratorPattern.example4;

public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        System.out.println();

        // Adding a Border to Circle
        Shape borderedCircle = new BorderDecorator(circle);
        borderedCircle.draw();
        System.out.println();

        // Adding Color to Triangle
        Shape triangle = new Triangle();
        Shape coloredTriangle = new ColorDecorator(triangle);
        coloredTriangle.draw();
        System.out.println();

        // Adding Both Border and Color to a Circle
        Shape fancyCircle = new BorderDecorator(new ColorDecorator(new Circle()));
        fancyCircle.draw();
    }
}
