package step1_10.whileEx;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 */
//30분
public class WhileEx10_A {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int log = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean run = true;
		while(run) {
			System.out.println("=====은정 은행=======");
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if (log == -1) {
					System.out.println("계좌번호 :");
					int account = scan.nextInt();
					if(account == dbAcc1 || account == dbAcc2) {
						System.out.println("계좌 비번 :");
						int pw = scan.nextInt();
						if(pw == dbPw1) {
							log = 1;
							System.out.println(dbAcc1+"님으로 로그인 되었습니다!");
						}else if(pw == dbPw2) {
							log = 2;
							System.out.println(dbAcc2+"님으로 로그인 되었습니다!");
						}else {
							System.out.println("비밀번호 틀렸습니다!");
						}
					}else {
						System.out.println("등록되지 않은 계좌 번호 입니다");
					}
				}else if(log == 1) {
					System.out.println("이미 1111 님으로 로그인 중");
				}else if(log == 2) {
					System.out.println("이미 2222 님으로 로그인 중");
				
				}
			}
			else if(sel == 2) {
				log = -1;
				System.out.println("로그아웃 되었습니다");
			}
			else if(sel == 3) {
				if(log == -1) {
					System.out.println("로그인 후 이용가능");
				}else if(log == 1) {
					System.out.println("입금할 금액 : ");
					int myCash = scan.nextInt();
					dbMoney1 = dbMoney1 + myCash;
					System.out.println(myCash+"원 입금 완료! 총 잔액"+ dbMoney1 +"원 입니다!");
				}else if(log == 2) {
					System.out.println("입금할 금액 : ");
					int myCash = scan.nextInt();
					dbMoney2 = dbMoney2 + myCash;
					System.out.println(myCash+"원 입금 완료! 총 잔액"+ dbMoney2 +"원 입니다!");
				}
			}
			else if(sel == 4) {
				if(log == -1) {
					System.out.println("로그인 후 이용가능");
				}else if(log == 1) {
					System.out.println("현재 계좌 잔액은"+dbMoney1+"입니다.");
					System.out.println("출금할 금액 :");
					int withdraw = scan.nextInt();
					if(withdraw <= dbMoney1) {
						dbMoney1 = dbMoney1 - withdraw;
						System.out.println("출금 완료! 계좌 잔액은" + dbMoney1+"입니다!");
					}else {
						System.out.println("잔액부족!! 해당 계좌에 그만큼의 돈이 없어요..");
					}
				}else if(log == 2) {
					System.out.println("현재 계좌 잔액은"+dbMoney2+"입니다.");
					System.out.println("출금할 금액 :");
					int withdraw = scan.nextInt();
					if(withdraw <= dbMoney2) {
						dbMoney2 = dbMoney2 - withdraw;
						System.out.println("출금 완료! 계좌 잔액은" + dbMoney2+"입니다!");
					}else {
						System.out.println("잔액부족!! 해당 계좌에 그만큼의 돈이 없어요..");
					}
				}
			}
			else if(sel == 5) {
				if(log == -1) {
					System.out.println("로그인 후 이용가능");
				}else if(log == 1) {
					System.out.println("이체할 계좌번호 :");
					int moveAccount = scan.nextInt();
					
				    if(moveAccount == 2222) {
					System.out.println("현재 금액 :"+dbMoney1+" / 이체할 금액 :");
					int moveMoney = scan.nextInt();
					
						if(moveMoney <= dbMoney1) {
							dbMoney1 = dbMoney1 - moveMoney;
							dbMoney2 = dbMoney2 + moveMoney;
							System.out.println("이체 완료! 남은금액"+ dbMoney1);
							
						}else if(moveMoney > dbMoney1) {
							System.out.println("계좌에 잔액 부족");
						}
						
				    }else if(moveAccount != 2222) {
				    	System.out.println("없는 계좌번호 입니다.");
				    	}	
				}else if(log ==2) {
					System.out.println("이체할 계좌번호 :");
					int moveAccount = scan.nextInt();
					
				    if(moveAccount == 1111) {
					System.out.println("현재 금액 :"+dbMoney2+" / 이체할 금액 :");
					int moveMoney = scan.nextInt();
					
						if(moveMoney <= dbMoney2) {
							dbMoney2 = dbMoney2 - moveMoney;
							dbMoney1 = dbMoney1 + moveMoney;
							System.out.println("이체 완료! 남은금액"+ dbMoney2);
							
						}else if(moveMoney > dbMoney2) {
							System.out.println("계좌에 잔액 부족");
						}
						
				    }else if(moveAccount != 1111) {
				    	System.out.println("없는 계좌번호 입니다.");
				    	}	
				}
			}else if(sel == 6) {
				if(log == -1) {
					System.out.println("로그인 후 이용가능");
				}else if(log == 1) {
					System.out.println("잔액 : " + dbMoney1);
				}else if(log == 2) {
					System.out.println("잔액 : " + dbMoney2);
				}
			}
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		
		
			
		}
	}
}

			
		

