package chap4.EmployeeTest;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Sam", 19933.67, 2017, 11, 13);
        staff[1] = new Employee("Jim", 20000.00, 2018, 01,25);
        staff[2] = new Employee("Lily", 25533, 2019,06,17);


        for(Employee e: staff)
        {
            e.raisedSalary(5);
            System.out.println("name:" + e.getName() + ", salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
        }
    }
}

class Employee
{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

//    constructor
    public String getName() {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raisedSalary(double byPercent)
    {
        double raise = this.salary * byPercent / 100;
        salary += raise;
    }
}