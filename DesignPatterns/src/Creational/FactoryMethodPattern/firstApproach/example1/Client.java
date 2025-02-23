package Creational.FactoryMethodPattern.firstApproach.example1;

import Creational.FactoryMethodPattern.firstApproach.example1.factory.KnifeStore;
import Creational.FactoryMethodPattern.firstApproach.example1.factory.SimpleKnifeStore;
import Creational.FactoryMethodPattern.firstApproach.example1.product.Knife;

public class Client {
    public static void main(String[] args) {
        KnifeStore store = new SimpleKnifeStore();
        System.out.println("Ordering a Chef Knife:");
        Knife chefKnife = store.orderKnife("chef");

        System.out.println("\nOrdering a Steak Knife:");
        Knife steakKnife = store.orderKnife("steak");
    }
}
