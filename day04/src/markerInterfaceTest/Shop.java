package markerInterfaceTest;

public class Shop {

	public void checkType(Electronics[] electronics) {
		for (int i = 0; i < electronics.length; i++) {
			// electronics 마커가 있는 부분
			if(electronics[i] instanceof LapTopMarker) {
				System.out.println("노트북 입니다.");
			}else if (electronics[i] instanceof MobileMarker) {
				System.out.println("스마트폰 입니다.");
			}else {
				System.out.println("기타 주변 기기 입니다.");
			}//else꺼
		}//for
	}// checkType
	
	public static void main(String[] args) {
		
		Shop s = new Shop();
		
		Electronics[] electronics = { // 객체를 만들자 마자 배열에 담아버린거~ 저는 혼자 못해요ㅠ
				new GalaxyBook3(), // new Shop을 Ele e 여기에 객체로 담을 수 있는거 
				new Galaxy23() 
		};
		
		
		s.checkType(electronics);
	}
	
	
}//C
