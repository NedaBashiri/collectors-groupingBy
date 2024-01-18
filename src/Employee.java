public class Employee {
    private String employeeName;
    private String postalCode;

    public Employee() {
    }

    public Employee(String employeeName, String postalCode) {
        this.employeeName = employeeName;
        this.postalCode = postalCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Employee setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
        return this;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public Employee setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
