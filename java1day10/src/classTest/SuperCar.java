package classTest;
// 이름 바꾸기, refactor - rename - update reference 체크 한 채로 바꾸면 됨! 

public class SuperCar {
	// 브랜드, 색상, 가격, 엔진 상태
	String brand;
	String color;
	int price;
//	String engine;(삐----!)
	boolean check;

	
//	기본 생성자 
//  자기 이름 치면 나옴.!	
	public SuperCar(){;}
		
		
//	초기화 생성자
	public SuperCar(String brand, String color, int price, boolean check) {
	super();
	this.brand = brand;
	this.color = color;
	this.price = price;
	this.check = check;		
	}// 
		
	// 초기화를 우리가 해주지 않아도 new가 알아서 해준다.
	// check = false;
		
//	시동 켜기 메소드
	//시동의 상태를 확인하고, 
	//시동이 꺼져잇다면 "시동 켜기" 출력
	//이미 시동이 켜져있다면, "시동이 이미 켜져있습니다" 출력
	void engineStart() {
		if(!check) {
			System.out.println("시동을 켰습니다. 안전 운전하세요.");
			check = true;
		}else {
			System.out.println("시동이 이미 켜져있습니다. 정신차리세요.");
		}
	}
	
	
//	시동 끄기 메소드
	//시동의 상태를 확인하고, 
	//시동이 꺼져잇다면 "시동 끄기" 출력
	//이미 시동이 켜져있다면, "시동이 이미 꺼져있습니다" 출력
	void engineStop() {
		if(!check) {
			System.out.println("시동을 껐습니다. 즐거우셨나요?");
			check = false;
		}else {
			System.out.println("시동이 이미 꺼져있습니다. 집에 들어가세요.");
		}
	}

}//public클래스
