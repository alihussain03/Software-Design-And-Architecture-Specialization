package Structural.DecoratorPattern.example3;

public class ConcreteComponent extends Component {
    @Override
    public void doJob() {
        System.out.println("I am from Concrete Component - I am closed for modification.");
    }
}
