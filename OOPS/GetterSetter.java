public class GetterSetter {
    public static void main(String[] args) {

        // Creating object of Student class
        Student s1 = new Student();

        // Accessing data
        System.out.println("Student Name : " + s1.getName());   // 🔄 CHANGED
        System.out.println("Student Age : " + s1.getAge());    // 🔄 CHANGED
        System.out.println("Student Salary : " + s1.getSalary()); // 🔄 CHANGED

        // Updating values using methods
        s1.setAge(23);                  // 🔄 CHANGED (public)
        s1.changeSalary(80000.0f);      // 🔄 CHANGED (public)

        System.out.println("\nAfter Updating Values");
        System.out.println("Student Age : " + s1.getAge());    // 🔄 CHANGED
        System.out.println("Student Salary : " + s1.getSalary()); // 🔄 CHANGED
    }
}

// Student class
class Student {

    // 🔄 CHANGED: variables made private (Encapsulation)
    private String name = "Mohit Kumar";
    private int age = 22;
    private float salary = 65000.0f;

    // 🔄 CHANGED: public getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getSalary() {
        return salary;
    }

    // 🔄 CHANGED: public setters
    public void setAge(int age) {
        this.age = age;
    }

    public void changeSalary(float newSalary) {
        salary = newSalary;
    }
}
