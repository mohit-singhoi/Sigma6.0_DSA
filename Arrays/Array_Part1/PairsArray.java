public class PairsArray {
    public static void pairsOfArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+ arr[j]+")\t");
            }
            System.out.println();
        }
        int tp = arr.length*(arr.length-1)/2; // tp means total no. of pairs 
        System.out.println("Total number of Pairs : " +tp);
      //  System.out.println("Total Numbers of Pairs is : "+ (arr.length*(arr.length-1))/2);

    }
    public static void main(String[] args) {
        int arr[] ={2,4,6,8,10};
        pairsOfArray(arr);
    }
    
}
