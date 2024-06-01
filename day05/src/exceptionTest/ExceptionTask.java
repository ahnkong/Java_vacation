package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
		public static void main(String[] args) {//메인클래스 
			
// 실습	
	// 5개의 정수만 입력 받기
	// 	- 무한 입력 상태로 구현
	// 	- q 입력시 나가기
	//	- 5개의 정수는 배열  담기
	//	- if문은 딱 한 번만 사용하기 (q를 입력 시 탈출하는 용도로만 사용)
	//	- 단 입력 받을 때는 무조건 next()만 사용하기
			// 선언부
	Scanner sc = new Scanner(System.in);// 입력
		int[] arData = new int[5]; // 5칸 배열 담기
		String msg = "번째 정수 : ", num = null; // 
		int i = 0;

		while(true) {
			System.out.print(++i + msg);
			num = sc.next();

			if(num.equals("q")) {// 문자열 비교는 equals 메소드 사용
				System.out.println("입력 종료");
				break;

			}//if

			try {
				arData[i-1] = Integer.parseInt(num);// 에러가 난 코드

			}catch (ArrayIndexOutOfBoundsException e) { // 에러코드 복붙, 이거면 밑에 출력해줘
				System.out.println("이미 5개의 정수를 입력했네요?");
				break;	

					// 이십사, 요렇게 쓸때, 수정하고 다시 5개 끝까지 작성할 수 있도록 ! 
			}catch (NumberFormatException e) {
				System.out.println("정수만 숫자로 입력하라니까?");
				i--;
			}catch (Exception e) { // 모든 예외의 부모클래스를 하나 넣어주고, 다른 예외는 밑에를 출력해죠
				System.out.println("예기치 못한 에러가 발생했습니다.");
				System.out.println(e);
				break;
			}// catch문 중괄호


		}//while문 중괄호


		for (int j = 0; j < arData.length; j++) {
			System.out.print(arData[j] + " ");
		}// for문
	}// 메인함수

} //  클래스
