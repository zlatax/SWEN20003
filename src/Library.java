public class Library {
    private int book_limit =10, currNumBooks =0;
    private Book archive[] = new Book[book_limit];

    public Library() {
        this.archive = archive;
    };

     public void addBook(Book newBook) {
        if(!(archive.length >= book_limit)) {
            archive[currNumBooks] = newBook;
            currNumBooks++;
        }
    }

    public void returnBook(Book newBook) {
        for(int i=0;i<currNumBooks;i++) {
            if(newBook.toString().equals(archive[i].toString())) {
                // add line here to remove Book from array (no useful function)
                currNumBooks--;
            }
        }
    }

    public Book lookup(String title) {
         for(int i=0;i<currNumBooks;i++) {
             if(title.equals(archive[i].getTitle())) {
                 return archive[i];
             }
         }
        return null;
    }

    public Book lookup(String title, String author) {
        for(int i=0;i<currNumBooks;i++) {
            if(title.equals(archive[i].getTitle()) & author.equals(archive[i].getAuthor())) {
                return archive[i];
            }
        }
        return null;
    }

    public String getCatalogue() {
         String message="";
         for(int i=0;i<currNumBooks;i++)
             message = message.concat(archive[i].toString()+"\n");
         return message;
    }

    public int getCurrBorrowed() {
        return currNumBooks;
    }

}
