package creational.FactoryMethodPattern.firstApproach.example2;

public class RectangleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMthod() {
        return new Rectangle();
    }
}
