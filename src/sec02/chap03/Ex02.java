package sec02.chap03;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println("\n- - - - -\n");

        double pi = 3.14; // 💡 값이 바뀔 수 있으므로 '변수'라 부름

        System.out.println("원주율: " + pi);

        System.out.println("\n- - - - -\n"); // 💡 \n : 줄바꿈

        System.out.println("원주율: " + pi);
        System.out.println("원의 둘레: 지름 X " + pi);
        System.out.println("원의 넓이: 반지름의 제곱 X " + pi);
        System.out.println("구의 부피: 반지름의 세제곱 X 4/3 X " + pi);

        System.out.println("\n- - - - -\n");

        pi = 3.14159265358979; // 💡 값이 바뀔 수 있으므로 '변수'라 부름

        System.out.println("원주율: " + pi);
    }
}
