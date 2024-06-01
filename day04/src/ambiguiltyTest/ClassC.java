package ambiguiltyTest;

public class ClassC extends ClassA implements InterA {
// 에러가 나지 않는 이유 : 아무것도 재정의 할 필요가 없어서!
// TEST 이유: 뭐가 더 우선선위인가 상속받은 부모 클래스의 ClassA와 다중 상속의 InterA중 어떤 printData가 프린트 될거냐!	
	public static void main(String[] args) {
		
	ClassC c = new ClassC();
	
	c.printData();
	
	
	}//main함수 중괄호
}// 클래스 중괄호



// 모호성을 이렇게 처리한다는 걸 test하기 위함.
// 상속받은 부모 클래스의 ClassA와 다중 상속의 InterA중 부모 클래스의 메소드가 우선적으로 사용된다.