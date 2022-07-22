package Ch10ClassBasic;

//this : 만들어진 객체의 위치값 저장하고 있는 내장형 참조변수
//this.멤버변수 : 멤버변수와 매개변수명이 동일할 경우 구별할 수 있다.
//this() : 다른생성자 호출가능
/*class TestThis
{
	TestThis getThis()
	{
		return this;
	}
}
*/

class C06Simple
{
	int x;
	int y;
	int z;
	C06Simple(){
//		x=10;
//		y=10;
//		z=10;
		this(10,10,10); //인자 3개를 받는 생성자 호출
	}	//디폴트
	C06Simple(int x){
//		this.x=x;
//		y=10;
//		z=10;
		this(x,10,20);
	}	//인자 1
	C06Simple(int x, int y){
//		this.x=x;
//		this.y=y;
//		y=10;
		this(x,y,10);		
	}	//인자2
	C06Simple(int x, int y, int z)	//인자3
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
}


public class C06this {

	public static void main(String[] args) {
//		C06Simple ob1 = new C06Simple(10,20,30);
		
		//1 this 확인
//		TestThis ob1 = new TestThis();
//		System.out.println("ob = "+ob1);
//		System.out.println("this = "+ob1.getThis());
		
		//2 This 확인
		C06Simple ob1 = new C06Simple();
		C06Simple ob2 = new C06Simple(100);
		C06Simple ob3 = new C06Simple(100,200);
		C06Simple ob4 = new C06Simple(100,200,300);
		
	}

}
