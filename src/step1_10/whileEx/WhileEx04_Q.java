package step1_10.whileEx;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 * 3 X 5 = ?
 */

//4:54 ~ 5:3 (9분)
public class WhileEx04_Q {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		//구구단 5번
		int i = 1;
		int score = 0;
		while(i <= 5) {
			
			int num1 = ran.nextInt(9)+1;
			int num2 = ran.nextInt(9)+1;
			
			System.out.println(num1 + "X" + num2 + "=");
			
			int answer = scan.nextInt();
			
			if(answer == (num1*num2)) {
				score = score + 20;
			}
			
			i = i + 1;
		}
		System.out.println("your score = " + score);
	}

}
