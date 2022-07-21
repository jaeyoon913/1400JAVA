package Ch10ClassBasic;

import java.util.Scanner;

public class C05Prac {

	public static void main(String[] args) {
		//문제
		//String 클래스로 문자열을 하나 입력받습니다
		//1. 입력받은 문자열의 길이 출력
		//2. 문자열이 idx중에 2,3,4만 출력
		//3. 다른 문자열을 하나 더 받아서 이전에 저장된 문자열에 해당 문자열이 포함되어있는지 여부 확인
		//4. 두 문자열의 일치여부확인
		//5. 저장된 문자열의 길이를 확인해서, 특정문자열 위치 idx 확인 후 확인된 idx위치에서 마지막 idx까지 잘라내기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("tmp : ");
		String tmp = sc.nextLine();
		
		System.out.println("입력받은 문자열의 길이 : "+tmp.length());
		System.out.println("idx 2,3,4 : "+tmp.charAt(2)+tmp.charAt(3)+tmp.charAt(4));
		
		System.out.print("tmp2 : ");
		String tmp2 = sc.nextLine();
		
		System.out.println("포함여부 확인 : "+tmp.contains(tmp2));
		System.out.println("일치여부 확인 : "+tmp.equals(tmp2));
		System.out.println("잘라내기 : "+tmp.substring(tmp.indexOf('a'),tmp.length()));
	
	}

}
