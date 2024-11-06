import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Uzak Jol", 150, "Roman", LocalDate.of(1990,12,23));
        Book book2 = new Book(1, "Erte Kelgen Turnalar", 230, "Roman", LocalDate.of(2001,12,23));
        Book book3 = new Book(1, "Ak Keme", 350, "Povest", LocalDate.of(2005,03,23));
        Book book4 = new Book(1, "Singan Kilich", 150, "Povest", LocalDate.of(2000,12,23));
        Book book5 = new Book(1, "Uzak", 150, "Roman", LocalDate.of(1990,12,23));

        Book[] books1 = {book1, book2};
        Book[] books2 = {book1, book2, book3};
        Book[] books3 = {book1, book2, book3, book4};

        Library library1 = new Library(1, "BookStrore", "Toktogul",books1);
        Library library2 = new Library(2, "BookStrore", "Toktogul",books2);
        Library library3 = new Library(3, "BookStrore", "Toktogul",books3);

        if(library1.id == 1){
            System.out.println(library1.toString());
        }


    }
}