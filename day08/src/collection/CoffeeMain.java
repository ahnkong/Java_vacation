package collection;

public class CoffeeMain {
	public static void main(String[] args) {
		
		
		// 커피 기능만 간단히 테스트
		
		CoffeeService cf = new CoffeeService();
		Coffee c1 = new Coffee("아메리카노", "커피", 3000, false);
		Coffee c2 = new Coffee("아이스티", "논커피", 4000, true);
		Coffee c3 = new Coffee("밀크세이크", "스무디", 5500, true);
		
		
		
		cf.add(c1); 									//add를 통해 arrayList에 추가
		cf.add(c2);
		cf.add(c3);
		
		
		
		System.out.println(cf.coffees); 				// 클래스 타입의 친구가 들어가니까 걔의 toString 나옴. 결국 개 편한다는 소리
		System.out.println(CoffeeService.coffees);		// System.out.println(cf.coffees); 이거랑 같은거
		
		
		
		//삭제
		cf.remove("아이스티");
		System.out.println(CoffeeService.coffees);
		
		
		int price1 = cf.sell("아메리카노");
		int price2 = cf.sell("밀크세이크");
		int price3 = cf.sell("오레오빙수");
		
		System.out.println(price1 + "원 결제 대기 중");
		System.out.println(price2 + "원 결제 대기 중");
		
//		if(price3 == 0) {
//			System.out.println("해당 메뉴가 없습니다. \n다음 번에 추가할 수 있도록 노력하겠습니다.");
//		}
		
		if(price3 != 0) {
			System.out.println(price3 + "원 결제 대기 중");
		}
		else{
			System.out.println("해당 메뉴가 없습니다. \n다음 번에 추가할 수 있도록 노력하겠습니다.");
		}
		
	}
}
