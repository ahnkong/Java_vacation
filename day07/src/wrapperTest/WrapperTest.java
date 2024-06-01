package wrapperTest;

public class WrapperTest {
	public static void main(String[] args) {
		
		int number = 10;
		
//		boxing
		
		//deprecated 이제 더 이상 이렇게 쓰지 말자!
//		Integer number_W = new Integer(number);
		Integer number_W = Integer.valueOf(number);
		System.out.println(number_W);
		
		
		
//		unboxing
		number = number_W.intValue(); // 다시 선언해줄 필요 없음. number_W.intValue();얘를 number에 재저장 => 똑같이 10저장
		System.out.println(number);
		
		
//		autoBoxing
		Integer number_A = 49;
		System.out.println(number_A);
		
		
//		auto unboxing
		number = number_A;
		
	}
}

//Integer number_W = new Integer(number);
////		 @Deprecated(since="9", forRemoval = true)
////		    public Integer(int value) {
////		        this.value = value; 생성자 요러케 만드는거라구?