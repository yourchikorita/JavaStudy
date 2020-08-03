package step4_17.stringEx;
/*
 * # 끝말잇기 게임
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * ...
 */

import java.util.Scanner;

public class StringEx11_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String start = "자전거";
		System.out.println("제시어 : " + start);
		
		while(true) {
			System.out.println("입력 : ");
			String user = scan.next();
			
			if(start.charAt(start.length()-1) == user.charAt(0)) {//첫글자랑 마지막 글자랑 일치하면
				start = user;
			}else {
				System.out.println("땡");
				break;
			}
		}

	}

}
