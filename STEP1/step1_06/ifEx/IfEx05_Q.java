package step1_06.ifEx;

import java.util.Scanner;

/*
 * # 로그인[2단계]
 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */


public class IfEx05_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int dbId = 0;
		int dbPw = 0;
		System.out.println("사용할 id를 입력해주세요 :");
		int dbid = scan.nextInt();
		System.out.println("사용할 pw를 입력해주세요 :");
		int dbpw = scan.nextInt();
		System.out.println("로그인 할 id입력해주세요 : ");
		int id = scan.nextInt();
		System.out.println("로그인 할 pw입력해주세요 : ");
		int pw = scan.nextInt();
		
		if (dbid == id && dbpw == pw) {
			System.out.println("로그인 성공!");
		}else {
			System.out.println("로그인 실패");
		}
	}

}
