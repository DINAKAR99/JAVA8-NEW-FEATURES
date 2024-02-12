package Listinterface;

import Collectioninterface.Employee;
import java.util.ArrayList;
import java.util.List;

public class defMeth {

  public static void main(String[] args) {
    List<Employee> empList = new ArrayList<>();

    empList.add(new Employee("Raj", 90000, "HR"));
    empList.add(new Employee("Frank", 80000, "Finance"));
    empList.add(new Employee("Kishan", 30000, "HR"));
    empList.add(new Employee("Sean", 90000, "Finance"));
    empList.add(new Employee("Rajesh", 90000, "HR"));

    empList.forEach(System.out::println);
    System.out.println("-------------------------------");
    System.out.println("Employee sorted by salary..");

    empList.sort((e1, e2) -> e1.getSalary() > e2.getSalary() ? 1 : -1);
    empList.forEach(System.out::println);

    System.out.println("-------------------------------");
    empList.replaceAll(e -> {
      if (e.getSalary() > 60000) {
        return e;
      } else {
        e.setSalary(e.getSalary() + e.getSalary() * 10);
        return e;
      }
    });
    empList.forEach(System.out::println);
  }
}
