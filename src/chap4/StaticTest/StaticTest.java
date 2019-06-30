package chap4.StaticTest;

public class StaticTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Kitty", 10000);
        staff[1] = new Employee("Jim", 12000);
        staff[2] = new Employee("Kelly", 25000);

        for(Employee e: staff) {
            System.out.println(e.getName() + ",salary=" + e.getSalary() + ",id=" + e.getId());
        }
    }
}

class Employee {
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s) {
        name = n;
        salary = s;
        id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId ++;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Jack", 30000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
