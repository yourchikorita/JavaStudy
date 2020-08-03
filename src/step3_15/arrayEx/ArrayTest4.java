package step3_15.arrayEx;

import java.util.Arrays;

public class ArrayTest4 {

	public static void main(String[] args) {
		// 문제 1) 아래 배열 a 와 b 를 비교해서 둘의 합이 짝수 일때만 c에 저장 ??
		int[] a = { 10, 20, 30, 40, 50 };
		int[] b = { 13, 54, 17, 42, 1 };
		int[] c = { 0,0,0,0,0};
		// 예) c[5] = {74,82,0,0,0}
		int jj = 0;
		for(int i=0;i<a.length;i++) {
			if((a[i]+b[i]) % 2 == 0) {
				c[jj] = a[i]+b[i];
				jj += 1;
			}
		}
		System.out.println(Arrays.toString(c));

		// 문제2) 아래는 시험결과 이다. 시험에 합격한사람의 번호만 win 에 저장 (60점이상합격)
		int[] num = { 1001, 1002, 1003 };
		int[] score = { 50, 83, 78 };
		int[] win = { 0,0,0 };
		// 예) win[3]= {1002, 1003, 0};
		int j=0;
		for(int i=0;i<score.length;i++) {
			if(score[i]>= 60) {
				win[j]=num[i];
				j+=1;
			}
		}
		System.out.println(Arrays.toString(win));
		
		// 문제3) 아래는 시험결과 이다 시험에 합격한 사람의 번호만 win2 에 저장 (60점이상 합격)
		int[] data = { 1001, 80 , 1002, 23, 1003 , 78 };
		int[] win2 = { 0,0,0 };
		// 예) win2[3] = {1001, 1003, 0};
		int j2=0;
		for(int i=0;i<data.length;i++) {
			if(i % 2 ==1) {
				if(data[i]>= 60) {
					win2[j2] = data[i-1];
					j2 +=1;
				}
			}
		}
		System.out.println(Arrays.toString(win2));
		
		

	}

}
