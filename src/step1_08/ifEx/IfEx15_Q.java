package step1_08.ifEx;

import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */
//5:02 ~ 5:15 (13분)
public class IfEx15_Q {

	public static void main(String[] args) {

		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("계좌에 있는 돈 = " + myMoney + "원");
		System.out.println("지갑에 있는 돈 = " + yourMoney + "원");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("계좌번호 입력 :");
		int somebodyAccount = scan.nextInt();
		
		if(somebodyAccount == myAcc) {
			System.out.println("계좌에서 얼마를 출금빼시겠습니까?");
			int moveMoney = scan.nextInt();
			if(moveMoney <= myMoney) {
				myMoney = myMoney - moveMoney;
				yourMoney = yourMoney + moveMoney;
				System.out.println("이체 가능, 계좌에 남은 금액은"+ myMoney +"내 지갑에 있는 돈="+yourMoney);
			}else if(moveMoney > myMoney) {
				System.out.println("이체 불가");
			}
		}else {
			System.out.println("계좌번호 오류");
		}

	}

}
