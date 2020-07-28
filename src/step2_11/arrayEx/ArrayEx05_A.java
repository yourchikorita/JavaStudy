package step2_11.arrayEx;

import java.util.Scanner;

/*
 * # 학생성적관리 프로그램[2단계] : 학생검색
 */


public class ArrayEx05_A {

	public static void main(String[] args) {
		// 인덱스            0   1   2   3   4
		int[] arr = {87, 11, 45, 98, 23};
		
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1	성적 : 11점
		for (int i = 0; i< arr.length; i++) {
			System.out.println(i+"번 성적:"+arr[i]);
		}
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11		인덱스 : 1
		Scanner scan = new Scanner(System.in);
		System.out.println("성적 조회 원하는 인덱스 입력하세요");
		int indexSelect = scan.nextInt();
		System.out.println(arr[indexSelect] +"점");
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		System.out.println("=====================");
		
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003	성적 : 45점
		System.out.println("학번을 입력해주세요");
		int id = scan.nextInt();
		int order = 0;
		for(int i = 0; i < hakbuns.length;i++) {
			if(hakbuns[i] == id) {
				order = i;
			}
		}
		System.out.println("점수는 : " + scores[order]);
		


	}

}
