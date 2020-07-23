package step1_08.ifEx;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가위바위보 게임[2단계]를
 *   if - else if 구문으로 변경해보자.
 */
/*
 * # 가위(0)바위(1)보(2) 게임[2단계]
 * 1. com은 0~2 사이의 랜덤한 숫자를 저장한다.
 * 2. me는 0~2 사이의 숫자를 입력받는다.
 * 3. com과 me를 비교해,
 * 		1) 비겼다.
 * 		2) 내가 이겼다.
 * 		3) 내가 졌다.			를 출력한다.
 */
//4:58 ~ 5:00 (2분)
public class IfEx14_Q {

	public static void main(String[] args) {
		Random ran = new Random();
		int com = ran.nextInt(3);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력해주세요! 가위(0)바위(1)보(2)");
		int me = scan.nextInt();
		
		if(com > me) {
			System.out.println("com이 이겼다.");
		}else if(com < me) {
			System.out.println("me 이 이겼다.");
		}else {
			System.out.println("비겼다");
		}
	}

}
