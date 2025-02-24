package Creational.AbstractFactoryPattern.example3.Product.NextGenProduct;

public class FutureVehicleElectricCar implements ElectricVehicle {
    @Override
    public void build() {
        System.out.println("Building a future electric car");
    }
}
