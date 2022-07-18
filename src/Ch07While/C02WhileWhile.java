package Ch07While;

public class C02WhileWhile {

	public static void main(String[] args) {
		//전체 구구단출력(2-9단)
		
//		int dan = 2;
//		int i;
//		while(dan<=9)
//		{
//			i=1; 	//i를 다시 1로 초기화.
//			while(i<=9)
//			{
//				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		//문제
//		int n = 2;
//		while(n<=9)
//		{
//			System.out.printf("%d*9 = %d\n",n,n*9);
//			System.out.printf("%d*8 = %d\n",n,n*8);
//			System.out.printf("%d*1 = %d\n",n,n*1);
//			System.out.println();
//			n++;
//		}
//		int dan = 9;
//		int i;
//		while(dan>=2)
//		{
//			i=9; 	
//			while(i>=1)
//			{
//				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
//				i--;
//			}
//			System.out.println("-----------");
//			dan--;
//		}
		
		//별찍기
		//*****
		//*****
		//*****
		//*****
//		int i = 1;
//		int j;
//		while(i<=4)
//		{
//			j=1;
//			while(j<=5)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//*
		//**
		//***
		//****
//		int i = 1;
//		int j;
//		int n=0;
//		while(i<=4)
//		{
//			j=0;
//			while(j<=n)
//			{			
//				System.out.print("*");
//				j++;			
//			}
//			n++;
//			System.out.println();
//			i++;
//		}
//		
//		//****
//		//***
//		//**
//		//*
//		
//		System.out.println();
//		int i2 = 1;
//		int j2;
//		int n2=0;		
//		while(i2<=4)
//		{
//			j2=4;
//			while(j2>n2)
//			{			
//				System.out.print("*");
//				j2--;			
//			}
//			n2++;
//			System.out.println();
//			i2++;
//		}
		//   *
		//  ***
		// *****
		//*******
//		int i=0;
//		int j=0;
//		int k=0;
//		while(i<4)
//		{
//			j=0;
//			while(j<=2-i)	//공백찍기
//			{
//				System.out.print(" ");
//				j++;				
//			}
//			k=0;
//			while(k<=2*i)	//별찍기
//			{
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//*******
		// *****
		//  ***
		//   *
		int i,j,k;
		i=0;
		while(i<4)
		{
			j=0;
			while(j<=i-1) 
			{
				System.out.print(" ");
				j++;
			}
			k=6;
			while(k>=2*i)
			{
				System.out.print("*");
				k--;
			}
			System.out.println();
			i++;
		}		
	}
}
