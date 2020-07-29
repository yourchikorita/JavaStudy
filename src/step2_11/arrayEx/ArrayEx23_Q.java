package step2_11.arrayEx;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # ATM[3단계]
 * 1. 가입
 * . 계좌번호와 비밀번호를 입력받아 가입
 * . 계좌번호 중복검사
 * 2. 탈퇴
 * . 계좌번호를 입력받아 탈퇴
 */

public class ArrayEx23_Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] accs = { 1001, 1002, 0, 0, 0 };
		int[] pws = { 1111, 2222, 0, 0, 0 };

		int cnt = 2;

		boolean run = true;
		while (run) {

			System.out.println("1.가입");
			System.out.println("2.탈퇴");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.println("계좌번호 : ");
				int acc1 = scan.nextInt();
				System.out.println("비번 : ");
				int pw1 = scan.nextInt();
				
				accs[cnt] = acc1;
				pws[cnt] = pw1;
				cnt += 1;
				
				System.out.println(Arrays.toString(accs));
				
			} else if (sel == 2) {
				System.out.println("탈퇴할 계좌번호 입력");
				int acc1 = scan.nextInt();
				for(int i=0;i<accs.length;i++) {
					if(acc1 == accs[i]) {
						accs[i] = 0;
						pws[i] = 0;
						cnt -= 1;
					}
				}
			}
			System.out.println(Arrays.toString(accs));

		}

	}

}
