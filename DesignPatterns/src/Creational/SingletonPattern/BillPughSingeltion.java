package Creational.SingletonPattern;

public class BillPughSingeltion {
    private BillPughSingeltion() {
    }

    public static BillPughSingeltion getInstance() {
        return Holder.INSTACNE;
    }

    private static class Holder {
        private static final BillPughSingeltion INSTACNE = new BillPughSingeltion();
    }
}
