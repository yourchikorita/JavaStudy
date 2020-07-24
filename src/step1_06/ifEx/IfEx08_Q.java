package step1_06.ifEx;

import java.util.Scanner;

/*
 * # 놀이기구 이용제한
 * 1. 키를 입력받는다.
 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
 *    예) 부모님과 함께 오셨나요?(yes:1, no:0)
 */


public class IfEx08_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("키 :");
		int tall = scan.nextInt();
		
		if(tall > 120) {
			System.out.println("놀이기구 이용가능");
		}
		if(tall < 120) {
			System.out.println("부모님이랑 같이 오셧나요? yes:1, no:0 :");
			int parent = scan.nextInt();
			
			if(parent == 1) {
				System.out.println("부모님이랑 같이와서 가능");
			}else {
				System.out.println("불가능");
			}
			
		}}
	}


