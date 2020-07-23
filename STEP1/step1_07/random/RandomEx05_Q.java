package step1_07.random;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[2단계]
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 랜덤하게 저장한다.
 * 2. 저장된 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */
// 04:33 ~ 04:38 (5분)
public class RandomEx05_Q {

	public static void main(String[] args) {
		Random ran = new Random();
		int num1 = ran.nextInt(10) + 1;
		int num2 = ran.nextInt(10) + 1;
		
		System.out.println(num1 + "X" + num2 + "=");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정답은?");
		int answer = scan.nextInt();
		
		if(answer == (num1*num2)) {
			System.out.println("정답입니다.");
			
		}else {
			System.out.println("땡");
		}
	}

}
