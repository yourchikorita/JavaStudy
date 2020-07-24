package step1_10.whileEx;
//# 반복문 기본문제[2단계]


public class WhileEx03_Q {

	public static void main(String[] args) {
		// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		int i = 1;
		int sum = 0;
		while(i < 6) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println("1번문제 =======================");
		System.out.println(sum);
		System.out.println("2번 문제 =======================");
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		int j = 1;
		while(j < 11) {
			if(j < 3 || j >= 7) {
				System.out.println(j);
			}
			j = j + 1;
		}
		System.out.println("3번문제 =======================");
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		int j2 = 1;
		int sum2 = 0;
		while(j2 < 11) {
			if(j2 < 3 || j2 >= 7) {
				sum2 = sum2 + j2;
			}
			j2 = j2 + 1;
			
		}
		System.out.println(sum2);
		System.out.println("4번문제 =======================");
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6
		j = 1;
		i = 0;
		while(j < 11) {
			if(j < 3 || j >= 7) {
				i = i + 1;
			}
			j=j+1;
		}
		System.out.println(i);

	}

}
