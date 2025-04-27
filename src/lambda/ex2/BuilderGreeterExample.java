package lambda.ex2;

public class BuilderGreeterExample {

    public static StringFunction buildGreater(String greeting) {
        /*
        return new StringFunction() {
            @Override
            public String apply(String s) {
                return greeting + ", " + s;
            }
        };
        */

        return s -> greeting + ", " + s;
    }

    public static void main(String[] args) {
        StringFunction helloGreeter = buildGreater("hello");

        System.out.println(helloGreeter.apply("Java"));
        System.out.println(helloGreeter.apply("Spring"));
    }
}
