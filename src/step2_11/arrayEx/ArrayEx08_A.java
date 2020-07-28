package step2_11.arrayEx;

import java.util.Arrays;
import java.util.Random;

/*
 * # OMR카드
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */


public class ArrayEx08_A {

	public static void main(String[] args) {
		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];

		Random ran = new Random();
		
		for(int i = 0; i < hgd.length; i++) {
			hgd[i] = ran.nextInt(5)+1;
		}
		System.out.println("정 답"+Arrays.toString(answer));
		System.out.println("내 답"+Arrays.toString(hgd));
		
		int score = 0;
		for(int i = 0; i < hgd.length; i++) {
			if(hgd[i] == answer[i]) {
				System.out.println("O");
				score += 1;
			}else {
				System.out.println("X");
			}
		}
		
		System.out.println(score * 20 + "점");
	}

}
