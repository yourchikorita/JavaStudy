package step1_06.ifEx;

import java.util.Scanner;

/*
 * # 구구단 게임[1단계]
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */


public class IfEx06_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 :");
		int firstNum = scan.nextInt();
		System.out.println("숫자 입력 :");
		int secondNum = scan.nextInt();
		System.out.println("두 숫자의 곱 결과를 입력하라");
		int result = firstNum * secondNum;
		int yourResult = scan.nextInt();
		if (yourResult == result) {
			System.out.println("정답");
		}else {
			System.out.println("땡");
		}
		
	}

}
