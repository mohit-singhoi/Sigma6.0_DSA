public class ClassObject {
    public static void main(String[] args) {
        Pen p = new Pen();
        System.out.println("Pen color : " + p.color);
        p.setColor("Red");
        System.out.println("Updated Pen color : " + p.color);

        p.setTip(5);
        System.out.println("Pen Thickness : "+p.tip);

        // Student Class
        System.out.println("Percentage : "+ Student.percentage);
        Student.calcPercentage(89, 78, 91, 80,73);
        System.out.println("Updated Percentage : "+Student.percentage);

    }

}

class Pen {
    String color = "Blue";
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) { // Thickness  Scale range  is : 1-10
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    static float percentage = 74; // cgpa

   public static void calcPercentage(int sub1, int sub2, int sub3, int sub4, int sub5) {
        percentage = (sub1 + sub2 + sub3 + sub4 + sub5)/5;
    }

    void changeAge(int updatedAge) {
        age = updatedAge;
    }

}