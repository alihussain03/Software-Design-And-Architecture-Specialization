package Structural.CompoistePattern.example2;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty {
    private String name;
    private String deptName;
    private List<Faculty> myFacultyList;

    Supervisor(String name, String deptName) {
        this.name = name;
        this.deptName = deptName;
        myFacultyList = new ArrayList<>();
    }

    public void add(Faculty professor) {
        myFacultyList.add(professor);
    }

    public void remove(Faculty professor) {
        myFacultyList.remove(professor);
    }

    public List<Faculty> getMyFaculty() {
        return myFacultyList;
    }

    @Override
    public String getDetails() {
        StringBuilder details = new StringBuilder(name + " is the " + deptName);
        for (Faculty member : myFacultyList) {
            details.append("\n\t").append(member.getDetails());
        }
        return details.toString();
    }

}
