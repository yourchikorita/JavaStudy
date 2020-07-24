package step1_06.ifEx;

import java.util.Scanner;

public class IfEx06_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("숫자1 입력 : ");
			int x = scan.nextInt();
			System.out.print("숫자2 입력 : ");
			int y = scan.nextInt();
			
			int answer = x * y;
			
			System.out.print("정답 입력 : ");
			int myAnswer = scan.nextInt();
			
			if(answer == myAnswer) {
				System.out.println("정답!");
			}
			if(answer != myAnswer) {
				System.out.println("땡!");
			}
			
		}


	}


