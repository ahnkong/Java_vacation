package variable;

public class FormatTest {
	public static void main(String[] args) {

// 이름, 나이, 몸무게 저장할 변수 선언 후 본인 걸로 초기회(선언과 동시에 초기화)
		String name = "안민정"; // 문자열 String 여기는, 대문자 S가 맞다. 클래스 이기 때문
		int age = 33;
		double weight = 42;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(weight);
		
		
// printf를 활용해서 해당 변수들을 출력해보자.
		//  서식지정자
		//	정수 : %d
		//	실수 : %f
		//	문자열 : %s	
		
		System.out.printf("저는 오늘 %d시에 밥을 먹으러 갈거에요.", 12);
		System.out.println();
		System.out.printf("제 학점은 %f에요.", 4.5);
		System.out.println();
		System.out.printf("제 이름은 %s 입니다. 잘 부탁 드립니다.", "안민정");
		
		
		
//		강사님꺼
		
		System.out.printf("저는 오늘 %d시에 밥을 먹으러 갈거에요.\n", 12);
		System.out.printf("이름 : %s\n나이 : %d\n몸무게 : %.2f\n", name, age, weight);
//		%.2f는 2번째 짜리까지 표현하고 싶을때,
//		%2d도 가능하다!
//		즉 정수도 실수도 가능한데, 저 소수점 표시를 잘 확인!

	
	}// 메인함수
} //클래스
