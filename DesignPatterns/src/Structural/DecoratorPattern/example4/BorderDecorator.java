package Structural.DecoratorPattern.example4;

public class BorderDecorator extends ShapeDecorator {
    public BorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw(); // Draw original shape
        addBorder();           // Add new behavior
    }

    private void addBorder() {
        System.out.println("Adding border to the shape.");
    }
}
