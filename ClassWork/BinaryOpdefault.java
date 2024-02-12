import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BinaryOpdefault {

  public static void main(String[] args) {
    List<Employee> empList = new ArrayList<>();

    empList.add(new Employee("A", 30000, "HR"));
    empList.add(new Employee("B", 20000, "HR"));
    empList.add(new Employee("C", 100000, "HR"));
    empList.add(new Employee("D", 30000, "HR"));

    empList.add(new Employee("X", 30000, "Finance"));
    empList.add(new Employee("Y", 20000, "Finance"));
    empList.add(new Employee("X", 1000, "Finance"));
    empList.add(new Employee("P", 90000, "Finance"));

    Comparator<Employee> salaryComparator = Comparator.comparing(
      Employee::getSalary
    );
  }
}
