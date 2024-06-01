package forEach;

public class ForEachTask {
	public static void main(String[] args) {
		
		
//		실습
//		두 학생의 점수가 배열에 담겨있다.
//		각 학생의 총점과 평균을 출력하세요.
		
		int[][]scores = {{100, 80, 65}, {40, 77, 30}};
		
//		담아줄 변수를 만들기 (타입 변수명 = 초기화;)
		int num = 0;
		
		
//	========================AHN================================
//		
//		for (int[] is : scores) {
////			System.out.println(is);
////			System.out.println(scores);
//			for (int score : is) {
//				System.out.print(score + ", ");
//				
//				
//			}//포
//		}//이중
//		
				
				
//	=========================TEACHER==================================				
		for (int[] stu : scores) {
			// 
			// 위가 아닌 밑에 여기에 total과 avg를 만든 이유는 이곳에서만 출력하고, 다음부터 쓰지 않을 거라, 여기서만 쓰고 없어지는게 좋다.
			int total = 0; // 중간값 초기화 //1)
			double avg = 0.0; //
			for (int score : stu) {
				total += score;
			}//포
			
			avg = total / (double)stu.length;
			avg = Double.parseDouble(String.format("%.2f", avg)); // String 타입의 포맷의 리턴은 = 문자열이다.
			
			System.out.println(++num + "번 학생의 피땀눈물^^b");
			System.out.println("총점 : " + total + "점");
			System.out.println("평균 : " + avg + "점");
			System.out.println();
		}//이중포		
		
		
 
				
				 
	}//메	
}//클
