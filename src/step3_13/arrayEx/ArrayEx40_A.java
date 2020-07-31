package step3_13.arrayEx;

import java.util.Scanner;

//# 2차원배열 기본문제[2단계]

public class ArrayEx40_A {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];

		int k = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println("  ");
		}

		System.out.println("===========================");
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예 1) 인덱스1 입력 : 1 인덱스2 입력 : 2
		// 값 출력 : 60
		Scanner scan = new Scanner(System.in);
		System.out.println("인덱스 1 입력");
		int index1 = scan.nextInt();
		System.out.println("인덱스 1 입력");
		int index2 = scan.nextInt();
		System.out.println(arr[index1][index2]);
		
		System.out.println("===========================");
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예 2) 값 입력 : 60
		// 인덱스1 출력 : 1 인덱스2 출력 : 2
		System.out.println("값 입력");
		int value = scan.nextInt();
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(arr[i][j]==value) {
					System.out.println("인덱스1 :" + i);
					System.out.println("인덱스2 :" + j);
				}
			}
		}
		System.out.println("===========================");
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		int max = 0;
		int maxI = 0;
		int maxJ = 0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
					maxI = i;
					maxJ = j;
				}
			}
		}
		System.out.println(maxI + "  " + maxJ);
		System.out.println("===========================");
		
		// 문제 4) 값 2개를 입력받아 값 교체
		System.out.print("값1 입력 : ");
		int data1 = scan.nextInt();
		System.out.print("값2 입력 : ");
		int data2 = scan.nextInt();
		
		int i	= 0;	int j	= 0;
		int i2	= 0;	int j2	= 0;
		int tempA = 0;	int tempB =0;
		int tempA2 =0;	int tempB2 =0;
		
		for(int a = 0;a<3;a++) {
			for(int b =0;b<3;b++) {
				if(data1 == arr[a][b]) {
					tempA = a;
					tempB = b;
				}
				if(data2 == arr[a][b]) {
					tempA2 = a;
					tempB2 = b;
				}
				
			}
		}
		int tempValue = 0;
		tempValue = arr[tempA][tempB];
		arr[tempA][tempB] = arr[tempA2][tempB2];
		arr[tempA2][tempB2] = tempValue;
		
		for(int ii=0; ii<3; ii++) {
			for(int jj=0; jj<3; jj++) {
				System.out.print(arr[ii][jj] + " ");
			}
			System.out.println();
		}



		


	}

}
