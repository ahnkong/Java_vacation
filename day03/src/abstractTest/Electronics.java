package abstractTest;

public abstract class Electronics {

	// 추상 메소드의 선언!
	public abstract void on();
	public abstract void off();
	
	
	// 일반 메소드의 선언!
	public void printData() {
		System.out.println("일반 메소드도 선언 가능!");
	}
}
