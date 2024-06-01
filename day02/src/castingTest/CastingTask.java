package castingTest;

public class CastingTask {
// OTT 넷플릭스
// 애니메이션, 영화, 드라마 클래스 선언
// 사용자가 선택한 영상이 아래와 같다면! ott라는 데에 애니메이션, 영화, 드라마 담아주고!
// 애니메이션이라면 "자막지원" 출력하는 메소드 실행(if)
// 영화라면 "4D 지원" 출력하는 메소드 실행(else if)
// 드라마라면 "굿즈 구매" 출력하는 메소드 실행(else)
	
	 public void check(OTT ott) {// 하나만 upCasting이 돼서 들어온다고 생각하면 됨.
		if(ott instanceof Animation) {		//너가 ott에서 받아온 애니메이션이라면, 아래 코드 실행 
			Animation ani = (Animation)ott; //다운캐스팅
			ani.printSubtitle();			
		}else if(ott instanceof Drama) {
			Drama drama = (Drama)ott;
			drama.buyGoods();
		}else {
			Movie movie = (Movie)ott;
			movie.show4D();
		}
	}
//-------------------메인함수-----------------------------------//	
	public static void main(String[] args) {
		CastingTask ct = new CastingTask();
		
		OTT ott1 = new Animation();
		OTT ott2 = new Drama();
		OTT ott3 = new Movie();
		
		
		ct.check(ott1);
		ct.check(ott2);
		ct.check(ott3
				);
		
	}
}
