package Ch10ClassBasic;

import java.util.Scanner;

public class C04StringClass {

	public static void main(String[] args) {
		
//		String str1 = new String("JAVA is");
//		String str2 = new String(" Powerful");
//		String str3 = str1+str2;
		
//		System.out.println(str3);
		//문자열의 저장 위치 확인
//		System.out.println(System.identityHashCode(str1));
//		System.out.println(System.identityHashCode(str2));
//		System.out.println(System.identityHashCode(str3));
//		
//		System.out.println("길이 : "+str1.length());
//		System.out.println("단일문자 찾기 : "+str1.charAt(1));
//		System.out.println("문자열Idx 검색 : "+str1.indexOf("V"));
//		System.out.println("문자열 자르기 : "+str1.substring(1,4));
//		System.out.println("포함문자열 검색 : "+str1.contains("VA"));
//		System.out.println("문자열 교체하기 : "+str1.replace('A','a'));
		
		//단일 한문자 받기 연습
		Scanner sc = new Scanner(System.in);
		
		char tmp = sc.nextLine().charAt(0);
		
		System.out.println("단일문자 확인 : "+tmp);
		
		
		
	}

}
