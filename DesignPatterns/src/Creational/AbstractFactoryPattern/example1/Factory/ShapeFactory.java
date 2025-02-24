package Creational.AbstractFactoryPattern.example1.Factory;

import Creational.AbstractFactoryPattern.example1.Color.Color;
import Creational.AbstractFactoryPattern.example1.Shape.Circle;
import Creational.AbstractFactoryPattern.example1.Shape.Rectangle;
import Creational.AbstractFactoryPattern.example1.Shape.Shape;
import Creational.AbstractFactoryPattern.example1.Shape.Square;


public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
