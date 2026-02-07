public class GetterSetter {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Student Name : "+s1.name);
    }
}

class Student {
    String name = "Mohit Kumar";
    int age = 22;
    float salary = 75000.0f;


    void setAge(int newAge) {
        age = newAge;
    }

    void changeSalary(float newSalary){
        salary = newSalary;
    }

}
