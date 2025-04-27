package lambda.lambda3;

public class TargetType1 {

    public static void main(String[] args) {
        FunctionA functionA = n -> "value : " + n;
        System.out.println("functionA.apply(10) = " + functionA.apply(10));

        FunctionB functionB = n -> "value : " + n;
        System.out.println("functionB.apply(20) = " + functionB.apply(20));

        // 이미 만들어진 FUnctionA 인스턴스를 FunctionB에 대입 -> compile error
//        FunctionB targetB = FunctionA;


    }

    @FunctionalInterface
    interface FunctionA {
        String apply(Integer integer);
    }

    @FunctionalInterface
    interface FunctionB {
        String apply(Integer integer);
    }
}
