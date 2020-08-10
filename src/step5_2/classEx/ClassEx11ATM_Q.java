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
//class Ex11 {
//	String name = "";
//
//	String[] arAcc = { "1111", "2222", "3333", "4444", "5555" };
//	String[] arPw = { "1234", "2345", "3456", "4567", "5678" };
//	int[] arMoney = { 87000, 34000, 17500, 98000, 12500 };
//
//	int count = 5;
//
//	// 3333 로그인 중
//	int loginCheck = 2;
//}

public class ClassEx11ATM_Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Ex11 e = new Ex11();
		e.name = "Mega Bank";

		while (true) {

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

			if (sel == 1) {//회원가입
				System.out.println("계좌번호  :");
				int myAcc = scan.nextInt();
				e.arAcc[e.count] = e.arAcc+"";
				System.out.println(Arrays.toString(e.arAcc));
			} else if (sel == 2) {
				
			} else if (sel == 3) {
			} else if (sel == 4) {
				if(e.loginCheck == -1) {
					System.out.println("로그인 후 이용가능");
				}else if(e.loginCheck != -1) {
					System.out.println("로그아웃 완료");
				}
			} else if (sel == 5) {
				if(e.loginCheck == -1) {
					System.out.println("로그인 후 이용가능");
				}else if(e.loginCheck != -1) {
				}
			} else if (sel == 6) {
				if(e.loginCheck == -1) {
					System.out.println("로그인 후 이용가능");
				}else if(e.loginCheck != -1) {
				}
			} else if (sel == 7) {
				if(e.loginCheck == -1) {
					System.out.println("로그인 후 이용가능");
				}else if(e.loginCheck != -1) {
				}
			} else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}

}
