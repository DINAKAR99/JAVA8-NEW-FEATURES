package DoubleAccAdd;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.DoubleAccumulator;

public class DoubleAccumulatorTest {
    public static void main(String[] args) {


        
        DoubleAccumulator defaultAccumulator=new DoubleAccumulator((x,y)->x+y, 10);

        DoubleAccService d2=new DoubleAccService(10, defaultAccumulator);
        DoubleAccService d3=new DoubleAccService(10000000L, defaultAccumulator);


         List<Callable<Double>>  tasks =  new ArrayList<>();
         tasks.add(d2);
         tasks.add(d3);


         System.out.println(Thread.currentThread().getState());

         try {
            List<Future<Double>> invokeAll = Executors.newFixedThreadPool(2).invokeAll(tasks);

            // for (Future<Double> future : invokeAll) {
            //     future.get();
            //     System.out.println("get release");
                
            // }
            System.out.println(Thread.currentThread().getState());


            Double finalVal=defaultAccumulator.get();
            System.out.println(finalVal);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
