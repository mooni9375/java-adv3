package lambda.start;

public class Ex0RefMain {

    public static void helloPrint(String content) {
        System.out.println("프로그램 시작");
        System.out.println("Hello " + content);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        helloPrint("Java");
        helloPrint("Spring");
    }
}
