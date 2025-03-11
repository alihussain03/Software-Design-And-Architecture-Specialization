package Behavioral.StrategyPattern.example1;

import Behavioral.StrategyPattern.example1.context.ShoppingCart;
import Behavioral.StrategyPattern.example1.strategy.CreditCardStrategy;
import Behavioral.StrategyPattern.example1.strategy.PaypalStrategy;

public class Client {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item = new Item("1234", 10);
        Item item1 = new Item("4567", 40);

        shoppingCart.addItem(item);
        shoppingCart.addItem(item1);
        shoppingCart.pay(new PaypalStrategy("ali@gmail.com", "12"));

        shoppingCart.pay(new CreditCardStrategy("al1", "2222222222222", "333", "2025/03/12"));

    }
}
