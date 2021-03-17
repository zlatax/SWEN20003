import java.lang.*;

public class main {
    public static void main(String[] args) {
        System.out.println("============== Q1 ==============");
        Circle c1 = new Circle();
        System.out.println("c1: "+c1);
        Circle c2 = new Circle();
        System.out.println("c1.equals(c2) = "+c1.equals(c2));
        Circle c3 = new Circle(10);
        System.out.println("c1.equals(c3) = "+c1.equals(c3));

        // todo Q2: instantiate an rectangle with (3, 15), a width (3), and a height (15)
        System.out.println("============== Q2 ==============");
        Rectangle rectangle = new Rectangle();

        // todo Q3: deonstrate your methods
        System.out.println("============== Q3 ==============");
        // Book book1 = new Book("Charles Dickens", "Great Expectations");
        // Book book2 = new Book("Sun Tzu", "The Art of War");
        // Book book3 = new Book("Brian Kernighan & Denis Ritchie", "The C Programming Language");

        // Q4: deonstrate your methods
        System.out.println("============== Q4 ==============");
        Library library = new Library();
        // todo Q4(g) Write a main method to create some books, add them to a library, look up books, and borrow them.
        // uncomment following to check your answer
        // library.addBook(book1);
        // library.addBook(book2);
        // library.addBook(book3);
        // System.out.print(library.getCatalogue());
        // Book dickens = library.lookup("Great Expectations");
        // dickens.borrow("somebody");
        // System.out.println("Number of books borrowed: " + library.numBorrowed());
    }
}
