package LongAccAdd;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.concurrent.atomic.LongAccumulator;

public class LongAccService implements Callable<Long> {


        
public LongAccService(long noOfTimes, LongAccumulator longAcc) {
        this.noOfTimes = noOfTimes;
        LongAcc = longAcc;
    }

private long noOfTimes;

private LongAccumulator LongAcc;
    public static void main(String[] args) {
        
    }

    @Override
    public Long call() throws Exception {
        for (int i = 0; i <= noOfTimes; i++) {

            LongAcc.accumulate(i);
            
        }
        return LongAcc.get();


    }
}
