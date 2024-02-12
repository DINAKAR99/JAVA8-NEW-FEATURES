package completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenApply {

  public static void main(String[] args)
    throws InterruptedException, ExecutionException {
    CompletableFuture<String> c1 = CompletableFuture.supplyAsync(() -> ("hemlo")
    );
    c1 = c1.thenApply(s -> s + "frinds");
    System.out.println(c1.get());

    System.out.println("---------------------------------------------------");

    CompletableFuture<String> c2 = CompletableFuture.supplyAsync(() ->
      "hii allllll"
    );
    c2.thenAccept(s -> System.out.println("india "));
    c2.get();

    CompletableFuture<String> c3 = CompletableFuture.supplyAsync(() ->
      "hii allllll"
    );
    c3.thenRun(() -> System.out.println("taskcompleted "));
    c3.get();
  }
}
