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


public class ArrayEx32ATM_Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int MAX = 5;
		
		int[] arId = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];
		
		int count = 0;
		int log = -1;
		int person = 0;
		
		String menu = "=== 메가IT ATM ===\n";
		menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
		menu += "5.입금\n6.이체\n7.잔액조회\n0.종료";
		
		while(true) {
			System.out.println(Arrays.toString(arId));
			System.out.println(Arrays.toString(arPw));
			System.out.println(Arrays.toString(arMoney));
			System.out.println(menu);
			
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				System.out.println("계좌번호 :");
				int acc1 = scan.nextInt();
				System.out.println("비번 :");
				int pw1 = scan.nextInt();
				int check = 1;
				
				for(int i=0;i<count;i++) {//중복되는거 있으면 -1
					if(arId[i] == acc1) {
						check = -1;
					}
				}
				
				
				
				if(check == -1) {
					System.out.println("중복된다.");
				}else {
					arId[person] = acc1;
					arPw[person] = pw1;
					arMoney[person] = 1000;
					person += 1;
				}
				
				
				
			}
			else if(sel == 2) {
				
			}
			else if(sel == 3) {}
			else if(sel == 4) {}
			else if(sel == 5) {}
			else if(sel == 6) {}
			else if(sel == 7) {}
			else if(sel == 0) {
				break;
			}
		}


	}

}
