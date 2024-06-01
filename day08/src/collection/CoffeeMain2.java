package collection;

public class CoffeeMain2 {
	public static void main(String[] args) {
		CoffeeService cf = new CoffeeService();
		Coffee c1 = new Coffee("아메리카노", "커피", 3000, false);
		Coffee c2 = new Coffee("아이스티", "논커피", 4000, true);
		Coffee c3 = new Coffee("밀크세이크", "스무디", 5500, true);
		Coffee c4 = new Coffee("까페라떼", "커피", 5500, true);
		Coffee c5 = new Coffee("돌체라떼", "커피", 5500, true);
		Coffee c6 = new Coffee("캐모마일티", "티", 5500, true);
		Coffee c7 = new Coffee("요거트스무디", "스무디", 5500, true);
		Coffee c8 = new Coffee("말차라떼", "커피", 5500, true);
		Coffee c9 = new Coffee("카라멜마끼아또", "커피", 5500, true);
		
		cf.add(c1); 									//add를 통해 arrayList에 추가
		cf.add(c2);
		cf.add(c3);
		cf.add(c4);
		cf.add(c5);
		cf.add(c6);
		cf.add(c7);
		cf.add(c8);
		cf.add(c9);
		
		System.out.println(CoffeeService.coffees);
	
//		System.out.println(cf.searchKind("논커피"));
		
		cf.increasePrice(500);
		System.out.println(CoffeeService.coffees);
	}
}
