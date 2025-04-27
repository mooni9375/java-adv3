package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV1 {

    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        // 문자열을 숫자로 변환
        List<Integer> integerList = map(list, s -> Integer.parseInt(s));
        System.out.println("integerList = " + integerList);

        // 문자열의 길이
        List<Integer> lengthList = map(list, s -> s.length());
        System.out.println("lengthList = " + lengthList);
    }

    static List<Integer> map(List<String> list, Function<String, Integer> mapper) {
        List<Integer> mappedList = new ArrayList<>();

        for (String s : list) {
            Integer applied = mapper.apply(s);
            mappedList.add(applied);
        }

        return mappedList;
    }
}
