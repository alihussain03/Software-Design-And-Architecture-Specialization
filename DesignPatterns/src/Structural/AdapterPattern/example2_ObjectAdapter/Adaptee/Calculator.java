package Structural.AdapterPattern.example2_ObjectAdapter.Adaptee;

import Structural.AdapterPattern.example2_ObjectAdapter.Target.CalculatorInterface;
import Structural.AdapterPattern.example2_ObjectAdapter.Target.Rectangle;

public class Calculator implements CalculatorInterface {
    @Override
    public double getArea(Rectangle r) {
        return r.getLength() * r.getWidth();
    }
}
