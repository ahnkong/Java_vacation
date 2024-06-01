package anonymousTest;

public class Computer {
	public static void main(String[] args) {
		
// 실습 : 내부 클래스_익명 클래스		
		Electronics e = new Electronics() {
		// 익명 클래스는 구현하지 않은 필드를 구현하기 위함니다.
		// 한번만 구현을 하고 가져다 쓰면 되기 때문에 이름이 필요없는 것.
			@Override
			public void on() {
				System.out.println("컴퓨터를 켠다.");
				
			}
			
			@Override
			public void off() {
				System.out.println("컴퓨터를 끈다.");
			}
		};//e1
		
		// 익명 클래스에서 재정의된 내용은 해당 객체에서 한해서 메모리에 존재함.
		Electronics e2 = new Electronics() {
			
			@Override
			public void on() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void off() {
				// TODO Auto-generated method stub
				
			}
		};	// e2	
		
		
		e.on();//출력
		
		
	}// 메인함수
}//public class Computer
