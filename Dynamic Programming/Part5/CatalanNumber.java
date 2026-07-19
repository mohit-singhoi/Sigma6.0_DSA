// Catalan's number Problem using recursion

//C0 = 1
//C1 = 1

//C2 = C0.C1 + C1.C2 = 2
//C3 = C0.C2 + C1.C2 + C2.C0 = 5
//C4 = 

public class CatalanNumber {
    public static int catalanRec(int n){
        if( n == 0 || n == 1){
            return 1;
        }

        int ans = 0; //cn
        for(int i =0;i<=n-1;i++){
            ans += catalanRec(i) * catalanRec(n-i-1);
        }
        return ans;

    }

    public static void main(String[] args){
        int n = 4;
        System.out.println(" Catalan of " + n + " is : " + catalanRec(n));
    }
    
    
}
