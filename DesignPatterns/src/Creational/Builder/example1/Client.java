package Creational.Builder.example1;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        // Building a Sports Car
        CarBuilder sportsCarBuilder = new SportsCarBuilder();
        director.constructSportsCar(sportsCarBuilder);
        Car sportsCar = sportsCarBuilder.getCar();
        System.out.println("Sports Car: " + sportsCar);

        // Building an SUV
        CarBuilder suvBuilder = new SUVBuilder();
        director.constructSUV(suvBuilder);
        Car suv = suvBuilder.getCar();
        System.out.println("SUV: " + suv);
    }
}
