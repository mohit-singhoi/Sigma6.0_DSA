package Constructor;
public class CopyConstructor {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.UserName = "Mohit Kumar";
        b1.age = 22;
        b1.pass = 379;

        b1.txns[0] = 100;
        b1.txns[1] = 755;
        b1.txns[2] = 15000;

        Bank b2 = new Bank(b1); // Copy All Properties
        b2.pass = 973;
        b1.txns[2] = 50000;

        System.out.println("Marks");
        for(int i=0;i<3;i++){
            System.out.println(b2.txns[i]);
        }



    }
}

class Bank {
    String UserName;
    int age;
    int pass;
    int txns[];

    // //Shallow Copy Constructor
    // Bank(Bank b1) {
    //     txns = new int [3];
    //     this.UserName = b1.UserName;
    //     this.age = b1.age;
    //     this.txns = b1.txns; // Here only referenced is copied

    // }

    // Deep copy constructor
    Bank(Bank b1){
        txns = new int[3];
        this.UserName = b1.UserName;
        this.age = b1.age;
        for(int i=0;i<txns.length;i++){
            this.txns[i] = b1.txns[i];
        }
    }

    // Non-parameterized Constructor
    Bank() {
        txns = new int [3];
        System.out.println("Constructor Created...");
    }

    // parameterized Constructor
    Bank(String UserName) {
        txns = new int [3];
        this.UserName = UserName;
    }
}