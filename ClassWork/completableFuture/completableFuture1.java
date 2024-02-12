package completableFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class completableFuture1 {

  private static CompletableFuture<String> calculateAsynce() {
    CompletableFuture<String> completableFuture = new CompletableFuture<>();

    List<String> list = new ArrayList<>();
    list.add("KK");
    list.add("PK");
    list.add("SK");

    Executors
      .newCachedThreadPool()
      .submit(() -> {
        try {
          Thread.sleep(20);
          String joinStr = String.join(",", list);
          System.out.println(Thread.currentThread().getName());
          completableFuture.complete(joinStr);
        } catch (Exception e) {
          e.printStackTrace();
        }
        return null;
      });
    return completableFuture;
  }

  public static void main(String[] args) {
    CompletableFuture<String> completableFuture = calculateAsynce();
    CompletableFuture<String> completableFuture1 = calculateAsynce();

    try {
      String result = completableFuture.get();
      String result2 = completableFuture1.get();
      System.out.println(result);
      System.out.println(result2);
      System.out.println(Thread.currentThread().getName());
      System.out.println("------------------------------------");
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }
  }
}
