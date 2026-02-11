package PracticeSet;

public class Qns_03 {
    public static void main(String[] args) {
        Student s1 = new Student("Mohit");
        Student s2 = new Student("Rahul");

        s1.display();
        s2.display();
    }
}

class Student {
    static String college = "ABC College";
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " - " + college);
    }
}


