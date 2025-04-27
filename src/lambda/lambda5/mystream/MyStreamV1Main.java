package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamV1Main {

    public static void main(String[] args) {

        // 짝수만 남기고, 남의 값을 2배를 반환
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        returnValue(numbers);
        methodChain(numbers);
    }

    private static void returnValue(List<Integer> numbers) {
        MyStreamV1 stream = new MyStreamV1(numbers);
        MyStreamV1 filteredStream = stream.filter(n -> n % 2 == 0);
        MyStreamV1 mappedStream = filteredStream.map(n -> n * 2);
        List<Integer> result = mappedStream.toList();

        System.out.println("result = " + result);
    }

    private static void methodChain(List<Integer> numbers) {
        List<Integer> result = new MyStreamV1(numbers)
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .toList();
        System.out.println("result = " + result);
    }
}
