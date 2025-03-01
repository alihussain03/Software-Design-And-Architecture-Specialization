package Structural.FlyWeightPattern.example2;

public class Terrorist implements Player {
    // instrinsic attribute
    private final String TASK;

    // extrinsic attribute
    private String weapon;

    public Terrorist() {
        TASK = "Plant a bomb";
    }

    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void mission() {
        System.out.println("Terrorist with weapon " + weapon + " : Task is " + TASK);
    }
}
