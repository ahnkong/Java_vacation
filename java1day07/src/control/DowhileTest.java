package control;
// dowhile문은 잘 안쓰긴 함.
import java.util.Scanner; // 이거 안하면 Scanner sc = new Scanner(System.in);요거거 빨강색 뜸.
							// dot은 안에 라는 뜻. 그래서 저건 시스템 안에 입력을 받겠다라눈 의미!

public class DowhileTest {
	 public static void main(String[] args) {
	      
	      String msg = "1. 통신요금 조회\n2. 번호 이동\n3. 분실 신고\n0. 상담원 연결";
	      Scanner sc = new Scanner(System.in);
	      int choice = 0;
	      
//	      while(choice != 0) { // 영이 아
//	         System.out.println(msg);
//	         choice = sc.nextInt();
//	      }
	      
	      do {
	         System.out.println(msg);
	         choice = sc.nextInt();
	      }while(choice != 0);
	      
	   }
	}

 