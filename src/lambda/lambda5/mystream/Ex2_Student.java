package lambda.lambda5.mystream;

import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.GenericMapper;

import java.util.ArrayList;
import java.util.List;

public class Ex2_Student {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)

        );

        List<String> directResult = direct(students);
        System.out.println("directResult = " + directResult);

        List<String> lambdaResult = lambda(students);
        System.out.println("lambdaResult = " + lambdaResult);

        
    }

    // 어떻게 수행해야 하는지(수행 절차)에 중점 -> 명령형 프로그래밍
    static List<String> direct(List<Student> students) {
        List<String> result = new ArrayList<>();

        for (Student student : students) {
            if (student.getScore() >= 80) {
                result.add(student.getName());
            }
        }

        return result;
    }

    // 무엇을 수행해야 하는지(수행 결과)에 중점 -> 선언적 프로그래밍
    static List<String> lambda(List<Student> students) {
        List<Student> filteredList = GenericFilter.filter(students, s -> s.getScore() >= 80);
        List<String> mappedList = GenericMapper.map(filteredList, n -> n.getName());

        return mappedList;
    }
}
