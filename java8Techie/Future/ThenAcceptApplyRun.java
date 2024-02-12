package Future;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThenAcceptApplyRun {
    public void SendRemainder () throws InterruptedException, ExecutionException{


        CompletableFuture<Void> thenAccept = CompletableFuture.supplyAsync(()->{
            System.out.println(Thread.currentThread().getName());
            return Arrays.asList("ram","bhanu","rajesh","karthik");
        } ).thenApplyAsync(e->e.stream().filter(ea->!ea.equals("rajesh"))).thenAccept(kids->kids.forEach((kid)->SendEmails(kid)));
        
            // thenAccept.get();

    }


    public void SendEmails (String email){
        System.out.println("EMAIL WAS SENT SUCCESFULLY TO : "+email);

    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        

        ThenAcceptApplyRun t2= new ThenAcceptApplyRun();
        t2.SendRemainder();
    }
    


}
