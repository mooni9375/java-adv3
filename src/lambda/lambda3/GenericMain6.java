package lambda.lambda3;

public class GenericMain6 {

    public static void main(String[] args) {

        GenericFunction<String, String> toUpperCase = s -> s.toUpperCase();
        GenericFunction<String, Integer> length = s -> s.length();
        GenericFunction<Integer, Integer> square = n -> n * n;
        GenericFunction<Integer, Boolean> inEvent = n -> n % 2 == 0;

        System.out.println( toUpperCase.apply("hello") );
        System.out.println( length.apply("hello") );
        System.out.println( square.apply(3) );
        System.out.println( inEvent.apply(3) );

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
