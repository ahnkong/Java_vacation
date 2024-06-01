package access2;

import access1.Access1;

public class Access2 extends Access1 {
//	public static void main(String[] args) {

//TEST1: public 확인!		
//		Access1 a1 = new Access1();
		
// 		찍어보면 접근할 수 있는 멤버 변수나 메소드를 확인할 수 있는데,
//		현재 public으로 접근한 data2만 가능! 이유 : public 접근자는 어디서나 접근 할 수 있는 제어자이기 때문!
//		a1.
		
		
		
////TEST2: Access1을 상속시켜준 이후에 확인,
		//(5번째 줄: public class Access2 extends Access1{)
	
	void test() {			//r super 부모 접근해줘~
		System.out.println(super.data3);
		//부모로는 protected 까지 접근이 가능하다.
	}
	public static void main(String[] args) {
		// Access1을 상속시켜준 이후에 확인!
		// 상속 시켜준 이후, 자식 객체로 부모의 데이터에 접근 가능.
		Access2 a2 = new Access2();
//		a2.
		
	}//C
	
}//P
