package methodref;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MethodRefEx2 {

    public static void main(String[] args) {

        // 1. 정적 메서드 참조
        Function<String, String> staticMethod1 = (name) -> Person.greetingWithName(name);
        System.out.println("staticMethod1.apply(\"Gu\") = " + staticMethod1.apply("Gu"));

        Function<String, String> staticMethod2 = Person::greetingWithName;
        System.out.println("staticMethod2.apply(\"Gu\") = " + staticMethod2.apply("Gu"));

        // 2. 특정 객체의 인스턴스 참조
        Person person = new Person("Gu");
        Function<Integer, String> instanceMethod1 = (n) -> person.introduceWithNumber(n);
        System.out.println("instanceMethod1.apply(5) = " + instanceMethod1.apply(5));

        Function<Integer, String> instanceMethod2 = person::introduceWithNumber;
        System.out.println("instanceMethod2.apply(5) = " + instanceMethod2.apply(10));


        // 3. 생성자 참조
        Function<String, Person> newPerson1 = (name) -> new Person(name);
        System.out.println("newPerson1.apply(\"Gu\") = " + newPerson1.apply("Gu").getName());

        Function<String, Person> newPerson2 = Person::new;
        // ㄴ 기본 생성자와 다른 생성자 중 어떻게 구분하는가?
        System.out.println("newPerson2.apply(\"Gu\") = " + newPerson2.apply("Gu").getName());
    }
}
