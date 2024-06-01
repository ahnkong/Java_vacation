package ambiguiltyTest;

public class ClassB implements InterA, InterB {
//다중상속 했을때, 클래스에 빨간줄은 둘중 하나 재정의 하라고 하는 것
	@Override
	public void printData() {
		InterA.super.printData(); 
		// super: 부모에서 쓰고 있는거 호출하는 것
		
	}

	
}
