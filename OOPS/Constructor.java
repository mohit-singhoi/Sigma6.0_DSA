public class Constructor {
    public static void main(String[] args) {
        // Student s1 = new Student("Mohit");
        // System.out.println("Student Name : "+s1.name);

        Student s1 = new Student();
        Student s2 = new Student("Mohit");
        System.out.println("Student Name : "+s2.name);
        Student s3 = new Student(3);
        System.out.println("Student Roll : "+s3.roll);


    }
    
}

class Student{
    String name;
    int roll;


    // Non parameterized Constructor
    Student(){
        System.out.println("Constructor is Called...");
    }

    //Parameterized  Constructor  
    Student(String name){
        this.name = name;
        
    }

    Student(int roll){
        this.roll = roll;
    }

}
