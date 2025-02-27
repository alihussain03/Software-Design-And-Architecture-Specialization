package Structural.DecoratorPattern.example1;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: " + coffee.getCost() + "; Description: " + coffee.getDescription());

        coffee = new SugarDecorator(coffee);
        System.out.println("Cost: " + coffee.getCost() + "; Description: " + coffee.getDescription());

        coffee = new MilkDecorator(coffee);
        System.out.println("Cost: " + coffee.getCost() + "; Description: " + coffee.getDescription());
    }
}
