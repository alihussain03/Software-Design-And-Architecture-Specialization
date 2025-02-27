package Structural.CompoistePattern.example2;

public class Professor implements Faculty {
    private String name;
    private String position;
    private int officeNum;

    Professor(String name, String position, int officeNum) {
        this.name = name;
        this.position = position;
        this.officeNum = officeNum;
    }

    @Override
    public String getDetails() {
        return name + " is the " + position + " (Office: " + officeNum + ")";
    }
}
