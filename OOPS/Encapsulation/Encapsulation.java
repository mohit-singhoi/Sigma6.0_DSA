package Encapsulation;
public class Encapsulation {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setSalary(55000.0f);
        System.out.println("Employee Salary : "+e1.getSalary());
    }
    
}

class Employee {
    public String name;
    private float salary;

    public void setSalary(float sal){
        salary = sal;
    }

     float getSalary(){
        return salary;
    }

    
}
