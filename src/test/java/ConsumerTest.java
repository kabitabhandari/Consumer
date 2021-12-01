import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerTest {

    @Test
    public void whenNamesPresentConsumeAll(){
        Consumer<String> print = t -> System.out.println(t);
        Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");
        cities.forEach(print);
    }
}
