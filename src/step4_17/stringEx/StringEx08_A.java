package step4_17.stringEx;

import java.util.Arrays;

public class StringEx08_A {

	public static void main(String[] args) {
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력

		String str = "김철수/87,이만수/42,이영희/95";

		String[] name = new String[3];
		int[] score = new int[3];

		String[] temp1 = str.split(",");
		System.out.println(Arrays.toString(temp1));
		
		for(int i=0;i<temp1.length;i++) {
			name[i] = temp1[i].split("/")[0];
			score[i] = Integer.parseInt(temp1[i].split("/")[1]);
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
	}

}
