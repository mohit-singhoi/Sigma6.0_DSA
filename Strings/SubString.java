public class SubString {


    public static String substring(String  str, int stridx , int endidx){
        String subStr ="";
        for(int i=stridx; i<endidx;i++){
            subStr += str.charAt(i);
        }
        return subStr;

    }
    public static void main(String[] args) {
        // SubString : Substring is part of a string 

        String str = "Java Programming";
       String  fullName = " Mohit Kumar";
       // String collegeName = "Galgotias University";
       String result = substring(str,5,16);

       System.out.println("The original string is: " + str);
       // Using substring function
       System.out.println("The substring using built-in function is: " + str.substring(5,16));
       System.out.println("The substring is: " + result);

       System.out.println("Length of the substring is: " + result.length()  );

       // Sub String of fullName 
       // This is the alternative way to get substring
       String subFullName = substring(fullName,6,12);
       System.out.println("The substring of fullName is: " + subFullName);
    }
    
}
