package Structural.DecoratorPattern.example3;

public class ConcreteDecoratorEx_1 extends AbstractDecorator {
    public void doJob() {
        super.doJob();
        // Add additional responsibilities
        System.out.println("I am explicitly from Ex_1");
    }
}
