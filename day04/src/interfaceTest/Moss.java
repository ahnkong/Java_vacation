package interfaceTest;

//TEST => Pet의 인터페이스에서 4가지 기능중 선택해서 사용하고 싶은거,
public class Moss extends PetAdapter {// 강제성을 컨트롤하고 싶다. - 추상메소드를 활용해서  Adapter라는 것을 만들어서 인터페이스의 강제성을 없애버리는 추상클래스를 만든다.

	@Override// 강제성이 부여된 상태임.
	public void waitNow() {
		// TODO Auto-generated method stub
		
	} 
}
