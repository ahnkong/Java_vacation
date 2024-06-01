package objectTest;

public class HashCodeTest {
	public static void main(String[] args) {
		
	String data1 = "ABC";
	String data2 = "ABC";
	String data3 = new String("ABC");
	String data4 = new String("ABC");
	
	
	System.out.println(data1 == data2); // true, constant pool에 담기는 것(일반자료형 처럼 쓰라고,) 다들 콘스탄트풀에 담가버리는 거여서 같은것으로,!
	System.out.println(data3 == data4); // false, new를 만나면 주소가 아예 달라져 버리는 것
	
	
//  new를 썼기에 필드(주소)가 다르기에 hashCode도 달라야하지만
//	String 클래스에서 재정의를 해서 필드 안에 값의 hashCode를 가져오게 된다.
	System.out.println(data1.hashCode()); //data1,2는 주소가 같으니가 hashcode도 같겠거니 생각하는데,
	System.out.println(data2.hashCode());
	System.out.println(data3.hashCode()); //data3,4는 주소가 달르니까 hashcode도 다를줄 알았는데, 해시코드는 다 같넹!
	System.out.println(data4.hashCode()); // 이유: String class에서 재정의가 되어버리기 떄문이다.
	
	}
}
