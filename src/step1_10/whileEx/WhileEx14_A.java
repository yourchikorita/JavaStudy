package step1_10.whileEx;

import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 */
//1:49 ~ 1:51 (2분)
public class WhileEx14_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 3개 입력해주세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int max = num1;
		if(max < num2) {
			max = num2;
		}
		if(max < num3) {
			max = num3;
		}
		System.out.println(max);
		
	}

}
