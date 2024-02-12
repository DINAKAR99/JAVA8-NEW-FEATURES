import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Bifunctional {

  public static void main(String[] args) {
    Map<String, Integer> hashMap = new HashMap<>();
    hashMap.put("One", 1);
    hashMap.put("Two", 2);
    hashMap.put("Three", 3);

    BiFunction<String, Integer, Void> biFunction = (key, value) -> {
      System.out.println(key + ": " + value);

      return null;
    };

    hashMap.forEach((key, value) -> biFunction.apply(key, value));
  }
}
