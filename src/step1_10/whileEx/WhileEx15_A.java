package step1_10.whileEx;

import java.util.Random;

/*
 * # 랜덤학생
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 */

//1:54 ~ 2: 05(10분)
public class WhileEx15_A {

	public static void main(String[] args) {
		Random ran = new Random();
		int totalScore = 0;
		int averScore = 0;
		int bestScore = 0;
		int bestScoreStudentNumber = 0;
		int totalPassStudent = 0;
		
		int i = 0;
		while(i < 10) {
			int score = ran.nextInt(100)+1;
			if(bestScore <score) {
				bestScore = score;
				bestScoreStudentNumber = i;
			}
			if(score <= 60) {
				totalPassStudent += 1;
				totalScore += score;
				System.out.println("60점이하 i="+i+" / score="+score);
			}else {
				totalScore += score;
				System.out.println("60점이상 i="+i+" / score="+score+"합격!!");
			}
			i += 1;
		}
		System.out.println("전교생 총점"+totalScore);
		System.out.println("전교생 평균"+totalScore/10);
		System.out.println("1등 학생의 번호"+bestScoreStudentNumber+"점수"+bestScore);
	}

}
