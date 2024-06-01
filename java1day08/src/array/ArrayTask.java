package array;

import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
//      10 ~ 1 까지 중 짝수만 배열에 담고 출력
//		int[] num = new int[5];
//		for (int i = 0; i < num.length; i++) {
//			num[i] = (5-i) *2;  //변화하는 i를 가지고 조정하는 거!
//		}	
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
//      1 ~ 100까지 배열에 담은 후 홀수만 출력
//      int[] arData = new int[100];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         if(arData[i] % 2 != 0) {
//            System.out.println(arData[i]);
//         }
//      }
//      
//      for (int i = 0; i < 100; i+=2) {
//            System.out.println(arData[i]);
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         if(arData[i] % 2 == 0) {
//            continue;
//         }
//         System.out.println(arData[i]);
//      }
//      1 ~ 100까지 배열에 담은 후 짝수의 합 출력
//      int[] arData = new int[100];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//      }
//      
//      int sum = 0;
//      for (int i = 0; i < arData.length; i++) {
//         if(i % 2 != 0) {
//            sum += arData[i];
//         }
//      }
//      System.out.println("총합 : " + sum);
	
	
//      A ~ F 까지 중 C 제외하고 배열에 담은 후 출력
//    char[] arData = new char[5];
//    for (int i = 0; i < 5; i++) {
//       arData[i] = (char)(i > 1 ? i + 66 : i + 65);
//    }
//    
//    for (int i = 0; i < arData.length; i++) {
//       System.out.print(arData[i] + " ");
//    }	
	
	
      
//      <심화문제>
//      1번) 5개의 정수를 입력받고 배열에 담은 후 최댓값과 최솟값을 출력 // 최솟값 담을 애한개, 최댓값 담을 애 한개 
//		뭐가 더 크니 뭐가 더 작니, 하다가 마지막에는 제일 작은애가 남게!,
//    int[] arData = new int[5];
//    Scanner sc = new Scanner(System.in);
//    String msg = "5개의 정수를 입력하세요.";
//    int max = 0, min = 0;
//    
//    System.out.println(msg);
//    for (int i = 0; i < arData.length; i++) {
//       arData[i] = sc.nextInt();
//    }
//    
////    배열에 잘 들어갔는지 확인용 함수.
////    for (int i = 0; i < arData.length; i++) {
////       System.out.print(arData[i] + " ");
////    }
//    
//    
//    max = arData[0]; // 맥스에 0번쨰 방 집어 넣은거
//    min = arData[0];
//    
//    for (int i = 1; i < arData.length; i++) {
//       if(max < arData[i]) {max = arData[i];}
//       if(min > arData[i]) {min = arData[i];}
//    }
//    
//    System.out.println("최댓값 : " + max);
//    System.out.println("최솟값 : " + min);	
//      
	
//      2번)사용자가 입력한 정수의 개수만큼 배열을 만든 후
//         그 갯수만큼 정수를 입력 받아 요소를 채운 후, 그 요소들의 평균 구하기	

	//  선언은 항상 선언부에!
	//  값도 모르고 칸도 아직 모르니까 null을 넣어 배열 초기화
	int[] arData = null;
	String msg1 = "정수 개수 : ", msg2 = "번째 정수 : ";
	int total = 0; // 총점을 담아줄 변수
	double avg = 0.0; // 평균을 담아줄 변수
	Scanner sc = new Scanner(System.in); // 입력을 받아줄거라 Scanner 선언 

	System.out.print(msg1);

	
	//  사용자가 입력한 정수만큼 칸 할당.
	arData = new int[sc.nextInt()];
	//						ㄴ 정수를 입력하라는 코드 sc.nextInt()
	for (int i = 0; i < arData.length; i++) {
		System.out.print(i+1+msg2);
		//     사용자가 입력한 정수를 순서대로 넣는다.
		arData[i] = sc.nextInt();
	}
	// 요소 확인용 함수
	//  for (int i = 0; i < arData.length; i++) {
	//     System.out.print(arData[i] + " ");
	//  }

	for (int i = 0; i < arData.length; i++) {
		//     배열에 저장되어있는 값을 전부 더한다.
		total += arData[i];
	} // 이 for문을 빠져나오면 total 에는 총 합이 담겨있다.

	//  정수와 정수의 연산은 정수가 나오므로, 강제 형변환을 하나 해줌.
	avg = (double)total/arData.length;

	//  소수점 둘째자리까지 나오게 하기 위해 String 클래스의 format 메소드를 사용했다.
	//  printf() 안 쓰고 싶어서 이 방법을 썼다.
	System.out.println("입력한 수의 평균은 " + String.format("%.2f", avg) + " 입니다.");


	}//메인
}// 클래스
