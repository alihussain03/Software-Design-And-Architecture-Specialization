package Creational.Builder.example1;

public class Director {
    public void constructSportsCar(CarBuilder carBuilder) {
        carBuilder.buildEngine();
        carBuilder.buildWheels();
        carBuilder.buildSunroof();
        carBuilder.buildTransmission();
    }

    public void constructSUV(CarBuilder carBuilder) {
        carBuilder.buildEngine();
        carBuilder.buildWheels();
        carBuilder.buildSunroof();
        carBuilder.buildTransmission();
    }
}
