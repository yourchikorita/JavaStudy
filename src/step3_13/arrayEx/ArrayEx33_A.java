package step3_13.arrayEx;

import java.util.Arrays;

public class ArrayEx33_A {

/*
 * # 정렬하기
 * 1. 인덱스 0번이 나머지를 검사한다.
 * 2. 제일 큰 값을 찾아 교환한다.
 * 3. 인덱스 1증가한다.
 * 4. [1~3]을 끝까지 반복한다.
 * 예)
 * 10, 50, 30, 40, 80, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 40, 30, 10, 7
 */


	public static void main(String[] args) {
		int[] score = {10, 50, 30, 40, 80, 7};
		
	
		System.out.println(Arrays.toString(score));
		
		for(int i=0;i<score.length;i++) {
			int max = score[i];//10
			int maxIdx = i;//0
			for(int j=i;j<score.length;j++) {
				if(max < score[j]) {//10<80
					max = score[j];//max=80
					maxIdx = j;//4
					
				}
			}
			int temp = score[i];//비교한 작은값
			score[i] = max;//작았떤 위치에다가 큰 값넘
			score[maxIdx] = temp;//큰위치에다가 작은값넘
		}
		
		System.out.println(Arrays.toString(score));

	}

}
