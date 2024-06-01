package interfaceTest;
			//r재정의 안된 거 해줘라~ => 올려서 첫번째거 클릭
public class Dog implements Pet {

	@Override
	public void sitDown() {
		System.out.println("앉는다.");
		
	}

	@Override
	public void turn() {
		System.out.println("돈다.");
		
	}

	@Override
	public void giveYourHand() {
		System.out.println("손 준다.");
		
	}

	@Override
	public void waitNow() {
		System.out.println("기다린다.");
		
	}
	
}
