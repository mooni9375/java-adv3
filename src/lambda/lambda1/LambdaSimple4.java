package lambda.lambda1;

import lambda.MyFunction;

public class LambdaSimple4 {

    public static void main(String[] args) {

        MyCall call1 = (int value) -> value * 2;
        System.out.println("call1 = " + call1.call(10));

        MyCall call2 = (value) -> value * 2;
        System.out.println("call2 = " + call2.call(10));

        // 매개변수가 1개일 때만 () 생략 가능
        MyCall call3 = value -> value * 2;
        System.out.println("call3 = " + call3.call(10));
    }

    interface MyCall{
        int call(int value);
    }
}
