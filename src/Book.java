import java.time.LocalDate;

public class Book {
    int id;
    String bookName;
    int price;
    String genre;
    LocalDate createDate;

    public Book(int id, String bookName, int price, String genre, LocalDate createDate) {
        this.id = id;
        this.bookName = bookName;
        this.price = price;
        this.genre = genre;
        this.createDate = createDate;
    }

    public String toString(){
        return "Id: "+ id + "\n" + "Book name: " + bookName + "\n" +"Price: " +  price + "\n" + "Genre: " + genre + "\n" + "Create Date: " + createDate;
    }



}
