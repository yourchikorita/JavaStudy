package step4_19.fileEx.step4_1;

import java.util.Random;
import java.util.Scanner;

public class FindWord_Q {

	public static void main(String[] args) {
		//문제) 영어단어 맞추기  
				// 영어단어가 전부 * 로 표시된다. 
				// 영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 5점씩 감점)
				// (조건) 만약에 같은 철자가 여러개면 한번에 벗겨진다. 
				// 전부 벗겨지거나 맞추면 종료 
				Scanner scan = new Scanner(System.in);
				Random ran = new Random();
				int score = 100;
				String word = "performance";
				String meaning = "공연";
				int size = word.length();
				int check[] = new int[size];  // 힌트 체크를 통해서 확인할수있다.
				int incorrect = 0;
				
				while(true) {
					System.out.println("뜻 : " + meaning);
					System.out.print("문제 : ");
					
					if(incorrect == 0) {
						for(int i =0; i< size; i++) {
							System.out.print("*");
							
						}
					}else if(incorrect !=0) {
						int r = ran.nextInt(size);
						for (int i = 0; i < size; i++) {
							if(i != r) {
								System.out.print("*");
							}else {
								System.out.print(word.charAt(r));
							}
						}
						System.out.println("   ");
						System.out.println("틀렷엇고만");
					}
					
					
					System.out.println();
					System.out.println("영어단어를 입력하세요 >>> ");
					String me = scan.next();
					
					if(me.equals(word)) {
						System.out.println("정답!");
						break;
					}else if(me != word) {
						incorrect += 1;
						System.out.println("오답!");
					}
				}



	}

}
