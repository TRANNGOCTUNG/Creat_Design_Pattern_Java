package singleton;

public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton bookSingleton = null;
    private static boolean isLoanedOut;

    private BookSingleton() {
        author = "Adam,Seme";
        title = "Think the world, Just do now";
        isLoanedOut = false;
        System.out.println("Successfully initialized: ");
    }

    public static BookSingleton borrowBook() {
        if (!isLoanedOut) {
            if (bookSingleton == null) {
                bookSingleton = new BookSingleton();
            }
            isLoanedOut = true;
        }
        return null;
    }

    public void returnBook(BookSingleton bookReturn) {
        isLoanedOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthorAndTitle() {
        return title + " by " + author;
    }

}


