package step4_19.fileEx.step4_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindWord_Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = 100;
		String word = "performance";
		String meaning = "공연";
		int size = word.length();
		int check[] = new int[size]; // 힌트 체크를 통해서 확인할수있다.

		while (true) {
			System.out.println("뜻 : " + meaning);
			System.out.print("문제 : ");
			for (int i = 0; i < size; i++) {
				System.out.print("*");

			}
			System.out.println();
			System.out.println("영어단어를 입력하세요 >>> ");
			String me = scan.next();
		}

	}

}
