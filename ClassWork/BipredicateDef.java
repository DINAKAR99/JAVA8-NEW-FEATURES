import java.util.function.BiPredicate;

public class BipredicateDef {

  public static void main(String[] args) {
    BiPredicate<Integer, Integer> b1 = (x, y) -> x > y;
    BiPredicate<Integer, Integer> b2 = (x, y) -> x - 2 > y;
    System.out.println(b1.and(b2).test(10, 2));
    System.out.println(b1.or(b2).test(10, 8));
    System.out.println(b1.negate().test(10, 8));
  }
}
