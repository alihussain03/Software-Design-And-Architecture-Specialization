package Creational.AbstractFactoryPattern.example3.Product;

public class Motorcycle implements MotorVehicle {
    @Override
    public void build() {
        System.out.println("Building a motorcycle");
    }
}
