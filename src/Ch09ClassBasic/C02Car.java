package Ch09ClassBasic;

public class C02Car {
	String owner;
	int speed;
	int fuel;
	//기능
	void Accel()
	{
		System.out.println(owner+"님의 차의 속도가 증가합니다");		
	}
	void Break()
	{
		System.out.println(owner+"님의 차의 속도가 감소합니다");		
	}
	void showInfo()
	{
		System.out.printf("%s %d %d\n", owner,speed,fuel);
	}
}
