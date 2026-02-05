// Convert uppercase to lower case using Bit
public class Qns_05 {
    public static void main(String[] args) {
        String s = "HELLO WORLD";
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z')
                result.append((char) (ch | 32));
            else
                result.append(ch);
        }

        System.out.println(result); // hello world
    }

}
