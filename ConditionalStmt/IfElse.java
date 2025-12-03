package ConditionalStmt;

public class IfElse {
    public static void main(String[] args) {
        
        int age = 45;

        if(age < 18){
            System.out.println("You are not eligible to vote.");
        } else {
            System.out.println("You are an Adult, eligible to vote.");

            if(age >= 25 && age < 40){
                System.out.println("You are a Young Adult.");
            } else if(age >= 40 && age < 60){
                System.out.println("You are a Senior Adult.");
            } else {
                System.out.println("You are an Elderly Person (Senior citizen).");
            }
        }
    }
    
}
