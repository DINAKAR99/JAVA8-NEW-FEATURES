package LongAccAdd;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.DoubleAdder;

public class DoubleAdderService implements Callable<Double> {
    // public DoubleAdderService(long noOfTimes, DoubleAdder DoubleAdd) {
    //     this.noOfTimes = noOfTimes;
    //     this.DoubleAdd = DoubleAdd;
    // }
    private long noOfTimes;
    private DoubleAdder DoubleAdd ;


    public DoubleAdderService(long noOfTimes, DoubleAdder doubleAdd) {
        this.noOfTimes = noOfTimes;
        DoubleAdd = doubleAdd;
    }
    @Override
    public Double call() throws Exception {
    

        for (int i = 0; i < noOfTimes; i++) {
            // LongAdd.add(i);
            DoubleAdd.add(10.00);

            
            
        }
        // return DoubleAdd.doubleValue();

        return DoubleAdd.doubleValue(); // for value retrieval
    }



    

    
}
