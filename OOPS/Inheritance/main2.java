package Inheritance;

public class main2 {
    public static void main(String[] args) {
        Manager m1 = new Manager();

        // parent class - Person
        m1.name = "Mohit Kumar";
        System.out.println("Name : "+m1.name);
        m1.work(); 
        // derived class - Employee
        System.out.println("Dept : "+m1.dept);
        m1.EmpWork();
        // derived class - manager
        System.out.println("Designation : "+m1.desg);
        m1.salary = 180000;
        System.out.println("Salary : "+m1.salary);
        m1.mgmtWork();


        
    }
    
}

class Person{
    int age;
    String name;

    void work(){
        System.out.println("Working as a person");
    }
}

class Employee extends Person{
    float salary = 45000.0f;
    String dept = "IT";

    void EmpWork(){
        System.out.println("Working as an Employee");
    }
}

class Manager extends Employee{
    String desg = "Manager";
    double salary;

    void mgmtWork(){
        System.out.println("Working as a Manager");
    }
}