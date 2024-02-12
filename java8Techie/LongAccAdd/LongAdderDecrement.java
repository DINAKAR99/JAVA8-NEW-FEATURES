package LongAccAdd;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.LongAdder;

public class LongAdderDecrement implements Callable<Long> {
    public LongAdderDecrement(long noOfTimes, LongAdder longAdd) {
        this.noOfTimes = noOfTimes;
        LongAdd = longAdd;
    }
    private long noOfTimes;
    private LongAdder LongAdd ;
    @Override
    public Long call() throws Exception {
    

        for (int i = 0; i < noOfTimes; i++) {
            // LongAdd.add(i);
            LongAdd.decrement();
            
            
        }

        return LongAdd.longValue(); // for value retrieval
    }



    

    
}

