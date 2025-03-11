package Behavioral.StrategyPattern.example2.strategy;

public class SubtractionOperation implements Strategy {

    @Override
    public void performOperation(int a, int b) {
        System.out.println(a - b);
    }
}