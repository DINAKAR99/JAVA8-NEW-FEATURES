import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

  List<Book> getBooksinSort() {
    List<Book> Books = new BookDAO().getBooks();
    Collections.sort(Books, (i, j) -> i.getName().compareTo(j.getName()));
    return Books;
  }

  //   class Mycomparator implements Comparator<Book> {

  //     @Override
  //     public int compare(Book o1, Book o2) {
  //       return o1.getName().compareTo(o2.getName());
  //     }
  //   }

  public static void main(String[] args) {
    System.out.println(new BookService().getBooksinSort());
  }
}
