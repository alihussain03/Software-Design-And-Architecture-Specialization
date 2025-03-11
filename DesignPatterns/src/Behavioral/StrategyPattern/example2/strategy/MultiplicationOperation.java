package Behavioral.StrategyPattern.example2.strategy;

public class MultiplicationOperation implements Strategy {

    @Override
    public void performOperation(int a, int b) {
        System.out.println(a * b);
    }
}
