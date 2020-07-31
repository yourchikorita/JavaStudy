package step3_13.arrayEx;
//# 2차원배열 기본문제[3단계]


public class ArrayEx41_A {

	public static void main(String[] args) {
		int[][] arr = {
				{101, 102, 103, 104},//01.02.03.04
				{201, 202, 203, 204},
				{301, 302, 303, 304}
			}; 
		int[] garo = new int[3];
		int[] sero = new int[4];
		
		// 문제 1) 가로 합 출력
		// 정답 1) 410, 810, 1210
		int tot = 0;
		int tot1 = 0;
		int tot2 = 0;
		for(int i=0;i<4;i++) {
			if(i == 0) {
				for(int j=0;j<4;j++) {
					tot += arr[i][j];
				}
				System.out.println(tot);
			}
			if(i == 1) {
				for(int j=0;j<4;j++) {
					tot1 += arr[i][j];
				}
			}
			if(i == 2) {
				for(int j=0;j<4;j++) {
					tot2 += arr[i][j];
				}
			}
			
		}
		System.out.println(tot+","+tot1+","+tot2+",");
		// 문제 2) 세로 합 출력
		// 정답 2) 603, 606, 609, 612
			
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				sero[j] += arr[i][j];
			}
		}
		//찍어보기
		for(int i=0; i<4; i++) {
			System.out.print(sero[i] + " ");
		}




	}

}
