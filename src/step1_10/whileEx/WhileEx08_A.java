package step1_10.whileEx;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 */

// 1:20 - 1:34 (14분)
public class WhileEx08_A {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int log = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(log == -1) {
					
					System.out.println("계좌번호 랑 비번 입력해주세요");
					int userAccount = scan.nextInt();
					int userPw = scan.nextInt();
					if(userAccount == dbAcc1 && userPw == dbPw1) {
						log = 1;
						System.out.println(dbAcc1+ "님 로그인 완료");
						
					} else if(userAccount == dbAcc2 && userPw == dbPw2) {
						log = 1;
						System.out.println(dbAcc2 + "님 1로그인 완료");
						
					}else {
						System.out.println("계좌번호와 비밀번호 다시 확인해주세요");
					}
				}else {
					if(log == 1) {
						System.out.println("이미 로그인 중입니다.");
					}
				}
				}else if(sel == 2) {
					log = -1;
					System.out.println("로그아웃 됨");
				
				}
				else if(sel == 0) {
					run = false;
					System.out.println("프로그램 종료");
					run = false;
				}
		}


	}

}
