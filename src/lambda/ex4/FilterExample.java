package lambda.ex4;

import lambda.ex2.MyPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterExample {

    // 고차 함수, 함수를 인자로 받아서 조건에 맞는 요소만 뽑아내는 filter
    static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {

        List<Integer> result = new ArrayList<>();

        for (int val : list) {
            if (predicate.test(val)) {
                result.add(val);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<Integer> numbers = List.of(-3, -2, -1, 1, 2, 3, 5);
        System.out.println("원본 리스트 : " + numbers);

        // 1. 음수만 뽑아내기
        System.out.println(filter(numbers, i -> i < 0));

        // 2. 짝수만 뽑아내기
        System.out.println(filter(numbers, i -> (i % 2 == 0) && (i > 0)));

    }


}
