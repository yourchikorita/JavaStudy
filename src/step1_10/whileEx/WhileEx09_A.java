package step1_10.whileEx;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 1. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 2. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 4. 조회
 * . myMoney와 yourMoney 잔액 모두 출력
 */

//2 ~ 2:23 (23분)
public class WhileEx09_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int myAccDb = 1111;
		int myMoneyDb = 500;
		
		int yourAccDb = 2222;
		int yourMoneyDb = 700;	
		
		boolean run = true;
		while(run) {
			System.out.println("======은정 은행============");
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("입금할 금액 : ");
				int myCash = scan.nextInt();
				myMoneyDb = myMoneyDb + myCash;
				System.out.println("계좌 잔액 :" + myMoneyDb);
			}
			else if(sel == 2) {
				System.out.println("현재 계좌 잔액 :"+ myMoneyDb);
				System.out.println("출금할 금액 : ");
				int myCash = scan.nextInt();
				if( myCash <= myMoneyDb) {
					myMoneyDb = myMoneyDb - myCash;
					System.out.println("출금 완료! 계좌 잔액 : " + myMoneyDb);
				}else if(myCash > myMoneyDb) {
					System.out.println("계좌 잔액이 부족합니다.");
				}
			}
			else if(sel == 3) {
				System.out.println("이체할 계좌번호 적으주세요");
				int yourAccount = scan.nextInt();
				if(yourAccount == yourAccDb) {
					System.out.println("현재 잔액"+ myMoneyDb);
					System.out.println("이체할 금액 : ");
					int moveMoney = scan.nextInt();
					if(moveMoney <= myMoneyDb) {
						myMoneyDb = myMoneyDb - moveMoney;
						yourMoneyDb = yourMoneyDb + moveMoney;
						System.out.println("이체완료");
						System.out.println("내 계좌 잔액" + myMoneyDb);
						System.out.println("다른 은행 계좌 잔액" + yourMoneyDb);
						
					}else{
						System.out.println("그만큼의 돈이 계좌에 없습니다.ㅠㅠ");
					}
				}else {
					System.out.println("계좌번호가 존재하지 않습니다.");
				}
			}
			else if(sel == 4) {
				System.out.println("현재 내 계좌 잔액" + myMoneyDb);
				System.out.println("현재 다른 계좌 잔액" + yourMoneyDb);
			}
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
		


	}

}
