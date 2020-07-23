package step1_08.ifEx;

import java.util.Scanner;

public class IfEx15_2 {
	public static void main(String[] args) {
		// 1. 로그인 ==> 1.입금 2.출금 3.조회		
		int cash = 20000;  // 입금시 감소  , 출금시 증가
		int balance = 30000; // 입금시 증가 , 출금시 감소 
		int account  = 11111; // 로그인시 사용
		int password  = 1234; // 로그인시 사용 
		Scanner scan = new Scanner(System.in);
		System.out.println("===MEGA ATM===");
		System.out.println("1.로그인 2.종료");
		int select = scan.nextInt();
		if(select == 1) {
			System.out.println("계좌와 비밀번호를 입력하세요 ");
			int acc = scan.nextInt();
			int pw = scan.nextInt();
			if(acc == account && password == pw) {
				System.out.println("1.입금 2.출금 3.조회");
				select = scan.nextInt();
				if(select == 1) {
					System.out.println("입금할 금액을 입력하세요");
					int deposit = scan.nextInt();
					cash = cash - deposit;
					balance = balance + deposit;
				}else if(select == 2) {
					System.out.println("출금할 금액을 입력하세요");
					int withdraw = scan.nextInt();
					cash = cash + withdraw;
					balance = balance - withdraw;
				}else if(select == 3) {
					System.out.println("조회 : " + balance + "원");
				}
			}
			else {
				System.out.println("아이디와 패스워드를 확인해주세요.");
			}
		}
		else if(select == 2) {
			System.out.println("종료");
		}	
	}


}
