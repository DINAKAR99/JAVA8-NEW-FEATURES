import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

  public List<Employee> loadEmployeesFromDB() {
    List<Employee> l1 = new ArrayList<>();
    l1.add(new Employee(1, "remo", 20000));
    l1.add(new Employee(2, "bhanu", 20000));
    l1.add(new Employee(3, "ninja", 20000));

    return l1;
  }
}
