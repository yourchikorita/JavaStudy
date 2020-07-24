package step1_06.ifEx;

import java.util.Scanner;

public class IfEx02_A {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int com = 8;
		
		System.out.print("숫자 입력 : ");
		int me = scan.nextInt();
		
		if(me < com) { System.out.println("Up!"); }
		if(me > com) { System.out.println("Down!"); }
		if(me == com) { System.out.println("Bingo!"); }
		
	}


}
