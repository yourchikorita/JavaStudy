package step2_11.arrayEx;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */


public class ArrayEx12_A {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		System.out.println("처음 :" +Arrays.toString(arr));
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}
		Scanner scan = new Scanner(System.in);
		System.out.println("====문제 1======");
		System.out.println("인덱스 입력1:");
		System.out.println("인덱스 입력2:");
		int index1 = scan.nextInt();
		int index2 = scan.nextInt();
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		System.out.println(Arrays.toString(arr));
		
		System.out.println("====문제 2======");
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 40
		//        값2 입력 : 20
		//		  {10, 20, 30, 40, 50}
		System.out.println(">>>문제2");
		System.out.print("값1 입력 : ");
		int data1 = scan.nextInt();
		System.out.print("값2 입력 : ");
		int data2 = scan.nextInt();
		
		int idx1 = 0;
		int idx2 = 0;
		
		for(int i=0; i<5; i++) {
			if(arr[i] == data1) {
				idx1 = i;
			}
			if(arr[i] == data2) {
				idx2 = i;
			}
		}
		temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("====문제 3======");
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		
		//입력한 학번의 인덱스 주소
		int loc1 = 0;//0
		int loc2 = 0;//1
		int scoresValue1 = 0;//87
		int scoresValue2 = 0;
		
		System.out.println("학번을 입력하세요1");
		int hakbun1 = scan.nextInt();
		System.out.println("학번을 입력하세요2");
		int hakbun2 = scan.nextInt();
		
		for (int i = 0; i < hakbuns.length; i++) {
			if(hakbun1 == hakbuns[i]) {
				loc1 = i;//입력한 학번이 있는 인덱스주소
				scoresValue1 = scores[i];
				
			}
			if(hakbun2 == hakbuns[i]) {
				loc2 = i;//입력한 학번이 있는 인덱스주소
				scoresValue2 = scores[i];
				
			}
			
		}
		scores[loc1] = scoresValue2;
		scores[loc2] = scoresValue1;
		
		System.out.println(Arrays.toString(scores));
	}

}
