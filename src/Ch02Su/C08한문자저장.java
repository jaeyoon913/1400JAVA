package Ch02Su;

public class C08한문자저장 {

	public static void main(String[] args) {
		//ascii코드로 문자를 숫자로 변환 또는 숫자를 문자로 변환
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((int)'가');
		System.out.println((int)'각');
		System.out.println((int)'나');
		System.out.println((char)65);
		
		System.out.printf("%x\n",(int)'가');
		System.out.printf("%x\n",(int)'나');
		
		System.out.println('\ub090');	//유니코드표의 코드를 변환하기 위함
		System.out.println('\uac00');
		
		
		
	}

}
