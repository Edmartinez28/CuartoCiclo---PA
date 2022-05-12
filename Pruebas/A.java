import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.List;

public class A {
    public static void main(String[] args) {
        List numbers = IntStream.generate(() ->
                        ThreadLocalRandom.current().nextInt(10_000, 1_000_000))
                .limit(25)
                .boxed()
                .toList();
        numbers.stream().forEach(System.out::println);
    }
}
