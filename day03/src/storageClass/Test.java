package storageClass;

public class Test {
	public static void main(String[] args) {
		
		VariableTest mom = new VariableTest();
		VariableTest son = new VariableTest();
		
//Test1	// 하나의 통장을 쓰면서, 쓰는 만큼 줄어들게 하고 싶었던것 
//		System.out.println(mom.money);
//		mom.increaseMoney();
//		
//		System.out.println(son.money);
		// 근데 지금 이거는 mom객체에 10000이 따로, son객체에 10000이 따로 저장되어 있는 것이다.

//Test2
		//스태틱 메소드와 마찬가지로 컴파일러가 가장 먼저 할당해준다.
		// 객체 생성 유무와 상관 없다.
//		System.out.println(VariableTest.money_s);
		
		// 모든 객체가 static 변수 하나의 자원에 접근한다.
//		System.out.println(mom.money_s);
//		mom.increaseMoney_s();
//		System.out.println(son.money_s);
		

//Test3: static 변수의 생성주기를 확인
//		mom.increaseMoney(); //9000
//		mom.increaseMoney(); //8000
//		mom.increaseMoney(); //7000
//		mom = new VariableTest(); //9000 => 초기화! 즉, 새로운 주소가 할당되기 때문에, 객체가 원래 가지고 있던 주소가 사라지고 새로 덮어지는걸 생명주기라고 생각하면 됨. 
//		mom.increaseMoney(); //8000
//		mom.increaseMoney(); //7000
//		mom.increaseMoney(); //6000
//		mom.increaseMoney(); //5000
//		mom.increaseMoney(); //4000
//		mom.increaseMoney(); //3000		
		
		
// Test4:static의 생성주기 는 new! 이걸 확인!
		mom.increaseMoney_s(); //9000
		mom.increaseMoney_s(); //8000
		mom.increaseMoney_s(); //7000
		mom.increaseMoney_s(); //6000
		mom.increaseMoney_s(); //5000
		mom = new VariableTest(); // 컴파일러가 그냥 RAM 맨위에 쌓아둔 것. 그래서 아무상관이 없는 것 //4000
		mom.increaseMoney_s(); //3000
		mom.increaseMoney_s(); //2000
		mom.increaseMoney_s(); //1000
		mom.increaseMoney_s(); //0 

		
//Test5: static의 값 수정 가능, 저렇게 해도 접근할 수 있는 이유는,!
		mom.money_s = 20000; //=> ★의미 mom이라는 객체 안에 있는 money_s 여기안에 있는 주소로 가서 20000으로 바꿔라!
		System.out.println(mom.money_s); //20000 을 출력
		

		
	}//C
}//P
