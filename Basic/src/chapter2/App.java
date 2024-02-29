package chapter2;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!"); // ""은 string type
        System.out.println('H'); // '' 은 character type

        double a = 1.1;
        double b = 1; // 1.0 (Auto casting)

        int d = (int) 1.1; // casting: 소수점 제거해서 1로 변환됨

        String c = Integer.toString(d); // JS와 유사함
    }
}
