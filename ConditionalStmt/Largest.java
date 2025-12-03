package ConditionalStmt;

public class Largest {
    public static void main(String[] args) {
        int a=10,b=5;

        // if(a>b){
        //     System.out.println(a + " is a largest Number");
        // } else {
        //     System.out.println(b + " is a  largest Number");
        // }


        int c=25;
        if(a>b && a>c){
            System.out.println(a +"is the largest Number");
        } else if (b>c){
            System.out.println(b +" is the largest Number");    
        }
        else{
            System.out.println(c +" is the largest Number");
        }
        
    }
    
}
