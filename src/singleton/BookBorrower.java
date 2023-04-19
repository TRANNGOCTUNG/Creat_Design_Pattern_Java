package singleton;

public class BookBorrower {
    private boolean haveBook;
    private static BookSingleton borrowedBook;

    public void  borrowBook(){
        borrowedBook = BookSingleton.borrowBook();
        if(borrowedBook == null){
            haveBook = false;
        } else{
            haveBook = true;
        }
    }
    public String getAuthorAndTitle() {
        if(haveBook){
            return borrowedBook.getAuthorAndTitle();
        }
        return "I have not book";
    }
    public void returnBook(){
         borrowedBook.returnBook(borrowedBook);
    }

}
