package Creational.Singeltion;

public class ThreadSafeSingeltion {
    private static volatile ThreadSafeSingeltion instance;

    private ThreadSafeSingeltion() {
    }

    public static ThreadSafeSingeltion getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingeltion.class) {
                if (instance == null) instance = new ThreadSafeSingeltion();
            }
        }
        return instance;
    }
}
