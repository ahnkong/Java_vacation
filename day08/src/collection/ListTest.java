package collection;

import java.util.ArrayList; //컨트롤+쉬프트+O
import java.util.Collections;

//오케 활기차게 고!   
public class ListTest {
	public static void main(String[] args) {
		
//		ArrayList<E> //* 어떤 타입이 들어갈지 몰라서 일단 e라고 적어주는 제네릭을 만들어 준것. //제네릭까지 하나의 타입이다. *
		//객체화시, 뒤에 제네릭 안에 타입은 생략이 가능하다.
		ArrayList<Integer> numbers = new ArrayList<>();
		//클래스 타입의		  	객체임.	
		
		
//		System.out.println(numbers); //=> [] 이건데 뭐가 재정의된게 나온겨?
		System.out.println(numbers.toString()); // 비어있는 리스트임.
		
		// ①리스트의 값 추가
		numbers.add(100); // 리턴값이 boolean 잘 나오면 true, 아니면 false
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		numbers.add(500);
		numbers.add(600);
		numbers.add(700);
		numbers.add(800);
		System.out.println(numbers.toString()); 
		
		
		//②삽입
		//add메소드가 오버로딩 되어있다.
		//(0, nu11) = 인덱스 번호, 값
//		numbers.add(0, null);
		numbers.add(3, 777); // 3번째 배열에 777넣어줘, 그 뒤로 하나씩 밀리게 됨. -- 배열에서 이걸 하려고 하면,, 다시 만들어서 재저장 시켜주고, 해야함. 귀찮
		System.out.println(numbers.toString()); 
		
		
		//③인덱싱
//		System.out.println(numbers[0]); 배열의 인덱싱 방식
		System.out.println(numbers.get(3)); // get(3)인티저타입!-그럼 이제 안에 들어가서 이것저것 함수 사용할 수 잇는거
		
		
		
		//④ 반복문 돌리기
		System.out.println(numbers.size());//=> 9 (길이가 9개라는 것)
		
		
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");// => 100 200 300 777 400 500 600 700 800
		}
		
		
		System.out.println();
		// ⑤ 수정
		//200을 1000으로 수정
		System.out.println(numbers.set(1, 1000) + "을 1000으로 수정했습니다."); // 사용처가 궁금: 몇번 게시글이 삭제 되었습니다. 수정되엇습니다. 요런거
		
			// 실제로 수정되었는가 확인.
		System.out.println(numbers);
		
		
		// ⑥ 삭제
		// 1) 인덱스 번호를 활용한 삭제 : 3번째 칸 삭제해줘
		// 2) 값을 활용한 삭제 : __이거 삭제해줘.
		
		
//		1)
		System.out.println(numbers.remove(5) + "을 삭제 했습니댱");
		System.out.println(numbers);//=>[100, 1000, 300, 777, 400, 600, 700, 800]
		
		
		
//		2)
//		numbers.remove(600);// 600삭제해줘. => 오류... ->이거 지금 강제형변환해줘여ㅑ함. 
		System.out.println(numbers.remove((Integer)600) + "가 나왔습니다. 삭제하겠습니다.");
		System.out.println(numbers.remove((Integer)900) + "가 나왔습니다. 값이 없어 삭제할 수 없습니다..");
		System.out.println(numbers);
		
		
		//Collections 안에 있는 메소드 - Collections얘가 클래스니까 안에 메소드가 있는거 - 레이어처럼 잘 생각
		Collections.sort(numbers); //sort: void타입이라 리턴 값없이 정렬해주고 끝나ㅓㅁ.
		System.out.println(numbers);
		
		Collections.reverse(numbers);
		System.out.println(numbers); //reverse 역순
		
		Collections.shuffle(numbers);
		System.out.println(numbers); //shuffle 섞기
		
	}
}

//이제 에러는 안뜨는데....참... 문법이나 프로그래밍 이해가 부족하네..
