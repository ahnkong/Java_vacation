package method;

import java.util.Scanner;

public class MethodTask {
   
//   두 정수의 나눗셈을 해주는 메소드(몫과 나머지 둘 다 리턴)
   int[] divide(int data1, int data2) {
      int[] results = null;
      
      if(data2 != 0) {
         results = new int[2];
         
         results[0] = data1 / data2;
         results[1] = data1 % data2;
      }
      return results;
   }
//   TASK 과제!)
//   사용자가 입력한 갯수만큼 배열을 만들고, 요소를 채워넣는다.(for문 사용)
//   배열의 최댓값, 최솟값을 구한 후 배열에 담아 리턴한다.
//   main 함수에 test 코드까지 이쁘게 작성하고, 테스트도 해본다.

   int[] getMinMax(Scanner sc) {
//	  Scanner sc = new Scanner(System.in);// RAM에 스캐너의 위치 정보를 만들어 주는 것 내용이 똑같더라도, 25줄과 34줄이 다름.
       int count = 0, min = 0, max = 0;
       int[] arData = null; // 몇개인지 모르니, 배열 선언후 null
	   int[] minMax = new int[2];
	   
	   System.out.println("배열의 요소의 갯수를 설정하세요 >> ");
	   count = sc.nextInt();
	   
	   arData = new int[count];
	   
	   // for문을 통해 배열요소 채워넣기!
	   for (int i = 0; i < arData.length; i++) { // for문으로 입력 받는거.
		   System.out.print(i+1 + "번째 정수 입력 : ");
		   arData[i] = sc.nextInt(); // 알트데이터 방에, 넥스트 인트 때려주공!
	   } //  이 for문 탈출시 배열이 만들어 짐!
	   
	   // 요소 확인용 for문
	   for (int i = 0; i < arData.length; i++) {
		   System.out.print(arData[i] + " ");
	   } 
	   System.out.println();
	   
	   min = arData[0]; //최솟값 0번쨰 방에 arData 0번쨰 값 넣고,
	   max = arData[0]; //최댓값
	  
	   
	   for (int i = 1; i < arData.length; i++) {
		   min = min > arData[i] ? arData[i] : min;
		   max = max < arData[i] ? arData[i] : max;
		   
	   } 
	   
	   minMax[0] = min;
	   minMax[1] = max;
	   
	   return minMax;
	   
      // sc.___ 이거는 그룹으로 묶인게 아닌 메임함수의 스캐너이다.       
   }
   
   public static void main(String[] args) {
      MethodTask mt = new MethodTask();
      Scanner sc = new Scanner(System.in);
      
      int[] result = mt.divide(10, 3);
      if(result == null) {
         System.out.println("0으로 나눌 수 없습니다.");
      }else {
         System.out.println("몫 : " + result[0]);
         System.out.println("나머지 : " + result[1]);
      }
      
//      문제 테스트 코드
      int[] minMax = mt.getMinMax(sc);
      System.out.println("최솟값 : " + minMax[0]);
      System.out.println("최댓값 : " + minMax[1]);
   }
}































