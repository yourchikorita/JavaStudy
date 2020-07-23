package step1_08.ifEx;

import java.util.Random;

/*
 * # 369게임[1단계]
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */

//5:34 ~ 5:44(10분)
public class IfEx17_Q {

	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt(50)+1;
		System.out.println("문제" + num);
		
		int x = num / 10;//십의자리
		int y = num % 10;//일의자리
		int clapCount = 0;
		
		if(x == 3 || x == 6 || x == 9) {
			clapCount = clapCount + 1;
		}
		if(y == 3 || y == 6 || y == 9) {
			clapCount = clapCount +1;
		}
		
		if(clapCount ==2) {
			System.out.println("짝짝");
		}else if(clapCount == 1) {
			System.out.println("짝");
		}else {
			System.out.println(num);
		}
	}

}
