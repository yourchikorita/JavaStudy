package step5_2.classEx;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # ATM[4단계] : 전체 기능구현
 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */

class Ex11{
	String name = "";
	
	String[] arAcc = {"1111", "2222", "3333", "4444", "5555"};
	String[] arPw  = {"1234", "2345", "3456", "4567", "5678"};
	int[] arMoney  = {87000, 34000, 17500, 98000, 12500};
	
	int count = 5;
	
	// 3333 로그인 중
	int loginCheck = 2;
}

public class ClassEx11ATM_A {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Ex11 e = new Ex11();
		e.name = "Mega Bank";
		
		while(true) {
			System.out.println("-------------------------");
			System.out.println("계좌번호\t비밀번호\t계좌잔액");
			System.out.println("-------------------------");
			for(int i=0; i<e.count; i++) {
				System.out.println(e.arAcc[i] + "\t" + e.arPw[i] + "\t" + e.arMoney[i]);
			}
			System.out.println("-------------------------");
			System.out.print("상태 : ");
			if(e.loginCheck == -1) {
				System.out.println("로그아웃");
			}else {
				System.out.println(e.arAcc[e.loginCheck] + " 로그인");
			}
			System.out.println("-------------------------");
			
			System.out.println("[" + e.name + "]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금하기");
			System.out.println("[6]이체하기");
			System.out.println("[7]잔액조회");
			System.out.println("[0]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.print("[가입]계좌번호를 입력하세요 : ");
				String acc = scan.next();
				
				int check = 1;
				for(int i=0; i<e.arAcc.length; i++) {
					if(e.arAcc[i].equals(acc)) {
						check = -1;
					}
				}
				
				if(check == -1) {
					System.out.println("[메세지]중복되는 계좌번호 입니다.");
				}else {
					System.out.print("[가입]비밀번호를 입력하세요 : ");
					String pw = scan.next();
					
					System.out.print("[가입]금액을 입력하세요 : ");
					int money = scan.nextInt();
					
					e.arAcc[e.count] = acc;
					e.arPw[e.count] = pw;
					e.arMoney[e.count] = money;
					
					System.out.println("[메세지]가입을 축하합니다.");
				}
			}
			else if(sel == 2) {
				if(e.loginCheck == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
					continue;
				}
				
				for(int i=e.loginCheck; i<e.count - 1; i++) {
					e.arAcc[i] = e.arAcc[i + 1];
					e.arPw[i] = e.arPw[i + 1];
					e.arMoney[i] = e.arMoney[i + 1];
				}
				
				e.count -= 1;
				e.loginCheck = -1;
				System.out.println("[메세지]탈퇴되었습니다. 안녕히가십시오.");
			}
			else if(sel == 3) {
				if(e.loginCheck != -1) {
					System.out.println("[메세지]현재 " + e.arAcc[e.loginCheck] + "님, 로그인 중...");
					continue;
				}
				System.out.print("[로그인]계좌번호를 입력하세요 : ");
				String acc = scan.next();
				
				System.out.print("[로그인]비밀번호를 입력하세요 : ");
				String pw = scan.next();
				
				for(int i=0; i<e.count; i++) {
					if(e.arAcc[i].equals(acc) && e.arPw[i].equals(pw)) {
						e.loginCheck = i;
					}
				}
				
				if(e.loginCheck == -1) {
					System.out.println("[메세지]계좌번호와 비밀번호를 확인해주세요.");
				}else {
					System.out.println("[메세지]" + e.arAcc[e.loginCheck] + "님, 환영합니다.");
				}
			}
			else if(sel == 4) {
				if(e.loginCheck == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
					continue;					
				}
				
				e.loginCheck = -1;
				System.out.println("[메세지]로그아웃 되었습니다.");
			}
			else if(sel == 5) {
				if(e.loginCheck == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
					continue;					
				}
				System.out.print("[입금]입금할 금액을 입력하세요 : ");
				int money = scan.nextInt();
				
				e.arMoney[e.loginCheck] += money;
				System.out.println("[메세지]입금을 완료하였습니다.");
			}
			else if(sel == 6) {
				if(e.loginCheck == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
					continue;					
				}
				
				System.out.print("[이체]계좌번호를 입력하세요 : ");
				String acc = scan.next();
				
				int check = -1;
				for(int i=0; i<e.count; i++) {
					if(e.arAcc[i].equals(acc)) {
						check = i;
					}
				}
				
				if(check == -1) {
					System.out.println("[메세지]계좌번호를 확인해주세요.");
				}else {
					System.out.print("[이체]금액을 입력하세요 : ");
					int money = scan.nextInt();
					
					if(e.arMoney[e.loginCheck] >= money) {
						e.arMoney[e.loginCheck] -= money;
						e.arMoney[check] += money;
						System.out.println("[메세지]이체를 완료하였습니다.");
					}else {
						System.out.println("[메세지]계좌잔액이 부족합니다.");
					}
				}
			}
			else if(sel == 7) {
				if(e.loginCheck == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
					continue;					
				}		
				
				System.out.println(e.arAcc[e.loginCheck] + "님의 계좌잔액은 " + e.arMoney[e.loginCheck] + "원 입니다.");
			}
			else if(sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
	}
}
