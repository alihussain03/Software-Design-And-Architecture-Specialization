package Creational.FactoryMethodPattern.firstApproach.example1.product;

public class SteakKnife implements Knife {
    @Override
    public void sharpen() {
        System.out.println("Sharpening Steak Knife...");
    }

    @Override
    public void polish() {
        System.out.println("Polishing Steak Knife...");
    }
}
