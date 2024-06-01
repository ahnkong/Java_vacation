package storageClass;

public class VariableTest {
	// 멤버 변수!
	int money = 10000; // 멤버 변수이자 필드
	
	
	static int money_s = 10000;
	
	
//========================================	
// 필드를 빼서 쓰려고 하는 것
//Test1 : 일반 변수 테스트	
	// ex) 하나의 통장에서 엄마, 나, 누나가 같이 나눠 쓰는 체크카드라고 생각하고 계산 값들을 이걸 구현하려 고 하는 것
	// 엄마, 나, 누나가 각각의 객체임. 
	//만원이라는 공통되는 하나의 자원에 접근하는 것이라고 이해! -> static변수(공통되는 하나의 자원)
	void increaseMoney() { 
		this.money -= 1000;// money -= 1000; 같은거!
		// this는 보통 생략되어 있음. this.money -= 1000; 이나 money -= 1000; 이나 같은 것! 
		System.out.println(money);
	}
	
//========================================
//Test2	: static 변수 테스트
	void increaseMoney_s() { 
		money_s -= 1000;
		System.out.println(money_s);
	
		
	}//클래스 중괄호
}//패키지 중괄호



//========================================
// 1) static을 쓰기 전에는 공통된 자원에 접근한다기 보다는 각각의 객체에 각각 접근하는 것이기 때문에 기획대로 구현이 되지 않음.
// 2) static을 꼭 써야 함.


/* 나의 궁금증 
 * 1. this.객체 의 의미
 */
 