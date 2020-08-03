package step4_17.stringEx;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 타자연습 게임[1단계]
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

public class StringEx10_A {

	public static void main(String[] args) {
		String[] words = { "java", "mysql", "jsp", "spring" };
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		//셔플
		for(int i=0;i<100;i++) {
			int r = ran.nextInt(words.length);
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
		}
		System.out.println(Arrays.toString(words));
		
		//문제
		int j=0;
		while(true) {
			System.out.println("문제 :"+words[j]);
			System.out.println("입력 :");
			String ans = scan.next();
			if(words[j].equals(ans)) {
				j += 1;
			}else {
				System.out.println("땡 다시 풀어욜");
				
			}
			if(j == words.length) {
				System.out.println("종료");
				break;
			}
		}
	}

}
