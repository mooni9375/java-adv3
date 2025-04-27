package lambda.ex4;

import lambda.ex3.MyReducer;

import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceExample {

    static int reduce(List<Integer> list, int initial, BinaryOperator<Integer> binaryOperator) {
        int result = initial;

        for (Integer val : list) {
            result = binaryOperator.apply(result, val);
        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4);

        System.out.println(reduce(numbers, 0, (a, b) -> (a + b)));
        System.out.println(reduce(numbers, 1, (a, b) -> (a * b)));


    }
}
