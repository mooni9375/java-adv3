package lambda.lambda5.filter;

import java.util.List;

import static lambda.lambda5.filter.GenericFilter.filter;


public class FilterMainV5 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = filter(numbers, n -> n % 2 == 0);
        System.out.println("evenNumbers = " + evenNumbers);
        List<Integer> oddNumbers = filter(numbers, n -> n % 2 == 1);
        System.out.println("oddNumbers = " + oddNumbers);


        List<String> strings = List.of("A", "BB", "CCC");

        List<String> stringResult = filter(strings, s -> s.length() >= 2);
        System.out.println("stringResult = " + stringResult);
    }

}
