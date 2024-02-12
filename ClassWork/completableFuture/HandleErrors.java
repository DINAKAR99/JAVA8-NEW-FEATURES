package completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import javax.management.RuntimeErrorException;
import javax.print.DocFlavor.STRING;

public class HandleErrors {
    public static void main(String[] args) throws InterruptedException, ExecutionException {


        String name=null;
        CompletableFuture<String> handle = CompletableFuture.supplyAsync(()->{


            if (name==null){
            throw new RuntimeException( "computation error");}

        else{
        return "hello,"+name;

        }

        }).handle((s,t)->s!=null?s:"hemlo wurld");

        System.out.println(handle.get());
    }
}
