import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {

  public static List<customer> getAll() {
    return Stream
      .of(
        new customer(1, "jhon", "s@g.com", Arrays.asList("1233", "2342")),
        new customer(1, "jhon", "s@g.com", Arrays.asList("1233", "2342")),
        new customer(1, "jhon", "s@g.com", Arrays.asList("1233", "2342"))
      )
      .collect(Collectors.toList());
  }
}
