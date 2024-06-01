 package operator;

public class Oper1 {
	public static void main(String[] args) {
/* 관계 연산자 */
		// boolean -> 조건식 
		boolean temp = 10 > 11;   //형태1
		boolean temp1 = false;  //형태2
		
		System.out.println(10 > 11); //false라는 값이 최우선 연산자로 인해 먼저 실행되며 대입연산자에 의해 temp에 저장 되는 것

		
/* 논리 연산자 */
//		여러개의 조건을 연결해서 하나의 조건을 만든다.<조건 연결>(13세 이상, 130cm 이상, 여자 )요렇게 해도! 저 연산의 값은 true, 아니면 false가 뜨는 것
		// 논리합
		System.out.println(10 > 11 || 45 > 55 || 55 < 33 || 88 == 44); //4개의 조건이 있었지만, 결국은 한개이다.
	
		// 논리곱
		System.out.println(10 > 11 && 10 == 10);// 논리 곱이므로 둘다 충족해야함. 연산자를 수정하여 식을 true가 나오게 =>>>>>>>>>>>>>>>>>> !
		System.out.println(!(10 > 11) && 10 == 10);
		
		
/* 산술 연산자 중 - 나머지 연산자 */
//		정수와 정수의 연산의 결과는 무조건 정수가 나오게 되어있음.
		System.out.println(10 % 3); // 나머지 연산자, 정수에서만 => 1
		System.out.println(10 / 3); // 몫 연산자 => 3
	
		
		
	} // 메인 함수
}// 클래스 
