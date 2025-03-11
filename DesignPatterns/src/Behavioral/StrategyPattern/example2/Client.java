package Behavioral.StrategyPattern.example2;

import Behavioral.StrategyPattern.example2.context.Context;
import Behavioral.StrategyPattern.example2.strategy.AdditionOperation;
import Behavioral.StrategyPattern.example2.strategy.SubtractionOperation;

public class Client {
    public static void main(String[] args) {
        Context mathClass = new Context();
        mathClass.pay(new AdditionOperation(), 2, 3);
        mathClass.pay(new SubtractionOperation(), 2, 3);
        mathClass.pay(new SubtractionOperation(), 2, 3);

    }
}
