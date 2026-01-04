//WAP to print 0-1 Traiangle
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

package PatternPrinting.Level_02;

public class Pattern_05 {
    ////1st way
    
    // public static void zeroOne(int n){
    //     boolean temp=true;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             if(temp){
    //                 System.out.print("1 ");
    //             }else{
    //                 System.out.print("0 ");
    //             }
    //             temp = !temp;
    //         }
    //         System.out.println();
    //     }

    ////2nd way
    public static void zeroOne(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0) { //even
                    System.out.print("1"+" ");
    
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        int n=5;
        zeroOne(n);
    }
    
}
