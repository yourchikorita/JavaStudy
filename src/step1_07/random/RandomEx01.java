package step1_07.random;

import java.util.Random;

/*
 * # 랜덤
 */

public class RandomEx01 {
	public static void main(String[] args) {

		Random ran = new Random();
		
		// 예) 0 ~ 2 사이의 랜덤
		int rNum = ran.nextInt(3);
		System.out.println(rNum);
		
		// 문제 1) 1 ~ 5 사이의 랜덤
		
		rNum = ran.nextInt(5) + 1;		// [0 ~ 4] + 1
		System.out.println(rNum);
		
		
		// 문제 2) -3 ~ 3 사이의 랜덤
		rNum = ran.nextInt(7) - 3;		// [0 ~ 6] - 3
		System.out.println(rNum);
		
	}
}
