package stream.basic;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateExecutionMain {

    public static void main(String[] args) {

        // 스트림 중복 실행 확인
        Stream<Integer> stream = Stream.of(1, 2, 3);

        // 1. 최초 실행
        stream.forEach(System.out::println);

        // 2. 스트림 중복 실행 -> Exception : stream has already been operated upon or closed
//        stream.forEach(System.out::println);

        // 대안 : 대상 리스트를 스트림으로 새로 생성해서 사용
        List<Integer> list = List.of(1, 2, 3);
        Stream.of(list).forEach(System.out::println); // 서로 다른 스트림 객체
        Stream.of(list).forEach(System.out::println); // 서로 다른 스트림 객체


    }
}
