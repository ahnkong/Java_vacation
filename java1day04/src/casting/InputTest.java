package casting;

import java.util.Scanner;

// 스캐너의 주소를 알려주는 것, Scanner 만들때, 자동 완성으로 만들면 임폴트 해서 주소를 알려줌.
// 즉 스캐너의 주소는  java.util.Scanner 어 유틸안이야~ 라고 이야기 해줌!
// ctrl + shift + 알파벳 O =>> 단축키
public class InputTest {
	public static void main(String[] args) {
								//r 시스템 안으로 넣어주는 표준 입력 장치라고 생각
//		Scanner sc = new Scanner(System.in);
		
		
//		초기값: 어떤 값을 넣을지 모를 때 일단 넣어두는 값.
		/*
		 * 정수: 0 
		 * 실수: 0.0 
		 * 문자: ''(공백문자) 
		 * 문자열: null 또는 "" (클래스이다.) * null을 넣어야 할때, ""를 넣어야 하는 경우의 수가 다 다르다.
		 */
		
//		String name = null; // 초기화, 해놓고, 다른 단어로 바꾸지 않게 해놓지 않으면, null님 환영합니다. 요렇게 되어버림
//		System.out.println(name + "님 환영합니다.");
		
		
//		<선언부>
		Scanner sc = new Scanner(System.in);
		String name = null;
		String firstName = null;
		String lastName = null;
		
				
//		입력 커서가 밑에				
		System.out.println("이름을 입력하세요 : ");
		// next(); = 스페이스바를 기준으로 구분,
		name = sc.next(); // 엔터 누름 \n은 어디선가 존재, 
		
//		입력 커서가 옆에
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
					
		System.out.println(name + "님 완전 환영합니다.");
		sc.nextLine(); // 아직 남아있는 줄바꿈을 소비시켜준다.
		sc.nextLine(); // 
		
		
		
		// nextLine() : 줄바꿈(엔터)를 기준으로 구분
		System.out.println("성과 이름을 엔터 해서 입력해주세요. : ");
		lastName = sc.nextLine(); 
				// \n이 다음 입력인 lastName 여기서 끝나서, 그 이후인 sc.nextLine여기가 실행되지 않아버림.
				// 해결하기 위해서
		firstName = sc.nextLine();
		 
		System.out.println(lastName + firstName + "님 짱 환영합니다.");
		
		//sc.nextInt(); => 입력한 값을 정수로 변환
		//sc.nextDouble(); => 입력한 값을 실수로 변환
		//공백을 기준으로 구분한다. 123 456
	}//메인
}//클래스
