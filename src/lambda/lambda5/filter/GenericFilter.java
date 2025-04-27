package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GenericFilter {

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();

        for (T t : list) {
            if (predicate.test(t)) {
                filtered.add(t);
            }
        }
        return filtered;
    }
}
