package methodref;

import lambda.lambda5.mystream.MyStreamV3;

import javax.print.DocFlavor;
import java.util.List;
import java.util.function.BiFunction;

public class MethodRef6 {

    public static void main(String[] args) {

        Person person = new Person("Kim");

        BiFunction<Person, Integer, String> fun1 =
                (Person p, Integer number) -> p.introduceWithNumber(number);

        System.out.println("fun1.apply(person, 1) = " + fun1.apply(person, 1));

        // 메서드 참조 : 타입이 첫 번째 매개변수가 됨, 그리고 첫 번째 매개변수의 메서드를 호출
        BiFunction<Person, Integer, String> fun2 = Person::introduceWithNumber;
        System.out.println("fun2.apply(person, 1) = " + fun2.apply(person, 2));




    }

}
