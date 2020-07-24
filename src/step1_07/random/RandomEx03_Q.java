package step1_07.random;

import java.util.Random;

/*
 * # 당첨복권[1단계] 30%의 당첨확률
 */

// 4:15 ~ 4:19 (4분)
public class RandomEx03_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		
		int ranNumber = ran.nextInt(10);//[0,1,2,3,4,5,6,7,8,9]
		
		if(ranNumber > 3) {
			System.out.println(ranNumber +"=당신의 넘버 꽝");
		}else {
			System.out.println(ranNumber +"=당신의 넘버 당첨");
		}
		
	}

}
