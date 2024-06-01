package collectionTask;
// 보라색 메서드
// 하늘색 지역변수
public class User {
//	아이디, 비밀번호, 이름, 나이
	private String id;
	private String pw;
	private String name;
	private int age;
	
//	기본생성자
	
//	초기화생성자
	public User(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	
//	getter setter
	public String getId() {
		return id;
	}


	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}
	
//	toString재정의
	
		
	}
