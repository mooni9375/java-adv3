package lambda.lambda6;

public class CaptureMain {

    public static void main(String[] args) {

        final int final1 = 10; // 명시적으로 final
        int final2 = 20; // 사실상(final): 재할당(값 변경) 없음
        int changedVar = 30; // 값이 변경되는 변수

        // 1. 익명 클래스에서의 캡처
        Runnable anonymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 클래스 - final1: " + final1);
                System.out.println("익명 클래스 - final2: " + final2);
                // 컴파일 오류
                //System.out.println("익명 클래스 - changedVar: " + changedVar); 
            }
        };

        // 2. 람다 표현식에서의 캡처
        Runnable lambda = () -> {
            System.out.println("람다 - final1: " + final1);
            System.out.println("람다 - final2: " + final2);
            // 컴파일 오류
//            System.out.println("람다 - changedVar: " + changedVar);
        };

        // changedVar 값을 변경해서  "사실상 final"이 아님
        changedVar++;

        // 실행
        anonymous.run();
        lambda.run();
    }
}