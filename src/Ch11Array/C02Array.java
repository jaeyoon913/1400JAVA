package Ch11Array;

import java.util.Scanner;

public class C02Array {

	public static void main(String[] args) {
		//문제
		//1 배열의 크기를 입력받습니다
		//2 크기만큼 점수를 키보드로부터 입력받아 배열에 차례대로 저장합니다
		//3 배열에 저장된 각 요소에 접근하여 전체 합과 평균을 출력
		//4 배열 안의 저장된 점수 중에 가장 큰 값과 가장 작은 값을 출력해봅니다
			
		Scanner sc= new Scanner(System.in);
		System.out.print("크기 : ");
		int size = sc.nextInt();
		int arr[]=new int[size];

		for(int i=0;i<size;i++)
		{
			System.out.print("arr["+i+"]=");
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		double avg;
		for(int i=0;i<size;i++)
		{
			sum+=arr[i];
		}
		avg=(double)(sum)/arr.length;
		System.out.printf("sum : %d avg : %.2f\n", sum,avg);
		
		int min=arr[0];
		int max=arr[0];
		for(int i =1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("min : "+min+" max: "+max);
			
	}
	public static void sor(int[] ar)
	{
		//배열을 정렬합니다
		//선택/삽입/버블/기수/병합/.. 아무거나 정렬 로직 사용해봅시다
		//선택정렬사용(왼쪽요소부터 차례대로 정렬되는 방식)
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int tmp=ar[i];
					ar[i]=ar[j];
					ar[j]=tmp;				
				}
			}
		}
	}

}
