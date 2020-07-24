package step1_06.ifEx;

import java.util.Scanner;

/*
 * # 최대값 구하기[1단계]
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */


public class IfEx12_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력:");
		int num1 = scan.nextInt();
		System.out.println("숫자 입력:");
		int num2 = scan.nextInt();
		System.out.println("숫자 입력:");
		int num3 = scan.nextInt();
		
		int maxNum = num1;
		
		if(maxNum < num2) {
			maxNum = num2;
		}
		if(maxNum < num3) {
			maxNum = num3;
		}
		System.out.println("최댓값은 "+maxNum);
	}

}
