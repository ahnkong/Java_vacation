package method;

import java.util.Scanner;

public class MethodTest {
	// 메소드의 선언은 클래스 영역 안에서!
//	두 정수를 받아와 두 정소의 곱을 리턴하는 메소드 선언
	int multiple(int num1, int num2){
		int result = num1 * num2; // result; 이렇게 하면, 사라짐.  시점이 다르기 떄문에, 
		return result;
	}
	
	
	// 두 정수의 덧셈의 결과를 출력해주는(여기까지 기능) 메소드 선언
	void add(int num1, int num2) {
		System.out.println("두 정수의 합은 : " + (num1 + num2));
	}// 메소드는 각각 실행되고, 사라지기 때문에 a메소드, b메소드의 매개변수 이름 같아도 됨.! 메소드 리턴값 나오면, 매개 변수 초기화
	
	
	
// 1~ 매개변수로 넘어온 정수까지의 합을 리턴해주는 함수
	int getTotal(int num) { // 외부에서 받아오고, 안에서 입력하도록!
		int total = 0;
		for (int i = 0; i < num; i++) {
			total += i + 1;
		}
		
		return total;
	}
	
// 1 ~ 입력받은 수까지의 덧셈을 리턴해주는 함수 - 1번 모양)
	
	int getSum(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		int total = 0;
		
		for (int i = 0; i < num; i++) {
			total += i + 1;
		}
		
		return total;
	}
	
	
// 1 ~ 입력받은 수까지의 덧셈을 리턴해주는 함수 - 2번 모양)
	
	int getSum2(Scanner sc){
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		int total = 0;
		
		for (int i = 0; i < num; i++) {
			total += i + 1;
		}
		
		return total;
	}
	
	
//  매개변수로 넘어온 이름을 입력한 횟수 만큼 반복 출력해주는 메소드
	static void printName(String name, Scanner sc) {
		System.out.print("몇 번 출력할래요? ");
		int count = sc.nextInt();
     
		for (int i = 0; i < count; i++) {
        System.out.println(i + 1 + " 내 이름은 " + name);
	}
} 	
	
	
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();// 클래스도 하나의 자료형이다. 	
//						new MethodTest()얘를, MethodTest mt 여기에 담아준다.
//						쟤를 안적어주면 메모리에 올라가지 않아, 위에 있는 6~7을 사용할 수도 없다.
//						sc.nextInt(), Integer.parseint() 메모장 참고!
//						new 를 해서 선언해야, 메모리에 올라가고, 이건 개발자가 하는거'
		Scanner sc = new Scanner(System.in);
//		리턴타입이 있는 메소드의 사용은
//		그 부분 전체를 리턴 값으로 봐야한다.
		System.out.println(mt.multiple(5, 3)); //int값 2개 입력, 이 리턴 값은 int이다. 
		
		int result = mt.multiple(4, 9) + 13;
		System.out.println(result);
		System.out.println("--------------------------------");
		mt.add(13, 100);
		
		
		int total = mt.getTotal(10);
		System.out.println(total);
		
		
		int total2 = mt.getSum();
		System.out.println(total2);
		
		
		int total3 = mt.getSum2(sc);
		System.out.println(total3);
		
//		Integer.parseInt(null);
//      static
//      컴파일러가 가장 먼저 메모리에 할당해준다.
//      일반 메소드를 static 메소드로 사용하는 방법
		
//      1. static을 붙여서 static 메소드임을 자바에 알려준다.
//      2. 사용할 때는 일반메소드의 소속만 알려주면 된다.

		// printName이 선언되어있는 곳이 MethodTest안이기 떄문에 소속을 알려줄 필요는 없다.
//		printName("류호근", sc);
		
		MethodTest.printName("안민정",sc);
	}// 메인
}// 클래스
