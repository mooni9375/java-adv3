package lambda.lambda3;

import java.util.function.Function;

/**
 * 자바가 기본으로 제공하는 Function 활용
 */
public class TargetType2 {

    public static void main(String[] args) {

        Function<String, String> toUpperCase = s -> s.toUpperCase();
        System.out.println("toUpperCase.apply(\"hello\") = " + toUpperCase.apply("hello"));

        Function<Integer, Integer> square = n -> n * n;
        System.out.println("square.apply(3) = " + square.apply(3));


    }

}
