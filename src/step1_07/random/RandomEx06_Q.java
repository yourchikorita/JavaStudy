package step1_07.random;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가위(0)바위(1)보(2) 게임[2단계]
 * 1. com은 0~2 사이의 랜덤한 숫자를 저장한다.
 * 2. me는 0~2 사이의 숫자를 입력받는다.
 * 3. com과 me를 비교해,
 * 		1) 비겼다.
 * 		2) 내가 이겼다.
 * 		3) 내가 졌다.			를 출력한다.
 */

// 4:40 ~ 4: 44 (4분)
public class RandomEx06_Q {

	public static void main(String[] args) {
		Random ran = new Random();
		int com = ran.nextInt(3);
		System.out.println("0,1,2중 숫자 선택");
		Scanner scan = new Scanner(System.in);
		int me = scan.nextInt();
		
		if(com > me) {
			System.out.println("com 이 이겼다." + "com=" + (com));
		}
		if(com < me) {
			System.out.println("me가 이겼다." + "com=" + (com));
		}
		if(com == me) {
			System.out.println("비겼다");
		}
	}

}
