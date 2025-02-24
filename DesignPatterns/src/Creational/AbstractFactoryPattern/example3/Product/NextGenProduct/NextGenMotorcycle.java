package Creational.AbstractFactoryPattern.example3.Product.NextGenProduct;

import Creational.AbstractFactoryPattern.example3.Product.MotorVehicle;

public class NextGenMotorcycle implements MotorVehicle {
    @Override
    public void build() {
        System.out.println("Building a next generation motorcycle");
    }
}
