// WAP of Keypad Combination Problem
public class KeypadCobinationProblem {

    final static char[][] keypad = {
        {}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'},
        {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'},
        {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}
    };
    
    public static void keypadCombination(String digits, String current, int index) {
        if (index == digits.length()) {
            System.out.println(current);
            return;
        }
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            keypadCombination(digits, current + letters.charAt(i), index + 1);
        }
    }

    public static void main(String[] args) {
        String digits = "24";
        System.out.println("Possible combinations for digits " + digits + ":");
        keypadCombination(digits, "", 0);
    }
}
