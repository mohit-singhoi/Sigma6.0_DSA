// Remove Duplicates in a String
// "appnnacollege"

package Part2;

public class RemoveDuplicate {
    public static void removeDuplicate(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }

    //Main function
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicate(str);
    }

}
