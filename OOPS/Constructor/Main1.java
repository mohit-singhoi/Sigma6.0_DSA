// Constructor Channing
package Constructor;

public class Main1 {
        public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Student Name : " +s.name);
    }
}

class Student {
    String name;
    int age;

    Student() {
        this("Mohit", 22);   // calls parameterized constructor
        System.out.println("Default Constructor");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor");
    }
}


