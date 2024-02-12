import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodReferenceDemo {

  public static void main(String[] args) {
    EmployeeService servie = new EmployeeService();

    EmployeeManager manager = Employee::new;
    manager.getEmployee().getEmployeeInfo();

    //ANNONYMOUS IMPLEMENTATION
    // servie
    //   .loadEmployeesFromDB()
    //   .forEach(
    //     new Consumer<Employee>() {
    //       @Override
    //       public void accept(Employee employee) {
    //         System.out.println(employee);
    //       }
    //     }
    //   );

    // //LAMBDA INMPLEMNT
    // servie
    //   .loadEmployeesFromDB()
    //   .forEach(employee -> System.out.println(employee));

    // // method referenceINMPLEMNT
    // servie.loadEmployeesFromDB().forEach(MethodReferenceDemo::pint);

    // method reference by existing  methds

    // servie.loadEmployeesFromDB().forEach(System.out::println);
    EmployeeMapper map11 = new EmployeeMapper();
    // List<String> empdos =
    servie
      .loadEmployeesFromDB()
      .stream()
      .map(Employee::getId)
      .map(ArrayList::new) // instance method refe
      .forEach(System.out::println);
    //    new Function<Employee, EmployeeDO>() {
    //       @Override
    //       public EmployeeDO apply(Employee e) {
    //         EmployeeDO em = new EmployeeDO();
    //         em.setId(e.getId());
    //         em.setName(e.getName());
    //         em.setSalary(e.getSalary());

    //         return em;

    // System.out.println(empdos);
  }

  public static void pint(Employee employee) {
    System.out.println(employee);
  }
}
