package PracticeSet;

public class Qns_01 {
    public static void main(String[] args) {

        // Create first Student Object
        Student s1 = new Student();
        s1.setRollNo(3);
        s1.setName("Mohit Kumar");
        s1.setAge(22);
        s1.setMarks(87);

        // Create 2nd Student Object
        Student s2 = new Student();
        s2.setRollNo(2);
        s2.setName("Vinay Kaushik");
        s2.setAge(23);
        s2.setMarks(92);

        // Display student details
        System.out.println("Student Details:");
        s1.displayStudentInfo();
        s2.displayStudentInfo();

        // Using getter
        System.out.println("Topper: " + s2.getName());
    }

}

// Student.java
class Student {

    // Private data members (Data Hiding)
    private int rollNo;
    private String name;
    private int age;
    private float marks;

    // Setter methods (to set values)
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) { // validation
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }
    }

    public void setMarks(float marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks");
        }
    }

    // Getter methods (to get values)
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getMarks() {
        return marks;
    }

    // Extra method
    public void displayStudentInfo() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Marks   : " + marks);
        System.out.println("----------------------");
    }
}
