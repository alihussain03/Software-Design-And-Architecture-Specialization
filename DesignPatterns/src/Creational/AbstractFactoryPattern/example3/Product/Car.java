package Creational.AbstractFactoryPattern.example3.Product;

public class Car implements MotorVehicle {
    @Override
    public void build() {
        System.out.println("Building a car");
    }
}
