package Structural.AdapterPattern.example1_ObjectAdapter.adapter;

import Structural.AdapterPattern.example1_ObjectAdapter.Adaptee.WildTurkey;
import Structural.AdapterPattern.example1_ObjectAdapter.Target.Duck;

public class TurkeyAdapter implements Duck {
    WildTurkey wildTurkey;

    public TurkeyAdapter(WildTurkey wildTurkey) {
        this.wildTurkey = wildTurkey;
    }

    @Override
    public void quack() {
        wildTurkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++)
            wildTurkey.fly();
    }
}
