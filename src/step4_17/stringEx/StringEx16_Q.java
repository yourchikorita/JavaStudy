package step4_17.stringEx;

import java.util.Scanner;

/*
 * # 단어 검색
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

public class StringEx16_Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);

		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();

	}

}
