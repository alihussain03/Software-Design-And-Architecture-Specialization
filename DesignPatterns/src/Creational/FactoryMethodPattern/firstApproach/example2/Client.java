package Creational.FactoryMethodPattern.firstApproach.example2;

import Creational.FactoryMethodPattern.firstApproach.example2.factory.CircleFactory;
import Creational.FactoryMethodPattern.firstApproach.example2.factory.RectangleFactory;
import Creational.FactoryMethodPattern.firstApproach.example2.factory.SquareFactory;
import Creational.FactoryMethodPattern.firstApproach.example2.product.Shape;

public class Client {
    public static void main(String[] args) {
        //get an object of Circle and call its draw method.
        Shape shape1 = new CircleFactory().getShape();
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = new RectangleFactory().getShape();

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = new SquareFactory().getShape();

        //call draw method of square
        shape3.draw();
    }
}
