import java.util.function.BiFunction;
import java.util.function.Function;

public class BifunctionDefault {

  public static void main(String[] args) {
    BiFunction<String, Integer, Integer> b1 = (designation, age) -> {
      if (designation != null && age != null) {
        if (designation.equalsIgnoreCase("manager") && age > 30) {
          return 140000;
        } else if (designation.equalsIgnoreCase("dev") && age > 20) {
          return 20000;
        } else {
          return 0;
        }
      } else {
        return 0;
      }
    };

    Function<Integer, String> fun = s1 -> {
      if (s1 > 80000) {
        return "band-5";
      } else if (s1 > 1000) {
        return "band-4";
      } else {
        return "band-3";
      }
    };

    int sal1 = b1.apply("manager", 31);
    int sal2 = b1.apply("dev", 31);

    System.out.println(b1.andThen(fun).apply("manger", 40));
  }
}
