package PracticeSet;

public class Qns_02 {
    public static void main(String[] args) {
        Manager m1 = new Manager(45000.5f);

        // parent class - Person
        m1.name = "Mohit Kumar";
        System.out.println("Name : " + m1.name);
        m1.work();
        // derived class - Employee
        System.out.println("Dept : " + m1.dept);
        m1.EmpWork();
        // derived class - manager
        System.out.println("Designation : " + m1.desg);
        m1.salary = 180000;
        System.out.println("Salary : " + m1.salary);
        m1.mgmtWork();

    }

}

class Person {
    int age;
    String name;
    float salary;

    Person(float salary) {
        this.salary = salary;
        System.out.println("Salary : " + this.salary);

    }

    void work() {
        System.out.println("Working as a person");
    }
}

class Employee extends Person {

    String dept = "IT";

    Employee(float salary) {
        super(salary);
        this.salary = salary;
        this.salary = this.salary + (this.salary * 20 / 100);
        System.out.println("Employee Salary (20% hike): " + this.salary);
    }

    void EmpWork() {
        System.out.println("Working as an Employee");
    }
}

class Manager extends Employee {
    String desg = "Manager";
   

    Manager(float salary) {
        super(salary);
        this.salary = this.salary + (this.salary * 50 / 100);
        System.out.println("Employee Salary (50% hike): " + this.salary);

    }

    void mgmtWork() {
        System.out.println("Working as a Manager");
    }
}