package creational.FactoryMethodPattern.firstApproach.example1;

public class FactoryMethodExample {
    public static void main(String[] args) {
        KnifeStore store = new SimpleKnifeStore();
        System.out.println("Ordering a Chef Knife:");
        Knife chefKnife = store.orderKnife("chef");

        System.out.println("\nOrdering a Steak Knife:");
        Knife steakKnife = store.orderKnife("steak");
    }
}
