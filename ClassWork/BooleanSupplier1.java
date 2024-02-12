import java.util.function.BooleanSupplier;

public class BooleanSupplier1 {

  public static void main(String[] args) {
    int x = 10;
    int y = 200;
    BooleanSupplier bt = () -> x > y;
    System.out.println(bt.getAsBoolean());
  }
}
