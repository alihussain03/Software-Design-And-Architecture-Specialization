package Creational.BuilderPattern.example1;

class SUVBuilder implements CarBuilder {
    private Car car = new Car();

    @Override
    public void buildEngine() {
        car.setEngine("V6 Diesel");
    }

    @Override
    public void buildWheels() {
        car.setWheels(4);
    }

    @Override
    public void buildSunroof() {
        car.setSunroof(false);
    }

    @Override
    public void buildTransmission() {
        car.setTransmission("Manual");
    }

    @Override
    public Car getCar() {
        return car;
    }
}

