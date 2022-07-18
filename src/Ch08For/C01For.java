package Ch08For;

import java.util.Scanner;

public class C01For {

	public static void main(String[] args) {
	
//		int i=1;		
//		while(i<=10)
//		{
//			System.out.println("i : "+i);
//			i++;
//		}
		//for 문
		for(int i=1;i<=10;i++)
		{
			System.out.println("i : "+i);	
		}
		
		//문제
		//1부터 N까지의 합
		Scanner sc = new Scanner(System.in);
		System.out.print("N : ");
		int N = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=N;i++)
		{
			sum+=i;
		}
		System.out.println("sum : "+sum);
		
		//N부터 M까지의 합
		//N부터 M까지의 수 중의 3의 배수를 제외한 합
		//구구단 출력
		//-------중첩for--------
		//전체 구구단 출력
		//전체 구구단 역순 출력
		//별찍기(직삼각형, 역직각삼각형, 정삼각형, 역정삼각형...)
		
		
	}

}
