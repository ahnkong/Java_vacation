package collection;

import java.util.ArrayList; // 컨트롤+ 시프트 +ㅐ
import java.util.List;

public class CoffeeService { // 웬만한건 앞에서 메인에서 다 하고, 추가하는 기능만 적기

//	coffee 메뉴들을 저장할 DB를 선언하기
	public static List<Coffee> coffees = new ArrayList<>();
				//질문 : ArrayList의 의존도를 낮춘다. 나중에List를 다른애한테 넣어줄때, 더 효율적이게 됨.(인터페이스시)
	
	
//	coffee 메뉴 추가(이름, 종류, 가격, 세일)
	public void add(Coffee coffee) { // 아무것도 받아오지 못했지만, 받아왔다 생각하고 아래의 기능들을 짜게 됨.
		coffees.add(coffee);
	}

//  coffee 메뉴 삭제
//	메뉴의 이름을 받아와서 삭제.
	public void remove(String name) { 
		
		
		
	//일반 for문!
//		for (int i = 0; i < coffees.size(); i++) {
//			if(coffees.get(i).getName().equals(name)) {
//				coffees.remove(coffees.get(i));
//				return;
//			}//이프문거
//		}//포문거
//			
//	}//퍼블릭거
		
		
	//forEach문 (위의 for문과 완전히 똑같은 기능을 하는 코드다) - for 문을 줄여둔거.!
		for (Coffee coffee : coffees) {
			if(coffee.getName().equals(name)) {
				coffees.remove(coffee);
				return;
			}//if
			
		}//for
			
	}
	
	
	// 메뉴 판매
	// 1. 이름을 받아와서, 가격을 리턴하는 메소드
	// 2. 만약 sale이 true가 라면 10% 차감한 금액을 리턴
	public int sell(String name) {
		int price = 0; //나 지역변수
		for (Coffee coffee : coffees) {
			if(coffee.getName().equals(name)) {
				if(coffee.getSale()) {
					price = (int)(coffee.getPrice()* 0.9);
				}//이프거
				else {
					price = coffee.getPrice();
				}//엘스꺼
			
			}//이프거
		}//포이치거	
		return price;
	}//int sell거
	
	
	
	// 메뉴 카테고리 검색
	public ArrayList<Coffee> searchKind(String kind) { //검색한 결과 어레이리스트에 담아주기
		
		ArrayList<Coffee> result = new ArrayList<>();
		
		for (Coffee coffee : result) {
			if(coffee.getKind().equals(kind)) {
				result.add(coffee);
			}
		}// 마지막까지 돌면서 kind검사 해줘야하기 때문에 break필요 없.
		
		
		return result;
		
	}
	
	
	// 물가상승률 고려하여, 전 메뉴 가격 인상!
	// 매개변수로 넘어온 가격 만큼 인상
	public void increasePrice(int upPrice) {
		int temp = 0;
		for (Coffee coffee : coffees) {
			temp = coffee.getPrice() + upPrice;
			coffee.setPrice(temp);
		}
	}
	
	
	

}//클래쓰!