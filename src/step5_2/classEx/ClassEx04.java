package step5_2.classEx;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//# 학생성적관리 프로그램[2단계] : 클래스 + 변수
class Ex04{
	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
}

public class ClassEx04 {
	public static void main(String[] args) {
		
		Ex04 ex04 = new Ex04();
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		Random ran = new Random();
		
		for (int i = 0; i < ex04.scores.length; i++) {
			ex04.scores[i] = ran.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(ex04.scores));
	
	
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int total =0;
		int ave = 0;
		for (int i = 0; i < ex04.scores.length; i++) {
			total += ex04.scores[i];
		}
		ave = total / ex04.scores.length;
		System.out.println("총점 :"+ total);
		System.out.println("평균 :"+ ave);
		
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int passCount = 0;
		for (int i = 0; i < ex04.scores.length; i++) {
			if(ex04.scores[i] >= 60) {
				passCount += 1;
			}
		}
		System.out.println("합격자 수는"+passCount);
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		Scanner scan = new Scanner(System.in);
		System.out.println("인덱스 입력 : ");
		int idx = scan.nextInt();
		System.out.println(ex04.scores[idx]+"점");
		
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		System.out.println("성적을 입력:");
		int inputScore = scan.nextInt();
		int save = 0;
		for (int i = 0; i < ex04.scores.length; i++) {
			if(inputScore == ex04.scores[i]) {
				save = i;
			}
		}
		
		System.out.println(save+" 번 인덱스 입니다.");
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		System.out.println("학번 입력 : 1001, 1002, 1003, 1004, 1005");
		int hakb = scan.nextInt();
		int hakbunsIdx = 0;
		int cnt = 0;
		for (int i = 0; i < ex04.hakbuns.length; i++) {
			 if(hakb == ex04.hakbuns[i]) {
				hakbunsIdx = i;
				cnt += 1;
			}
		}
		if(cnt == 0) {
			System.out.println("해당학번은 존재하지 않습니다.");
		}else if(cnt != 0) {
			
			System.out.println("성적은 : "+ ex04.scores[hakbunsIdx]);
		}
		
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		
		int topHakbun= 0;
		int topScore = 0;
		for (int i = 0; i < ex04.hakbuns.length; i++) {
			if(topScore < ex04.scores[i]) {
				topScore = ex04.scores[i];
				topHakbun = i;
			}
		}
		System.out.println("1등 학생 성적 :"+topScore + "/ 학번"+topHakbun);
	}
}
