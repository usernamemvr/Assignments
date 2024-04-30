import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//Write a program to store Employee information, user should be able to sort the Employees based on their name in ascending order.
public class SortEmployee {
    String name;
    String EmployeeID;
    int salary;
    public SortEmployee(String name, String EmployeeID, int salary) {
        this.name = name;
        this.EmployeeID = EmployeeID;
        this.salary = salary;
    }
    public static void main(String[] args) {
        List<SortEmployee> employees = new ArrayList<>();
        employees.add(new SortEmployee("Raj","E001",40000));
        employees.add(new SortEmployee("Ron","E002",47000));
        employees.add(new SortEmployee("Ash","E003",60000));
        Comparator<SortEmployee> comparebyName = new Comparator<SortEmployee>() {
            @Override
            public int compare(SortEmployee emp1, SortEmployee emp2) {
                return emp1.name.compareTo(emp2.name);
            }
        };
        Collections.sort(employees,comparebyName);
        for (SortEmployee emp : employees) {
            System.out.println(emp.name + " " + emp.EmployeeID+ " " + emp.salary);
        }
    }
}
