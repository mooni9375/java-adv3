package optional;

import java.util.Optional;

public class OptionalMy {

    public static void main(String[] args) {

        Optional<Integer> optEmpty = Optional.empty();
        Integer i = optEmpty.orElseGet(() -> 3);
        System.out.println("i = " + i);
    }
}
