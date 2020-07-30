package step3_13.arrayEx;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[2단계] : 1 to 9
 * 1. arr배열에 1~9 사이의 숫자를 저장한다.
 * 2. shuffle을 통해 숫자를 섞는다.
 * 3. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
 * 4. 정답을 맞추면 해당 값은 0으로 변경되어 모든 값이 0이되면 게임은 종료된다.
 */

public class ArrayEx25_A {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] arr = new int[9];
	
		//배열 값 입력 [1, 2, 3, 4, 5, 6, 7, 8, 9]
		for(int i=0; i<9; i++) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr)+"섞기전 배열");
		
		//shuffle
		//arr[0]째값이랑 랜덤째 값이랑 서로 바꿈 이걸 1000번
		for(int i=0; i<1000; i++) {
			int r = ran.nextInt(9);//5
			int temp = arr[0];//temp=1
			arr[0] = arr[r];// arr[0]값을 랜덤으로 하나 넣는다. arr[0]=6
			arr[r] = temp;//arr[6]=1
		}
		System.out.println(Arrays.toString(arr)+"섞은 후 배열");
		
		System.out.println("============================");
		int num = 1;
		while(true) {
			
			System.out.println("[" + num + "] 위치 찾아라");
			for(int i=0; i<9; i++) {
				System.out.print(arr[i] + "\t");
				if(i % 3 == 2) {
					System.out.println("\n");
				}
			}
			
			System.out.print("입력 : ");
			int idx = scan.nextInt();//인덱스를 받아서
			
			if(arr[idx] == num) {
				arr[idx] = 0;
				num += 1;
			}
			
			if(num == 10) {
				break;
			}
		}
		
	}
}
