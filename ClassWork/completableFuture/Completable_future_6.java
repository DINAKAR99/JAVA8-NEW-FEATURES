package completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Completable_future_6{


    public static void main(String[] args) throws InterruptedException, ExecutionException {

        CompletableFuture<String> supplyAsync1 = CompletableFuture.supplyAsync(()->"im ");
        CompletableFuture<String> supplyAsync2 = CompletableFuture.supplyAsync(()->"iron ");
        CompletableFuture<String> supplyAsync3 = CompletableFuture.supplyAsync(()->"man ");


        CompletableFuture<Void> allOf = CompletableFuture.allOf(supplyAsync1,supplyAsync2,supplyAsync3);
        
        System.out.println(allOf.get());

        System.out.println(supplyAsync1.isDone());
        System.out.println(supplyAsync2.isDone());
        System.out.println(supplyAsync3.isDone());


        String collect = Stream.of(supplyAsync1,supplyAsync2,supplyAsync3).map(CompletableFuture::join).collect(Collectors.joining("-"));
    System.out.println(collect);
    
    
    
    
    }


}   