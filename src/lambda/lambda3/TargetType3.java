package lambda.lambda3;

import java.util.function.Function;

/**
 * 자바가 기본으로 제공하는 Function 대입
 */
public class TargetType3 {

    public static void main(String[] args) {

        Function<Integer, String> functionA = i -> "value by A : " + i;
        Function<Integer, String> functionB = i -> "value by B : " + i;

        functionB = functionA;

        System.out.println("functionB.apply(10) = " + functionB.apply(10));

    }

}
