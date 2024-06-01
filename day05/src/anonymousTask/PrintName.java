package anonymousTask;

//람다식 실습!

@FunctionalInterface
public interface PrintName {
	
// 성과 이름을 전달 받은 후 String 으로 리턴하는 추상 메소드 선언
	public String getFullName(String lastName, String firstName);
	// 매개변수 2개 , 리턴타입은String!
	
	
}
