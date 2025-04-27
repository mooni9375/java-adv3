package lambda.lambda5.mystream;

import javax.xml.namespace.QName;
import java.util.List;

public class MyStreamLoopMain {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );

        List<String> result1 = MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .map(s -> s.getName())
                .toList();

        // 외부 반복
        for (String s : result1) {
            System.out.println("[external] name : " + s);
        }

        MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .map(s -> s.getName())
                .toList()
                .forEach(n -> System.out.println("[internal] name : " + n));
    }

}
