package control;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		
//////////////////////////////////////////////////////////////	
 /* 왕초보 단계 */
    // 1~100까지 출력
//		for (int i = 1; i <= 100; i++) {
//			System.out.println(i);
//		}
    // 100~1까지 출력
		
		// i를 변화시켜서
//		for (int i = 0; i < 100; i++) {
//			System.out.println(100-i); // 
//		}
    
		// 초기식과 조건식을 바꿔서
//		for (int i = 100; i > 0; i--) { 
//			System.out.println(i);
//		}
		
		
    // 1~100까지 중 짝수만 출력
											//형태1)
//	  for (int i = 1; i <= 100; i++) {
//	     if(i%2 == 0) { // i를 2로 나눈 값이 0일때 
//	     } // if문
//	        System.out.println(i);
//	  }// for문
//	  
//	  										//형태2)
//	  for (int i = 2; i <= 100; i=i+2) {
//	        System.out.println(i);
//	  }// for문
	  
//	  										//형태3)
//	  for (int i = 1; i <= 50; i++) {
//	     System.out.println(i*2);
//	  }	// for문 
//	  
 /////////////////////////////////////////////////////////////////////  
 /* 중급자 코스 */
    // 정수를 하나 입력 받고(->스캐너 사용) 그 숫자만큼의 누적합을 구하기
    // 1~n까지 합 출력
//    Scanner sc = new Scanner(System.in);
//    String msg = "어디까지의 합을 구하고 싶나요? ";
//    int end = 0, total = 0; //end 입력받을 변수, total 합을 저장할 변수
//    
//    System.out.println(msg);
//    end = sc.nextInt();
//    
//    for (int i = 1; i <= end; i++) {
//		total += i; // 변화 하는 i를 넣어주면 되는데, i는 0부터 니까! i+1해주면 됨.!
//		System.out.println("현재 i 값 : " + i + "  현재 total : " + total);
//	}
//	System.out.println(total);
    
    
    // A ~ F 까지 출력
//    for (int i = 0; i < 6; i++) { // 6번 반복
//    	System.out.print((char)(i+65) + " ");
//	}
    
//    for (char i = 'A'; i <= 'F'; i++) { // 6번 반복
//    	System.out.print(i + " "); // 강제형변환이 되어서 char i에 다시 저장 되기 때문에 문자가 나오는 거
//    }
	  
	  
/////////////////////////////////////////////////////////////////////  
	  
 /* 고급 단계 (어렵군)*/
    // A ~ F 까지 중 C 제외하고 출력
//	    for (int i = 0; i < 6; i++) { // 6번 반복
//	    	if(i == 2) {
//	    		continue;  // ★컨티뉴는 즉시 다음 반복 실행! 자주 사용
//	    	}
//	    	System.out.print((char)(i+65) + " ");
//	    }//for문		
		
		for (int i = 0; i < 5; i++) {
			System.out.println((char)(i>1 ? i+66 : i+65) + " ");
		}
		
	}//main
}//class

