package step3_15.arrayEx;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 2차원배열[삭제]
 * . 이름과 번호를 입력받아 삭제하기
 * 예)
 * 입력 : 철수	1
 * 삭제 : 김밥
 * 
 * 입력 : 철수 2
 * 삭제 : 바나나
 * 영희중에서 몇번째 영희를 지우겠다.
 */


public class ArrayEx47_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][] jang = {
			{"철수", "소고기"},
			{"철수", "김밥"},
			{"영희", "김치"},
			{"철수", "바나나"},
			{"철수", "새우깡"},
			{"영희", "오징어"},
			{"영희", "맛밤"}
		};
		
		//보기 출력
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
		
		System.out.print("[삭제]이름을 입력하세요 : ");
		String name = scan.next();//철수
		
		System.out.print("[삭제]번호를 입력하세요 : ");
		int idx = scan.nextInt();//3
		
		int delIdx = -1;
		
		int count = 0;
		for(int i=0; i<jang.length; i++) {
			if(name.equals(jang[i][0])) {//입력한 이름이 배열안에 있으면
				if(count == idx) {//count == 내가 번호 일치하면 3
					delIdx = i;//지워야하는 인덱스  찾앗음
				}
				count += 1;//내가 원하는 번째가 3이니까 3될때까지 +1을 해준다.
			}
		}
		
		System.out.println(delIdx+"=지워야하는 인덱스");
		
		String[][] temp = jang;
		jang = new String[temp.length - 1][2];
		
		int j = 0;
		for(int i=0; i<temp.length; i++) {
			if(i != delIdx) {
				jang[j] = temp[i];
				j += 1;
			}
		}
		
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}		



	}

}
