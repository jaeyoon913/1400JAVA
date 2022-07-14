package Ch06ifswitch;

import java.util.Scanner;

public class C01If {

	public static void main(String[] args) {
		/*단순 IF
		if(조건식)
		{
		 	참인 경우 실행되는 코드
		}
		*/
		
//		int age = 7;
//		
//		if(age>=8)
//		{
//			System.out.println("취학 아동입니다");
//		}
//		System.out.println("첫번째 IF문 벗어남");
//		if(age<8)
//		{
//			System.out.println("미취학 아동입니다");			
//		}
//		System.out.println("두번째 IF문을 벗어남");
//		System.out.println("프로그램을 종료합니다");
		
		/*if(조건식)
		{
			참인 경우 실행되는 코드
		}
		else
		{
			거짓일 경우 실행되는 코드
		}
		*/
//		int age = 7;
//		
//		if(age>=8)
//		{
//			System.out.println("취학 아동입니다");
//		}
//		else
//		{
//			System.out.println("미취학 아동입니다");			
//		}	
//		System.out.println("프로그램을 종료합니다");
		
		//문제
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("문제1 정수: ");
//		int n1 = sc.nextInt();
//		if (n1%2==0)
//		{
//			System.out.println("짝수입니다");
//		}
//		else 
//		{
//			System.out.print("홀수입니다");
//		}
//		
//		System.out.print("문제2 정수 : ");
//		int n2 = sc.nextInt();
//		if(n2%3==0)
//		{
//			System.out.println("3의 배수입니다");
//		}
//		if(n2%4==0)
//		{
//			System.out.println("4의 배수입니다");
//		}
//		else 
//		{
//			System.out.println("NULL");
//		}
//		
//
//		System.out.print("문제3 정수1 : ");
//		int n3 = sc.nextInt();
//		System.out.print("문제3 정수2 : ");
//		int n4 = sc.nextInt();
//		if(n3>n4)
//		{
//			System.out.println("큰수 : "+n3);
//		}
//		else
//		{
//			System.out.println("큰수 : "+n4);
//		}
//		
//		System.out.print("문제4 정수1 : ");
//		int a = sc.nextInt();
//		System.out.print("문제4 정수2 : ");
//		int b = sc.nextInt();
//		System.out.print("문제4 정수3 : ");
//		int c = sc.nextInt();
//		
//		if (a>b)
//		{
//			if(a>c)
//			{
//				System.out.println("큰수 : "+a);
//			}
//			if(a<c)
//			{
//				System.out.println("큰수 : "+c);
//			}
//		}
//		if(a<b)
//		{
//			if(b>c)
//			{
//				System.out.println("큰수 : "+b);
//			}
//			if(b<c)
//			{
//				System.out.println("큰수 : "+c);
//			}
//		}
		
		//else-if 문 ->순서를 고려, 단계적으로 수행
//		System.out.print("국,영,수 입력 : ");
//		int kor = sc.nextInt();
//		int eng = sc.nextInt();
//		int mat = sc.nextInt();
//		double avg = (double)((kor+eng+mat)/3);
//		if(kor>=40 && eng>=40 && mat>=40)
//		{
//			if(avg>=60)
//			{
//				System.out.println("합격");
//			}
//			else
//			{
//				System.out.println("불합격");
//			}
//		}
//		else
//		{
//			System.out.println("불합격");
//		}
		
//		if(kor < 40)		//국어점수가 40점 미만인가?
//		{
//			System.out.println("불합격");
//		}
//		else if(eng < 40)	//영어점수가 40점 미만인가?
//		{
//			System.out.println("불합격");
//		}
//		else if(mat < 40)	//수학점수가 40점 미만인가?
//		{
//			System.out.println("불합격");
//		}
//		else if(avg < 60)	//점수평균이 60점 미만인가?
//		{
//			System.out.println("불합격");
//		}
//		else				//모두 아니라면 합격
//		{
//			System.out.println("합격");
//		}
		
		//평균점수를 입력받아 그 점수가 90점이상이면 A, 80점이상이면 B,
		//70점이상이면 C, 60점이상이면 D, 60점미만이면 F출력
		
		System.out.print("평균점수 : ");
		int score = sc.nextInt();
		
		if(score>=90)
		{
			System.out.println('A');
		}
		else if(score>=80)
		{
			System.out.println('B');
		}
		else if(score>=70)
		{
			System.out.println('C');
		}
		else if(score>=60)
		{
			System.out.println('D');
		}
		else
		{
			System.out.println('F');
		}

		//3의배수이면서 4의배수라면 출력
		//3의배수가 아니면서 5의배수라면 출력
//		Scanner sc = new Scanner(System.in);
		
//		int num = sc.nextInt();
		
//		if(num%3==0)
//		{
//			//3의배수인경우
//			if(num%4==0)
//			{
//				System.out.println("3의배수이면서 4의배수");
//			}
//		}
//		else
//		{
//			//3의배수가 아닌 경우
//			if(num%5==0)
//			{
//				System.out.println("3의배수가 아니면서 5의배수");
//			}
//		}
		
//		if(num%3==0 && num%4==0)
//		{
//			System.out.println("3의배수이면서 4의배수");
//		}
//		else
//		{
//			//3의배수가 아니거나 
//			//4의 배수가 아니거나
//			//둘다아니거나
//		}
//		
//		if(num%3!=0 && num%5==0)
//		{
//			System.out.println("3의배수X, 5의배수O");
//		}
	}
}
