package Ch01;

public class C02BasicOutputMethod {

	public static void main(String[] args) {
		//System.out : 표준 출력 스트림(해석 : 표준출력장치(모니터)에 전달)
		
		//System.out.print() : 콘솔화면에 내용출력
		/*Escape문자 사용을 통한 개행(줄바꿈) : 기존의 문자용도를 벗어나 특정한 기능 수행에 사용되는 문자
		\n : 줄바꿈
		\b : 한문자 삭제
		\t : 8칸 커서 이동
		*/
		System.out.print("HELLO WORLD\n");
		System.out.print("HELLO WORLD\n");
		
		System.out.print("\b\b\b*\n");
		System.out.print("\b\b***\n");
		System.out.print("\b*****\n");
		System.out.print("*******\n");
		
		//System.out.printf()
		//format : 형식, 서식
		//%d : 10진 정수 서식문자
		//%f : 실수
		//%c : '한문자' 서식문자
		//%s : "문자열" 서식문자
		
		System.out.printf("%d\n",10);
		System.out.printf("%d + %d = %d\n",10,10,10+20);
		System.out.printf("%f + %f = %f\n", 10.23,20.75,30.98);
		System.out.printf("%c %c %c\n", 'A','B','C');
		System.out.printf("%s %s %s\n", "This is ","String ","Test");
		System.out.printf("%d.%s : %d\n", 1, "성적", 100);
		
		/*문제
		System.out.printf("나의 이름은 %s 입니다.\n", "유재윤");
		System.out.printf("나의 나이는 %d세 입니다.\n", 24);
		System.out.printf("나의 성별은 %c 입니다.\n", 'F');
		*/
		
		//서식문자 정렬/ 자리수지정
		//10칸 확보 후 오른쪽 정렬 , 왼쪽정렬을 원한다면 -붙여주기
		//소수점은 .n으로 자리수 지정 가능
		System.out.printf("%10d%d\n", 1234,5678);
		System.out.printf("%-10d%d\n", 1234,5678);
		System.out.printf("%10.3f\n",10.123456);
		
		//주의! : 특수문자가 출력되길 바란다면 \을 사용하자
		System.out.print("I said \"Hello?\"\n");
		
		//System.out.println() : 자동줄바꿈가능
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		
		//문제
		System.out.printf("%-8s %-8s %-8s %-8s\n","No","이름","나이","주소");
		System.out.printf("%-8d %-8s %-8d %-8s\n",1,"홍길동",20,"대구");
		System.out.printf("%-8d %-8s %-8d %-8s\n",2,"남길동",30,"서울");
		System.out.printf("%-8d %-8s %-8d %-8s\n",3,"서길동",40,"울산");
		System.out.printf("%-8d %-8s %-8d %-8s\n",4,"동길동",50,"김해");
		
		System.out.printf("%-10s %-10s %-10s %-10s\n", "Code","Title","Publisher","Price");
		System.out.printf("%-10d %-10s %-10s %-10d\n", 1010,"DoItJava","미디어",29000);
		System.out.printf("%-10d %-10s %-10s %-10d\n", 2020,"윤성우C","오렌지미디어",25000);
		
		System.out.printf("%4s\n", "*");
		System.out.printf("%5s\n", "***");
		System.out.printf("%6s\n", "*****");
		System.out.printf("%7s\n", "*******");
		System.out.printf("%6s\n", "*****");
		System.out.printf("%5s\n", "***");
		System.out.printf("%4s\n", "*");
		
		

	}

}
