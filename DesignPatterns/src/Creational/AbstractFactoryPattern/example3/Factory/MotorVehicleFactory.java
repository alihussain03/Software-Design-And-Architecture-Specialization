package Creational.AbstractFactoryPattern.example3.Factory;

import Creational.AbstractFactoryPattern.example3.Product.MotorVehicle;

public abstract class MotorVehicleFactory {
    public MotorVehicle create() {
        MotorVehicle motorVehicle = createMotorVehicle();
        motorVehicle.build();
        return motorVehicle;
    }

    protected abstract MotorVehicle createMotorVehicle();
}
