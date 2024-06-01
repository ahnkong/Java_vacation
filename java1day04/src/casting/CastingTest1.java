package casting;

public class CastingTest1 {
	public static void main(String[] args) {
/*문자 타입의 형변환*/		
		// 아스키 코드 (1~ 127까지 있고) 1바이트여서~ 8비트 이다! 
		// 문자 + 정수 = 정수
		// 1바이트 < 2바이트 큰 바이트로 자동 형변환이 되는 것이기 때문에 정수가 나온다.
		// 정수(4바이트 ) + 실수(8바이트) => 실수로 튀어 나오는 것과 같은 것
		char data = 65;
		char data2 = 66;
		System.out.println(data);
		System.out.println(data2);
		System.out.println(data+1);
		
		
		
		
		
		
	}// 메인
}// 클래스
