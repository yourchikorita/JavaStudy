package step3_13.arrayEx;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */

public class ArrayEx31_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		final int SIZE = 9;
		
		int[] front = new int[SIZE];
		int[] back  = new int[SIZE];

		for(int i=0; i<SIZE; i++) {
			front[i] = i + 1;//1~9
			back[i] = SIZE + (i+1);//10 18
		}
		
		
		
		//shuffle
		for(int i=0; i<1000; i++) {
			int r = ran. nextInt(SIZE);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			
			r = ran.nextInt(SIZE);
			temp = back[0];
			back[0] = back[r];
			back[r] = temp;
		}
		
		System.out.println(Arrays.toString(front));
		System.out.println(Arrays.toString(back));
		System.out.println("=========================");
		
		int num = 1;
		while(true) {
			
			int answer = 0;
			for(int i=0; i<SIZE; i++) {
				if(front[i] == num) {
					answer = i;
				}
			}
			System.out.println(num +"의 위치를 찾아라 "+ "[" + answer + "]");
			
			for(int i=0; i<SIZE; i++) {
				if(front[i] == 0) {
					System.out.print("\t");
				}else {
					System.out.print(front[i] + "\t");
				}
				if(i % 3 == 2) {
					System.out.println("\n");
				}
			}
			
			System.out.print("[" + num + "]의 인덱스 입력 : ");
			int idx = scan.nextInt();
			
			if(front[idx] == num) {
				if(1 <= num && num <= SIZE) {//가장 작은 숫자 없어지고 그자리에 10보다 큰숫자 나옴 
					front[idx] = back[idx];
				}else {
					front[idx] = 0;
				}
				
				num += 1;
			}
			
			if(num == 19) {
				break;
			}
		}


	}

}
