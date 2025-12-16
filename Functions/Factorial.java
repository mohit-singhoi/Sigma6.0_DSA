package Functions;

public class Factorial {
    // public static  void fact(int n){
      
    //     int f=1;
    //     for(int i=1;i<=n;i++){
    //         f=f*i;
    //     }
    //     System.out.println("factorial of "+n +" is : "+f);
        
    // }
    // public static void main(String[] args) {
    //     int n=5;
    //     fact(n);
    // }

    //using Recursive way
    public static int fact(int n){
        if(n==0 || n==1)return 1;
        else
            return n*(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int result = fact(n);
        System.out.println("Factorial of "+n+ " is :"+result);
    }
    
}
