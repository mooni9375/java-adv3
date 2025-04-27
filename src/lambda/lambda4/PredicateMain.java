package lambda.lambda4;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateMain {

    public static void main(String[] args) {

        Predicate<Integer> predicate = i -> i % 2 == 0;

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> collect = integers.stream()
                .filter(predicate)
                .collect(Collectors.toList());

        System.out.println("collect = " + collect);



    }
}
