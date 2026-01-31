public class LargestStr { // O(maxnumlen*N(compare every element))
    
    public static void main(String[] args) {
        String names[] ={"Ankit Raj","Dipak","Mohit", "Amit","Abhishek","Raja","Ankit"};

        String largest = names[0];
        for(int i=0;i<names.length;i++){
            if(largest.compareToIgnoreCase(names[i])<0){
                largest = names[i];

            }
        }

        System.out.println("Largest String is : " +largest);
    }
}
