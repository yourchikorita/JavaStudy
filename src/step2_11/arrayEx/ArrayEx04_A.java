package step2_11.arrayEx;

import java.util.Random;

/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 *
*/

public class ArrayEx04_A {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Random ran = new Random();
		
		// 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		for(int i=0; i<arr.length;i++) {
			int number = ran.nextInt(100)+1;
			arr[i] = number;
			System.out.println(arr[i]);
		}
		System.out.println("======================");
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int sum = 0;
		for(int i=0; i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println("총점:"+sum);
		System.out.println("평균:"+sum/arr.length);
		System.out.println("======================");
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int passTotal = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 60) {
				passTotal += 1;
			}
		}
		System.out.println(passTotal+"명 합격");
	}

}

