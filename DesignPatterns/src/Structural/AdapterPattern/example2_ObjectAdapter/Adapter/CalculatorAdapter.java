package Structural.AdapterPattern.example2_ObjectAdapter.Adapter;

import Structural.AdapterPattern.example2_ObjectAdapter.Adaptee.Calculator;
import Structural.AdapterPattern.example2_ObjectAdapter.Target.CalculatorInterface;
import Structural.AdapterPattern.example2_ObjectAdapter.Target.Rectangle;
import Structural.AdapterPattern.example2_ObjectAdapter.Target.Triangle;

public class CalculatorAdapter implements CalculatorInterface {
    Calculator calculator;
    Triangle triangle;

    public CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle r) {
        calculator = new Calculator();
        Rectangle rectangle = new Rectangle(triangle.getBase(), 0.5 * triangle.getHeight());
        return calculator.getArea(rectangle);
    }
}
