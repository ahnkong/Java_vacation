package game2MinJung;

public class Futsal {
//	기획중: 나는 프로 풋살러 만들기 게임을 기획
//	선언
	String[] rank = {"풋린이", "아마추어 풋살러", "조금 눈을 뜬 풋살러", "프로 풋살러"};
	
	String name;
	int physical;
	int offense;
	int defense;
	int rankNumber;
	
	
//	 생성자 호출
	public Futsal(String name) {
		this.name = name;
		physical = 10;
		offense = 10;
		defense = 10;
		
	}
	
}
