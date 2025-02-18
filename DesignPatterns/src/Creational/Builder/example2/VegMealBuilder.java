package Creational.Builder.example2;

class VegMealBuilder implements MealBuilderInterface {
    private Meal vegMeal = new Meal();

    @Override
    public void buildBurger() {
        vegMeal.addItem(new VeggieBurger());
    }


    @Override
    public void buildDrink() {
        vegMeal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}
