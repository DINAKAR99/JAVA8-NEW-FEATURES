import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStream {

  public static void main(String[] args) {
    Supplier<UUID> randomUUIDs = UUID::randomUUID;

    Stream<UUID> gen = Stream.generate(randomUUIDs);

    List<UUID> gen1 = gen.skip(10).limit(10).collect(Collectors.toList());
    gen1.forEach(System.out::println);
    System.out.println("-------------");

    Stream<Integer> infi = Stream.iterate(0, (e -> e + 1));
    List<Integer> lis = infi.limit(10).collect(Collectors.toList());

    lis.forEach(System.out::println);
  }
}
