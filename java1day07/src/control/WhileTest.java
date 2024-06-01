package control;

public class WhileTest {
	public static void main(String[] args) {
		
//		while(true) {
//			System.out.println("오늘 너무 추워여..");
//			
//		} //와일문
		
//		for(; ;) {
//			System.out.println("for문 무한 반복~");
//		}// for문
		
		int count = 0;
	//while문의 탈출-1 (조건식이 false일떄 탈출):// 10이 아닐때 탈출
//		while(count != 10) { 
//			count++;
//			System.out.println(count + ". 안민정은 오늘 바르셀로나를 간다.");
		
	// while문의 탈출-2 : break로 탈출! => 얘를 주로 많이 쓰긴 함.
		while(true) {
			count++;
			System.out.println(count + "안민정정정");
			if(count == 10) {
				break; 
				
			}//if문
		
		}//W
	}//메인
}//클래스
