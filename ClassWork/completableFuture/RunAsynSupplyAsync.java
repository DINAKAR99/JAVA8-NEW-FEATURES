package completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class RunAsynSupplyAsync {

  public static void main(String[] args)
    throws InterruptedException, ExecutionException {
    CompletableFuture.runAsync(() -> {
      System.out.println("hemlo bro");
      System.out.println("hemlo bro");
      System.out.println(Thread.currentThread().getName());
    });
    System.out.println("----------------------------------");

    CompletableFuture.runAsync(
      () -> {
        System.out.println("hemlo bro -- 1");
        System.out.println("hemlo bro -- 2");
        System.out.println("hemlo bro -- 3");
        System.out.println(Thread.currentThread().getName());
      },
      Executors.newFixedThreadPool(2)
    );
    System.out.println("----------------------------------");

    CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(() -> {
        return "hello";
      }
    );
    System.out.println(supplyAsync.get());
    System.out.println("----------------------------------");

    CompletableFuture<String> supplyAsync2 = CompletableFuture.supplyAsync(
      () -> {
        return "Hello World!!!";
      },
      Executors.newCachedThreadPool()
    );
    System.out.println(supplyAsync2.get());
  }
}
