import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Map_FlatMap {

  public static void main(String[] args) {
    List<customer> customer = EkartDataBase.getAll();
    //convrt list<cust> to list<string>

    List<String> emails = customer
      .stream()
      .map(e -> e.getEmail())
      .collect(Collectors.toList());
    System.out.println(emails);

    List<String> ph = customer
      .stream()
      .flatMap(e -> e.getPhNums().stream())
      .collect(Collectors.toList());
    System.out.println(ph);
  }
}
