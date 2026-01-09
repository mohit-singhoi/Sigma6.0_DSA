public class LinearSearch {

    public static void  linearsearch(int marks[], int key){
        for(int i=0;i<marks.length;i++){
            if(marks[i]==key){
                System.out.println("Key is found on the index of :"+i);
                return;
            }
        }
        System.out.println("Key not found");
    }

    public static void main(String[] args) {
        int marks[]={89,78,98,69,76};
        int key=69;
        linearsearch(marks, key);
    }
    
}
