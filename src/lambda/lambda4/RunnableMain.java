package lambda.lambda4;

public class RunnableMain {

    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("runnable runs");
        runnable.run();
    }
}
