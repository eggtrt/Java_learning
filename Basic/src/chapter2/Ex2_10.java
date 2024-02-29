package chapter2;
import java.util.Scanner;  

class Ex2_10 { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);

		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); 

		System.out.println("�Է³��� :"+input);
		System.out.printf("num=%d%n", num);
	} 
}