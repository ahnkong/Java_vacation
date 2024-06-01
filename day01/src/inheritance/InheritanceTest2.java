package inheritance;
//<덮어쓰기: 재정의>

//----------------------부모---------------------------	
class Human{
	void eat() {
		System.out.println("신명나게 먹기");
	}
	void sleep() {
		System.out.println("꿀잠자기");
	}
	void walk() {
		System.out.println("직립보행");
	}
	
}	
//--------------------상속-----------------------------	
// class 변수명 extends human{}
// 1)Monkey 만들어야지~ 오? 근데, 
// 2)원숭이도 먹고, 자고, 걸으니까 아하! human거 상속 받으면 되겠댜! 
class Monkey extends Human{
	
	// 성격이 비슷한 친구는 데려와서 선언부만 바꿔주면 된다.
	void rideTree() {
		System.out.println("나무를 탄다.");
	}
	//어노테이션, 이거 walk 내가 재정의 한거니까, 부모 생성자에서 덮어써줘.
	// 부모 생성자의 가져오고 싶은 메소드 입력하면 자동완성 뜸. ex) walk
	@Override
	// 이름과 매개변수 타입이 같으면, 덮어쓰기 ->오버 라이딩
	// 매개변수 갯수랑 타입이 다르면 -> 오버로딩
	void walk() {
		System.out.println("네 발로 걷기");
	}
	
	
	// ▶ 오버로딩
	void walk(int legCounts) {
		if(legCounts == 2) {
			// 생성자 호출 : super(); 즉 walk를 
			super.walk(); //2발로 걸을때는, 직립 보행이니까 위에 부모에 있는거 만들어져잇는거를 그대로 사용하는것!
		}
		else {
			System.out.println("네 발로 걷기");
		}
	}
}

//-------------------------------------------------	
public class InheritanceTest2 {
	public static void main(String[] arg) {
		Monkey m = new Monkey();
	
		m.walk(2);
		
		
	}// 클래스 중괄호
}// 패키지 중괄호
