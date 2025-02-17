package Creational.FactoryMethodPattern.firstApproach.example2;

public class SquareFactory extends AbstractShapeFactory {

    @Override
    protected Shape factoryMthod() {
        return new Square();
    }
}
