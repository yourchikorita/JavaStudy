package step2_11.arrayEx;

import java.util.Arrays;
import java.util.Random;

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


public class ArrayEx16_Q {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] check = new int[4];
		int[] arr = new int[4];
		System.out.println(ran.nextInt(4)+1);
		for(int i = 0; i < arr.length; i++) {
			int randomNumber = ran.nextInt(4);
			arr[i] = randomNumber;
			if(check[randomNumber] == 0) {
				check[randomNumber] = 1;
			}else if(check[randomNumber] != 0) {
				i = i -1;// -1을 하는 이유는 이미 배열에 겹치는 숫자가 있기떄문에 다시 뒤로돌아가서 랜덤으로 숫자를 찾기때문
			}
		}
		System.out.println("arr"+Arrays.toString(arr));
	}

}
