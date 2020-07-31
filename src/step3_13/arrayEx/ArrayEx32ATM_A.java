package step3_13.arrayEx;

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

public class ArrayEx32ATM_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int MAX = 5;

		int[] arId = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];
		int count = 0;

		int log = -1;//로그인 안됬을경우

		String menu = "=== 메가IT ATM ===\n";
		menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
		menu += "5.입금\n6.이체\n7.잔액조회\n0.종료";
		int who = -1;

		while (true) {
			System.out.println(Arrays.toString(arId));
			System.out.println(Arrays.toString(arPw));
			System.out.println(Arrays.toString(arMoney));
			System.out.println(menu);

			int sel = scan.nextInt();

			if (sel == 1) {//회원가입

				System.out.println("계좌번호 :");
				int acc1 = scan.nextInt();
				System.out.println("비번 :");
				int pw1 = scan.nextInt();

				int check = 1;
				//첫번째는 당연 중복안되니까 취급안하구 다음부터 적용됨.
				for (int i = 0; i < count; i++) {// 중복되는거 있으면 -1
					if (arId[i] == acc1) {
						check = -1;
					}
				}

				if (check == -1) {
					System.out.println("중복된다.");
				} else {
					System.out.println(" ********가입 완료합니다.****");
					arId[count] = acc1;
					arPw[count] = pw1;
					arMoney[count] = 1000;
					count = count + 1;
				}

			} else if (sel == 2) {
				System.out.println("삭제할 계좌번호 입력해달라");
				int myAcc = scan.nextInt();
				System.out.println("탈퇴완료");
				
			} else if (sel == 3) {//로그인
				int check = -1;//아이디 비번 맞으면 1 아니면 -1
				//1.로그인이  안 되어있는 경우
				if(log == -1) {
					System.out.println("계좌번호 입룍");
					int myAcc = scan.nextInt();
					System.out.println("비번");
					int myPw = scan.nextInt();
					//1-1.아이디와 비번이 맞는 경우 check =1 로 변경해줌
					for(int i=0; i<5;i++) {
						if(myAcc == arId[i] && myPw == arPw[i] ) {
							check = i;
							who = i;
							log = 1;//log 완료
							System.out.println(arId[check]+"환영합니다 로그인 완료************");
							break;
							}
					}
					//1-2.안맞는 경우는 그대로 -1
					if(check == -1) {
						System.out.println("**********아이디 비번 확인 해달라 **************");
					}
				//2.로그인 이미 되잇는 경우	
				}else if (log == 1) {
					System.out.println("**************이미 로그인 중이다. ********");
				}
			//로그아웃
			} else if (sel == 4) {
				int check = -1; //아이디 비번 틀림
				if(log == 1) {//로그인 중
					log = -1;
					System.out.println("*******로그아웃 완료*******");
				}else if(log == -1) {//로그아웃 중
					System.out.println("****로그인 한 적 없다리 *******");
				}
				
			//입금	
			} else if (sel == 5) {
				if(log == 1) {
					System.out.println("*얼마를 입금하시겠습니까?***********");
					int cash = scan.nextInt();
					System.out.println(who);
					arMoney[who] += cash;
					System.out.println(cash +"원입금완료 후 계좌 잔액"+ arMoney[who]);
				}else if(log == -1) {
					System.out.println("****로그인 후 이용 가능**********");
				}
				//이체
			} else if (sel == 6) {
				if(log == 1) {
					int check = -1;
					System.out.println("****이체할 계좌번호 입력: ***********");
					int moveAc = scan.nextInt();
					//입력한 계좌번호가 배열에 있는지 확인
					for(int i=0; i<5;i++) {
						if(moveAc == arId[i]) {//있으면
							System.out.println("****이체할 금액 입력: ***********");
							int moveMoney = scan.nextInt();
							check = 1;
							
							//이체하려는 금액보다 내 계좌에 잔액이 많은가
							if(arMoney[who] >= moveMoney) {
								arMoney[i] += moveMoney;
								arMoney[who] -= moveMoney;
								System.out.println("**** 이체 완료****");
							}else {
								System.out.println("잔액부족으로 이체 불가***");
							}
							
							
						}
					}
					//없으면
					if(check == -1) {
						System.out.println("등록된 계좌번호가 아닙니다. *******");
					}
				}else if(log == -1) {
					System.out.println("****로그인 후 이용 가능**********");
				}
			} else if (sel == 7) {//잔액조회
				if(log == 1) {
					System.out.println(arId[who]+"님 잔액은"+arMoney[who]);
				}else if(log == -1) {
					System.out.println("****로그인 후 이용 가능**********");
				}
			} else if (sel == 0) {//종료
				break;
			}
		}

	}

}
