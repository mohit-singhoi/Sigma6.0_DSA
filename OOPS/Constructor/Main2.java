public class Main2 {
    public static void main(String[] args) {
        SchoolStudent st = new SchoolStudent();
        st.display();
    }
}

class Student{
    String name;

    Student(String name){
        this.name = name;
    }
    
    void display(){
        System.out.println("Student Name :"+name);
    }
}

class SchoolStudent extends Student{
    SchoolStudent(){
        super("Rakesh");
        super.display();
    }
}
