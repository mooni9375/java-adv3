package stream.operation;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class IntermediateOperationMain {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);

        // 1. filter
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // 2. map
        numbers.stream()
                .map(n -> Integer.toString(n))
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // 3. distinct
        numbers.stream()
                .distinct()
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // 4. sorted (기본 정렬)
        Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
                .sorted()
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // 5. sorted (커스텀 정렬)
        Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // 6. peerk
        numbers.stream()
                .peek(n -> System.out.print("before: " + n + ", "))
                .map(n -> n * n)
                .peek(n -> System.out.print("after: " + n + ", "))
                .limit(5)
                .forEach(n -> System.out.println("최종값: " + n));
        System.out.println("\n");

        // 7. limit
        numbers.stream()
                .limit(5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // 8. slip
        numbers.stream()
                .skip(5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 1, 2, 3);

        // 9. takeWhile
        numbers2.stream()
                .takeWhile(n -> n < 5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // 10. dropWhile
        numbers2.stream()
                .dropWhile(n -> n < 5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

    }
}
