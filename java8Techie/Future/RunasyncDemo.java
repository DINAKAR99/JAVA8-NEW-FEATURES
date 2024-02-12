package Future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunasyncDemo {

    
    public static void RunAsyncc() throws InterruptedException, ExecutionException{
        
Executor new1=Executors.newFixedThreadPool(2);
          CompletableFuture<Void> runAsync = CompletableFuture.runAsync(
 ()->System.out.println("hemlo"+Thread.currentThread().getName())

         ,new1);

        runAsync.get();
    }

    
    public static void main(String[] args) throws InterruptedException, ExecutionException {


    RunasyncDemo.RunAsyncc();

    }
    
}
