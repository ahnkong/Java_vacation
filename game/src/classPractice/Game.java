package classPractice;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		// 생성자 호출하면서 case1이 시작됨.
		BongEun digimon = new BongEun("밍꾸");
		// 입력 받기
		Scanner sc = new Scanner(System.in);
		
		
		// 사용할 변수 넣어주기!
		String startMsg = "★☆★☆★☆★☆학교를 구해줘!★☆★☆★☆★☆";
		String msg = " 1. 상태 확인 창\n 2. 참교육 하기\n 3. 밍꾸! 진화해!\n 4. 꿀잠자기\n 5. 급식 먹기\n 6. 칼퇴근";
		int choice = 0, exitChoice = 0;
		//flag활용
		boolean flag = false;
		
		System.out.println(startMsg);
		
		
		while(choice != 6) {
			flag = false;
			System.out.println(msg);
			// 번호를 선택해서 누르라는 코드
			choice = sc.nextInt(); 
			
			
			// choice하라고 하고, 밑에 선택된 번호에 맞춰 코드들이 진행되게 짠거.
			switch(choice) {
			case 1:
				System.out.println("이름 : " + digimon.name);
				System.out.println("진화 상태 : " + digimon.rank[digimon.rankNumber]);
				System.out.println("hp : " + digimon.hp);
				System.out.println("exp : " + digimon.exp);
				System.out.println("남은 급식 수 : " + digimon.feedCount + "\n");
				break;
				
			case 2:
				digimon.fight();//싸움
				break;
				
			case 3:
				digimon.doEvolution();//진화
				break;
				
			case 4:
				digimon.sleep();//자
				break;
				
			case 5:
				digimon.eat();//먹어
				break;
				
			case 6: // 여기 플래그 있댜! 
				while(!flag) {
					System.out.println("저것들..저렇게 둘거야.....?");
					System.out.println("1. 아니지! 참교육을 시전 하겠어!\n2. 미안해... 난 번아웃이야...사직서를 내겠어");
					// 종료하는 번호를 골라죠!
					exitChoice = sc.nextInt(); //1번 아니면, 2번을 누를텐데)
										
					switch(exitChoice) {
					case 1:
						System.out.println("그럴 줄 알았어!! 참교육을 해보자!");
						choice = 0;
						exitChoice = 0;
						flag = true;
						break;
						
					case 2:
						System.out.println("난 글렀어...");
						flag = true;
						break;
						
					// 내가 1,2가 아닌 번호를 안누르면, 다시 입력해주세요! 라고 뜨게! 만들어 줬던거
					default:
						System.out.println("다시 입력해주세요!");
						break;
					}
				}
				
				break;
				
			default:
				System.out.println("다시 입력해주세요!\n");
				break;
			}
			
			
		}
		
		
		
		
		
	}
}
