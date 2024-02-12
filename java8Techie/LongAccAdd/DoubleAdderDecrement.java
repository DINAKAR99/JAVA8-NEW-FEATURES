package LongAccAdd;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.concurrent.atomic.LongAdder;

public class DoubleAdderDecrement implements Callable<Double> {
    public DoubleAdderDecrement(long noOfTimes, DoubleAdder DoubleAdd) {
        this.noOfTimes = noOfTimes;
        this.DoubleAdd = DoubleAdd;
    }
    private long noOfTimes;
    private DoubleAdder DoubleAdd ;
    @Override
    public Double call() throws Exception {
    

        for (int i = 0; i < noOfTimes; i++) {
            // LongAdd.add(i);
            DoubleAdd.add(-10.0);

            
            
        }
        // return DoubleAdd.doubleValue();

        return DoubleAdd.doubleValue(); // for value retrieval
    }



    

    
}
