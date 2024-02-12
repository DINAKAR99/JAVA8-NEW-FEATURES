package Collectioninterface;

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

    empList.forEach(s -> System.out.println(s));
    System.out.println("------------------------------------------------");

    empList.removeIf(s -> "HR".equalsIgnoreCase(s.getDeptName()));

    empList.forEach(s -> System.out.println(s));
  }
}
