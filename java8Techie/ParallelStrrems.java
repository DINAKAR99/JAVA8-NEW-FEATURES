import java.util.List;
import java.util.stream.IntStream;

public class ParallelStrrems {

  public static void main(String[] args) {
    // long t1 = System.currentTimeMillis();

    // IntStream.range(1, 1000).forEach(System.out::println);
    // long t2 = System.currentTimeMillis();

    // System.out.println("TIME TOOK BY SEQUENTIAL STREAM IS :" + (t2 - t1));
    // System.out.println("--------------------");

    // t1 = System.currentTimeMillis();

    // IntStream.range(1, 1000).parallel().forEach(System.out::println);
    // t2 = System.currentTimeMillis();

    // System.out.println("TIME TOOK BY PARALLEL STREAM IS :" + (t2 - t1));

    // IntStream
    //   .range(1, 10)
    //   .forEach(s ->
    //     System.out.println(Thread.currentThread().getName() + " -" + s)
    //   );

    // System.out.println("----------------------------");
    // IntStream
    //   .range(1, 10)
    //   .parallel()
    //   .forEach(s ->
    //     System.out.println(Thread.currentThread().getName() + " -" + s)
    //   );

    List<Employees> l2 = EmployeeDatabase.getEmployeeRandom();
    long t1 = System.currentTimeMillis();
    double asDouble = l2
      .stream()
      .map(Employees::getSalary)
      .mapToDouble(i -> i)
      .average()
      .getAsDouble();
    long t2 = System.currentTimeMillis();

    System.out.println("TIME TOOK BY seq STREAM IS :" + (t2 - t1));
    List<Employees> l3 = EmployeeDatabase.getEmployeeRandom();
    t1 = System.currentTimeMillis();
    asDouble =
      l3
        .stream()
        .parallel()
        .map(Employees::getSalary)
        .mapToDouble(i -> i)
        .average()
        .getAsDouble();
    t2 = System.currentTimeMillis();

    System.out.println("TIME TOOK BY parallely7 STREAM IS :" + (t2 - t1));
  }
}
