package Ch09ClassBasic;

class TV
{
	String corporation;
	int year;
	int inch;
	
	void showInfo()
	{
		System.out.printf("회사 : %s 년도 : %d 인치 : %d\n",corporation,year,inch);
	}
}
public class C05TVMain {

	public static void main(String[] args) {
		
		TV mytv = new TV();
		mytv.corporation = "LG";
		mytv.year = 2022;
		mytv.inch = 32;
		mytv.showInfo();

	}

}
