package control;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//		두 정수를 입력 받아서
//		어떤 숫자가 더 큰지 확인하는 프로그램 작성
			int num1 = 0, num2 = 0;
			String msg = "정수 두개를 엔터로 구분하여 입력 : ", result = null;// result변수 선언
			//입력 코드
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println(msg);
			num1 = sc.nextInt(); // 다이렉트로 숫자로만 입력받게 하는 코드
			num2 = sc.nextInt();

			
// if문 검사-> else if -> else이런식으로 흐름			
//			 if(num1 > num2) {
//		         result = "큰 값 : " + num1;
//		      } else if(num1 < num2){
//		         result = "큰 값 : " + num2;
//		      } else {
//		         result = "두 수는 같습니다.";
//		      }
			
			
//if문이 3개로 다 실행해야 함.		      
		      if(num1 >= num2) {
		         result = "큰 값 : " + num1;
		      }
		      if(num1 < num2){
		         result = "큰 값 : " + num2;
		      } 
		      if(num1 == num2){
		         result = "두 수는 같습니다.";
		      }

			
			System.out.println(result);
			
	} // 메인
}//클래스
