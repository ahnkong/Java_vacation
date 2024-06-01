package control;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
		
	 //심리 테스트
     /*
      * Q. 당신이 좋아하는 색을 선택하세요.
      * 1. 빨간색
      * 2. 노란색
      * 3. 검은색
      * 4. 흰색
      * 
      * 빨간색 : 불같고 열정적이고 적극적이다.
      * 노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
      * 검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
      * 흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
      */
     String msg = "Q. 당신이 좋아하는 색을 선택하세요.";
     String choiceMsg = "1.빨간색\n2.노란색\n3.검은색\n4.흰색";
     String redMsg = "불같고 열정적이고 적극적이다.";
     String yellowMsg = "발랄하고 밝고 귀엽고 개성있고 착하다.";
     String blackMsg = "묵묵하고 든든하고 냉철하고 멋지다.";
     String whiteMsg = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
     String errorMsg = "다시 입력해주세요.";
     String resultMsg = null;
     int choice = 0;
     Scanner sc = new Scanner(System.in);

     
//     String msg1 = "번호로 눌러야 합니다.";
     System.out.println(msg + "\n" + choiceMsg);
     System.out.println("번호를 눌러야 합니다.");
     choice = sc.nextInt();
     
     // 출력 메소드의 활용
     // 출력 메소드를 중간중간 넣어, 콘솔창을 확인하면서
     // 프로그램의 흐름을 알 수 있다.
     
//     // if문으로 작성.
//     if(choice == 1) {
//        System.out.println("1번 들어옴.");
//        resultMsg = redMsg;
//     }else if(choice == 2) {
//        resultMsg = yellowMsg;         
//     }else if(choice == 3) {
//        resultMsg = blackMsg;         
//     }else if(choice == 4) {
//        resultMsg = whiteMsg;         
//     }else {
//        resultMsg = errorMsg;
//     }// if문

     // switch문
     switch(choice) { //choice에 어떤 값이 들어가냐에 따라 실행되는 코드가 다른 것. (문자, 문자열, 숫자 어느것이 들어가도 상관 없다.)
     case 1 :
        System.out.println("1번 들어옴"); // break 없을 때 test 용도
        resultMsg = redMsg;
        break; // break 안적어 주면, 밑으로 계속 실행된다.
     case 2 :
        System.out.println("2번 들어옴");
        resultMsg = yellowMsg;
        break;
     case 3 :
        System.out.println("3번 들어옴");
        resultMsg = blackMsg;
        break;
     case 4 :
        System.out.println("4번 들어옴");
        resultMsg = whiteMsg;
        break;
     default : 
        System.out.println("default 들어옴");
        resultMsg = errorMsg;
        break;
     }
     
     	System.out.println(resultMsg);
   
     	
	}
}
