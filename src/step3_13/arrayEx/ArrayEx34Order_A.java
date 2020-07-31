package step3_13.arrayEx;

import java.util.Arrays;

/*
 * # 석차 출력
 * . 성적 순으로 이름 출력
 */


public class ArrayEx34Order_A {

	public static void main(String[] args) {
		String[] name = {"홍길동", "김영", "자바킹", "민병철", "메가맨"};
		int[] score   = {    87,    42,    100,     11,     98};
		
		for(int i=0;i<name.length;i++) {
			int max = score[i];//첫번재 값이 젤 크다고 놓고 비교
			int maxIdx = i;
			for(int j=i;j<score.length;j++) {
				if(max < score[j]) {
					max = score[j];
					maxIdx = j;
				}
			}
			
			//성적 정렬
			int temp = score[i];//작았던 값 임시 저장
			score[i] = max;//작았던 위치에 큰값 넣기
			score[maxIdx] = temp;//컸던 위치에 임시저장해둔거 넣기
			
			//이름 정렬
			String tempName = name[i];
			name[i] = name[maxIdx];
			name[maxIdx] = tempName;
			
			
			
		}
		System.out.println(Arrays.toString(score));//score 정렬 완료
		System.out.println(Arrays.toString(name));


	}

}
