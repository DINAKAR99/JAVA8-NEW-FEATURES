import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {

  public static List<Employee> getAllEmployee() {
    return Stream
      .of(
        new Employee(1, "ram", 1000, "A"),
        new Employee(2, "BHIM", 2000, "B"),
        new Employee(2, "BHIM", 2390, "B")
      )
      .collect(Collectors.toList());
  }

  public static List<Employees> getEmployeeRandom() {
    List<Employees> l1 = new ArrayList<>();

    for (int i = 0; i < 1000; i++) {
      l1.add(new Employees(i, "name:" + i, i));
    }
    return l1;
  }
}
