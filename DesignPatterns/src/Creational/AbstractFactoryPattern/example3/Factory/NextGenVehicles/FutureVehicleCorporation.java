package Creational.AbstractFactoryPattern.example3.Factory.NextGenVehicles;

import Creational.AbstractFactoryPattern.example3.Factory.Corporation;
import Creational.AbstractFactoryPattern.example3.Product.NextGenProduct.ElectricVehicle;
import Creational.AbstractFactoryPattern.example3.Product.NextGenProduct.FutureVehicleElectricCar;
import Creational.AbstractFactoryPattern.example3.Product.NextGenProduct.FutureVehicleMotorcycle;
import Creational.AbstractFactoryPattern.example3.Product.MotorVehicle;

public class FutureVehicleCorporation extends Corporation {
    @Override
    public MotorVehicle createMotorVehicle() {
        return new FutureVehicleMotorcycle();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new FutureVehicleElectricCar();
    }
}
