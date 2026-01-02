//Inverted Half-Pyramid with Numbers
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1


package PatternPrinting.Level_02;

public class Pattern_03 {
    public static void printhalfPyramidNum(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
             
                System.out.print(j+" ");

            }
            //    n=n-1;
               System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        printhalfPyramidNum(n);
    }

    
}
