package stream.operation;

import java.util.Optional;

public class OptionalSimpleMain {

    public static void main(String[] args) {

        Optional<Integer> optional1 = Optional.of(10);
        System.out.println("optional1 = " + optional1);

        if (optional1.isPresent()) {
            System.out.println("optional1 = " + optional1.get());
        }

        Optional<Object> optional2 = Optional.ofNullable(null);
        System.out.println("optional2 = " + optional2);
        if (optional2.isPresent()) {
            Object o = optional2.get();
            System.out.println("o = " + o);
        }

        // 값이 없는 Optional 에서 get() 호출시 NoSuchElementException 발생
//        Object o2 = optional2.get();
    }
}
