package Creational.FactoryMethodPattern.firstApproach.example1.product;

public class ChefKnife implements Knife {
    @Override
    public void sharpen() {
        System.out.println("Sharpening Chef Knife...");
    }

    @Override
    public void polish() {
        System.out.println("Polishing Chef Knife...");
    }
}
