import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapEx {

  public static void main(String[] args) {
    List<String> uris = new ArrayList<>();
    uris.add("c:\\new1.txt");
    uris.add("c:\\new2.txt");
    uris.add("c:\\new3.txt");

    Stream<Path> map = uris.stream().map(Paths::get);
    map.forEach(System.out::println);

    List<Detail> details = new ArrayList<>();
    List<String> parts1 = new ArrayList<>();
    parts1.add("parts11");
    parts1.add("parts12");
    parts1.add("parts13");
    List<String> parts2 = new ArrayList<>();
    parts2.add("parts21");
    parts2.add("parts22");
    parts2.add("parts23");
    parts2.add("parts3");

    Detail detail1 = new Detail(1001, parts1);
    Detail detail2 = new Detail(1002, parts2);

    details.add(detail2);
    details.add(detail1);

    Stream<String> flat = details
      .stream()
      .flatMap(s -> s.getDetails().stream());

    flat.forEach(System.out::println);

    System.out.println("------------------");

    List<Integer> int1 = Arrays.asList(1, 1, 1);

    Integer int11 = int1.stream().reduce(25, (a, b) -> a + b);
    System.out.println(int11);
  }
}
