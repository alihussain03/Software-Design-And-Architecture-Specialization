package Structural.DecoratorPattern.example4;

public class ColorDecorator extends ShapeDecorator {
    public ColorDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setColor(decoratedShape);
    }

    private void setColor(Shape decoratedShape) {
        System.out.println("Color: Red");
    }
}
