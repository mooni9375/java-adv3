package lambda.lambda5.map;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static lambda.lambda5.map.GenericMapper.map;

public class MapMainV5 {

    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        List<Integer> integerList = map(list, s -> Integer.parseInt(s));
        System.out.println("integerList = " + integerList);

        List<Integer> lengthList = map(list, s -> s.length());
        System.out.println("lengthList = " + lengthList);


        List<String> strings = List.of("orange", "apple", "banana");

        List<Integer> resultList1 = map(strings, s -> s.length());
        System.out.println("resultList1 = " + resultList1);

        List<String> resultList2 = map(strings, s -> s.toUpperCase());
        System.out.println("resultList2 = " + resultList2);


        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> starList = map(integers, n -> "*".repeat(n));
        System.out.println("starList = " + starList);

        System.out.println("\"hi\".repeat(3) = " + "hi".repeat(3));
    }
}
