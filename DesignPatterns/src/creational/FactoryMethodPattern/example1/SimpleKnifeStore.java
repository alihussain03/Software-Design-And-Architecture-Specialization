package creational.FactoryMethodPattern.example1;

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
