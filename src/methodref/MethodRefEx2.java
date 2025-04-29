package methodref;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MethodRefEx1 {

    public static void main(String[] args) {

        // 1. 정적 메서드 참조
        Supplier<String> staticMethod1 = () -> Person.greeting();
        System.out.println("staticMethod1 = " + staticMethod1.get());

        Supplier<String> staticMethod2 = Person::greeting;
        System.out.println("staticMethod2 = " + staticMethod2.get());

        // 2. 특정 객체의 인스턴스 참조
        Person person = new Person("Kim");
        Supplier<String> instanceMethod1 = () -> person.introduce();
        System.out.println("instanceMethod1 = " + instanceMethod1.get());

        Supplier<String> instanceMethod2 = person::introduce;
        System.out.println("instanceMethod2 = " + instanceMethod2.get());

        // 3. 생성자 참조
        Supplier<Person> newPerson1 = () -> new Person();
        System.out.println("newPerson1 = " + newPerson1.get());

        Supplier<Person> newPerson2 = Person::new;
        System.out.println("newPerson2 = " + newPerson2.get());

        UnaryOperator<String> unaryOperator = x -> x.toUpperCase();
        UnaryOperator<String> unaryOperator2 = String::toUpperCase; // 호출할 수 있는 "함수 자체"를 넘긴다.

    }
}
