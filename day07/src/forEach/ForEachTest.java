package forEach;

public class ForEachTest {
	public static void main(String[] args) {
		
		int[][]numbers = {{50, 70 ,100}, {1, 8, 6}};
		//int 타입의 numbers라는 배열이 있다.
		
//		이중포문을 만드세요
		
		// 안민정 실패
//		// 이중 포문? 내가...만들라면...걍 만들수 있어요?
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers); // 주소만 나오는데요.ㅠ
//		} // 안민정 실패
		
		
		//강사님꺼!
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " |");
			}
		}//(이중포문)
		
		System.out.println();
		
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
//		===========================================================			
		
		//ForEach문 : 향상된 For문
//			1)인덱스를 활용하지 않음.
		for (int[] is : numbers) { 
			System.out.println(is);
			for (int number : is) {
				System.out.print(number + " ");
			}
			System.out.println();
		}
	
		
	}
}
