package castingTest;
//클래스간의 형변환이며, 이는 상속관계에서 이루어진다. 
//상속관계로 묶여 있는 클래스 간의 형변환
// ============부모 클래스===================
class Car{
	   void engineStart() {
	      System.out.println("열쇠로 시동 킴");
	   }
	}

//===============Car를 상속받은 자식 클래스 =========================
//Car를 상속받은 SuperCar 자식 클래스!
class SuperCar extends Car{
		@Override
	   void engineStart() { //엔진스타트, 부모에도 잇음
	      System.out.println("음성으로 시동 킴");
	   }
	   
	   void openRoof() { // 선루프관련 새로 정의
	      System.out.println("지붕 열기");
	   } // void openRoof거 중괄호
	}//Supercar 클래스 중괄호

//=========================================================
public class CastingTest {
	public static void main(String[] args) {
		Car sportage = new Car(); // 1. 객체 생성
		SuperCar lambo = new SuperCar();
		
//--------------------★ 업캐스팅 : up casting (부모, 자식 둘다 가지게 됨)----------------------------		
//		
		Car c1 = new SuperCar(); // ★업캐스팅이 됐을때도, 자식에 대한 것을 가지고 있다고 간주 하는것
		// SuperCar type의 객체를 생성  = 메로리 할당 
		// Car c1 만큼의 공간만큼 메모리를 가지게 됨.
		// Car c2 = lambo; 도 가능
		//c1.engineStart();재정의까지 나온다. (음성으로 시동킴).
		// 				   재정의 한 친구는 덮어 씌워지는 거다. - 메모리는 달라지지 않는다.
		//c1.openRoof(); // ★업캐스팅하면, 플러스 알파는 잘림.= 즉 openRoof 사용할 수 없음.
		
		
//--------------// down casting<강제 형변환 이라고 생각>--------------------------------------------		
		// +알파를 사용 할 수 있게 됨. = ★openRoof사용할 수 있게 됨.
		SuperCar su1 = (SuperCar)c1;
//		su1.openRoof();
				
//		SuperCar up_sportage = (SuperCar)sportage;
//		 up_sportage.engineStart();
		 // 살려줄 플러스 알파가 없어서 에러!
		// 이렇게 되면 메모리가 비어버림.
		
	}//클래스
}//패키지


// Car sportage = new Car(); 독립적인 Car타입
// SuperCar lambp = new SuperCar();

// up casting 
// Car c1 = new SuperCar(); 업캐스팅된 new SuperCar

// down cating 
// SuperCar su1 = (SuperCar)c1; 다운캐스팅된 SuperCar
