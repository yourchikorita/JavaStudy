package step1_07.random;

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

//4:01 ~ 4:08 (7분)
public class RandomEx02_Q {

	public static void main(String[] args) {
		Random ran = new Random();
		int coinPosition = ran.nextInt(2); 
		
		int front = 1;
		int back = 2;
		
		System.out.println("앞0, 뒤1 맞춰보세요");
		
		Scanner scan = new Scanner(System.in);
		int guess = scan.nextInt();
		
		if(guess == coinPosition) {
			System.out.println("정답입니다! 내가 예측한값"+guess+"실제"+coinPosition );	
		}else {
			System.out.println("땡");
		}
	}
}
