package casting;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
		
// [ 실습 ]
//	두 정수를 입력한 뒤 덧셈 결과 출력
//		단, next()만 사용.
//		Scanner sc = new Scanner(System.in);
////		int num1 = 0;
////		int num2 = 0;
//		
//		System.out.print("첫번째 정수를 입력해주세요. : ");
//		
////		num1 = sc.next();
//		System.out.println();
//		
//		System.out.print("두번째 정수를 입력해주세요. : ");
////		num2 = sc.next();
//	
//		System.out.println(num1 + num2);

//		강사님 코드
		int num1 = 0, num2 = 0, result = 0; //이렇게도 가능
		String msg1 = "첫번째 정수 : " , msg2 = "두번째 정수 : ";
		Scanner sc = new Scanner(System.in);
		
		System.out.print(msg1);
		num1 = Integer.parseInt(sc.next());
		
		
		System.out.print(msg2);
		num2 = Integer.parseInt(sc.next());
		
		result = num1 + num2;
		//형태1
		System.out.printf("%d + %d = %d", num1, num2, result);
		
		System.out.println();
		
		//형태2
		System.out.println(num1 + " + " + num2 +  " = " + (num1 + num2));
		
	}//메인
}//클래스
