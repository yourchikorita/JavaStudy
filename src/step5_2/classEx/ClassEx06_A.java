package step5_2.classEx;

import java.util.Arrays;
import java.util.Random;

/*
 * # OMR카드 : 클래스 + 변수
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
class Ex06{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	
	int cnt = 0;						// 정답 맞춘 개수
	int score = 0;						// 성적
}


public class ClassEx06_A {

	public static void main(String[] args) {
		Random ran = new Random();
		Ex06 ex = new Ex06();
		String[] ox = new String[5];
		
		for (int i = 0; i < ex.hgd.length; i++) {
			ex.hgd[i] = ran.nextInt(5)+1;
		}
		
		int yes = 0;
		for (int i = 0; i < ex.hgd.length; i++) {
			if(ex.hgd[i] == ex.answer[i]) {
				ex.cnt += 1;
				ox[i] = "O";
				
			}
		}
		
		for (int i = 0; i < ox.length; i++) {
			if(ox[i] == null) {
				ox[i] = "X";
			}
		}
		System.out.println("학생답"+Arrays.toString(ex.hgd));
		System.out.println("정답   "+Arrays.toString(ex.answer));
		System.out.println(Arrays.toString(ox));
		
	}

}
