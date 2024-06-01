package anonymousTask;

//바나프레소 본사 
//7번째줄 Form form, 
//21번째줄의 form instanceof FormAdapter 이거 확인, 
		// 자식클래스는 부모클래스를 받을 수 있기 때문에 FormAdaper가 Form form에 들어갈 수 있다.)
public class Banapresso { 
	public void register(Form form) {// 양식을 매개변수로 받아와야함.
		// Form 안에 메뉴 주문하는 getMenu받아 올거임.
		String[] menus = form.getMenu();
		
		System.out.println("----메뉴----");
		
		//for
		for (int i = 0; i < menus.length; i++) {
			System.out.println(i + 1 + ". " + menus[i]);
		}//for문

		
		
		//if
		if(form instanceof FormAdapter) {// 매개변수로 넘어온 form이  FormAdapter를 가지고 있다면,
			System.out.println("무료 나눔 행사중");
			return;// 이거라면 밑에 코드 진행 안되고 여기서 끝!
					// 만약 아니라면 밑에 코드 까지 진행되어 form.sell("아메리카노") 실행되지 않음.;	
			
		}//if문
		
		
		form.sell("아메리카노");	
		
		
	}//main
}//C

// ★
// form과 formAdapter로 강제성을 지워주고, 업캐스팅해서 사용 한것
// retrun 값으로 종료 해주고
// for문과 if문으로 할수 있음
// instanceof  		★ //


// 위에 창이 많이 떠있으면, 우클릭하면 close others 눌러- 하나만 남고 다 사라짐!