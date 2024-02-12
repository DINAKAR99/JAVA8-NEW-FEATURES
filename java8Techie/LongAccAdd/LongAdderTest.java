package LongAccAdd;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.LongAdder;

public class LongAdderTest {


    public static void main(String[] args) throws InterruptedException, ExecutionException {

        LongAdder defalt=new LongAdder();
        
        LongAdderService l1=new LongAdderService(1000000, defalt);
        LongAdderDecrement l2=new LongAdderDecrement(200000, defalt);


        List<Callable<Long>> tusk=new ArrayList<>();

        tusk.add(l1);
        tusk.add(l2);


        
                     List<Future<Long>> future =Executors.newCachedThreadPool().invokeAll(tusk);

                     for (Future<Long> future2 : future) {
                        future2.get();       
                     }

                    System.out.println(defalt.longValue());
                    


    }
    
}
