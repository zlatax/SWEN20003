public class Book {
    private String author, title;
    private boolean borrowed; //True=Borrowed, False=NotBorrowed
    private String borrowedBy = null;

    public Book(String author, String title, boolean borrowed) {
        this.author = author;
        this.title = title;
        this.borrowed = borrowed;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    @Override
    public String toString() {
        return author+" : "+title;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    void borrow(String borrowedBy) {
        if(!borrowed) {
            this.borrowed = true;
            this.borrowedBy = borrowedBy;
        }
    }

    void returnBook() {
        if(borrowed) {
            borrowed = false;
            borrowedBy = null;
        }
    }


}
