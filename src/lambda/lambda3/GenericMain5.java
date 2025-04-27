package lambda.lambda3;

public class GenericMain5 {

    public static void main(String[] args) {

        GenericFunction<String, String> upperCase = s -> s.toUpperCase();
        String result1 = upperCase.apply("hello");
        System.out.println("result1 = " + result1);

        GenericFunction<Integer, Integer> square = n -> n * n;
        Integer result2 = square.apply(3);
        System.out.println("result2 = " + result2);

    }

    /**
     * @param <T> 매개변수 타입
     * @param <R> 반환 타입
     */
    @FunctionalInterface
    interface GenericFunction <T, R> {
        R apply(T t);
    }
}
