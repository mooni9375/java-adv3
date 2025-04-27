package lambda.ex3;

import java.util.List;

public class ReduceExample {

    static int reduce(List<Integer> list, int initial, MyReducer reducer) {
        int result = initial;

        for (Integer val : list) {
            result = reducer.reduce(result, val);
        }

        return result;

    }

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4);

        System.out.println(reduce(numbers, 0, (a, b) -> (a + b)));
        System.out.println(reduce(numbers, 1, (a, b) -> (a * b)));


    }
}
