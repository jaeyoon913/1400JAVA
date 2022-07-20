package Ch09ClassBasic;

class C13Prac
{
	
	int math;
	int science;
	int english;
	
	double avg(int x, int y, int z)
	{
		math = x;
		science = y;
		english = z;
		
		return (double)((x+y+z)/3);
	}
}
	
public class C13PracMain {

	public static void main(String[] args) {
		
		C13Prac obj = new C13Prac();
		System.out.println("평균 : "+obj.avg(90,88,96));

	}

}
