public class Qns_05 {
    public static void main(String[] args) {
        System.out.println("No of Books : "+Book.count);
        Book b1 = new Book(150);
        Book b2 = new Book(225);

        System.out.println("Total Books : " + b1.count);
        System.out.println("Total Books : " + b2.count);
        System.out.println("Total Books : " + Book.count);
    }
}

class Book{
    int price;
    static int count;

    public Book(int price){
        this.price = price;
        count++;
    }
}
