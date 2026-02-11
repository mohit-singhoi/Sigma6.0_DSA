package Encapsulation;
public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        System.out.println("UserName : "+bank.UserName);
        System.out.println("User Age : "+bank.age);

       // System.out.println("User Password : "+bank.password);
       bank.setPass("mohit@379");
       System.out.println("Password Changed!");
        
    }
    
}

class BankAccount{
    public String UserName ="Mohit Kumar";
    int age =22;
    private String password = "hitMo213"; // Not allow to outside the class

    public void setPass(String newPass){
        password = newPass;
        // System.out.println(password);
    }

}
