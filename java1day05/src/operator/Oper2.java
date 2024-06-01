   package operator;

import java.util.Scanner; // Scanner sc = new Scanner(System.in);

public class Oper2 {
	public static void main(String[] args) {
//	두 정수를 입력 받아서
//	어떤 숫자가 더 큰지 확인하는 프로그램 작성
		int num1 = 0, num2 = 0;
		String msg = "정수 두개를 엔터로 구분하여 입력 : ", result = null;// result변수 선언
		//입력 코드
		Scanner sc = new Scanner(System.in);
		boolean isSame = false, isBigger = false; //( 이것도 새로 선언) ★불린 타입의 초기값은 항상 false.임!!!
		
		
		System.out.println(msg);
		num1 = sc.nextInt(); // 다이렉트로 숫자로만 입력받게 하는 코드
		num2 = sc.nextInt();
		
		isSame = num1 == num2;
		isBigger = num1 > num2;
		
		
//		System.out.println("더 큰 놈은 " + (num1 > num2? num1 : num2) + " 이거랍니다."); 
		
		
// 형태 1) 변수 result, num1, num2		
//		result = num1 == num2 ? "두 수가 같습니다." : 
//			num1 > num2? "큰 값 : " + num1 : "큰 값 : " + num2;
			
// 형태 2) result, isSame, isBigger, 삼항연산자를 한번 더 쓴것, 삼항 연산자를 사용하면 값은 하나가 나옴.
//		위에서 isSame, isBigger 이거 새로 선언해주는것
				result = isSame ? "두 수가 같습니다." : 
				isBigger ? "큰 값 : " + num1 : "큰 값 : " + num2;
			
			System.out.println(result);
	}

}