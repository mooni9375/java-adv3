package stream.collectors;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors2Map {

    public static void main(String[] args) {

        Map<String, Integer> map1 = Stream.of("Apple", "Banana", "Tomato")
                .collect(Collectors.toMap(
                        name -> name,           // keyMapper
                        name -> name.length()   // valueMapper
                ));
        System.out.println("map1 = " + map1);

        // 키가 중복되는 경우 예외 발생 : Duplicate key
        /*
        Map<String, Integer> map2 = Stream.of("Apple", "Apple", "Tomato")
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length()
                ));
        */

        // 키 중복 대안 (병합)
        Map<String, Integer> map3 = Stream.of("Apple", "Apple", "Tomato")
                .collect(Collectors.toMap(
                        name -> name,           // keyMapper
                        name -> name.length(),  // valueMapper
                        (oldVal , newVal) -> oldVal + newVal    // 중복될 경우, 기존 값 + 새 값
                ));
        System.out.println("map3 = " + map3);

        // Map 타입 지정
        Map<String, Integer> map4 = Stream.of("Apple", "Banana", "Tomato")
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length(),
                        (oldVal, newVal) -> oldVal + newVal,
                        LinkedHashMap::new  // 원하는 타입 지정
                ));
        System.out.println("map4 = " + map4.getClass());

    }
}
