import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

  private static void doProcess(Student s) {
    System.out.println(s);
  }

  public static void main(String[] args) {
    String[] arr = { "a", "b", "c" };
    Stream<String> str = Arrays.stream(arr);
    str.forEach(System.out::println);

    System.out.println("------------------");
    Stream<String> of = Stream.of("a", "b", "c");
    ///////////////////////////

    of.forEach(System.out::println);
    System.out.println("------------------");

    List<String> list = new ArrayList<>();
    list.add("a1");
    list.add("a2");
    list.add("a3");

    List<Student> stulist = new ArrayList<>();
    stulist.add(new Student("a", 1));
    stulist.add(new Student("b", 2));
    stulist.add(new Student("c", 3));

    Stream<Student> s1 = stulist.parallelStream(); // generates threads internallyw
    s1.forEach(s -> doProcess(s));
  }
}
