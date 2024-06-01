package collection;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
					
		HashMap<String, Integer> map = new HashMap<>();
//		HashMap<key값, value 자료형> map = new HashMap<>();
		
//		제네릭이 두개가 열리고, 앞에거는 Key값의 자료형, 뒤는 Value값의 자료형을 맞춰줄수 잇게 됨.
//		앞에서 적은 제네릭은 뒤에서는 생략이 가능.
		
		
		// put : 값을 넣는 메소드
		// get : 값을 가져오는 메소드
		// 값을 넣어줄 때 해당 키 값이 존재하지 않는다면 null을 리턴
		// 키 값이 존재한다면 수정되기 전 value를 리턴 => 1
		
		
		// put의 사용
		System.out.println(map.put("A", 1));
		System.out.println(map.put("A", 2)); 
//		map.put("B", 2);
//		map.put("C", 2);
//		map.put("D", 2);
//		map.put("E", 2);
//		map.put("F", 2);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("E", 5);
		map.put("F", 6);
		
		System.out.println(map); //-> {A=2, B=2, C=3, D=4, E=5, F=6}
		System.out.println(map.get("D")); //=>4 
		System.out.println(map.size()); //->6
		System.out.println(map.keySet()); //->[A, B, C, D, E, F] set이라는 자료형태만 가지고 나옴. 중복이 없으니 keyset이라는 가벼운 친구로 가지고 나옴.
		System.out.println(map.values()); //->[2, 2, 3, 4, 5, 6] collection타입으로 가지고 나옴. 중복이 있을 수 있으니 set타입으로 못갖고 나옴.

		map.values().stream().forEach(System.out::println);
		
		
		HashMap<String, String> map2 = new HashMap<>();
		
		map2.put("age1", "22");
		map2.put("age2", "33");
		map2.put("age3", "45");
		map2.put("age4", "54");
		map2.put("age5", "66");
		map2.put("age6", "75");
		
		// 하나하나 요소에 메소드를 적용시켜 준다.
		map2.values().stream().map(i -> Integer.parseInt(i)).forEach(System.out::println);
		Object[] ar = map2.values().stream().map(i -> Integer.parseInt(i)).filter(i -> i%2 == 0).toArray();
		
		for (Object object : ar) {
			System.out.println(object + " ");
		}
		
		
		
	}
}
