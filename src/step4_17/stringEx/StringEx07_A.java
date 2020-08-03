package step4_17.stringEx;

import java.util.Arrays;

//# 문자열 1차원
public class StringEx07_A {

	public static void main(String[] args) {
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		String[] arrS = str.split("/");
		int total = 0;
		for(int i=0;i<arrS.length;i++) {
			total = total + Integer.parseInt(arrS[i]);
		}
		System.out.println(total);
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = "";
		for(int i=0; i<scores.length; i++) {
			text += String.valueOf(scores[i]) ;
			System.out.println(text);
			if(i != scores.length-1) {//맨 마지막에는 / 안붙힘
				text += "/";
			}
		}
		System.out.println(text);



	}

}
