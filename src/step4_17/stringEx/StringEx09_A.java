package step4_17.stringEx;

//# 문자열 2차원
public class StringEx09_A {

	public static void main(String[] args) {
		// 문제) 이름과 성적을 하나의 문자열로 연결
		// 정답) "김철수/87,이만수/42,이영희/95"

		String[] name = { "김철수", "이만수", "이영희" };
		int[] score = { 87, 42, 95 };
		String[] temp = new String[3];
		String str = "";

		for(int i=0;i<score.length;i++) {
			temp[i] = String.valueOf(score[i]);//1. int를 str으로 변경
			str += name[i]+"/"+temp[i];
			
			if(i != score.length-1) {
				str += ",";
			}
		}
		
		System.out.println(str);
		
	}

}
