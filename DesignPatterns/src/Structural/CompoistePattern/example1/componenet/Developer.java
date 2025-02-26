package Structural.CompoistePattern.example1.componenet;

class Developer implements Employee {
    private String name;
    private long empId;
    private String position;

    public Developer(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Employee id: " + empId + ", Employee Name: " + name + ", Employee Position: " + position);
    }
}

