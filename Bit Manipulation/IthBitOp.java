public class IthBitOp {
    public static void getIthBit(int n, int i){
        int BitMask =1;
        if((n & (BitMask<<i)) ==0){
            System.out.println("ith Bit is zero (0)");
        }
        else{
            System.out.println("ith Bit is 1");
        }
        
    }
    public static void main(String[] args) {
        int n= 15;
        int i= 2;
        getIthBit(n, i);
    }

    
}
