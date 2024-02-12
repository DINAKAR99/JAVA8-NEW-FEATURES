package LongAccAdd;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.LongAdder;

public class LongAdderService implements Callable<Long> {
    public LongAdderService(long noOfTimes, LongAdder longAdd) {
        this.noOfTimes = noOfTimes;
        this.LongAdd = longAdd;
    }
    private long noOfTimes;
    private LongAdder LongAdd ;
    @Override
    public Long call() throws Exception {
    

        for (int i = 0; i < noOfTimes; i++) {
            // LongAdd.add(i);
            LongAdd.increment();
            
            
        }

        return LongAdd.longValue(); // for value retrieval
    }



    

    
}
