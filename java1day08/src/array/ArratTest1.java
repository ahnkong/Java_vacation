package array;

public class ArratTest1 {
	public static void main(String[] args) {
		
//		int[] arData = {2, 4, 6, 8, 10};
//		System.out.println(arData); // 시작 주소: 배열이 담겨 있는 주소댜!
//		
//		// 배열의 길이
//		System.out.println(arData.length); // 인덱스 번호랑, data 번호랑 헷갈료~
		
		
/*for문과의 콜라보*/
//		int sum = 0;
//		for (int i = 0; i < arData.length; i++) { // i가 5면 6번쨰임
////			System.out.print(arData[i] + " "); // 값 사이에 띄어쓰기
//			
//			sum += arData[i];
//			
//		}
//		
//		System.out.println("총합 : " + sum);
//		System.out.println("평균 : " + (double)sum/arData.length);
		
//		배열을 하나 선언 하고5, 4, 3, 2, 1 넣고 출력하기
		
		int[] arData2 = new int[5];
		
// 		.34 처럼 저렇게 바로 해도 되지만 연습이니
//		배열의 값을 넣는 for문 1개
		for (int i = 0; i < arData2.length; i++) {
//			변환하는 i를 활용
			arData2[i] = 5-i;
//			System.out.print(arData2[i]);
		}
		
		// 배열이 잘 만들어졌는지 출력을 확인하는 for문 1개
		for (int i = 0; i < arData2.length; i++) {
			System.out.print(arData2[i] + " ");
		}
		
	}// 메인
}// 클래스
