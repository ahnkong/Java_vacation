package interfaceTest;
// ctrl+shift+S -> 전체 저장 눌러줘야함!
// ctrl+s -> 걍 저장 
public class Cat implements Pet {

	@Override
	public void sitDown() {
		System.out.println("째려본다.");

	}

	@Override
	public void turn() {
		System.out.println("무시한다.");

	}
 
	@Override
	public void giveYourHand() {
		System.out.println("손에 냥냥펀치를 날린다.");

	}

	@Override
	public void waitNow() {
		System.out.println("무시한다.");

	}

}
