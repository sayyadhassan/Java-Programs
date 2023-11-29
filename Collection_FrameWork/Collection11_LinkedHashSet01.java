package Collection_FrameWork;

import java.util.LinkedHashSet;

class Book{
    int bookId;
    String bookName,author,publisher;
    int quantity;
    public Book(int bookId,String bookName,String author,String publisher,int quantity){
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class Collection11_LinkedHashSet01 {
    public static void main(String []args){
        // Creating LinkedHashSet of Book type
        LinkedHashSet<Book> lh = new LinkedHashSet<>();

        // Creating Books
        Book b1 = new Book(101,"Computer","Ram Chaturvedi","Harihar",4);
        Book b2 = new Book(102,"English","Suresh Kumar","Ajanta Publication",6);
        Book b3 = new Book(103,"Java Programming","Raghuvender Verma","Chanchal Publication",9);

        // Adding books into the list
        lh.add(b1);
        lh.add(b2);
        lh.add(b3);

        // Traversing List using for-each-loop
        for(Book b : lh){
            System.out.println("Book Id-"+b.bookId+", "+"Book Name-"+b.bookName+", "+"Author Name-"+b.author+", "+"Publisher-"+b.publisher+", "+"Quantity-"+b.quantity);
        }

    }
}
