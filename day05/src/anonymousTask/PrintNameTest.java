package anonymousTask;

public class PrintNameTest {

// 외부에서 람다식으로 구현한 값을 name으로 전달 받기!
	public static void printFullName(PrintName name) {
		System.out.println(name.getFullName("안", "민정"));
		
	}
		
	
// 메인함수!!!!	
	public static void main(String[] args) {
// 만든 메소드 테스트
// 구현은, 두 문자열을 연결하도록 하자.
		
		
//		printFullName(null);초기화값
		printFullName((lastName, firstName) -> lastName + firstName); //
//		printFullName((매개변수) -> 리턴); 이 리턴값은 => 6번째 줄 name에 쓰윽 들어가게 됨.
		
	}//메인함수
	
}//클래스
