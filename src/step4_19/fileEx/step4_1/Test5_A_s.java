package step4_19.fileEx.step4_1;

import java.util.Arrays;

public class Test5_A_s {

	public static void main(String[] args) {
		int [] arr = {1,1,3,3,3,100,2,2,3,1,3};
/**
 * 위 배열에서 똑같은 숫자의 개수가 가장 적은 숫자와 가장 많은 숫자 의  개수를  출력 
		예) 개수가 가장적은숫자 ==> 100
		예) 개수가 가장많은숫자 ==> 3


		가장 많은 갯수 출력 : 3 ===> 5개 
		가장 적은 갯수 출력 : 100 ===> 1개
 */
		
		//1.a2 배열 생성
		int[] arr2 = new int[arr.length];
		int count = 0;
		//2.a2배열에 a배열에서 중복되는 값들 넣음/arr2에 arr첫번째 값넣고, 
		for (int i = 0; i < arr.length; i++) {
			int check = 0;
			for (int j = 0; j < count; j++) {
				if(arr[i] == arr2[j]) {
					check = 1;
				}
			}
			if(check ==0) {
				arr2[count] = arr[i];
				count += 1;
			}
		}
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(count +"=count");
		//3.a3배열 생성
		int[][] arr3 = new int[count][2];
		int finalCount = 0;
		//4.a3배열에 a2배열 값들 넣으면서
		for (int i = 0; i < arr3.length; i++) {
			arr3[i][0] = arr2[i];
			
			for (int j = 0; j < arr.length; j++) {
				if(arr3[i][0] == arr[j]) {
					
					arr3[i][1] +=1 ;
				}
				
			}
			
		}
		
		for(int i= 0; i < arr3.length; i++) {
			System.out.println(arr3[i][0] + " : " + arr3[i][1]);
		}




		

	}

}
