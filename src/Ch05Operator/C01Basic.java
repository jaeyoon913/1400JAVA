package Ch05Operator;

import java.util.Scanner;

public class C01Basic {

	public static void main(String[] args) {
		//산술 연산자
//		int a=10,b=3,c;
//		System.out.println("a+b = "+(a+b));
//		System.out.println("a-b = "+(a-b));
//		System.out.println("a*b = "+(a*b));
//		System.out.println("a/b = "+(a/b));		//몫
//		System.out.println("a%b = "+(a%b));		//나머지
//		System.out.println("-a = "+(-a));		//a=-a와 혼동 주의!
		
		//복합대입 연산자
		//+=, -=, *=, /=, %=
//		int a = 10;
//		a+=10;
//		System.out.println("a : "+a);
//		a-=5;
//		System.out.println("a : "+a);
//		a*=7;
//		System.out.println("a : "+a);
//		a/=7;
//		System.out.println("a : "+a);
		
		//비교연산자
		// >, >=, <, <=, ==, !=
//		int a=10, b=20;
//		System.out.println("a==b? "+(a==b));
//		System.out.println("a>=b? "+(a>=b));
//		System.out.println("a>b? "+(a>b));
//		System.out.println("a<=b? "+(a<=b));
//		System.out.println("a<b? "+(a<b));
//		System.out.println("a!=b? "+(a!=b));
		
		//논리연산자
		//&&(and), ||(or)
//		System.out.println("true && true ? "+(true&&true));
//		System.out.println("false && true ? "+(false&&true));
//		System.out.println("true && false ? "+(true&&false));
//		System.out.println("false && false ? "+(false&&true));
		
//		int a =10, b=20, c=15;
//		System.out.println("true && true ? "+(a>=b&&a>=c));
//		System.out.println("false && true ? "+(b>=c&&b>=a));
//		System.out.println("true && false ? "+(true&&false));
//		System.out.println("false && false ? "+(false&&true));
		
//		System.out.println("true || true ? "+(true||true));
//		System.out.println("false || true ? "+(false||true));
//		System.out.println("true || false ? "+(true||false));
//		System.out.println("false || false ? "+(false||false));
		
//		boolean flag = true;
//		System.out.println(!flag);

		//증감연산자(++,--)
		//전치연산자 : ++a, --a 변수안의 값을 먼저 증감해준다.
		//후치연산자 : a++, a-- 다른연산처리를 먼저한 후 증감해준다.
//		int a =10,b=20,c,d;
//		c=--a + b--;
//		d=a-- + --b;
//		System.out.printf("%d %d %d %d\n", a,b,c,d);
		
		//삼항연산자(IF문으로 대체가능, 단순구조의 분기문)
		Scanner sc = new Scanner(System.in);
//		System.out.print("점수입력 : ");
//		
//		int score = sc.nextInt();
//		char grade = (score>90)?'A':'B';
//		System.out.println("grade : "+grade);
		
		//문제: 두 수를 입력받아 큰 수를 출력하세요
		System.out.print("첫번째 수를 입력하시오 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수를 입력하시오 : ");
		int num2 = sc.nextInt();
		sc.close();
		
		System.out.printf("큰 수: %d",(num1>=num2)?num1:num2);
		
			
	}

}
