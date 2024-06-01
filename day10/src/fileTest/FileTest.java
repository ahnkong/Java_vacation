package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
   public static void main(String[] args) throws IOException {
      
//      자바에서 기본 현재경로는 프로젝트 폴더이다.
      BufferedWriter bw = new BufferedWriter(new FileWriter(new File("./test.txt")));
      
//    bw.write("안녕하세요.\n"); // 제어문자 사용가능
      bw.write("안녕하세요.");
      bw.newLine();// 엔터
      bw.write("오늘 점심 메뉴 뭐에요~??");
      
//    bw.flush(); -> 버퍼에 있는 데이터를 전송한다. // 버퍼를 비워주는 것.(저장버튼)
      bw.close();
      
      BufferedReader br = new BufferedReader(new FileReader(new File("test.txt")));
      
//      System.out.println((char)br.read());
//      System.out.println((char)br.read());// 한글자씩
      	System.out.println(br.readLine()); // 한 줄씩
      	System.out.println(br.readLine());
//      System.out.println(br.readLine()); // 처음부터 끝까지 읽으려면, While문 써서 null이 나올때까지 출력해라 하면 나온다고..?
      	
      
   }
}

