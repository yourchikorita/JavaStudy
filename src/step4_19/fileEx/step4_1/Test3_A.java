package step4_19.fileEx.step4_1;

import java.util.Arrays;

public class Test3_A {

	public static void main(String[] args) {
		String [][] student = {
				{"aaa","신촌","1001"}, 
				{"bbb","강남","1002"},
				{"ccc","대치","1003"}, 
				{"ddd","강동","1004"}
				};
		String[][] score = {
				{"1001" ,"100" ,"20" , "30"},
				{"1002" ,"10" ,"60" , "60"},
				{"1003" ,"23" ,"63" , "31"},
				{"1004" ,"45" ,"30" , "35"},
				};
		


		
		//학생 정보와 성적이 담긴 데이터 이다 
		//student ==> 1.id 2.주소 3.번호
		//score ==> 1.번호 2.국어 3.수학 4.영어 점수 이다 
		//문제1) 전체 성적이 1등인 학생 이름 출력 
		
		//1. 세 과목 점수의 합 을 가지는 배열을 생성
			int[] total = new int[student.length];
			for (int i = 0; i < total.length; i++) {
				for (int j = 0; j < total.length; j++) {
					total[i] = Integer.parseInt(score[i][1])+Integer.parseInt(score[i][2])+Integer.parseInt(score[i][3]);
				}
			}
			System.out.println(Arrays.toString(total));
			
		//2. 가장 큰 합의 인덱스번호를 구함
			int max = 0;
			int maxIdx = -1;
			for (int i = 0; i < total.length; i++) {
				if(total[i] >= max) {
					max = total[i];
					maxIdx = i;
				}
			}
			System.out.println(maxIdx);
			System.out.println("젤 1등 :"+ student[maxIdx][0]);
	}

}
