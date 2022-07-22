package Ch11Array;

import java.util.Scanner;

public class C04Array {

	public static void main(String[] args) {
		//1 행, 열의 크기를 키보드로 받습니다
		//2 행, 열 안에 각각의 위치에 값을 입력합니다
		//3 각 행의 값의 총합을 따로 출력합니다
		//4 각 열의 값의 총합을 따로 출력합니다
		//5 모든 값의 총합을 따로 출력합니다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행, 열의 크기 : ");
		int size = sc.nextInt();
		int size2= sc.nextInt();
		
		int [][] arr = new int[size][size2];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.printf("arr[%d][%d]= ",i,j);
				int num = sc.nextInt();
				arr[i][j]=num;
			}
		}
		//각 행의 값의 총합	
		int sum1=0;
		for(int i=0;i<arr.length;i++)
		{
			sum1=0;
			for(int j=0;j<arr[i].length;j++)
			{
				sum1+=arr[i][j];
			}
			System.out.printf("%d 행의 값의 합 : %d\n",i,sum1);
		}		
		//각 열의 값의 총합
		int sum2=0;
		for(int j=0;j<arr.length;j++)
		{
			sum2=0;
			for(int i=0;i<arr[j].length;i++)
			{
				sum2+=arr[i][j];
			}
			System.out.printf("%d 열의 값의 합 : %d\n",j,sum2);
		}
		int sum3=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				sum3+=arr[i][j];
			}
		}		
		System.out.println("값의 총 합 : "+sum3);
	}

}
