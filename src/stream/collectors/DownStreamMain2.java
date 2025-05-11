package stream.collectors;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DownStreamMain2 {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Kim", 1, 85),
                new Student("Park", 1, 70),
                new Student("Lee", 2, 70),
                new Student("Han", 2, 90),
                new Student("Hoon", 3, 90),
                new Student("Ha", 3, 89)
        );

        // 1단계 : 학년별로 학생들을 그룹화
        Map<Integer, List<Student>> collect1 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade
                ));
        System.out.println("collect1 = " + collect1);

        // 2단계 : 학년별로 가장 점수가 높은 학생 - reducing
        Map<Integer, Optional<Student>> collect2 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.reducing(
                                (s1, s2) -> s1.getScore() > s2.getScore() ? s1 : s2
                        )
                ));
        System.out.println("collect2 = " + collect2);

        // 3단계 : 학년별로 가장 점수가 높은 학생 - maxBy
        Map<Integer, Optional<Student>> collect3_1 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.maxBy(
                                (s1, s2) -> s1.getScore() > s2.getScore() ? 1 : -1
                        )
                ));
        System.out.println("collect3_1 = " + collect3_1);

        Map<Integer, Optional<Student>> collect3_2 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.maxBy(Comparator.comparingInt(Student::getScore))
                ));
        System.out.println("collect3_2 = " + collect3_2);

        // 4단계 : 학년별로 가장 점수가 높은 학생의 이름
        Map<Integer, String> collect4 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(Student::getScore)),
                                sOpt -> sOpt.get().getName()
                        )
                ));
        System.out.println("collect4 = " + collect4);

    }
}