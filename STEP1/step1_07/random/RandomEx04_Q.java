package step1_07.random;

import java.util.Random;
import java.util.Scanner;

/*
 * # 홀짝 게임
 * 1. 1~100사이의 랜덤 숫자를 저장한다.
 * 2. 저장된 랜덤 숫자를 보여주고,
 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
 */
//4:22 ~ 4:29 (7분)
public class RandomEx04_Q {

	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt(100)+1;//[0~99]+1 해주면 [1~100]
		int result = 0;
		
		if(num % 2 == 0) {
			result = 2;
		}
		if(num % 2 == 1) {
			result = 1;
		}
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.홀수");
		System.out.println("2.짝수");

		System.out.print("번호를 선택하세요 : ");
		int choice = scan.nextInt();
		
		if(choice==result) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답"+"내가 선택한것:"+choice+"/정답은"+result);
		}
		
		
		
		


	}

}
