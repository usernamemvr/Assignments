public class Employee {
    private String Name;
    private int Salary;
    private String Department;

    public Employee(String name, int salary, String department) {
        Name = name;
        Salary = salary;
        Department = department;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public static void main(String[] args) {

        

    }

}
