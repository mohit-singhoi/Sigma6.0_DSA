package Interfaces;

public class Main6 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student.CollegeName = "Galgotias University";

        System.out.println("College Name is : "+Student.CollegeName);
        s1.setName("Mohit Kumar");
        s1.roll = 261;
        System.out.println("Student Name is : " +s1.getName());
        System.out.println("Student Roll : " + s1.roll);

        Student s2 = new Student();
        Student.CollegeName = "ABC College";
        System.out.println("College Name : " +Student.CollegeName);
    }

}

class Student {
    String name;
    int roll;

    static String CollegeName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}