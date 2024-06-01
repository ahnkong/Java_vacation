package classTest;

import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		SuperCar s1 = new SuperCar();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String msg = "1. 시동 켜기\n2. 시동 끄기\n3. 프로그램 종료";
		
		while(choice != 3) {
			System.out.println(msg);
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				s1.engineStart();
				break;
				
			case 2:
				s1.engineStop();
				break;
				
			case 3:
				System.out.println("잘가요~");
				break;

			default:
				System.out.println("제대로 입력 안해?");
				break;
			}
		}
		
	}
}
