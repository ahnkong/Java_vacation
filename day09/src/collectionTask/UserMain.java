//package collectionTask;
//
//import java.util.Scanner;
//
////웹사이트 
//
//
//public class UserMain { 
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		UserService us = new UserService();
//		String id = null, pw = null, name = null; //회원가입, 로그인 할 때 입력 받은 값을 저장할 변수
//		String loginId = null; // 로그인 성공시 id값을 저장할 변수
//		String rename = null; // 바꿀 이름 입력
//		int age = 0; // 나이 입력, 메뉴 선택

//		
//		while(true) {
//			System.out.println("★★★★★민정 커뮤니티에 오신 걸 환영합니다.☆☆☆☆☆");	
//			System.out.println("▷▷▷▷▷메뉴를 선택하세요.◁◁◁◁◁");	
//			System.out.println("1. 회원가입\n2. 로그인\n3. 종료하기");	
//			choice = sc.nextInt();
//			
//			if(choice == 3) {
//				System.out.println("다음에 봐요!");
//				break;
//			}
//			
//			if(choice == 1) {
//				System.out.println("아이디 입력(중복검사는 자동으로 됩니다.) : ");
//				id = sc.next();
//				if(!us.checkId(id)) {
//					System.out.println("중복된 아이디 입니다.");
//				}else {
//					System.out.println("아이디 생성 가능!");
//					break;
//				}
//				
//			}// while닫는 중괄호
//			System.out.print("비밀번호 입력 : ");
//			pw = sc.next();
//			System.out.print("이름 입력 : ");
//			name = sc.nextInt();
//			System.out.print("나이 입력 : ");
//			age = sc.nextInt();
//			us.join(new User(id, pw, name, age));
//			System.out.println("회원 가입 성공!");
//		}	//choice == 1 if닫는 중괄호
//		
//	}
//	
//}
package collectionTask;

import java.util.Scanner;

public class UserMain {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      UserService us = new UserService();
      String id = null, pw = null, name = null; // 회원가입, 로그인 할 때 입력 받은 값을 저장할 변수
      String loginId = null; // 로그인 성공시 id 값을 저장할 변수
      String rename = null; // 바꿀 이름 입력
      int age = 0, choice = 0; // 나이 입력, 메뉴 선택
      User loginUser = null; // 로그인 된 유저 정보를 담을 변수
      
      while(true) {
         System.out.println("◆◆◆◆◆ 호근 커뮤니티에 오신 걸 환영합니다 ◆◆◆◆◆");
         System.out.println("◇◇◇◇◇◇◇◇◇◇ 메뉴를 선택하세요 ◇◇◇◇◇◇◇◇◇◇");
         System.out.println("1. 회원 가입\n2. 로그인\n3. 종료하기");
         choice = sc.nextInt();
         
         if(choice == 3) {
            System.out.println("다음에 봐요!");
            break;
         }
         
         if(choice == 1) {
            while(true) {
               System.out.print("아이디 입력 (중복검사는 자동으로 됩니다) : ");
               id = sc.next();
               if(!us.checkId(id)) { // 아이디를 만들 수 없다면
                  System.out.println("중복된 아이디입니다.");
               }else {
                  System.out.println("아이디 생성 가능!");
                  break;
               }         
            } // while 닫는 중괄호
            System.out.print("비밀번호 입력 : ");
            pw = sc.next();
            System.out.print("이름 입력 : ");
            name = sc.next();
            System.out.print("나이 입력 : ");
            age = sc.nextInt();
            us.join(new User(id, pw, name, age));
            System.out.println("회원 가입 성공!");
         } // choice == 1 if 닫는 중괄호
         
         else { // 로그인
            System.out.print("ID : ");
            id = sc.next();
            System.out.print("PW : ");
            pw = sc.next();
            
            loginId = us.login(id, pw);
            
            if(loginId != null) { // null이 아니라면 로그인 성공
            	
               System.out.println("로그인 성공!");
               while(true) {
                  System.out.println("1. 내 정보 보기\n2. 이름 변경\n3. 로그아웃");
                  choice = sc.nextInt();
                  
                  if(choice == 3) {// 3번 누르기 할때
                     System.out.println("로그아웃 완료!");
                     loginId = null;
                     break;
                  }
                  
                  if(choice == 1) { // 1번 내 정보 보기
                     loginUser = us.getUser(loginId);
                     System.out.println("아이디 : " + loginUser.getId());
                     System.out.println("이름 : " + loginUser.getName()); 
                     System.out.println("나이 : " + loginUser.getAge());
                  } // 1번 if 닫는 중괄호
                  else { // 2번 이름 변경
                     System.out.print("새 이름을 입력 : ");
                     rename = sc.next();
                     us.changeName(rename, loginId);
                     System.out.println("이름 변경 성공!");
                  } // 이름 변경 닫는 중괄호
               } // 로그인 후 while문 닫는 중괄호
            } // 로그인 성공 닫는 중괄호
            else { // 로그인 실패
               System.out.println("아이디 비밀번호를 확인하세요."); 
            }
         } // else 로그인 닫는 중괄호
      }// 큰 while문 닫는 중괄호
   }
}
