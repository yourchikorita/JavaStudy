package step1_08.ifEx;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가운데 숫자 맞추기 게임
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249		: 4
 */

//5:21 ~ 5:30 (9분)
public class IfEx16_Q {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int num = ran.nextInt(101)+150;//[0,100]+150
		int answer = num % 100 / 10; //100으로 나눈 나머지를 10으로 나누면 가운데 숫자
		System.out.print("가운데 숫자를 입력하세요 : ");
		int myAnswer = scan.nextInt();
		
		if(myAnswer == answer) {
			System.out.println("정답! 숫자는" +num +"이였습니다.");
		}else {
			System.out.println("오답 ! 숫자는" +num +"이였습니다.");
		}
		


		
	}

}
