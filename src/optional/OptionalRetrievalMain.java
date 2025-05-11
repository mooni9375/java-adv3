package optional;

import java.util.Optional;

public class OptionalRetrievalMain {

    public static void main(String[] args) {

        Optional<String> optValue = Optional.of("Hello");
        Optional<Object> optEmpty = Optional.empty();

        // isPresent()
        System.out.println("optValue.isPresent() = " + optValue.isPresent());
        System.out.println("optEmpty.isPresent() = " + optEmpty.isPresent());
        System.out.println("optEmpty.isEmpty() = " + optEmpty.isEmpty());

        // get() - 값이 없으면 NoSuchElementException
        optValue.get();
//        optEmpty.get();

        // 값이 있으면 그 값, 없으면 지정된 기본값
        System.out.println("optValue.orElse(\"UNKNOWN\") = " + optValue.orElse("UNKNOWN"));
        System.out.println("optEmpty.orElse(\"UNKNOWN\") = " + optEmpty.orElse("UNKNOWN"));

        // 값이 없을 때만 람다(Supplier)가 실행되어 기본값 생성
        System.out.println("optValue.orElseGet(() -> \"UNKNOWN\") = " + optValue.orElseGet(() -> "UNKNOWN"));
        System.out.println("optEmpty.orElseGet(() -> \"UNKNOWN\") = " + optEmpty.orElseGet(() -> "UNKNOWN"));

        // 값이 있으면 반환, 없으면 예외
        try {
            Object value = optEmpty.orElseThrow(() -> new RuntimeException("값이 없습니다!!"));
            System.out.println("value = " + value);
        } catch (Exception e) {
            System.out.println("예외 발생 : " + e.getMessage());
        }

        // Optional 반환
        Optional<String> result1 = optValue.or(() -> Optional.of("Fallback"));
        System.out.println("result1 = " + result1);

        Optional<Object> result2 = optEmpty.or(() -> Optional.of("Fallback"));
        System.out.println("result2 = " + result2);

    }
}
