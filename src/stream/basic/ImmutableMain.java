package stream.basic;

import java.util.Arrays;
import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {

        List<Integer> originList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> filteredList = originList.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("originList = " + originList);
        System.out.println("filteredList = " + filteredList);
    }
}
