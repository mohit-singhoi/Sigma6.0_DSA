package Abstraction;

public class Main3 {
    public static void main(String[] args) {
        SavingAcc myacc = new SavingAcc();
        // BankAccount --> SBI --> SavingAcc
        myacc.calInterest(); // Only saving bank Interest cal is called
        myacc.ac(); // Different fun is called but when 2-3 same fun in diff. class it overrides the fun latest fun is called.
        
    }
}

abstract class BankAccount{

    String name;
    BankAccount(){
        System.out.println("Bank Account Open.");
    }

    void ac(){
        System.out.println("Hii, Customer.");
    }

    abstract void calInterest();
}

class SBI extends BankAccount{

    SBI(){
        System.out.println("Account Open in SBI Bank");
    }
    void ac(){
        System.out.println("Hello, Welcome to SBI");
    }

    void calInterest(){
        System.out.println("Interest rate is : 3.5%");
    }
}

class SavingAcc extends SBI{

    SavingAcc(){
        System.out.println("Saving Account Open in SBI");
    }

    void calInterest(){
        System.out.println("Saving Account Interest rate is : 3.5");
    }
}

class KOTAKM extends BankAccount{

    void calInterest(){
        System.out.println("Kotak Saving Account Interest is : 6.5%");
    }

    

}