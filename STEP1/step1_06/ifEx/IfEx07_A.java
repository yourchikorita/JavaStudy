package step1_06.ifEx;

import java.util.Scanner;

public class IfEx07_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
		
		System.out.print("성적을 입력하세요(0~100) : ");
		int score = scan.nextInt();
		
		if(60 <= score && score <= 100) {
			System.out.println("합격");
		}
		
		/*
		 # if문 안의 if문
		 
		if(score >= 60) {
			if(score <= 100) {
				System.out.println("합격");
			}
		}
		*/
		
		if(0 <= score && score < 60) {
			System.out.println("불합격");
		}
		
		if(100 < score || score < 0) {
			System.out.println("성적을 잘못 입력했습니다.");
		}
		
	}


	}


