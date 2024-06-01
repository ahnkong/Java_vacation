package anonymousTask;

public class Building {//바나프레소 지점(TEST)
	public static void main(String[] args) {

//		역삼점 오픈
//		본사에서 요구하는 방식 그대로 구현		
		
		Banapresso ys = new Banapresso();// 기본생성자 호출
		
		// 본사에 양식 제출
		ys.register(new Form() {

			@Override
			public void sell(String order) {
				String[] menus  = getMenu();
				for (int i = 0; i < menus.length; i++) {
					if(order.equals(menus[i])) {//문자열 비교는  equals 메소드를 사용해서 한다.
						System.out.println("판매 완료");// 있으면! 판매 완료해줘!
						
						return;//void인데 return을 쓰는 것? - 함수의 종료를 의미한것
						// 즉 같은 메뉴를 찾으면, 판매완료가 뜨니까, 함수 종료함. 을 의미하는 것!
						
					}//if
				}//for
				System.out.println("메뉴가 없습니다."); // if문 안에서 메뉴를 만나지 못햇다. 그럼 이거 출력해줘...
			}//void
			
			@Override
			public String[] getMenu() {
				String[] menus = {"아메리카노", "스무디", "빙수"};
				return menus;
			}//재정의

		});//Form f	
		
// 강사님은 판매완료인데,
// 질문 나는 왜 메뉴가 없습니다가 뜨나용?
// 앞에 짱맛있는 카페인 폭탄 아메리카노 주문해서...ㅋ  

//---------------------------------------------------------------------------------
		// 잠실점
		// 잠실점은 무료 나눔 행사중이라서 판매 방식을 구현할 필요가 없다.(어댑터 만들어서 강제성을 삭제해주고)
		// 본사에서는 전달받는 양식을 검사할 때
		// 무료나눔 행사 중인 매장이라면, " 무료 나눔 행사중 " 출력하기
		Banapresso js = new Banapresso();
		
		//업캐스팅: FormAdapter가 form을 받아온 이후 강제성을 없앤 거니까 form의 자식이다. 업캐스팅하면서 들어갈 수 잇는거!
		js.register(new FormAdapter() {
		// 걍 Form이 아닌 new FormAdapter 이거를 전달하는게 중요햇다.)
			
			@Override
			public String[] getMenu() {	//getMenu의 재정의 필요!
				String[] menus = {"아메리카노", "스무디", "빙수"};	
				return menus;
			}
				
			});
		
	}//메인
}//클래스

