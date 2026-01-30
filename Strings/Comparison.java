public class Comparison {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        // Compare s1 and s2
        if (s1 == s2) {
            System.out.println("Strings are equal");
        } else
            System.out.println("Strings are not equal");

        // Compare S1 and S3 : == is check at object level string are equal or not 
        if (s1 == s3) {
            System.out.println("Strings are equal");
        } else
            System.out.println("Strings are not equal");


        // Compare using equals function : equals() function check at value level where strings values are equal or not
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
        else 
            System.out.println("Strings are not equal");
    }

}
