package step1_08.ifEx;

import java.util.Scanner;

/*
 * # 지하철 요금 계산
 * 1. 이용할 정거장 수를 입력받는다.
 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
 * 3. 요금표
 * 1) 1~5	: 500원
 * 2) 6~10	: 600원
 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)
 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)
 * 6) 17,18 : 800
 * ... 
 */
//3:18
public class IfEx18_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이용할  정거장 수를 입력해주세요");
		Scanner scan = new Scanner(System.in);
		int station = scan.nextInt();
		int fee = 0;
		if(1 < station && station < 6) {
			fee =500;
		}else if(5 < station && station <11) {
			fee = 600;
		}
	}

}
