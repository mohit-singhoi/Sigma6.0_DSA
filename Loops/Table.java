public class Table{
  public static void tablePrint(int n){
 for(int i =1; i<=10; i++){
    int table = n*i;
  System.out.println(n + " X " + i + " = "       +table);
   }
}

// Maine function 
public static void main(String [] args){
 int n = 5;
System.out.println("Print Table");
tablePrint(n);
}
}

