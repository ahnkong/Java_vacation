package objectTest;

class Animal{
	
	private String name;
	private String kind;
	private int age;
     // 오 신기 방기 tip
	  //한번에 쓰기 : alt+shift+a 마우스로 커서 크기 조절, 
	
//<기본생성자>
	public Animal() {;}
	
	
// <초기화 생성자>
// alt + shift + s + o => 초기화 생성자
	public Animal(String name, String kind, int age) {
		super();
		this.name = name;
		this.kind = kind;
		this.age = age;
	} 
	
	
//<게터 세터>
//만들어 주기 alt+ shift+ s+ r
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}



//	@Override
//	public String toString() {
//		return "귀요미의 이름은 " + name + "\n귀요미의 종은 " + kind + "\n귀요미들의 나이는 " + age + "살 입니다.";
//			// 만약 멤버 변수들이 수십개일때, 다 작성하는 건 어렵다 -> 자동완성 ㅇㅇ
//	}
	
	@Override // alt + shift + s + s
	public String toString() {
		return "Animal [name=" + name + ", kind=" + kind + ", age=" + age + "]";
	}					// 이거 안에서 수정하고 싶은거 수정하면 됨!
	
	
}


public class ToStringTest {

	public static void main(String[] args) {
		
		Animal lee = new Animal("콩이","방울이", 1);
		System.out.println(lee.getName() + " " + lee.getAge() + "살 " + lee.getKind());
		System.out.println(lee);
	
	}
}
