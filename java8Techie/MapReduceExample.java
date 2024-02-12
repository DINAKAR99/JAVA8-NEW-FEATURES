import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {

  public static void main(String[] args) {
    List<Integer> ints = Arrays.asList(3, 4, 56, 7);
    List<String> words = Arrays.asList("jhon", "ronny", "bugsby");

    int sum1 = ints.stream().mapToInt(e -> e).sum();
    int sum2 = ints.stream().reduce(0, (a, b) -> a + b);
    int max = ints.stream().reduce(0, (a, b) -> a > b ? a : b);

    double avgSal = EmployeeDatabase
      .getAllEmployee()
      .stream()
      .filter(e -> e.getGrade().equalsIgnoreCase("A"))
      .map(e -> e.getSalary())
      .mapToDouble(e -> e)
      .average()
      .getAsDouble();
    // System.out.println(sum2);
    System.out.println(avgSal);

    double sumSal = EmployeeDatabase
      .getAllEmployee()
      .stream()
      .filter(e -> e.getGrade().equalsIgnoreCase("A"))
      .map(e -> e.getSalary())
      .mapToDouble(e -> e)
      .sum();
    // System.out.println(sum2);
    System.out.println(sumSal);

    Optional<Integer> reducesumwithMethodRef = ints
      .stream()
      .reduce(Integer::sum);
    System.out.println(reducesumwithMethodRef.get());

    String longWord = words
      .stream()
      .reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2)
      .get();
    System.out.println(longWord);
  }
}
