import java.util.Arrays;

public class Library {
    int id;
    String name;
    String address;
    Book[] book;

    public Library(int id, String name, String address, Book[] book) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.book = book;
    }

    public String toString(){
        String books = Arrays.toString(book);
        return String.format("""
                ID: %d
                Name: %s
                Address: %s
                Book: %s
                """, id, name, address, books);
    }


}
