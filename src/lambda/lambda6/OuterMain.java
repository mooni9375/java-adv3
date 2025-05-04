package lambda.lambda6;

public class OuterMain {

    public static void main(String[] args) {
        OuterMain outer = new OuterMain();
        System.out.println("[외부 클래스] outer : " + outer);
        System.out.println("[외부 클래스] message : " + outer.message);
        System.out.println("--------------------------------------------------");
        outer.execute();

    }

    private String message = "외부 클래스";

    public void execute() {
        // 1. 익명 클래스 예시
        Runnable anonymous = new Runnable() {

            private String message = "익명 클래스";

            @Override
            public void run() {
                // 익명 클래스에서의 this : 익명 클래스의 인스턴스를 가리킴
                System.out.println("[익명 클래스] this : " + this);
                System.out.println("[익명 클래스] this.class : " + this.getClass());
                System.out.println("[익명 클래스] message : " + this.message);
            }

        };

        Runnable lambda = () -> {
            // 람다에서의 this : 람다가 선언되어 있는 클래스의 인스턴스(즉, 외부 클래스)
            System.out.println("[람다] this : " + this);
            System.out.println("[람다] this.class : " + this.getClass());
            System.out.println("[람다] message : " + this.message);
        };

        anonymous.run();
        System.out.println("--------------------------------------------------");
        lambda.run();
    }


}
