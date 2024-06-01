package variable;

public class CastingTest {
	public static void main(String[] args) {
/*자동 형변환*/
		
		System.out.println(11 / 4); //정수간의 연산은 정수 ★나머지는 버린다.
		System.out.println(11.0 / 4); // 정수와 실수의 연산 => 실수
		
		
/*강제 형변환*/
		System.out.println(11 / ( double)4); // 정수 앞에 double을 붙여서 실수로 강제 형변환
		System.out.println((int)8.43 + 3.56); // 실수 앞에 int를 붙여 정수로 강제 형변환
		System.out.println((int)(8.43 + 3.56)); // 실수 앞에 int를 붙여 정수로 강제 형변환
		// '10'이 출력되기 원한다.
		System.out.println((int)(8.34+2)); // 1)
		System.out.println((int)8.34 + (int)2); // 2) 둘다 가능하다.
	}
}
