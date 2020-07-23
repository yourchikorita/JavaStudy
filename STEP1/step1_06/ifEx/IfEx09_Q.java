package step1_06.ifEx;

import java.util.Scanner;

/*
 * # 로그인[3단계]
 * 1. Id를 입력받아 dbId와 일치할 경우에만 Pw를 입력할 수 있다.
 * 2. Id가 틀린 경우, "Id를 확인해주세요"라는 메세지를 출력한다.
 * 3. Pw가 틀린 경우, "Pw를 확인해주세요"라는 메세지를 출력한다.
 * 4. Id와 Pw와 모두 일치하는 경우, "로그인 성공"라는 메세지를 출력한다.
 */


public class IfEx09_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dbId = 1234;
		int dbPw = 1111;
		Scanner scan = new Scanner(System.in);
		System.out.println("id : ");
		int id = scan.nextInt();
		System.out.println("pw: ");
		int pw = scan.nextInt();
		
		
		
		if(dbId == id && dbPw == pw) {
			System.out.println("로그인 성공");
		}else {
			if(dbId == id && dbPw !=pw) {
				System.out.println("pw재확인");
			}
			if(dbId != id && dbPw ==pw) {
				System.out.println("id재확인");
			}
			if(dbId != id && dbPw !=pw) {
				System.out.println("id,pw 모두재확인");
			}
		}
		
				

	}

}
