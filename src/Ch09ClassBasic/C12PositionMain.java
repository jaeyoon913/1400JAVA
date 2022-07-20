package Ch09ClassBasic;

class C12Position
{
	//속성
	int x;
	int y;
	int z;
	//생성자
	C12Position(){}
	C12Position(int x){
		this.x=x; y=0; z=0;		//지역변수와 멤버변수를 구별하게 해준다. this.~ 이 멤버변수
	}
	C12Position(int x, int y){
		this.x=x;
		this.y=y;
		z=0;
	}
	C12Position(int x, int y, int z){
		this.x=x; this.y=y; this.z=z;
	}	
	//기능
	void ShowInfo()
	{
		System.out.printf("x=%d y=%d z=%d\n", x,y,z);
	}
	
}
public class C12PositionMain {

	public static void main(String[] args) {
		C12Position obj1 = new C12Position();
		C12Position obj2 = new C12Position(10);
		C12Position obj3 = new C12Position(10,20);
		C12Position obj4 = new C12Position(10,20,30);
	}

}
