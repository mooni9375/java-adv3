package lambda.ex1;

import lambda.Procedure;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class M3MeasureTime {

    // 공통 : 실행 시간 측정 메서드
    public static void measure(Procedure procedure) {
        long startNs = System.nanoTime();
        procedure.run();
        long endNs = System.nanoTime();
        System.out.println("elapsedMs = " + (endNs - startNs));
    }

    public static void main(String[] args) {

        measure(() -> {
            int result = 0;
            for (int i = 1; i <= 100; i++) {
                result += i;
            }
            System.out.println("result1 = " + result);
        });

        measure(() -> {
            List<Integer> list = Arrays.asList(4, 3, 2, 1);
            System.out.println("list    = " + list);
            List<Integer> result = list.stream()
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println("result2 = " + result);

        });

    }
}
