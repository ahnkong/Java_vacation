package inheritance;
// tip (ctrl + i) 자동 들여쓰기

class Car{
//♠멤버변수 : 브랜드, 색상, 가격
	String brand;
	String color;
	int price;
	
	
	
//♠기본 생성자 
	public Car() {;}
	// (Tip 자동완성은 아니지만, class이름 쓰고 ctrl + space 하면 나오는게 기본생성자)
	
	
//♠초기화 생성자
	public Car(String brand, String color, int price) {
		//(tip 매개변수 불러오기 alt +shift + s 밑에서 3번째거, 다 체크하면 됨.
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
}
	
	
// ♠메소드
//♠ "열쇠로 시동 킴" 을 출력하는 메소드
//  r 리턴값이 없음.	
	void engineStart() { // void 리턴 타입이 없음! -> 이게 뭘 의미 하는거지?
		System.out.println("열쇠로 시동 킴");
	}

	
	void engineStop() {
		System.out.println("열쇠로 시동 끔");
	}
// ♠"열쇠로 시동 끔" 을 출력하는 메소드
	
}


// 여기부터 자식 클래스이댜~~~~~~~~~~~~~
//==================자식생성자: 자식에만 있는 거 ! 매개변수 모드!==========================
class SuperCar extends Car{
// ♠모드	
	String mode;
	
// ♠기본 생성자
	public SuperCar() { // 부모 생성자를 적어주지 않으면 알아서 적어준다고 했는데 알아서 적어주는 것도 [부모 생성자의 기본 생성자]에 한함.
// 초기화 생성자를 만들어 주면, 기본 생성자는 더이상 생략 되지 않음.
//		super("기아", "white", 5000);
	}
	//super(); //  부모 생성자를 호출하기 위해서 근데 위에 부모 생성자가 없기에 삭제 해도됨. 
	
	
// ♠초기화 생성자( 1번 2번 둘 다 상관없음. 다 초기화 생성자임) ** 필드 =  brand, color, price, mode 4개
	// 4개의 필드에 값을 채워 넣을때, 부모 생성자의 필드값을 호출해서 쓸지 - 1번) /  자식 생성자에서 새롭게 정의한 필드값을 만들어 쓸지 - 2번)
		// 1) 모양 - 1  : 매개변수 부모에서 받아오는 브랜드, 색깔, 가격 + 자식생성자에서 만든 모드 = 이렇게 4개를 다 매개변수로 받아와서 초기화해서 쓸래
	public SuperCar(String brand, String color, int price, String mode) { 
	super(brand, color, price); // 이렇게 하는 방법 1개
	this.mode = mode;
	
	}
		// 2) 모양 - 2: 부모 말고, 전부다 자식 클래스에서 가져온 느낌으로 쓸지!
//	public SuperCar(String brand, String color, int price,, String mode) { 부
//		super();
//		this.brand = brand;
//		this.color = color;
//		this.price = price;
//		this.mode = mode;
//	}

	
//==========================재정의=============================================
//	  상속 받아서, 재정의
// ♠음성으로 시동 킴(재정의)
	//tip ctrl + spacebar
		@Override
		void engineStart() {
// 			super.engineStart(); - 이렇게 쓰는 경우는 잘 없기는 함. 근데 이렇게도 된다는 것만 알아둬.			
			System.out.println("음성으로 시동 킴");
		}
		
// ♠음성으로 시동 끔(오버라이딩)
		@Override                                          
		void engineStop() {
			System.out.println("음성으로 시동 끔");
		}

//		오픈카에만 있는 기능
// ♠지붕 열기(+알파)
		void openRoof() {
			System.out.println("뚜껑 열기");
		}
// ♠지붕 닫기	
		void closeRoof() {
			System.out.println("뚜껑 닫기");
		}
}

//--------------------------------------------------------------
public class InheritanceTask {
	public static void main(String[] args) {
		
		SuperCar lambo = new SuperCar();// 새로 메모리에 올려주는 문법임.
//(객체).(멤버변수) = "  " 이렇게 접근하는건 많이 사용하지 않아서, 나중엔 쓰지않음.
		lambo.brand = "람보르기니";
		lambo.color = "green";
		
		// + brand = "   "  하면, 저장공간으로 되면서, 값도 수정할 수 있게 됨.
		System.out.println(lambo.brand);
		System.out.println(lambo.color);
		
		
		SuperCar ferrari = new SuperCar("테슬라", "빨간색", 5000, "스포츠");
		System.out.println(ferrari.mode);
		
	}//클래스 중괄호
}//패키지 중괄호
