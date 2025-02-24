package Creational.AbstractFactoryPattern.example3.Factory;

import Creational.AbstractFactoryPattern.example3.Product.NextGenProduct.ElectricVehicle;
import Creational.AbstractFactoryPattern.example3.Product.MotorVehicle;

public abstract class Corporation {
    public abstract MotorVehicle createMotorVehicle();

    public abstract ElectricVehicle createElectricVehicle();
}