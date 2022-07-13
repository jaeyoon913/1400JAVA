package Ch04Scanner;

import java.util.Scanner;

public class C05연습 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("이름을 입력하세요 : ");
//		String name = sc.nextLine();
//		System.out.printf("%s 님의 나이를 입력하세요 : ",name);
//		int age = sc.nextInt();
//		System.out.printf("%s 님의 주소를 입력하세요 : ", name);
//		sc.nextLine();
//		String address = sc.nextLine();
//		sc.close();
//
//		System.out.println("\n[PROFILE]");
//		System.out.println("이름 : "+name);
//		System.out.println("나이 : "+age);
//		System.out.println("주소 : "+address);

		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		String strNum1 = Scanner.nextLine();
		System.out.print("두번째 수 : ");
		String strNum2 = Scanner.nextLine();
		Scanner.close();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1+num2;
		System.out.println("\n덧셈결과 : "+result);
		
		
	}

}
