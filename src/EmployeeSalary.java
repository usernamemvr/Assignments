//Given a list of employees, produce a list of employees with highest salary in their department.

import java.util.*;


public class EmployeeSalary{
    private String Name;
    private int Salary;
    private int EmployeeID;
    private String Department;

    public EmployeeSalary(String name, int salary,int employeeID, String department) {
        Name = name;
        Salary = salary;
        EmployeeID = employeeID;
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

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public static void main(String[] args) {
        List<EmployeeSalary> salaries = new ArrayList<EmployeeSalary>();
        salaries.add(new EmployeeSalary("James", 20000,1, "Germany"));
        salaries.add(new EmployeeSalary("John", 30000,2, "Germany"));
        salaries.add(new EmployeeSalary("Jack", 40000, 3,"Germany"));
        salaries.add(new EmployeeSalary("Jane", 50000, 4,"UK"));
        salaries.add(new EmployeeSalary("Jack", 60000, 5,"UK"));
        salaries.add(new EmployeeSalary("ack", 1000, 6,"UK"));
        salaries.add(new EmployeeSalary("Jak", 15000, 7,"UK"));
        salaries.add(new EmployeeSalary("Jac", 3000, 8,"UK"));
        salaries.add(new EmployeeSalary("A", 200, 9,"USA"));
        salaries.add(new EmployeeSalary("B", 100, 10,"USA"));
        salaries.add(new EmployeeSalary("Cory", 75000, 11,"USA"));
        salaries.add(new EmployeeSalary("D", 6000, 12,"IND"));
        salaries.add(new EmployeeSalary("E", 8500, 13,"IND"));
        salaries.add(new EmployeeSalary("Frey", 9000, 14,"IND"));

        Set<String> departments = new HashSet<>();
        List<EmployeeSalary> filteredSalaries = new LinkedList<>();
        Map<String, EmployeeSalary> map = new HashMap<>();
        EmployeeSalary maxSalaried = new EmployeeSalary("James", 0,0, "Germany");
        for (EmployeeSalary s : salaries) {
            departments.add(s.getDepartment());
        }
        for (String d : departments ){
            map.put(d,maxSalaried);
        }
        for (EmployeeSalary s : salaries) {
            if(map.containsKey(s.getDepartment())){
                if(map.get(s.getDepartment()).getSalary() < s.getSalary()){
                    map.put(s.getDepartment(),s);
                }
            }
        }
        for(String key : map.keySet()) {
            EmployeeSalary value = map.get(key);
            System.out.println(value.getName()+" "+value.getSalary()+" "+value.getEmployeeID()+" "+value.getDepartment());
        }
    }
    }

