package casting;

public class CastingTest3 {
	public static void main(String[] args) {
// 앞에 바로 붙여주는 강제 형변환은 일반과 일반 끼리만 가능하다.
// String 은 일반이 아니라 클래스 타입!
// 클래스 타입은 클래스를 이용해서 형변환 해야한다.
// int의 클래스 타입은 Integer
// "문자열"을 전달했을 때 정수로 바꾸는 기능이 Integer에 만들어져있다. -> 이를 메소드라 부른다.		
		System.out.println(Integer.parseInt("10") + 1);
		
		
// "3.9" + 9의 결과를 12.9로 출력해보기
		System.out.println(Double.parseDouble("3.9") + 9);
		
// 실수, double, float
// 80.8도 더블이지만 더블은 8바이트라 4바이트인 float를 사용하고 싶을때는 F를 붙여서! 알려줘야한다.
		float weight = 80.8F;
		
// 정수, int(4바이트) 더 큰게 long		
		long size = 100L;
	}
}
