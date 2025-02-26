package Structural.AdapterPattern.example2_ObjectAdapter;

import Structural.AdapterPattern.example2_ObjectAdapter.Adaptee.Calculator;
import Structural.AdapterPattern.example2_ObjectAdapter.Adapter.CalculatorAdapter;
import Structural.AdapterPattern.example2_ObjectAdapter.Target.CalculatorInterface;
import Structural.AdapterPattern.example2_ObjectAdapter.Target.Rectangle;
import Structural.AdapterPattern.example2_ObjectAdapter.Target.Triangle;

public class Client {
    public static void main(String[] args) {
        // Rectangle calculation (normal way)
        Rectangle rectangle = new Rectangle(10, 20);
        Calculator calculator1 = new Calculator();
        System.out.println("Area of rectangle is: " + calculator1.getArea(rectangle));

        // Triangle calculation using Adapter
        System.out.println("Triangle calculation using Adapter:");
        Triangle triangle = new Triangle(10, 20);
        CalculatorInterface calculator = new CalculatorAdapter(triangle);
        System.out.println("Area of triangle is: " + calculator.getArea(null)); // Fix: Call getArea()
    }
}
