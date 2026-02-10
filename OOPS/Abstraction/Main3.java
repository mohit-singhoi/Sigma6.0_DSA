package Abstraction;

public class Main3 {
    public static void main(String[] args) {
        SavingAcc myacc = new SavingAcc();
        // BankAccount --> SBI --> SavingAcc
        
    }
}

abstract class BankAccount{

    String name;
    BankAccount(){
        System.out.println("Bank Account Open.");
    }

    abstract void calInterest();
}

class SBI extends BankAccount{

    SBI(){
        System.out.println("Account Open in SBI Bank");
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