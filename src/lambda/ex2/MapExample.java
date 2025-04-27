package lambda.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MapExample {

    public static List<String> map(List<String> list, StringFunction function) {

        List<String> result = new ArrayList<>();

        for (String i : list) {
            result.add(function.apply(i));
        }

        return result;
    }

    public static void main(String[] args) {

        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트 : " + words);

        System.out.println(map(words, s -> s.toUpperCase()));
        System.out.println(map(words, s -> "*** " + s + " ***"));



    }

}
