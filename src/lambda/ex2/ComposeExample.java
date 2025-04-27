package lambda.ex2;

import javax.imageio.stream.ImageInputStream;

public class ComposeExample {

    public static MyTransformer compose(MyTransformer f1, MyTransformer f2) {

        return new MyTransformer() {
            @Override
            public String transform(String s) {
                return f2.transform(f1.transform(s));
            }
        };
    }

    public static void main(String[] args) {

        MyTransformer toUpper = s -> s.toUpperCase();
        MyTransformer addDeco = s -> "**" + s + "**";

        // 람다 함수를 반환
        MyTransformer transformer = compose(toUpper, addDeco);

        // 반환받은 람다 함수를 실행
        System.out.println(transformer.transform("hello"));
        System.out.println(transformer.transform("world"));
    }
}
