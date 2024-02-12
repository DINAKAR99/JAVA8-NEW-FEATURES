package ForkJoinPool;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewWorkStealingPool {
    public static void main(String[] args) throws InterruptedException {
        int avail=Runtime.getRuntime().availableProcessors();
        System.out.println(avail);
        ExecutorService executorService = Executors.newWorkStealingPool(avail);

        


        List<Callable<String>>tasks= Arrays.asList(()->"mytask-1",()->"mytask-2",()->"mytask-3",()->"mytask-4");


        executorService.invokeAll(tasks).stream().map(future->{

            try {
                
               return future.get();
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }

            return null;
        }).forEach(System.out::println);
    
    
    }
}
