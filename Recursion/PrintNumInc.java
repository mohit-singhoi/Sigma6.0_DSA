public class PrintNumInc {
    
    public static void printNumInc(int n){
        if(n == 1){
            System.out.println(n+" ");
            return;
        }
        printNumInc(n-1);
        System.out.println(n+" ");
    }

    //Main fun
    public static void main(String[] args) {
        int n = 10;
        printNumInc(n);
    }
}
