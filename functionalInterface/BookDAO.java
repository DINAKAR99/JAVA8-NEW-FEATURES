import java.util.ArrayList;
import java.util.List;

public class BookDAO {

  public List<Book> getBooks() {
    List<Book> books = new ArrayList<>();
    books.add(new Book(1, "jhon", 1));
    books.add(new Book(2, "ron", 2));
    books.add(new Book(3, "jack", 3));
    return books;
  }
}
