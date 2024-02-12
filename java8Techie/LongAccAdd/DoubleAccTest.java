package LongAccAdd;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.concurrent.atomic.LongAdder;

public class DoubleAccTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        DoubleAdder defalt=new DoubleAdder();
        
        DoubleAdderService l1=new DoubleAdderService(100, defalt);
        DoubleAdderDecrement l2=new DoubleAdderDecrement(50, defalt);


         List<Callable<Double>> tusk=new ArrayList<>();

        tusk.add(l1);
        tusk.add(l2);


        
                     List<Future<Double>> future =Executors.newCachedThreadPool().invokeAll(tusk);

                     for (Future<Double> future2 : future) {
                        future2.get();       
                     }

                    System.out.println(defalt.doubleValue());

    }
}
