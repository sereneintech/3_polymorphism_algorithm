import publications.Book;
import publications.Newspaper;

public class Main {

    public static void main(String[] args) {

        Newspaper newspaper = new Newspaper("The Times", 60, "R. Murdoch");

        newspaper.calculateMarkup();
        newspaper.calculateMarkup(true);

        Book book = new Book("Harry Potter", 347856, "JK Rowling", 8);
        book.calculateMarkup();

    }

}
