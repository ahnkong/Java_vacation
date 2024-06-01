package control;

import java.util.Scanner;

// While문 연습 - 번호 선택 후 다시 처음으로 돌아가는 걸 만들고 싶은거
// 어디서부터 와일문으로 묶어야 할까
// 선언x 
public class WhileTask {
	public static void main(String[] args) {
		String msg = "Q. 당신이 좋아하는 색을 선택하세요.";
	      String choiceMsg = "1.빨간색\n2.노란색\n3.검은색\n4.흰색\n5.종료";
	      String redMsg = "불같고 열정적이고 적극적이다.";
	      String yellowMsg = "발랄하고 밝고 귀엽고 개성있고 착하다.";
	      String blackMsg = "묵묵하고 든든하고 냉철하고 멋지다.";
	      String whiteMsg = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
	      String errorMsg = "다시 입력해주세요.";
	      String resultMsg = null;
	      int choice = 0;
	      Scanner sc = new Scanner(System.in);
//	      //flag를 사용한 무한반복 while문 탈출하rl      
//	      while(true){
//	    	  System.out.println(msg + "\n" + choiceMsg);
//	      	choice = sc.nextInt();
 //
////	      // switch문
//	      switch(choice) {
//	      case 1 :
//	         resultMsg = redMsg;
//	         break;
//	      case 2 :
//	         resultMsg = yellowMsg;
//	         break;
//	      case 3 :
//	         resultMsg = blackMsg;
//	         break;
//	      case 4 :
//	         resultMsg = whiteMsg;
//	         break;
//	      case 5 :
//	    	  flag = true; // 5번을 눌렀을때만 flag
//	    	  System.out.println("프로그램을 종료합니다.");
//	    	  break;
//	      default : 
//	         resultMsg = errorMsg;
//	         break;
//	      }//스위치
//	      
//	      if(flag) {break;} // 5번을 눌렀을때만 아웃
	      
//	      System.out.println(resultMsg);
//	      
//	    }// 와일  
	      
//// 조건식에 true를 적은 while문 탈출하기
//	      while(true){
//	      System.out.println(msg + "\n" + choiceMsg);
//	      choice = sc.nextInt();
//	      
//	      if(choice == 5) { // 입력받자마자 5번이면 바로 종료
//	    	  System.out.println("프로그램 종료");
//	    	  break;
//	      }
//
////	      // switch문
//	      switch(choice) {
//	      case 1 :
//	         resultMsg = redMsg;
//	         break;
//	      case 2 :
//	         resultMsg = yellowMsg;
//	         break;
//	      case 3 :
//	         resultMsg = blackMsg;
//	         break;
//	      case 4 :
//	         resultMsg = whiteMsg;
//	         break;
//	      case 5 :
//	    	  flag = true; // 5번을 눌렀을때만 flag
//	    	  System.out.println("프로그램을 종료합니다.");
//	    	  break;
//	      default : 
//	         resultMsg = errorMsg;
//	         break;
//	      }//스위치
//	      
//	      if(flag) {break;} // 5번을 눌렀을때만 아웃
	      
//	      System.out.println(resultMsg);
//	      
//	    }// 와일 
	      
// 조건식을 이용한 while문 탈출하기	      
	      while(choice !=  5){
	      System.out.println(msg + "\n" + choiceMsg);
	      choice = sc.nextInt();

//	      switch문
	      switch(choice) {
	      case 1 :
	         resultMsg = redMsg;
	         break;
	      case 2 :
	         resultMsg = yellowMsg;
	         break;
	      case 3 :
	         resultMsg = blackMsg;
	         break;
	      case 4 :
	         resultMsg = whiteMsg;
	         break;
	      case 5 :
	    	  System.out.println("프로그램을 종료합니다.");
	    	  break;
	      default : 
	         resultMsg = errorMsg;
	         break;
	      }//스위치

	      if(choice != 5) {
	    	  System.out.println(redMsg);
	      }
	      else {
	    	  System.out.println("프로그램 종료");
	      }
	   }// 와일
	      
	      
   } //메인
}//클래스
