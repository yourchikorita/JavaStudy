package step1_06.ifEx;

import java.util.Scanner;

/*
 * # 로그인[1단계]
 * 1. Id와 Pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 * 예) 로그인 성공 or 로그인 실패
 */


public class IfEx04_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dbId = 1234;
		int dbPw = 1111;
		Scanner scan = new Scanner(System.in);
		System.out.println("id :");
		int id = scan.nextInt();
		System.out.println("pw :");
		int pw = scan.nextInt();
		if(id == dbId && pw ==dbPw) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	}

}
