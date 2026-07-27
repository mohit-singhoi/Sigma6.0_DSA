//WAP to print the sum of 1 to 10

package Arrays.Array_Part1;

public class sum {
    public static int sum(int n){
        int sum1=0;
        for(int i=1;i<=n;i++){
            sum1=sum1+i;
        }
        return sum1;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("Sum : " +sum(n));
    }
    
}
