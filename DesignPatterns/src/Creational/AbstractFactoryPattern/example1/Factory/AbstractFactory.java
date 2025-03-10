package Creational.AbstractFactoryPattern.example1.Factory;

import Creational.AbstractFactoryPattern.example1.Color.Color;
import Creational.AbstractFactoryPattern.example1.Shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
