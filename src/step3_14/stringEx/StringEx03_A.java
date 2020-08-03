package step3_14.stringEx;
/*
 * # 문자열[정렬]
 * 1. compareTo() 메서드
 * 2. 2개의 문자열을 비교해 int형 값을 반환하는 메서드
 * 3. A.compareTo(B)
 * 4. 결과
 * 		A와 B가 같으면						0
 *      A가 B보다 사전적으로 순서가 앞이면		음수
 *      A보다 B가 사전적으로 순서가 앞이면		양수
 *      
 */

import java.util.Arrays;

public class StringEx03_A {

	public static void main(String[] args) {
		String str1 = "가";
		String str2 = "나";
		String str3 = "가";

		int rs1 = str1.compareTo(str2);
		System.out.println(rs1); // 음수

		int rs2 = str2.compareTo(str1);
		System.out.println(rs2); // 양수

		int rs3 = str1.compareTo(str3);
		System.out.println(rs3); // 0

		// 문제 ) 사전 순으로 이름 정렬
		String[] names = { "홍길동", "김유신", "마동석", "자바킹", "서동요" };
		
		String temp ="";
		for(int i=0;i<names.length;i++) {
			String minName = names[i];
			int minInx = i;
			for(int j=i;j<names.length;j++) {
				//가장 작은 이름(앞에오는이름)을 찾으려면 앞에꺼 - 뒤에꺼의 결과가 -가 나와야함.
				if(minName.compareTo(names[j]) > 0) {//만약 앞에 숫자가 더 작으면
					minName = names[j];//앞에숫자를 min 에다가 넣
					minInx = j;//
				}
			}
			temp = names[i];
			names[i] = names[minInx];
			names[minInx] = temp;
			}
		
		
		
		System.out.println(Arrays.toString(names));
		

	}

}
