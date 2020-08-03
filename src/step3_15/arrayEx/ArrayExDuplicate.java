package step3_15.arrayEx;

import java.util.Arrays;

public class ArrayExDuplicate {

	public static void main(String[] args) {
		int test1[] = {1,2,3,2,1};		
		int test2[] = {1,3,4,4,2};
		int test3[] = {1,1,1,2,1};
		// 위 배열에서 중복안된숫자를 제거하시요 
		// 1) {1,2,1,2}
		// 2) {4,4}
		// 3) {1,1,1,1}
		int testDu[] = new int[5];
		
		//돌면서 겹치는게 없으면 다른 배열에 추가
		for(int i=0;i<test1.length;i++) {
			for(int j=0;j<5;j++) {
				if(test1[i] == test1[j] && i != j) {
					System.out.println("같다"+i+","+ j);
					testDu[i] = test1[j];
				}
			}
		}
		System.out.println(Arrays.toString(testDu));
		
		
		
	}

}
