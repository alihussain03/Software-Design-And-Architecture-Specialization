package Creational.AbstractFactoryPattern.example3.Factory;

import Creational.AbstractFactoryPattern.example3.Product.Car;
import Creational.AbstractFactoryPattern.example3.Product.MotorVehicle;

public class CarFactory extends MotorVehicleFactory {
    @Override
    public MotorVehicle createMotorVehicle() {
        return new Car();
    }
}
