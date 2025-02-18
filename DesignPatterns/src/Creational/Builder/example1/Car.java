package Creational.Builder.example1;

class Car {
    private String engine;
    private int wheels;
    private boolean sunroof;
    private String transmission;

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car [Engine=" + engine + ", Wheels=" + wheels + ", Sunroof=" + sunroof + ", Transmission=" + transmission + "]";
    }
}
