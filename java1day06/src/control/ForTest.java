package control;

public class ForTest {
	public static void main(String[] args) {
// <이름 10번 출력>
		
//		for (int i = 0; i < 10; i++) { 
//			
////			System.out.println("안민정");
//			System.out.println(i + 1 + "안민정");
//		}//포문
		
			//i가 10부터 반복, i가 0일 때 탈출!
//		for (int i = 10; i > 0 ; i--) { // 조건식이 true일때 밑의 코드 실행!
//			System.out.println(i + "아이폰");
//		}// 포문

		
// <1부터~ 10까지의 합 출력>
		int total = 0; // 외부에서 변수 한개 선언, 누적해서 합할 공간이 필요 //0으로 초기화 안하면, 쓰레기 값이 저장
		for (int i = 1; i < 11; i++) {
			total += i;
			System.out.println("현재 i 값 : " + i + "  현재 total : " + total);
		}
		System.out.println(total);
		
	}//메인
}//클래스
