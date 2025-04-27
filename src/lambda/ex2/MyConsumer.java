package lambda.ex2;

@FunctionalInterface
public interface MyConsumer<T> {
    void accept(T value);
}
