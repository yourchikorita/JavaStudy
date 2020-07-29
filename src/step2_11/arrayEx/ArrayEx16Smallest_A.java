package step2_11.arrayEx;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[1단계] : 1 to 4
 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
 * 2. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
 * 예)
 * 4 2 3 1
 * 입력 : 3
 * 4 2 3 9
 * 입력 : 1
 * 4 9 3 9
 * ...
 */


public class ArrayEx16Smallest_A {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int[] check = new int[4];
		int[] arr = new int[4];
		//최초 랜덤 배열 만들기
		for(int i = 0; i < arr.length; i++) {
			int randomNumber = ran.nextInt(4)+1;
			arr[i] = randomNumber;
			if(check[randomNumber-1] == 0) {//-1하는 이유는 check배열이 인덱스3까지인데 랜덤넘버는 4까지이기때문
				check[randomNumber-1] = 1;
			}else if(check[randomNumber-1] != 0) {
				i = i -1;// -1을 하는 이유는 이미 배열에 겹치는 숫자가 있기떄문에 다시 뒤로돌아가서 랜덤으로 숫자를 찾기때문
			}
		}
		System.out.println("arr : "+Arrays.toString(arr));
		//배열에서 가장 작은 값 찾기
		
		boolean run = true;
		int cnt = 0;
		while(run) {
			
			int smallestNumber = 9;
			int smallestIndx = 0;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] < smallestNumber) {
					smallestNumber = arr[i];
					smallestIndx = i;
				}
			}
			//System.out.println(smallestIndx);
			System.out.println("젤 작은 숫자 인덱스 입력 :");
			
			int userInput = scan.nextInt();
			
			
			if(smallestIndx == userInput) {
					arr[userInput] = 9;
					cnt = cnt + 1;
				}
			System.out.println(Arrays.toString(arr)+cnt);	
			
			if(cnt == 4) {
				System.out.println("end");
				run = false;
			}
			
			
		} 
		
		
	}

}
