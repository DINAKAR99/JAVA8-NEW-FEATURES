import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Skiplimit {

  public static void main(String[] args) throws IOException {
    List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);

    l1.stream().skip(2).limit(4).forEach(System.out::println);

    List<String> dta = Files.readAllLines(
      Paths.get(
        "C:\\TRAINING\\JAVA\\JAVA8-NEW-FEATURES\\functionalInterface\\data.txt"
      )
    );

    System.out.println(
      Paths.get(
        "C:\\TRAINING\\JAVA\\JAVA8-NEW-FEATURES\\functionalInterface\\data.txt"
      )
    );

    dta.stream().skip(1).limit(dta.size() - 2).forEach(System.out::println);
  }
}
