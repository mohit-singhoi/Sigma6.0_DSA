// Qns 4. Determine if 2 Strings are anagram of each other or not

// Iftwostringscontainthesamecharactersbutinadifferentorder,
// theycanbesaidtobeanagrams.Considerraceandcare.Inthiscase,race'scharacterscanbeformedintoastudy,orcare'scharacterscanbeformedintorace

import java.util.Arrays;

public class Qns_04 {
    public static boolean checkAnagram(String str1, String str2){
        char[] a = str1.toCharArray();
        char [] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b)){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        String str1 ="race";
        String str2 ="care";
        System.out.println("Given String is Anagram ? : " +checkAnagram(str1, str2));
    }
    

    
}
