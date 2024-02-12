import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionalHandlingEx {

  public static void printur(String e) {
    try {
      System.out.println(Integer.parseInt(e));
    } catch (NumberFormatException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
  }

  public static Consumer<String> HandleExceptionifAny(
    Consumer<String> payload
  ) {
    return obj -> {
      try {
        payload.accept(obj);
      } catch (Exception e) {
        System.out.println(e);
      }
    };
  }

  public static <P, E extends Exception> Consumer<P> handleGenericEx(
    Consumer<P> target,
    Class<E> exobjclass
  ) {
    return obj -> {
      try {
        target.accept(obj);
      } catch (Exception e) {
        try {
          E e1 = exobjclass.cast(e);
        } catch (ClassCastException cass) {
          throw e;
          // TODO: handle exception
        }
      }
    };
  }

  public static void main(String[] args) {
    List<String> asList = Arrays.asList("1", "2", "s");

    // asList.stream().map(e->Integer.parseInt(e)).

    asList.forEach(
      handleGenericEx(
        s -> System.out.println(Integer.parseInt(s)),
        NumberFormatException.class
      )
    );
  }
}
