package step2_11.arrayEx;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 숫자이동[1단계]
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 */


public class ArrayEx14Move_A {

	public static void main(String[] args) {
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		System.out.println("현재 위치"+ Arrays.toString(game));
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.println("왼쪽 1  오른쪽 2");
			int select = scan.nextInt();
			int player = 0;
			
			if(select == 1 ) {
				for(int i=0; i<7; i++) {
					if(game[i] == 2) {
						game[i] = 0;
						game[i-1] = 2;
						
					}
				}
			}
			if(select == 2 ) {
				for(int i=0; i<6; i++) {
					if(game[i] == 2) {
						game[i] = 0;
						game[i+1] = 2;
						break;
					}
				}
			}
			
			System.out.println(Arrays.toString(game));
		}
		
		
		
		

	}

}
