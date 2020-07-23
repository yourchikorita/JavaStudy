package step1_08.ifEx;

import java.util.Random;
import java.util.Scanner;

public class Ifex16_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int rNum = ran.nextInt(101) + 150;		// [0 ~ 100] + 150
		System.out.println("문제 = " + rNum);
		
		int answer = rNum % 100 / 10;
		
		System.out.print("가운데 숫자를 입력하세요 : ");
		int myAnswer = scan.nextInt();
		
		if(answer == myAnswer) {
			System.out.println("정답!");
		}else {
			System.out.println("오답!");
		}
		


	}

}
