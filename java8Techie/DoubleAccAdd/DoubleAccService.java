package DoubleAccAdd;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.DoubleAccumulator;

public class DoubleAccService implements Callable<Double>{
    
private long noOfTimes;

private DoubleAccumulator doubleAcc;

public DoubleAccService (long noOfTimes, DoubleAccumulator doubleAcc) {
    this.noOfTimes = noOfTimes;
    this.doubleAcc = doubleAcc;
}

@Override
public Double call() throws Exception {
    // TODO Auto-generated method stub
    for (int i = 0; i < noOfTimes; i++) {

        doubleAcc.accumulate(10.0);
    }

    return doubleAcc.get();

}





}
