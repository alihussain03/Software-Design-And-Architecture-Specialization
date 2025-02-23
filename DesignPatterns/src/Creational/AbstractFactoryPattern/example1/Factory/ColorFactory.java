package Creational.AbstractFactoryPattern.example1.Factory;

import Creational.AbstractFactoryPattern.example1.Color.*;
import Creational.AbstractFactoryPattern.example1.Shape.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {

        return null;
    }
}
