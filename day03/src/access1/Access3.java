package access1;

public class Access3 {
	public static void main(String[] args) {

//TEST: private 접근자 확인
		// 다른 클래스 차원에서 접근 X, 메소드에서만!
		Access1 a1 = new Access1();
//		a1.
		
														//r private 접근자에 접근하는 기능을 가진 메소드를 만들고 싶음.(엑세스1에 가서 만들어야 함.)
		// private 접근자를 가진 변수로 접근하기 위해서는 메소드(원하는 기능)를 활용해야한다. access1 에 만들어줌.
		System.out.println(a1.getData4());   // 값가져오기(40)
		a1.setData4(49); 					// 데이터 수정(49) 
		System.out.println(a1.getData4()); // 값 변경 확인(49)
	}
}
