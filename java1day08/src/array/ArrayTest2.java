package array;
// 2차원 배열! 개발하려면 중요한 개념
public class ArrayTest2 {
	public static void main(String[] args) {
		int[][] arData = {{1, 2, 3, 0}, // 여기의 시작 주소 
						{4, 5, 6, 0},
						{7, 8, 9}};
  
		System.out.println(arData[0][0]); // 그안의 첫번 쨰 배열 주소, 타고 타고 들어옴.

		for (int i = 0; i < arData.length; i++) {
			System.out.print("\n" + arData[i] + "\n");
//								ㄴ "\n" 가독성 위해 개행문자 추가
			for (int j = 0; j < arData[i].length; j++) {
				System.out.print(arData[i][j] + " ");
				
				
			}//1차 접근하는 i값에 대한 ㄴ포문
		}//2차로 접근하는 J값에 대한 포문
	}//메인
}//클래스
