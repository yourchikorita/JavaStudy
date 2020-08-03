package step4_17.stringEx;
/*
 * # 타자연습 게임[2단계]
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 3. 단 문제를 출제할 때, 단어의 랜덤한 위치 한 곳만 *로 출력
 * 예)
 * 문제 : mys*l
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : *sp
 * 입력 : jsp
 * ...
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StringEx12_A {

	public static void main(String[] args) {
		String[] words = {"java", "mysql", "jsp", "spring"};
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		//셔플
		for(int i=0;i<words.length;i++) {
			String temp = words[0];
			int r = ran.nextInt(words.length);
			words[0] = words[r];
			words[r] = temp;
		}
		
		System.out.println(Arrays.toString(words));
		
		int i = 0;
		while(i < words.length) {
			int size = words[i].length();//단어별 길이
			int r = ran.nextInt(size);//단어중 한개의 인덱스 번호


			for(int j=0; j<size; j++) {
				if(j == r) {//랜덤 인덱스는 *로 한다.
					System.out.print("*");
				}else {
					System.out.print(words[i].charAt(j));//나머지는 그대로 나온다.
				}
			}
			System.out.println("입력 : ");
			String user = scan.next();
			if(user.equals(words[i])) {
				i += 1;
			}


			
		}


	}

}
