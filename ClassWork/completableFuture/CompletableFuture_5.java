package completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class CompletableFuture_5 {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
       CompletableFuture<String> c1= CompletableFuture.supplyAsync(()->"hellos").thenCompose(s->CompletableFuture.supplyAsync(()->s+"hello -2"));
       System.out.println(c1.get());

       CompletableFuture<String> thenCombine = CompletableFuture.supplyAsync(()->"hemlo ").thenCombine(CompletableFuture.supplyAsync(()->" world"), (s1,s2)->s1+s2);
       System.out.println(thenCombine.get());


    CompletableFuture.supplyAsync(()->"hemlo ").
    thenAcceptBoth(CompletableFuture.supplyAsync(()->" world"), (s1,s2)->System.out.println(s1+s2));

    
    }
}
