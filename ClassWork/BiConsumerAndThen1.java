import java.util.function.BiConsumer;

public class BiConsumerAndThen1 {

  public static void main(String[] args) {
    BiConsumer<Integer, Integer> b1 = (i1, i2) -> System.out.println(i1 + i2);
    BiConsumer<Integer, Integer> b2 = (i1, i2) -> System.out.println(i1 * i2);
    System.out.println("-------------------");
    b1.andThen(b2).accept(10, 20);
    b2.andThen(b1).accept(10, 20);
  }
}
