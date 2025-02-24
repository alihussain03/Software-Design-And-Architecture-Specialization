package Creational.AbstractFactoryPattern.example3.Product.NextGenProduct;

public class NextGenElectricCar implements ElectricVehicle {
    @Override
    public void build() {
        System.out.println("Building a next generation electric car");
    }
}
