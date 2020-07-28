package step2_11.arrayEx;

import java.util.Arrays;
import java.util.Random;

/*
 * # 중복숫자 금지[1단계]
 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
 * 2. 단, 중복되는 숫자는 없어야 한다.
 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
 * 
 * 예)
 * 랜덤숫자 : 1
 * check = {0, 1, 0, 0, 0}
 * arr   = {1, 0, 0, 0, 0}
 * 랜덤숫자 : 3
 * check = {0, 1, 0, 1, 0}
 * arr   = {1, 3, 0, 0, 0}
 * 랜덤숫자 : 2
 * check = {0, 1, 1, 1, 0}
 * arr   = {1, 3, 2, 0, 0}
 */
//3:27 ~ 3: 41 (15분)

public class ArrayEx11_A {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] check = new int[5];
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			int randomNumber = ran.nextInt(5);
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
