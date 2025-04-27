package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Generic 추가
 */
public class MyStreamV4<T> {

    private List<T> internalList;

    // 직접 생성하지 못하게 private
    private MyStreamV4(List<T> internalList) {
        this.internalList = internalList;
    }

    // static factory
    public static <T> MyStreamV4<T> of(List<T> internalList) {
        return new MyStreamV4<>(internalList);
    }

    public MyStreamV4<T> filter(Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();

        for (T t : internalList) {
            if (predicate.test(t)) {
                filtered.add(t);
            }
        }
        return MyStreamV4.of(filtered);
    }

    public <R> MyStreamV4<R> map(Function<T, R> mapper) {
        List<R> mapped = new ArrayList<>();

        for (T t : internalList) {
            mapped.add(mapper.apply(t));
        }
        return MyStreamV4.of(mapped);
    }

    public List<T> toList() {
        return internalList;
    }

    // 추가
    public void forEach(Consumer<T> consumer) {
        for (T element : internalList) {
            consumer.accept(element);
        }
    }
}
