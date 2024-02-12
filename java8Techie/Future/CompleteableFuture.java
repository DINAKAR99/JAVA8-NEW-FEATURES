package Future;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompleteableFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
     ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
     Future<List<Integer>> submit = newFixedThreadPool.submit(()->{
        
        
        //delay the execution of the thread it also blocks the main thread until it gets resolved 
        System.out.println(Thread.currentThread().getName());

         Thread.currentThread().sleep(60000);
        return Arrays.asList(1,2,3,4);
    }
        
        );
     List<Integer> list = submit.get();

     System.out.println(list);

    }
}
