package variable;

public class Constant {
	public static void main(String[] args) {
		
/*상수*
 * 소문자가 아닌 대문자로 선언한다.*/
		
//		int ON = 1;
//		int OFF = 0;
		final int ON = 1; 
		final int OFF = 0;
		
		// 소문자로 적어두고 출력해도 되지만, 해당 값을 수정하려고 할때 컴파일러가 에러를 일으킨다.
//		OFF = 3; // 상수는 값을 수정할 수 없다.
		System.out.println(ON);
		System.out.println(OFF);

// 소문자 출력시 에러		
//		System.out.println(on); 
//		System.out.println(off);
		
		
	}//메인
}//클래스
