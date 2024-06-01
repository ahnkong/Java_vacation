package interfaceTest;

public interface Pet {
// ★ 1) 상수와 2) 추상 메소드만 존재할 수 있다.
// 추상메소드가 재정의가 되어야 메모리에 올라감.
// main함수 안때려도 됨! 아이콘 옆에 i라고 써있는것 = 인터페이스라는 뜻!
	
	int eyes = 2; 
	//? 상수만 선언해야 한다고 했었고, => final도 생략, 어차피 상수만 선언해야한다는 성질때문에 final을 생략한 것) 
	// 쟤는 왜 누워있지? => static이 생략( 재정의가 되지 않더라도 사용하고 싶어서 static을 붙여서 메모리에 할당시키는 것)
	//				 => 우리가 상수를 사용하기 위해서는 static을 붙여주는 방법 밖에 없다.
	
// ①final static 생략
	int mouth = 1;
	// 추상메소드만! 가질 수 잇는 interface의 특성상 추상메소드와 일반메소드를 구분하지 않아도 된다.
	public abstract void sitDown();
	// abstract 도 안써도 오류 안나는 이유는 => 어차피 추상메소드밖에 못쓰니까 생략된 것.
	public void turn();
	public void giveYourHand();
	public void waitNow();
	
}
