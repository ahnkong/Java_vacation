package classPractice;

import java.util.Random;

public class BongEun {
	//-------------------------------멤버 변수 -----------------------------
	// [교사 밍꾸의 초기창], 개발자가 만들어둔,
	//▶ 멤버 변수
	//rank라는 이름의 배열은, 밍꾸의 진화체 이름을 가지고 있다.
	// 이 진화체 이름은 게임 개발자인 우리가 정해놓은 것.(기획)
	// 그렇기 때문에, 생성자 호출이나 매개변수로 받아오지 않고, 정해놓음.
	
	String[] rank = {"치와와", "1년차 미친 치와와", "3년차 개쎈 치와와", "완전체 지랄맞은 치와와"};
	
	String name; // 아구몬의 이름 정하기 "밍꾸"
	int hp;
	int exp; // 0으로 고정
	int feedCount; // 먹이
	int rankNumber; // 0으로 고정 : 0=아구몬, rank[0,1,2,3] rank인덱스로 진화체 순서를 지정해 둔것
	
	//-----------------------------------------------------------------------
	// ▶ 생성자 호출
	// 이름만 정하면, 자동으로 되게끔 했다.
	// exp, rankNumber를 따로 정해주지 않은 이유는: 생성자가 호출되면 자동으로 초기화 되기 때문이다. 
	// int를 new가 초기화 해주기 때문
	// 27~30부터가 이름을 정하면 캐릭터가 갖게 되는 초기 인터페이스이다.
	public BongEun(String name) {  
		this.name = name; 
		hp = 11;
		feedCount = 10;
	}
	//▶ 자기
	void sleep() {
		System.out.print(rank[rankNumber] + "(이)가 잠자는 중");
		for (int i = 0; i < 3; i++) { //반복횟수 3번, i<3 0부터 0,1,2
			try {Thread.sleep(1000);} catch (InterruptedException e) {;}// 1000이 1초다. 3초동안 잠재우려고!
			System.out.print("..."); // 뚜두두 뜨는 코드다. Thread 그 thread를 머무는 거다. try, catch다 배울거
		}
		System.out.println("\n아이고 잘잤다!\n");
		// 자고 일어나면, hp 증가
		hp += 3; // 자고 일어난 후 체력 3증가
	}
	// ▶ 진화하기
	void doEvolution() {
		if(rankNumber == 3) {
			System.out.println("이미 최종 단계입니다!\n");
			return;
		}
		
		if(exp < 10) { //경험치가 10보다 작으면, 경험치 더 채우고 와, 밑에 코드 실행
			System.out.println("애들의 눈물을 더 모아!");
		} else { // 10이상이면 진화!!!
			System.out.println(rank[rankNumber] + " 진화!!!!");
			for (int i = 0; i < 3; i++) {
				try {Thread.sleep(1000);} catch (InterruptedException e) {;}
				System.out.print("...");
			}
			rankNumber++;
			exp = 0;
			if(hp < 11) {
				hp = 11;
			}
			System.out.println("\n" +rank[rankNumber] + " 등장!!!!\n");			
		}
	}
	// ▶먹기
	void eat() {
		if(feedCount < 1) {
			System.out.println("쌤 오늘 급식 끝났어요... ㅠㅠ\n");
			return;
		}
		feedCount--;
		hp += 2;
	}
	// ▶악의 무리 무찌르기
	void fight() { 
		if(hp < 5) { // hp가 5보다 작으면 못싸우게 함.
			System.out.println("먹기나 잠자기를 통해서 hp를 회복해주세요!\n");
		} else {
			// ★확률 설정하는 부분.!!!
			Random r = new Random(); //  객체 생성 및 초기화
		
			// 10칸 짜리 배열을 만듬, 다 초기값 0이 들어가 있겠죵? new가 자동 초기화
			int[] percent = new int[100];
		
			// 확률을 50프로로 잡을 거야.
			int rating = 55;
			
			System.out.println("참교육을 해볼까?!?!?\n");
			
			for (int i = 0; i < rating; i++) {
				percent[i] = 1;
				//rating = 50 /10 => 5번 반복 도는거,
				//rating = 55%로 하려면, i < 55 하면 되는 거,
			}
			
			// ★확률을 뚫었을 때,
			// 0~9까지 아무거나 가져옴.
			// [] 이게 인덱스 번호를 불러오는 거고, 0~9가져왔을때, 그게 1일 확률
			if(percent[r.nextInt(percent.length)] == 1) { // 사냥 대성공!
				System.out.println("애들이 울고 있어!");
				exp += 10;
				
			} else { // 일반 적인 사냥
				System.out.println("하..애들이 조금 깨달았다....");
				hp -= 5;
				exp += 5;
			}	
			
			
		} // 클래스 중괄호
	}// 패키지 중괄호
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
