package stream.start;

import java.util.List;

public class StreamStartMain {

    public static void main(String[] args) {

        List<String> names = List.of("Apple", "Banana", "Berry", "Tomato");

        // "B" 시작 필터 후 대문자로
        List<String> result = names.stream()
                .filter(s -> s.startsWith("B"))
                .map(String::toUpperCase)
                .toList();

        // 외부 반복
        for (String s : result) {
            System.out.println(s);
        }

        // 내부 반복
        names.stream()
                .filter(s -> s.startsWith("B"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
