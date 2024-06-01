package exceptionTest;
//예외 클래스 실습

public class ExceptionTest {
	public static void main(String[] args) {
		
		try {
			System.out.println(10 / 0);		
			
			             //r예외 클래스 이름 
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			// 예외 클래스의 Exception 최상위 클래스임. 
			System.out.println(e.getMessage());
			
		} catch(Exception e) { //모든 예외 클래스의 부모는 Exception, upCasting을 해서 들어온다.
		System.out.println(e);
		
		}		
		
		System.out.println("종료!!!! 이제 퇴근하세요");
	}	
}