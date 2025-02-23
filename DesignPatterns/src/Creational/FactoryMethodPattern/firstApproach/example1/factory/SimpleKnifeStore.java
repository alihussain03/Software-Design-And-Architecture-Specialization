package Creational.FactoryMethodPattern.firstApproach.example1.factory;

import Creational.FactoryMethodPattern.firstApproach.example1.product.ChefKnife;
import Creational.FactoryMethodPattern.firstApproach.example1.product.Knife;
import Creational.FactoryMethodPattern.firstApproach.example1.product.SteakKnife;

public class SimpleKnifeStore extends KnifeStore {
    @Override
    protected Knife createKnife(String type) {
        if (type.equalsIgnoreCase("chef")) {
            return new ChefKnife();
        } else if (type.equalsIgnoreCase("steak")) {
            return new SteakKnife();
        }
        throw new IllegalArgumentException("Unknown knife type: " + type);
    }
}
