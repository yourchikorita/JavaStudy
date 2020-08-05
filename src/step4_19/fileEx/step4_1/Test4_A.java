package step4_19.fileEx.step4_1;

import java.util.Arrays;

public class Test4_A {

	public static void main(String[] args) {
		String [][] student = {{"aaa","신촌","1001"}, {"bbb","강남","1002" },
				{"ccc" ,"대치", "1003"} , {"ddd" , "강동","1004"}};
		String[][] score = {
				{"번호" ,"과목" , "점수"},
				{"1001" ,"국어","20"},
				{"1002" ,"국어","50"},
				{"1003" ,"국어","60"},
				{"1004" ,"국어","17"},
				{"1001" ,"수학","65"},
				{"1002" ,"수학","15"},
				{"1003" ,"수학","80"},
				{"1004" ,"수학","70"},
				{"1001" ,"영어","43"},
				{"1002" ,"영어","90"},
				{"1003" ,"영어","30"},
				{"1004" ,"영어","70"}
		};
		
		//학생 정보와 성적이 담긴 데이터 이다 
		//student ==> 1.id 2.주소 3.번호
		//score ==> 1.번호 2.국어 3.수학 4.영어 점수 이다 
		//문제1) 전체 성적이 1등인 학생 이름 출력 
		
		System.out.println("=============");
		
		
		int totalScore = 0;
		int totalScore1001 = 0;
		int totalScore1002 = 0;
		int totalScore1003 = 0; 
		int totalScore1004 = 0;
		//1.전체 성적 1등 구하기  
		int check = -1;
		int count = 0;
		int[] v = new int[4];
		for (int i = 0; i < student.length;i++) {
			for (int j = 0; j < score.length; j++) {
				if(score[j][0].equals(student[i][2])) {
					check = 1;
					totalScore += Integer.parseInt(score[j][2]);
					
				}
			}
			if(i == 0) {
				totalScore1001 = totalScore;
				v[i] = totalScore1001;
				totalScore = 0;
			}else if(i ==1) {
				totalScore1002 = totalScore;
				v[i] = totalScore1002;
				totalScore = 0;
			}else if(i ==2) {
				totalScore1003 = totalScore;
				v[i] = totalScore1003;
				totalScore = 0;
			}else if(i ==3) {
				totalScore1004 = totalScore;
				v[i] = totalScore1004;
				totalScore = 0;
			}
			
		}
		
		System.out.println("totalScore1001="+totalScore1001);
		System.out.println("totalScore1002="+totalScore1002);
		System.out.println("totalScore1003="+totalScore1003);
		System.out.println("totalScore1004="+totalScore1004);
		System.out.println(Arrays.toString(v));
		int max = 0;
		int maxIdx = 0;
		for (int i = 0; i < v.length; i++) {
			if(max < v[i]) {
				max = v[i];
				maxIdx = i;
				
			}
		}
		
		System.out.println("성적이 1등인 학생은 :"+student[maxIdx][0]+"째,"+v[maxIdx]+"점");
		
		
	}

}
