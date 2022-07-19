package Ch09ClassBasic;

import java.util.Scanner;

class SumCal
{
	Scanner sc = new Scanner(System.in);
	//인자o, 반환o
	int sum1(int x, int y) {
		return x+y;
	}
	//인자o, 반환x
	void sum2(int x, int y) {
		System.out.println("void sum2(x,y) = "+(x+y));
	}
	//인자x, 반환o
	int sum3() 
	{		
		System.out.print("x,y를 입력하세요 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();		
		return x+y;
	}
	//인자x, 반환x
	void sum4()
	{		
		System.out.print("x,y를 입력하세요 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();		
		System.out.println("void sum4() = "+(x+y));
	}
}
public class C06MethodTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//객체 생성
		SumCal obj1 = new SumCal();
		
		//함수 호출
		int result1 = obj1.sum1(10, 20);
		System.out.println("sum1(10,20) = "+result1);
		
		obj1.sum2(30, 40);
		
		int result3 = obj1.sum3();
		System.out.println("sum3() = "+result3);
		
		obj1.sum4();
	
	}

}
