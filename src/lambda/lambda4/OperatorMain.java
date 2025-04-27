package lambda.lambda4;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorMain {

    public static void main(String[] args) {

        UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
        BinaryOperator<String> binaryOperator = (s1, s2) -> s1 + s2;

        System.out.println("unaryOperator.andThen(\"java\") = " +
                unaryOperator.apply("java"));
        System.out.println("binaryOperator.apply(\"hello\", \"world\") = " +
                binaryOperator.apply("hello", " world"));
    }
}
