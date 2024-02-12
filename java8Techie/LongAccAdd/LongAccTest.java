package LongAccAdd;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.LongAccumulator;

public class LongAccTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        LongAccumulator defaultAcc=new LongAccumulator((x,y)->x+y, 0);

        LongAccService l1=new LongAccService(10, defaultAcc);
        LongAccService l2=new LongAccService(10, defaultAcc);

       
               List<Callable<Long>> tusks=new ArrayList<>();
               tusks.add(l2);
               tusks.add(l1);

          List<Future<Long>> invokedlist= Executors.newFixedThreadPool(2).invokeAll(tusks);

          for (Future<Long> future : invokedlist) {
            future.get();
            System.out.println(defaultAcc.get());
            
            
          }
    }
}
