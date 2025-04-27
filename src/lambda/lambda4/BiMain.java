package lambda.lambda4;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class BiMain {

    public static void main(String[] args) {

        BiFunction<String, String, Integer> bifunction =
                (s1, s2) -> s1.length() + s2.length();

        System.out.println("bifunction.apply(\"hello\", \"world\") = " +
                bifunction.apply("hello", "world"));

        BiConsumer<String, Integer> repeat = (s, i) -> {
            String tmp = "";
            for (int j = 0; j < i; j++) {
                tmp += s;
            }
            System.out.println(tmp);
        };
        repeat.accept("*", 5);

        BiFunction<String, Integer, String> repeatByFunction = (s, i) -> {
            String tmpString = "";
            for (int j = 0; j < i; j++) {
                tmpString += s;
            }
            return tmpString;
        };
        System.out.println("repeatByFunction.apply(\"*\", 5) = " + repeatByFunction.apply("*", 5));


        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;
        System.out.println("biPredicate.test(4, 5) = " + biPredicate.test(4, 5));


    }
}
