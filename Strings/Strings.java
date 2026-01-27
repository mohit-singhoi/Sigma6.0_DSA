//Strings are immutable in java : it means once created their values cannot be changed  


public class Strings {
    public static void main(String[] args) {

       ////char to string
        // char arr[] = {'H', 'e', 'l', 'l', 'o'};
        // String str ="abcde";
        // String str2 = new String("xyz");
        char arr[] = {'H', 'e', 'l', 'l', 'o'};
        String str = new String(arr);
        System.out.println("String: " + str);
    }
    
}
