package Creational.AbstractFactoryPattern.example3;

import Creational.AbstractFactoryPattern.example3.Factory.CarFactory;
import Creational.AbstractFactoryPattern.example3.Factory.Corporation;
import Creational.AbstractFactoryPattern.example3.Factory.MotorVehicleFactory;
import Creational.AbstractFactoryPattern.example3.Factory.MotorcycleFactory;
import Creational.AbstractFactoryPattern.example3.Factory.NextGenVehicles.FutureVehicleCorporation;
import Creational.AbstractFactoryPattern.example3.Factory.NextGenVehicles.NextGenCorporation;
import Creational.AbstractFactoryPattern.example3.Product.MotorVehicle;
import Creational.AbstractFactoryPattern.example3.Product.NextGenProduct.ElectricVehicle;

public class Client {
    public static void main(String[] args) {
        MotorVehicleFactory carFactory = new CarFactory();
        carFactory.create();

        MotorVehicleFactory motorcycleFactory = new MotorcycleFactory();
        motorcycleFactory.create();

        //Next gen vehicles
        Corporation corporation = new FutureVehicleCorporation();
        MotorVehicle motorVehicle = corporation.createMotorVehicle();
        motorVehicle.build();

        ElectricVehicle electricCar = corporation.createElectricVehicle();
        electricCar.build();

        corporation = new NextGenCorporation();
        ElectricVehicle nextGenElectricCar = corporation.createElectricVehicle();
        nextGenElectricCar.build();

        MotorVehicle nextGenMotorcycle = corporation.createMotorVehicle();
        nextGenMotorcycle.build();

    }
}
