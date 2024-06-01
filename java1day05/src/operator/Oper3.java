package operator;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
// [실습]
	
//	사용자에게 키를 입력 받고, 정수라면 정수로 출력
//	실수라면 실수로 출력
//	예) 183 -> 183 출력
//		183.5 -> 183.5 출력
//	 삼항연산자를 사용한다.
//	nextDouble()사용!
	
//	정수인지 실수인지 : 전체에서 진수부를 뺐을 때, 0인지 아닌지 검사
//	3.5 - 3 = 0.5 -> 실수
//	3.0 - 3 = 0.0 -> 정수
	
		double height = 0.0;
		String msg = "키를 입력하세요. 솔직하게!!! >>", result = null;
		boolean check = false;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(msg);
		height = sc.nextDouble();
		
		
		check = height - (int)height == 0;
		
//		정수로만,
//		System.out.println((int)height); // 실수 싫으니까~ 정수로 보여주세요.! parseInt 안하고, 강제 형변환을 사용하면 됨.
		
		
		
//		실수로만!	
//		result = check ? (int)height + "cm" : height + "cm";	
//		System.out.println(result);
		
	
	} // 메인함수
	
}// 클래스
