import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Foreach_Filter {

  public static void main(String[] args) {
    HashMap<Integer, String> hashMap = new HashMap<>();
    hashMap.put(1, "a");
    hashMap.put(2, "b");
    hashMap.put(3, "c");
    hashMap.put(4, "d");
    // hashMap.forEach((key, value) -> System.out.println(key + ":" + value));
    hashMap
      .entrySet()
      .stream()
      .filter(e -> e.getKey() % 2 == 0)
      .forEach(System.out::println);
    System.out.println("---------------");
    List<String> li = new ArrayList<>();
    li.add("ram");
    li.add("bhim");
    li.add("lax");
    // for (String i : li) {
    //   if (i.startsWith("r")) {
    //     System.out.println(i);
    //   }
    List<Employee> lo = new ArrayList<>();
    lo.add(new Employee(1, "ram", 2000));
    lo.add(new Employee(2, "bhim", 6000));
    lo.add(new Employee(3, "som", 8000));

    li.stream().filter(e -> e.startsWith("r")).forEach(System.out::println);
    List<Employee> collect = lo
      .stream()
      .filter(e -> e.getSalary() > 2000)
      .collect(Collectors.toList());

    System.out.println(collect);
  }
}
