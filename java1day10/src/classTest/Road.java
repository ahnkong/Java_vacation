package classTest;


class Vehicle{
//	<선언부>
	String brand;
	String color;
	int price;
	
	
	
	
//	<초기화 생성자>
//	지금은 연습이니까 상관 없는데, 나중에 짱 많을때는 힘들어짐..!
//	단축키 : alt + shift + s + o (체크하고 enter)
	public Vehicle(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public Vehicle(String color) {
		super();
		this.brand = "부릉자동차";
		this.color = color;
		price = 100000; // this는 생략이 되어도 상관없음.
	}
	
	void engineStart() {
		System.out.println(brand + " 시동 켜기");
	}
	
	void engineStop() {
		System.out.println("시동 끄기");
	}
	
	

}// 클래스



public class Road {
	public static void main(String[] args) {
		
		
		Vehicle v1 = new Vehicle("기아", "Black", 5000);
		Vehicle v2 = new Vehicle("White");
		
		v1.engineStart();
		v2.engineStart();
		
		
		
		
		
		
		
	}//메인함수
}// 메인 클래스
