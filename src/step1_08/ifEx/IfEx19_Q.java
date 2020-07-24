package step1_08.ifEx;

import java.util.Random;
import java.util.Scanner;

/*
 * # 연산자 기호 맞추기 게임
 * 랜덤으로 사칙연산을 집어넣고 사용자가 맞추기
 * 1. 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2. 1~4 사이의 랜덤 숫자 1개를 저장한다. 더하기,배기,곱,나머지
 * 3. 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
 * 4. 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 */

//3:56
public class IfEx19_Q {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int num1 = ran.nextInt(10)+1;
		int num2 = ran.nextInt(10)+1;
		int select = ran.nextInt(4)+1;
		int z = 0;
		
		if(select == 1) {
			z = num1 + num2;
		}else if(select == 2) {
			z = num1 - num2;
		}else if(select == 3) {
			z = num1 * num2;
		}else if(select == 4) {
			z = num1 % num2;
		}
		System.out.println(num1 + " ? " + num2 + " = " + z);
		System.out.println("1)+ 2)- 3)* 4)%");
		
		System.out.print("번호를 선택하세요 : ");
		int myAnwer = scan.nextInt();
		
		if(select == myAnwer) {
			System.out.println("정답!");
		}else {
			System.out.println("오답!");
		}



	}

}
