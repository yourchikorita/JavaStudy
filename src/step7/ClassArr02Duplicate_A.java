package step7;

import java.util.Arrays;
import java.util.Random;

class RanNum{
	int num;
	
}
public class ClassArr02Duplicate_A {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		// 문제) RanNum 클래스를 활용해서 중복숫자금지 출력 
		//      num에 1~5사이숫자를 랜덤으로 저장한다. (조건 중복숫자금지)
		RanNum[] arr = new RanNum[5];
		
		
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=new RanNum();
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].num = ran.nextInt(5)+1;
			for (int j = 0; j < i; j++) {
				if(arr[i].num == arr[j].num) {
					i -=1;
				}
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i].num + " ");
		}


		
	}
}
