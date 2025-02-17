package creational.FactoryMethodPattern.example2;

public abstract class AbstractShapeFactory {
    protected abstract Shape factoryMthod();

    public Shape getShape() {
        return factoryMthod();
    }
}
