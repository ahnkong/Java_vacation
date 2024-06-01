package abstractTest;

// TEST: 강제성을 부여하기 위한 상속  		r단지 강제성을 부여하기 위함, 이지 얘 자체로 객체를 만들지 않을 거기도 하지만 안됨.
public class Refrigerator extends Electronics {

	// 살짝 올려서 첫번째 나오는 해결방법 클릭: 재정의 해줘라~
	@Override
	public void on() {
		System.out.println("냉장고야 문 열어줘, 음성으로 얘기하기");
	}

	@Override
	public void off() {
		System.out.println("냉장고야 문 닫아줘, 음성으로 얘기하기");

		 
	}// 클래스
}// 패키지
