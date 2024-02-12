package Streams.StreamOperations;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streamoper {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("ab");
    list.add("b");
    list.add("cayman");
    list.add("can");
    list.add("bar");

    List<Stud> stulist = new ArrayList<>();
    stulist.add(new Stud("a", 1));
    stulist.add(new Stud("b", 2));
    stulist.add(new Stud("c", 3));

    Stream<String> s1 = list.stream();
    Stream<String> s2 = s1.distinct(); //intermideiate operation
    long count = s2.count(); // terminal operations

    //chaining
    long count1 = list.stream().distinct().count();
    ///stream cant be used after terminal operating
    System.out.println(count);
    System.out.println("------------------");

    /////////////////////////////////

    boolean check = list.stream().distinct().anyMatch(s -> s.contains("a"));
    System.out.println(check);
    System.out.println("------------------");

    ////////////////////////

    boolean s3 = stulist.stream().allMatch(s -> s.getName().contains("a"));
    System.out.println(s3);
    System.out.println("------------------");
    ////////////////////////

  }
}
