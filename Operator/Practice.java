public class Practice {
    public static void main(String[] args) {

        // //1. What will be the output of the following code snippet?
        // int x=2, y=5;

        // int exp1 =(x*y/x);
        // int exp2 = (x*(y/x));

        // System.out.println("Value of exp1: " + exp1);
        // System.out.println("Value of exp2: " + exp2);


        // //2. What will be the output of the following code snippet?
        // int x=200,y=50,z=100;
        // if(x>y  && y>z){
        //     System.out.println("Hello");
        // }
        // if(z>y && z<x){
        //     System.out.println("Java");
        // }

        // if((y+200) < x && (y+150) <z){
        //     System.out.println("Hello Java");
        // }


        // //3. What will be the output of the following code snippet?
        // int x,y,z;
        // x=y=z=2;
        // x+=y;
        // y-=z;
        // z/=(x+y);

        // System.out.println("Value of x:"+x +"\nValue of y:"+y +"\nValue of z:"+z);


        // //4. What will be the output of the following code snippet?
        // int x=9, y=12;
        // int a=2, b=4, c=6;

        // int exp = 4/3 * (x+34) +9 * (a+b+c) + (3+y*(2+a))/(a+b*y);

        // System.out.println("Value of exp: " + exp);


        //5. What will be the output of the following code snippet?
        int x=10, y=5;

        int exp1 = (y*(x/y+x/y));
        int exp2 = (y*x/y+y*x/y);

        System.out.println("Value of exp1: " + exp1);
        System.out.println("Value of exp2: " + exp2);   
    }

    
}
