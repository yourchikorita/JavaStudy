package step5_2.classEx;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 더하기 게임
 * 1. 1부터 10 사이의 랜덤한 값을 중복 없이 game 배열에 6개 저장한다.
 * 2. 0부터 5사이의 랜덤 값 3개를 중복 없이 선택해 그 수의 합을 출력한다. 
 * 3. 사용자는 중복없이 3개의 인덱스를 골라 그 합을 맞추는 게임이다.
 */

class Ex15{
	int[] game = new int[6];
	int[] idx = new int[3];
	int[] myIdx = new int[3];
	
	int total = 0;
}

public class ClassEx15Duplicate_A {
	public static void main(String[] args) {
		Ex15 e = new Ex15();
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		//중복없이 저장
		for (int i = 0; i < e.game.length; i++) {
			e.game[i] = ran.nextInt(10)+1;
			for (int j = 0; j < i; j++) {
				if(e.game[i] == e.game[j]) {
					i-=1;
				}
			}
		}
		
		System.out.println(Arrays.toString(e.game));
		
		//랜덤으로 0~5 까지 를  중복없이 3개의 배열에 저장
		int[] idxArr = new int[3];
		int total = 0;
		for (int i = 0; i < idxArr.length; i++) {
			idxArr[i] = ran.nextInt(6);
			for (int j = 0; j < i; j++) {
				if(idxArr[i] == idxArr[j]) {
					i-=1;
				}
			}
		}
		System.out.println("치트키 "+Arrays.toString(idxArr));
		
		//합
		for (int i = 0; i < idxArr.length; i++) {
			total += e.game[idxArr[i]];
		}	
		System.out.println("세 숫자의 합은 "+total+"입니다. 어떤 숫자들이였을까요? 인덱스 입력해주세요");
		int idx1 = scan.nextInt();
		int idx2 = scan.nextInt();
		int idx3 = scan.nextInt();
		
		if(e.game[idx1]+e.game[idx2]+e.game[idx3] == total) {
			System.out.println("정답입니다!");
		}else {
			System.out.println("틀렸다!");
		}
	}
}
