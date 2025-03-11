package Behavioral.StrategyPattern.example2.context;

import Behavioral.StrategyPattern.example2.strategy.Strategy;

public class Context {
    public void pay(Strategy strategy, int a, int b) {
        strategy.performOperation(a, b);
    }
}
