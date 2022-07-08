package Ch02Su;

public class C04실수 {

	public static void main(String[] args) {
		//실수
		//정의 : 유리수와 무리수의 통칭
		//소수점이하를 포함하는 수
		//범위가 무한대에 가깝기 때문에 모든 실수범위를 메모리공간에 저장할 수 없다.
		//특정 유효범위를 두고 근사치를 구해 메모리공간에 저장을 한다.
		//키워드 : 단정밀도, 배정밀도
		
		//소수점위치
		//고정 소수점 : 소수점의 위치 미리결정, 속도는 상대적으로 빠름, 메모리공간 비효율적
		//부동 소수점 : 소수점의 위치가 저장될 데이터에 따라 변경, 속도는 상대적으로 느림,메모리공간 효율
		//현재는 부동 소수점방식을 사용한다.
		//키워드 : 단정밀도, 배정밀도
		
		//리터럴 접미사 없는 실수의 기본자료형은 double형(8byte)
		//리터럴 접미사 f : float형(4byte)
		System.out.println(123.12345678987654321F);

	}

}
