package PracticeSet;

public class Qns_03 {
    public static void main(String[] args) {
        Student s1 = new Student("Mohit");
        Student s2 = new Student("Rahul");

        s1.display();
        System.out.println("Percentage : " +Student.calPercentage(47, 042, 39, 44, 48));
        s2.display();
    }
}

class Student {
    static String college = "ABC College";
    String name;

    Student(String name) {
        this.name = name;
    }

    static float calPercentage(int AJava, int DAA , int APPDev , int BigData ,int Eng ){
        return (AJava+DAA+APPDev+BigData+Eng)/2.5f;
    }

    void display() {
        System.out.println(name + " - " + college);
    }
}


