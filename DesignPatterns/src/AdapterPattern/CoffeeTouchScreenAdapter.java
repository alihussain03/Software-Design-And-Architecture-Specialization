package AdapterPattern;

public class CoffeeTouchScreenAdapter implements CoffeeMachineInterface {
    private OldCoffeeMachine oldCoffeeMAchine;

    public CoffeeTouchScreenAdapter(OldCoffeeMachine newMachine) {
        oldCoffeeMAchine = newMachine;
    }

    @Override
    public void chooseFirstSelection() {
        oldCoffeeMAchine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        oldCoffeeMAchine.selectB();
    }
}
