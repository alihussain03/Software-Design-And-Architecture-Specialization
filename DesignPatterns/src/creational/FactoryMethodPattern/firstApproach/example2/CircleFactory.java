package creational.FactoryMethodPattern.firstApproach.example2;

public class CircleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMthod() {
        return new Circle();
    }
}
