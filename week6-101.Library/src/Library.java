import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library;
    
    public Library() {
        this.library = new ArrayList<Book>();
    }
    
    public void addBook (Book newBook) {
        this.library.add(newBook);
    }
    
    public void printBooks() {
        for (Book entry : this.library) {
            System.out.println(entry);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book entry : this.library) {
            if (StringUtils.included(entry.title(), title)) {
                found.add(entry);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book entry : this.library) {
            if (StringUtils.included(entry.publisher(), publisher)) {
                found.add(entry);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book entry : this.library) {
            if (entry.year() == year) {
                found.add(entry);
            }
        }
        return found;
    }
}

