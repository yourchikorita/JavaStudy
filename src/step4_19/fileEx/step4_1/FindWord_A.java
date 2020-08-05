package step4_19.fileEx.step4_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindWord_A {

	public static void main(String[] args) {

		//문제) 영어단어 맞추기  
		// 영어단어가 전부 * 로 표시된다. 
		// 영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 5점씩 감점)
		// (조건) 만약에 같은 철자가 여러개면 한번에 벗겨진다. 
		// 전부 벗겨지거나 맞추면 종료 
		Scanner scan = new Scanner(System.in);
		int score = 100;
		String word = "performance";
		String meaning = "공연";
		int size = word.length();
		int check[] = new int[size];  //11 힌트 체크를 통해서 확인할수있다.
		System.out.println(Arrays.toString(check));
		Random ran = new Random();
		while(true) {
			int c = 0;
			for(int i = 0; i < size; i++) { // 전부 벗겨진건지확인
				if(check[i] == 0) {
					c += 1;
					break;
				}
			}
			if(c == 0) {
				break;
			}
			System.out.println(Arrays.toString(check));
			System.out.println("뜻 : " + meaning);
			System.out.print("문제 : ");
			for(int i =0; i< size; i++) {
				if(check[i] == 1) {
					System.out.print(word.charAt(i)); // 벗겨진글자출력
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
			System.out.println("영어단어를 입력하세요 >>> ");
			String me = scan.next();
			
			if(me.equals(word) == false) {
				while (true) {
					int r = ran.nextInt(size);
					if(check[r] == 0) { // 랜덤으로 뽑은 글자가 0 이면 1로 변경
						check[r] = 1;
						for(int i = 0; i < size; i++) {
							if(word.charAt(i) == word.charAt(r)) { // 랜덤글자가 또있는지  찾기 
								check[i] = 1;
							}
						}
						break;
					}
				
				}
				
			}
			
		}
	


	}

}
