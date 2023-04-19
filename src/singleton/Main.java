package singleton;

public class Main {
    public static void main(String[] args) {
        BookBorrower bookBorrower = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower.borrowBook();
        System.out.println("BookBorrower1 asked to borrow the book");
        System.out.println("BookBorrower1 Author and Title: ");
        System.out.println(bookBorrower.getAuthorAndTitle());


        bookBorrower2.borrowBook();
        System.out.println("BookBorrower2 asked to borrow the book");
        System.out.println("BookBorrower2 Author and Title: ");
        System.out.println(bookBorrower2.getAuthorAndTitle());

        bookBorrower.returnBook();
        System.out.println("BookBorrower1 returned the book");

        bookBorrower2.borrowBook();
        System.out.println("BookBorrower2 Author and Title: ");
        System.out.println(bookBorrower.getAuthorAndTitle());

        System.out.println("END TESTING SINGLETON PATTERN");

    }
}
