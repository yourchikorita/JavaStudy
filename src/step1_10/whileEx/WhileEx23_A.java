package step1_10.whileEx;

import java.util.Scanner;

/*
 * # 소수찾기[2단계]
 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
 * 예)
 * 입력 : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 *1) 해당 숫자를 1부터 자기자신까지 나눈다.
 * 2) 나머지가 0일 때마다 카운트를 센다.
 * 3) 그 카운트 값이 2이면 소수이다.


 */

public class WhileEx23_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = scan.nextInt();

		for (int i = 2; i <= num; i++) {//내가 입력한것보다 작을때까지
			int cnt = 0;
			for (int j = 1; j < num; j++) {
				if (i % j == 0) {
					cnt += 1;
				}
			}
			if (cnt == 2) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

	}

}
