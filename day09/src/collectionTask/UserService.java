package collectionTask;

import java.util.ArrayList;

// 회원가입과 마이페이지 
public class UserService {
//	모든 회원정보를 저장할 DV
	public static ArrayList<User> userList = new ArrayList<User>();
		// ㄴDB에서 받아온거 여기에 저장하는 거
	
	
	
//	id중복검사, boolean 타입으로 리턴
//	아이디를 만들 수 있다면 true 리턴
//	아이디를 만들 수 없다면 false 리턴
	public boolean checkId(String id) {
		boolean check = true;
		for (User user : userList) {
			if(user.getId().equals(id)) {
				check = false;
				break;
			}
		}
		return check;
	}
	
	
//	회원가입
	public void join(User user) {
		userList.add(user);
	}
	
	
//	로그인
//	매개변수로는 id,pw
//	리턴 -> id리턴
//	없으면 null 리턴(String타입이니 리턴타입 null)
	public String login(String id, String pw) {
		String loginid = null;
		for (User user : userList) {
			loginid = user.getId();
			if(loginid.equals(id) && user.getPw().equals(pw)) {
				return loginid;
			}
		}
			return null;
	}
	
	
	
//	로그인된 회원의 이름을 변경
//	매개변수는 변경하고 싶은 이름,id 
	public void changeName(String rename, String id) {
		for (User user : userList) {
			if(user.getId().equals(id)) {
				user.setName(rename);
				break;
			}
		}
		
	}
//  로그인된 전체 정보를 가지고오는 메소드
  public User getUser(String id) {
     for (User user : userList) {
        if(user.getId().equals(id)) {
           return user;
        }
     }
     return null;
  }
  
}
