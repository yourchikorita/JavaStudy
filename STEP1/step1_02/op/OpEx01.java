package step1_02.op;

public class OpEx01 {
/*
 * # 연산자(operator)
 * 1. 산술 연산자
 * 1) 더하기			+
 * 2) 빼기			-
 * 3) 곱하기			*
 * 4) 나누기			/
 * 5) 나머지			%
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(10 + 3);
		System.out.println(10 - 3);
		System.out.println(10 * 3);
		
		// 정수 / 정수 = 정수
		// 정수 / 실수 = 실수
		// 실수 / 정수 = 실수
		System.out.println(10 / 3);
		System.out.println(10 / 3.0);
		System.out.println(10 % 3);


	}

}
