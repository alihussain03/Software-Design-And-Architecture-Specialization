package Creational.AbstractFactoryPattern.example3.Factory.NextGenVehicles;

import Creational.AbstractFactoryPattern.example3.Factory.Corporation;
import Creational.AbstractFactoryPattern.example3.Product.NextGenProduct.ElectricVehicle;
import Creational.AbstractFactoryPattern.example3.Product.MotorVehicle;
import Creational.AbstractFactoryPattern.example3.Product.NextGenProduct.NextGenElectricCar;
import Creational.AbstractFactoryPattern.example3.Product.NextGenProduct.NextGenMotorcycle;

public class NextGenCorporation extends Corporation {
    @Override
    public MotorVehicle createMotorVehicle() {
        return new NextGenMotorcycle();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new NextGenElectricCar();
    }
}
