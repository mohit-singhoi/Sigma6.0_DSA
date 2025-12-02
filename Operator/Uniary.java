public class Uniary {
    public static void main(String[] args) {

        int a=10;

        int b= ++a;

       // int b= a++;
        System.out.println("Value of a: "+a);  //11
        System.out.println("Value of b: "+b);  //11

        int c=20;
       // int d=c--;

        int d=--c;
        System.out.println("Value of c: "+c);  //19
        System.out.println("Value of d: "+d);  //20
        
    }
    
}
