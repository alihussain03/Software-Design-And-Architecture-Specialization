package Creational.AbstractFactoryPattern.example3.Factory;

import Creational.AbstractFactoryPattern.example3.Product.MotorVehicle;
import Creational.AbstractFactoryPattern.example3.Product.Motorcycle;

public class MotorcycleFactory extends MotorVehicleFactory {
    @Override
    public MotorVehicle createMotorVehicle() {
        return new Motorcycle();
    }
}
