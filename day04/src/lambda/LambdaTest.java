package lambda;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class LambdaTest {
	public static void main(String[] args) {

//실습: Lambda식

	// 한줄로 나타내고 싶을때	         //r매개변수: 이름은 내 맘대로, 해도 됨.
		LambdaInter lambdaInter1 = (ahn) -> ahn % 10 == 0;
		//ㄴ 람다식 문법임.(한줄로 나타내기)
		
		System.out.println(lambdaInter1.checkMultipleof10(49));
		
	// 한줄로 나타내지 못할 때
		LambdaInter lambdaInter2 = (n) -> {
			System.out.println("10의 배수 검사를 시작할게요.");
			return n % 10 == 0;
		};
//		

//		// 람다식의 다른 모양! 변형1
//		IntPredicate i = new IntPredicate() {
//
//			@Override
//			public boolean test(int value) {
//				return value % 2 == 0;
//			}
//			
//		}; ==>원래는 이렇게 써야하는데, 이게 너무 기니까, 이걸 한줄로 간단히 나타낸게 람다식이고, 많이 쓰임.
		
	// 조금 심화...어렵다..	IntStream
		System.out.println(lambdaInter2.checkMultipleof10(50));
		IntPredicate i = n -> n%2 == 0; // n -> n%2 == 0; (함수형 인터페이스를 매개변수로 받아 오는 형태)
															//ㄴ함수를 구현 = 메소드를 구현하는 거 /이걸 null에 넣으면 편함.
											// 1부터 100까지 했을때 짝수만 가져오고 싶은거, 
											//filter(n -> n%2 == 0) 내가 설정한 값만 남겨두고 다른건 삭제 시키는 것이 filter
		IntStream even = IntStream.rangeClosed(1, 100).filter(n -> n%2 == 0);
		System.out.println(even.count());
		
		
////변형1 출력
//		이거 람다식이댜! 한 줄로 나타내는 것!

		//짝수
//		IntStream even = IntStream.rangeClosed(1, 100).filter(i);
//		System.out.println(even.count());
		
		//홀수					
		IntStream odd = IntStream.rangeClosed(1, 100).filter(n -> n%2 == 1); // true가 뜨는 것만 남겨주는 것
		System.out.println(odd.count());
		
		
		
		IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 1).forEach(System.out::print);
		
	
	}//M

}//C


//rangeClosed 1부터 100
//rangeClos 1부터 99
//람다식 쓰는 이유:


//
