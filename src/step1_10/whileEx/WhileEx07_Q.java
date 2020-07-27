package step1_10.whileEx;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 */
//1:00 ~ 1: 7 (7분)

public class WhileEx07_Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = 100;
		Random ran = new Random();
		int randomNumber = ran.nextInt(99)+1;
		boolean run = true;
		while(run == true) {
			System.out.println("1~100숫자 입력해주세요  ");
			int number = scan.nextInt();
			if(number == randomNumber) {
				System.out.println("정답입니다! 게임 종료!");
				System.out.println("현재 점수는 : " + score);
				run = false;
			}else {
				score = score - 5;
				if(number > randomNumber) {
					System.out.println("Down!");
				}else if(number < randomNumber) {
					System.out.println("Up!");
				}
				System.out.println("현재 점수 :" + score);
			}
		}
		
	}

}
