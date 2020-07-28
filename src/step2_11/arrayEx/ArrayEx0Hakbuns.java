package step2_11.arrayEx;

import java.util.Scanner;

public class ArrayEx0Hakbuns {

	public static void main(String[] args) {
		int arr[] = {1001, 20, 1002, 45, 1003, 54};
		// 학번과 점수가 한쌍이다 1001:20 , 1002:45  , 1003:54
		
		// 문제1) 학번을 입력하면 점수 출력 
		// 문제2) 점수를 입력하면 학번 출력 
		System.out.println("학번:");
		Scanner scan = new Scanner(System.in);
		int hakbun = scan.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == hakbun) {
			System.out.println(arr[i+1]);
			}
			}
		
		System.out.println("점수 : ");
		int scoreInput = scan.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == scoreInput) {
			System.out.println(arr[i-1]);
			}
			}
		
		int score[] = {1001, 20,43 , 1002 , 54,2 , 1003,76,6};
		// 학번과 국어 수학 점수이다 
		// 예) 1001 == (20 , 43)
		//    1002 == (54 , 2)
		//    1003 == (76 , 6)
		// 문제3)  점수의 합을 입력하면 번호 출력 
		// 예)  63 ==> 1001 
		// 예)  56 ==> 1002
		// 예)  82 ==> 1003
		System.out.println("점수 합 입력");
		int total = scan.nextInt();
		if(total == 63 ) {
			System.out.println("1001");
		}


	}

}
