package step2_11.arrayEx;

import java.util.Scanner;

/*
 * # 즉석복권
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 */


public class ArrayEx10Roto_Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] lotto = {0, 0, 7, 7, 7, 0, 0, 0};
		//int[] lotto = {7, 0, 7, 7, 0, 0, 0, 0};
		//int[] lotto = {7, 0, 7, 7, 7, 0, 7, 0};
		
		boolean run = true;
		while(run) {			
			System.out.println("1) 복권 결과확인");						
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
		
			}						
		}


	}

}
