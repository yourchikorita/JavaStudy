package step1_10.whileEx;
//# 반복문 기본문제[1단계]
//4:25 ~ 4:36 (11분)
public class WhileEx02_Q {

	public static void main(String[] args) {
		// 문제1) 1~10까지 반복해 5~9 출력
		// 정답1) 5, 6, 7, 8, 9
		int i = 1;
		while ( i < 10 ) {
			if(5 <= i && 10 > i) {
				System.out.println(i);
			}
			i = i + 1;
			
		}
		System.out.println("==========================");
		// 문제2) 10~1까지 반복해 6~3 거꾸로 출력
		// 정답2) 6, 5, 4, 3
		int j = 10;
		while (j > 1) {
			if(j < 7 && j > 2) {
				System.out.println(j);
			}
			j = j - 1;
		}
		
		// 문제3) 1~10까지 반복해 짝수만 출력
		// 정답3) 2, 4, 6, 8, 10
		System.out.println("==========================");		
		int k = 1;
		while(k < 11) {
			if(k % 2 ==0) {
				System.out.println(k);
			}
			k = k +1;
		}

	}

}
