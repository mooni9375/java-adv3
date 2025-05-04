package stream.collectors;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors1Basic {

    public static void main(String[] args) {

        // 기본 기능
        List<String> list = Stream.of("Java", "Spring", "JPA")
                .collect(Collectors.toList()); // 수정 가능 list 반환
        list.add("Hibernate");
        System.out.println("list = " + list);

        List<String> unmodifiableList = Stream.of("Java", "Spring", "JPA")
                .collect(Collectors.toUnmodifiableList());
//        unmodifiableList.add("Hibernate");

        Set<Integer> set = Stream.of(1, 2, 2, 3, 3, 3)
                .collect(Collectors.toSet()); // 중복 제거된 set 반환
        System.out.println("set = " + set);

        // 타입 지정
        TreeSet<Integer> treeSet = Stream.of(3, 4, 5, 2, 1)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("treeSet = " + treeSet);
    }
}
