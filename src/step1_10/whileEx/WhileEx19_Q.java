package step1_10.whileEx;

/*
 * # 반복문 for
 * 1. 반복문의 조건 3가지
 * 1) 초기식
 * 2) 조건식
 * 3) 증감식
 * 2. for문의 구조
 * for(초기식;조건식;증감식){
 * 		조건식이 참일 동안 실행할 문장;
 * }
 * 3. for문의 실행순서
 * 초기식 → 조건식 → 실행문 → 증감식 → 조건식 → 실행문 → 증감식 ...
 */


public class WhileEx19_Q {

	public static void main(String[] args) {
		// 1~5까지 출력
				int x = 1;
				while (x <= 5) {
					System.out.println(x);
					x = x + 1;
				}

				System.out.println();

				for (int y = 1; y <= 5; y++) {
					System.out.println(y);
				}

				// 문제 1) 1부터 5까지 출력
				// 정답 1) 1, 2, 3, 4, 5

				// 문제 2) 1부터 10까지 반복해, 5~9까지 출력
				// 정답 2) 5, 6, 7, 8, 9

				// 문제 3) 1부터 10까지 반복해 6~3까지 출력
				// 정답 3) 6, 5, 4, 3

				// 문제 4) 1부터 10까지 반복해 3미만 7이상 출력
				// 정답 4) 1, 2, 7, 8, 9, 10


	}

}
