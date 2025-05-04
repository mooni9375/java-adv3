package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Generic 추가
 */
public class MyStreamV3<T> {

    private List<T> internalList;

    // 직접 생성하지 못하게 private
    private MyStreamV3(List<T> internalList) {
        this.internalList = internalList;
    }

    // static factory
    public static <T> MyStreamV3<T> of(List<T> internalList) {
        return new MyStreamV3<>(internalList);
    }

    public MyStreamV3<T> filter(Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();

        for (T t : internalList) {
            if (predicate.test(t)) {
                filtered.add(t);
            }
        }
        return MyStreamV3.of(filtered);
    }

    public <R> MyStreamV3<R> map(Function<T, R> mapper) {
        List<R> mapped = new ArrayList<>();

        for (T t : internalList) {
            mapped.add(mapper.apply(t));
        }
        return MyStreamV3.of(mapped);
    }

    public void forEach(Consumer<T> consumer) {
        for (T t : internalList) {
            consumer.accept(t);
        }
    }

    public T getFirst() {
        return internalList.get(0);
    }

    public List<T> toList() {
        return internalList;
    }
}
