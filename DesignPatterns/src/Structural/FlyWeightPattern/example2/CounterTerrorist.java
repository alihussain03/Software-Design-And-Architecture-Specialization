package Structural.FlyWeightPattern.example2;

public class CounterTerrorist implements Player {
    // instrinsic attribute
    private final String TASK;

    // extrinsic attribute
    private String weapon;

    public CounterTerrorist() {
        TASK = "Diffuse a bomb";
    }

    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void mission() {
        System.out.println("Counter Terrorist with weapon " + weapon + " : Task is " + TASK);
    }
}
