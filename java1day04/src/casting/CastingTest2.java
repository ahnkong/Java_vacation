package casting;

public class CastingTest2 {
/*문자열을 이용한 자동 형변환*/
	

		public static void main(String[] args) {
			System.out.println('1' +3);//'1'문자, 앞에서 한거
			
			System.out.println("1" + 3);//"1"문자열 // 연결	//	연결!, 결과 타입은 문자열임.
			System.out.println("1" + 3 + 8); // 더 큰 대입 연산자가 없이 같을때는 왼쪽에서 오른쪽으로 연산이 일어남.
//			 			"1" + 3 = "13" ,   "13" + 8 = 138 요로케 되는 거임!
			System.out.println("1" +( 3 + 8)); // 111
			
			
			System.out.println("1 더하기 3은 " + ( 1 + 3 ));
			
		}// 메인 함수
	
}// 클래스
