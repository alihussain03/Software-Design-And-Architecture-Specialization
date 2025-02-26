package Structural.AdapterPattern.example1_ObjectAdapter;

import Structural.AdapterPattern.example1_ObjectAdapter.Adaptee.WildTurkey;
import Structural.AdapterPattern.example1_ObjectAdapter.Target.Duck;
import Structural.AdapterPattern.example1_ObjectAdapter.Target.MallardDuck;
import Structural.AdapterPattern.example1_ObjectAdapter.adapter.TurkeyAdapter;

public class client {
    public static void main(String[] args) {
        WildTurkey turkey = new WildTurkey();
        MallardDuck duck = new MallardDuck();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The turkey says ....");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says ....");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says ....");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
