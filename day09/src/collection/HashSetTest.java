package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet<String> animalSet = new HashSet<>();
		
		animalSet.add("강아지");
		animalSet.add("호랑이");
		animalSet.add("여우");
		animalSet.add("용");
		animalSet.add("수달");
		animalSet.add("고양이");
		animalSet.add("독수리");
		System.out.println(animalSet.add("판다"));	
		System.out.println(animalSet.add("수달"));	
		
		// 순서 없이 출력.
		// iterator() 로 변환한 이후에 가지고 오기 때문에 순서가 있는 것 처럼 보일 수 있다.
		System.out.println(animalSet.toString());
		
		Iterator<String> animalIter = animalSet.iterator();
		
//		System.out.println(animalIter.toString()); //재정의는 되어 있지 않다.
		
		
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		System.out.println(animalIter.next());
		System.out.println(animalIter.hasNext()); // 다음에 있으면 t 없으면 f
		
//		무한반복 돌려보기 -while
		
		while(animalIter.hasNext()) {
			System.out.println(animalIter.next() + " ");
		}
		

		
		
		
		
		
		
		
	}
}


// iterator 
// 순서 매기는 방법 - 알필요는 없다.