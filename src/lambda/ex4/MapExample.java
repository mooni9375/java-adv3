package lambda.ex4;

import lambda.ex2.StringFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapExample {

    public static List<String> map(List<String> list, Function<String, String> function) {

        List<String> result = new ArrayList<>();

        for (String s : list) {
            result.add(function.apply(s));
        }

        return result;
    }

    public static void main(String[] args) {

        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트 : " + words);

        List<String> newWords = map(words, s -> s.toUpperCase());
        System.out.println("newWords = " + newWords);
        System.out.println(map(newWords, s -> "*** " + s + " ***"));



    }

}
