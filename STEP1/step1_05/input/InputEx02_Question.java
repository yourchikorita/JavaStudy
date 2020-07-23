package step1_05.input;

import java.util.Scanner;

public class InputEx02_Question {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 문제 1) 숫자 2개를 입력받아, 합 출력
		System.out.println("숫자 2개 입력하라");
		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();
		System.out.println("입력받은 숫자 " + firstNum + "+" + secondNum + "=" + (firstNum + secondNum));
		// 문제 2) 숫자 1개를 입력받아, 홀수이면 true 출력
		System.out.println("숫자입력해라, 홀수면 true");
		int number = scan.nextInt();
		System.out.println(number % 2 == 1);
		// 문제 3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력

	}

}
