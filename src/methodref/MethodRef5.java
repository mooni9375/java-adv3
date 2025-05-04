package methodref;

import lambda.lambda5.mystream.MyStreamV3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodRef5 {

    public static void main(String[] args) {

        List<Person> personList = List.of(
                new Person("Kim"),
                new Person("Park"),
                new Person("Lee")
        );

        List<String> result1 = MyStreamV3.of(personList)
                .map(Person::introduce)
                .map(String::toUpperCase)
                .toList();
        System.out.println("result1 = " + result1);


    }

}
