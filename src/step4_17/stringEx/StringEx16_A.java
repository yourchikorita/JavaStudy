package step4_17.stringEx;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 단어 검색
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

public class StringEx16_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		char[] arr = new char[text.length()];
		System.out.println(text);

		for(int i=0;i<arr.length;i++) {
			arr[i] = text.charAt(i);
		}
		
		System.out.println("arr="+Arrays.toString(arr));
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();
		
		int check = 0;
		for(int j=0;j<word.length();j++) {
			for(int a=0;a<text.length();a++) {
				if(word.charAt(j) == arr[a]) {//같은게 있으면
					check += 1;
				}
				
			}
		}
		if(check >= 1) {
			System.out.println("True");
		}else {
			System.out.println("false");
		}
		
		
	}

}
