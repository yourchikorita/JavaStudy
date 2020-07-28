package step2_11.arrayEx;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 즉석복권
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 */

//15분
public class ArrayEx10Roto_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] lotto = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lottoRan = new int[8];
		
		for(int i = 0; i < lottoRan.length; i++) {
			lottoRan[i] = ran.nextInt(2)+6;
		}
		System.out.println(Arrays.toString(lottoRan));
		
		//int[] lotto = {7, 0, 7, 7, 0, 0, 0, 0};
		//int[] lotto = {7, 0, 7, 7, 7, 0, 7, 0};
		
		boolean run = true;
		while(run) {	
			
			System.out.println("1) 복권 결과확인");						
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
//			if(sel == 1) {
//				for(int i = 0; i < 7 - 2; i++) {
//					if(lotto[i] == 7 && lotto[i + 1] == 7 && lotto[i + 2] == 7) {
//						System.out.println("당첨");
//						i = 7 - 2;
//					}
//				}			
//			}
			
			
			//추가 문제) lotto 에 처음부터 값이 있는게 아니라 
			//         랜덤으로 7이나 0 을  넣은후 매번 다른 결과가 나오도록 만들어보세요
			
			if(sel == 1) {
				for(int i = 0; i < lottoRan.length; i++) {
					if(lottoRan[i] == 7 && lottoRan[i + 1] == 7 && lottoRan[i + 2] == 7) {
						System.out.println("당첨");
						break;
					}else {
						System.out.println("꽝");
						break;
					}
				}			
			}
		}
		

	}

}
