package step1_06.ifEx;

import java.util.Scanner;

public class IfEx05_A {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int dbId = 0;
		int dbPw = 0;
		
		System.out.println("=== 회원가입 ===");
		System.out.print("가입할 Id를 입력하세요 : ");
		dbId = scan.nextInt();
		System.out.print("가입할 Pw를 입력하세요 : ");
		dbPw = scan.nextInt();
		System.out.println("가입을 축하합니다.");
		
		System.out.println("=== 로그인 ===");
		System.out.print("ID 입력 : ");
		int myId = scan.nextInt();
		System.out.print("Pw 입력 : ");
		int myPw = scan.nextInt();
		
		if(dbId == myId && dbPw == myPw) {
			System.out.println("로그인 성공");
		}
		if(dbId != myId || dbPw != myPw) {
			System.out.println("로그인 실패");
		}
		
	}


}
