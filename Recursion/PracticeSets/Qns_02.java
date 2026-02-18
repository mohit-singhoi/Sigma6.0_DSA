package PracticeSets;

public class Qns_02 {
    public static void removeDuplicates(String Str , int idx , StringBuilder newStr , boolean map[]){
        // Base case
        if(idx == Str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = Str.charAt(idx);
        if(map[currChar - 'a'] == true){
            // duplicate
            removeDuplicates(Str, idx+1, newStr, map);
        } else {
            map[currChar -'a'] = true;
            removeDuplicates(Str, idx, newStr.append(currChar), map);
        }
    }

    // Main function
    public static void main(String[] args) {
        String str = "apnacollege";
        System.out.print(" After Removing Duplicates : ");
        removeDuplicates( str, 0, new StringBuilder(" "), new boolean[26]);
    }
}
