package api;

/**
 * @auther Ahn minjung
 * @since JDK 7
 * 
 * Calculator
 *
 **/

public class Calc {
	
	
	/**
	 * multiple
	 * 
	 * ex)
	 * multiple(5,3) : print 15
	 *
	 * @param num1 : First Number to multiple
	 * @param num2 : Last Number to multiple
	 * 
	 * @throws
	 * 
	 **/
	public void multiple(int num1, int num2) {
		System.out.println(num1 * num2);

	}
}


// 배포 방법
// [클래스]-[우클릭]-[export]-[jar file]-[next]-[workspace]-[첫번째거, 세번쨰거 선택 ]

// 내 이클립스에 가져오는 방법
// [프로젝트 우클릭]-[bulid path]- [configure build path]-[라이브러리스]-[Classpath]-
//		-[add external JARs]- 파일 열기- [apply]