package objectTest;


class Student{
	int num;
	String name;
	
	//기본 생성자
	public Student() {;}

	
	// 초기화 생성자
	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}// 초 (들여쓰기 ctrl +shift + f)


	// toString
	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + "]";
	}// (toString)
	
	
	//equals재정의(equals+ctrl+space)
	 @Override
	public boolean equals(Object obj) {
		 			//모든 자식은 부모타입, 모든 클래스의 부모는 object => 즉, upcasting이 되어 들어옴.
		 // 주소 비교
		 // 주소가 동일하면 true 리턴
		 if(this == obj) {
			 return true;
		 }
		 
		
		 // 타입 비교
		 if(obj instanceof Student) {	//obj가 학생 포함하고 잇니?
			 	// 번호가 같으면 true
			 Student s2 = (Student)obj;
			 if(this.num == s2.num) { // this.num과 s2.num 2개가 같으면 true
//			 if(this.num == ((Student)obj).num) { // .num이게 더 우선순위가 높아서 최우선 연산자로 (Student)obj)이거 묶어줘야하는 것!
				//(Student)obj 이게 최우선 연산자로 (Student)obj 이걸 다운캐스팅해준거 - 그 후에 이걸 묶어서.num찾는거
				 return true;
				 
			 }//if꺼
			 
		}//if꺼
		 
		 //아무것도 해당 안되면 false리턴
		 	return false;
		 	
	 }//equals꺼
	
}
	 
public class EqualsTest {
	public static void main(String[] args) {
		
//		String data1 = "ABC";
//		String data2 = "ABC";
//		String data3 = new String("ABC");
//		String data4 = new String("ABC");
//
//
//		System.out.println(data1 == data2); 
//		System.out.println(data3 == data4);
//		System.out.println(data1.equals(data2)); // 잘나옴.
//		System.out.println(data3.equals(data4)); 
//		// 잘나오는 이유:string클래스 안에 이퀄스라는 메소드가 재정의 되어 잇기 때문이다.

		
		Student stu1 = new Student(1, "안민정");
		Student stu2 = new Student(1, "차은우");
		
		System.out.println(stu1.equals(stu2)); //출력값, false인데, 이걸 true가 나오게끔 만들어라!
		}//메인함수
	
	}//메인클래스

