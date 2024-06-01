package access1;

//practice 1
public class Access1 {
	int data1 = 10;
	public int data2 = 20;// 모든 곳에서 접근 가능
	protected int data3 = 30; // 다른 패키지에서 접근 불가
	private int data4 = 40; // 다른 클래스에서 접근 불가


// public을 이용해서 누구든지 접근할 수 있게 해주고(엑세스3에서 private 접근자에게 접근할 수 있도록 하는거 test)
	public int getData4() {
		return data4;
		//data4를 리턴해내는 게 아니라 data4에 저장되어 있는 주소의 값을 리턴함.
	}
	
	// getter 와 setter ! 
	//게터(값을 가지는 거)세터(값을 넣는거) alt + shift + s + r  
	
	public void setData4(int data4) {// 해당 객체로 접근해서 data4라는 원하는 값을 매개변수로 넘겨오고, this를 통해 해당 객체로 접근해서 값을 바꿔버리는 거
		this.data4 = data4;
	
	// 화살표 밑으로 내리면서 스페이스바 누르면 체크, 해제 할 수 있듬!
	
		
		
	}// C
}//P
