package Creational.Builder.example1;

public interface CarBuilder {
    void buildEngine();

    void buildWheels();

    void buildSunroof();

    void buildTransmission();

    Car getCar();
}
