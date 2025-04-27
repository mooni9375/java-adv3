package lambda.lambda4;

import java.util.function.Consumer;

public class ConsumerMain {

    public static void main(String[] args) {

        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        consumer.accept("hello");

        testConsumerMethod("java", consumer);

    }

    static void testConsumerMethod(String text, Consumer<String> consumer) {
        consumer.accept(text);
    }


}
