package optional;

import java.util.Optional;

public class OptionalProcessingMain {

    public static void main(String[] args) {

        Optional<String> optValue = Optional.of("Hello");
        Optional<String> optEmpty = Optional.empty();

        // 값이 존재하면 Consumer 실행, 없으면 동작 X
        optValue.ifPresent(v -> System.out.println("optValue : " + v));
        optValue.ifPresent(v -> System.out.println("optValue : " + v));

        // 값이 있으면 Consumer 실행, 없으면 Runnable 실행
        optValue.ifPresentOrElse(v -> System.out.println("optValue : " + v)
                , () -> System.out.println("값이 비어 있음."));
        optEmpty.ifPresentOrElse(v -> System.out.println("optValue : " + v)
                , () -> System.out.println("값이 비어 있음."));

        // 값이 있으면 Function 적용 후 Optional 반환, 없으면 Optional.empty()
        Optional<Integer> lengthOpt1 = optValue.map(String::length);
        System.out.println("lengthOpt1 = " + lengthOpt1);
        Optional<Integer> lengthOpt2 = optEmpty.map(String::length);
        System.out.println("lengthOpt2 = " + lengthOpt2);

        // map()과 유사하나, 이미 Optional 반환하는 경우 중첩 제거
        Optional<Optional<Integer>> nestedOpt = optValue.map(s -> Optional.of(s.length()));
        System.out.println("nestedOpt = " + nestedOpt);
        Optional<Integer> flattenedOpt = optValue.flatMap(s -> Optional.of(s.length()));
        System.out.println("flattenedOpt = " + flattenedOpt);

        // 값이 있고 조건을 만족하면 그 값을 그대로, 불만족시 Optional.empty()
        Optional<String> filtered1 = optValue.filter(s -> s.startsWith("H"));
        Optional<String> filtered2 = optValue.filter(s -> s.startsWith("X"));
        System.out.println("filtered1 = " + filtered1);
        System.out.println("filtered2 = " + filtered2);

        // 값이 있으면 단일 요소 스트림, 없으면 빈 스트림
        optValue.stream()
                .forEach(System.out::println);

        optEmpty.stream()
                .forEach(System.out::println);

    }
}
