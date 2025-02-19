package Creational.SingletonPattern;

// The instance is created at the time of class loading.
// Instance is created even if it’s not used. Not good
public class EagerInitialization {
    private static final EagerInitialization INSTANCE = new EagerInitialization();

    private EagerInitialization() {
    }

    public static EagerInitialization getInstance() {
        return INSTANCE;
    }
}
