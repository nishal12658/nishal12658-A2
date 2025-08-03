public class Employee extends Person {
    private String employeeId;
    private String role;

    public Employee() {}

    public Employee(String name, int age, String address, String employeeId, String role) {
        super(name, age, address);
        this.employeeId = employeeId;
        this.role = role;
    }

    // Getters and setters
    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
