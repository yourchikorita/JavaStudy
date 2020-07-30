package step2_11.arrayEx;

import java.util.Arrays;
import java.util.Scanner;

/*
 * [반복문 심화예제]
 * 
 * 1. -1이 나올 때까지 일련의 수를 입력받는다.
 * 2. 위 수 중 key 값이 몇 번째에 포함되어 있는가를 출력하는 프로그램을 작성하시오.
 * 3. 단, key가 여러개 포함되어 있을 경우 앞에 나타난 것의 위치를 출력하시오.
 * 4. key가 일련의 수 안에 없는 경우 "not found"를 출력하시오.
 * 
 * 예) 
 * result 값 입력 : 99
 * 
 * 입력 : 10
 * 입력 : 99
 * 입력 : 20
 * 입력 : 99
 * 입력 : 30
 * 입력 : 99
 * 입력 : 10 
 * 입력 : -1
 * 
 * 결과 : key값 99가 첫번재 나타난 것은 2번째 이다.
 */

// 경우의 수 ==> -1 ==> 키는 입력받은적없다.
// 경우의 수 ==> 99 , 77 , -1 ==> 키는 1번이다 
// 경우의 수 ==> 55, 99 , 99, 99, 99, 3 , -1 ==> 키는 2번이다

public class ArrayExTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int count = 0;
		int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int i = 0;
		int guguCnt = 0;
		boolean gu = false;// 99가 기존에 없다.
		while (run) {
			System.out.print("key값 입력 : ");
			int key = scan.nextInt();

			if (key == -1 && i == 0) {
				System.out.println("키를 입력 받은 적 없다.");

			} else if (key != -1 && key != 99) {
				arr[i] = key;

				i += 1;

			} else if (key == 99) {// 99 일때,99가 기존에 없을떄
				if (gu == true) {// 99가 기존에 이미 있었을때
					arr[i] = key;
					i += 1;

				} else {// 99가 기존에 없었을때,
					arr[i] = key;
					i += 1;
					count = i;
					gu = true;
				}

			}

			else if (key == -1) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] != 99) {
						guguCnt += 1;
					}
				}
				if (guguCnt == 10) {
					System.out.println("not found!");

				} else if (guguCnt != 10) {
					System.out.println("key = " + count + "번째");
				}
				run = false;
			}

		}

	}

}
