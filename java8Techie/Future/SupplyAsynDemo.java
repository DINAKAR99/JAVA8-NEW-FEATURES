package Future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class SupplyAsynDemo {
    
    public static void SuppplyAsync () throws InterruptedException, ExecutionException{

        CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(()->
        {
            System.out.println("thread is "+Thread.currentThread().getName());
            return "code Excuted";
        },Executors.newFixedThreadPool(5));

        supplyAsync.get();
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        SupplyAsynDemo.SuppplyAsync();
    }
}
