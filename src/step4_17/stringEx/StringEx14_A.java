package step4_17.stringEx;

import java.util.Scanner;

/*
 * # 문자열 속 숫자검사
 * 예) adklajsiod
 * 	     문자만 있다.
 * 예) 123123
 *    숫자만 있다.
 * 예) dasd12312asd
 *    문자와 숫자가 섞여있다.
 */


public class StringEx14_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		String text = scan.next();//1234
		char[] charNum = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

		int onlyNumber = 0;
		for(int i=0;i<text.length();i++) {
			for(int j=0;j<charNum.length;j++) {
				if(text.charAt(i) == charNum[j]) {
					onlyNumber += 1;
				}
			}
		}
		if(onlyNumber == text.length()) {
			System.out.println("숫자만 있다.");
		}else if(onlyNumber == 0){
			System.out.println("문자만 있다.");
		}else {
			System.out.println("문자와 숫자가 섞여있다.");
		}



	}

}
