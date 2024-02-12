import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Infistream {

  public static void main(String[] args) {
    Stream<Integer> infi = Stream.iterate(0, (e -> e + 2));
    List<Integer> lis = infi.limit(10).collect(Collectors.toList());

    lis.forEach(System.out::println);

    IntStream string = "abcd".chars();

    System.out.println("-----------------");
    Stream<String> splitAsStream = Pattern.compile(",").splitAsStream("a,b,c");
    splitAsStream.forEach(System.out::println);

    Path path1 = Paths.get("ClassWork\\MapEx.java");
    try (Stream<String> st = Files.lines(path1, Charset.forName("UTF-8"));) {
      st.forEach(System.out::println);

      System.out.println("---------------");
    } catch (IOException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
  }
}
