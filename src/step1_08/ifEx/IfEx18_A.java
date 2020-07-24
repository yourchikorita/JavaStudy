package step1_08.ifEx;

import java.util.Scanner;

/*
 * # 지하철 요금 계산 50 정거장 까지
 * 1. 이용할 정거장 수를 입력받는다.
 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
 * 3. 요금표
 * 1) 1~5	: 500원
 * 2) 6~10	: 600원
 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)
 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)
 * ... 
 */

public class IfEx18_A {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("이용할 정거장 수를 입력하세요 : ");
		int station = scan.nextInt();
		
		int fee = 0;
		if(1 <= station && station <= 5) {
			fee = 500;
		}else if(6 <= station && station <= 10) {
			fee = 600;
		}else {
			if(station % 2 == 1) {
				fee = 600; 
                int add = (station - 10) / 2 * 50;
                fee = fee + add + 50; // 홀수일때는 50원이 적게 계산된다.
			}else if(station % 2 == 0){
                fee = 600;
                int add = (station - 10) / 2 * 50;
                fee = fee + add;
            }
			
		}
		
		System.out.println("요금  = " + fee + "원");
		
	}
}
