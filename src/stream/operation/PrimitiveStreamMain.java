package stream.operation;

import com.sun.source.doctree.SeeTree;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamMain {

    public static void main(String[] args) {

        // 기본형 특화 스트림 생성 (IntStream, LongStream, DoubleStream)
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        stream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 범위 생성 메서드 (IntStream, LongStream)
        IntStream range1 = IntStream.range(1, 6);
        IntStream range2 = IntStream.rangeClosed(1, 6);
        range1.forEach(i -> System.out.print(i + " "));
        System.out.println();
        range2.forEach(i -> System.out.print(i + " "));
        
        // 1. 통계 관련 메서드(sum, average, max, min, count)
        int sum = IntStream.range(1, 6).sum();
        System.out.println("sum = " + sum);

        // average()
        double avg = IntStream.range(1, 6)
                .average()
                .getAsDouble();
        System.out.println("avg = " + avg);
        System.out.println();

        // summaryStatistics() : 모든 통계 정보
        IntSummaryStatistics stats = IntStream.range(1, 6).summaryStatistics();
        System.out.println("stats.getSum() = " + stats.getSum());
        System.out.println("stats.getAverage() = " + stats.getAverage());
        System.out.println("stats.getMax() = " + stats.getMax());
        System.out.println("stats.getMin() = " + stats.getMin());
        System.out.println("stats.getCount() = " + stats.getCount());
        
        // 2. 타입 변환 메서드
        // IntStream -> LongStream
        LongStream longStream = IntStream.range(1, 5).asLongStream();
        // IntStream -> DoubleStream
        DoubleStream doubleStream = IntStream.range(1, 5).asDoubleStream();
        // IntStream -> Stream<Integer>
        Stream<Integer> boxedStream = IntStream.range(1, 5).boxed();

        // 3. 기본형 특화 매핑
        // int -> long 변환 매핑
        LongStream mappedLong = IntStream.range(1, 5)
                .mapToLong(i -> i * 10L);
        // int -> double
        DoubleStream mappedDouble = IntStream.range(1, 5)
                .mapToDouble(i -> i * 1.5);
        // int -> 객체 변환 매핑
        Stream<String> mappedObj = IntStream.range(1, 5)
                .mapToObj(i -> "Number: " + i);

        // 4. 객체 스트림 -> 기본형 특화 스트림
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        IntStream intStream = integerStream.mapToInt(i -> i);

        // 5. 객체 스트림 -> 기본형 특화 스트림
        int result = Stream.of(1, 2, 3, 4, 5)
                .mapToInt(i -> i)
                .sum();
        System.out.println("result = " + result);

    }
}
