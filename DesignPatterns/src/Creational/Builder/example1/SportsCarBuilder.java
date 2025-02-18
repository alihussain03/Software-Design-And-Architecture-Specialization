package Creational.Builder.example1;

public class SportsCarBuilder implements CarBuilder {
    private Car car = new Car();

    @Override
    public void buildEngine() {
        car.setEngine("V8 Turbo");
    }

    @Override
    public void buildWheels() {
        car.setWheels(4);
    }

    @Override
    public void buildSunroof() {
        car.setSunroof(true);
    }

    @Override
    public void buildTransmission() {
        car.setTransmission("Automatic");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
