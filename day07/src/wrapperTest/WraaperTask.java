package wrapperTest;

public class WraaperTask {
	public static void main(String[] args) {
			
				//r실수를 플로 타입으로!
//  	49, 82.5, 77.7F, 'H', "홍길동", true 
//  	위 6개의 값을 6칸 배열에 담기(hint: 오토박싱과 업캐스팅)

		Object[] datas = {49, 82.5, 77.7F, 'H', "홍길동", true};
//		클래스 타입으로 담아주고, 모든 클래스의 부모타입인 Object 배열을 만들어 주기!
		
		
//  for문을 사용하여 배열에 담긴 값 출력하기!
		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);			
		}

	}
}
