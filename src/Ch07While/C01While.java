package Ch07While;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
		//기본
		//탈출용 변수 지정
		//탈출용 조건식
		//조건식이 false가 되도록하는 연산식
		
//		int i=0; 
//		while(i < 10)
//		{
//			System.out.println("Hello World!");
//			i++;
//		}
		
		//02 1부터 10까지 합 구하기
//		int i=1;
//		int sum=0;
//		while(i<=10)
//		{
//			sum+=i;
//			System.out.printf("1부터 %d까지의 합: %d\n",i,sum);
//			i++;
//		}
//		System.out.println("1부터 10까지의 합: "+sum);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 : ");
//		int n1=sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		while(i <= n1)
//		{
//			sum+=i;
//			i++;
//		}
//		System.out.printf("1부터 %d까지의 합 : %d\n",n1,sum);
//		
//		System.out.print("정수 두개 : ");
//		int n2 = sc.nextInt();
//		int n3 =n2;
//		int m = sc.nextInt();
//		
//		//swap(n>m일 경우)
//		if(n2>m)
//		{
//			int tmp = n2;
//			n2=m;
//			m=tmp;
//		}
//		
//		int sum2 = 0;
//		while(n2<=m)
//		{
//			sum2+=n2;
//			n2++;
//		}
//		System.out.printf("%d부터 %d까지의 합 : %d\n",n3,m,sum2);
		
		//2단 구구단
//		int i =1;
//		while(i<=9)
//		{
//			System.out.printf("2*%d = %d\n",i,2*i);
//			i++;
//		}
//		
//		//2단 역순 구구단
//		int i2 = 9;
//		while(i2>=1)
//		{
//			System.out.printf("%d * %d = %d\n",2,i2,2*i2);
//			i2--;
//		}
//		
//		//정수값 하나 받아서 역순 구구단
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 : ");
//		int n = sc.nextInt();
//		int i3 = 9;
//		while(i3 >= 1)
//		{
//			System.out.printf("%d * %d = %d\n", n,i3,n*i3);
//			i3--;
//		}
	
		//1부터 n까지 수중에 3의 배수의 합만 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("n : ");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		while(i <= n)
		{
			if(i%3 == 0)
			{
				sum+=i;
			}
			i++;
		}
		if(sum!=0)
		{
			System.out.println("3의 배수의 합 : "+sum);
		}
		else
		{
			System.out.println("NULL");
		}
				
	}

}
