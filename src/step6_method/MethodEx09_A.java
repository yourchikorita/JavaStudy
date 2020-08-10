package step6_method;
import java.util.Random;

// # 학생성적관리 프로그램[2단계] : 클래스 + 메서드

class Student22{
	int hakbun;
	int score;
}

class Ex09{
	
	void test1(int[] x) {
		
		Random ran = new Random();
		
		for(int i=0; i<x.length; i++) {
			x[i] = ran.nextInt(100) + 1;
			System.out.print(x[i] + " ");
		}
		System.out.println();		
	};
	
	int test2(int[] x) {
		int tot = 0;
		for(int i=0; i<x.length; i++) {
			tot += x[i];
		}
		return tot; 
	}
	
	double test3(int[] x) {
		double avg = test2(x) / (double)x.length;
		return avg; 
	}
	
	int test4(int[] x) {
		int cnt = 0;
		for(int i=0; i<x.length; i++) {
			if(x[i] >= 60) {
				cnt += 1;
			}
		}
		return cnt; 
	}
	
	int test5(int[] x, int idx) {
		int score = 0;
		for(int i=0; i<x.length; i++) {
			if(i == idx) {
				score = x[i];
			}
		}
		return score; 
	}
	
	int test6(int[] x, int score) { 
		int idx = -1;
		for(int i=0; i<x.length; i++) {
			if(x[i] == score) {
				idx = i;
			}
		}
		return idx; 
	}
	
	int test7(int[] x, int[] y, int hakbun) {
		int score = -1;
		int idx = -1;
		for(int i=0; i<x.length; i++) {
			if(x[i] == hakbun) {
				idx = i;
			}
		}
		
		if(idx != -1) {
			score = y[idx];
		}
		
		return score; 
	}

	Student22 test8(int[] x, int[] y) {
		int maxScore = 0;
		int maxIdx = 0;
		for(int i=0; i<x.length; i++) {
			if(maxScore < y[i]) {
				maxScore = y[i];
				maxIdx = i;
			}
		}
		
		Student22 temp = new Student22();
		temp.hakbun = x[maxIdx];
		temp.score = y[maxIdx];
		
		return temp; 
	}
}

public class MethodEx09_A {
	public static void main(String[] args) {

		Ex09 e = new Ex09();
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = new int[5];

		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장 메서드
		// 예   1) 87, 11, 92, 14, 47
		e.test1(scores);
		
		// 문제2) 전교생의 총점 리턴 메서드
		// 예   2) 총점(251) 평균(50.2)
		int tot = e.test2(scores);
		System.out.println("tot = " + tot);
		
		// 문제3) 전교생의 평균 리턴 메서드
		// 예   3) 평균(50.2)
		double avg = e.test3(scores);
		System.out.println("avg = " + avg);
		
		// 문제4) 성적이 60점 이상이면 합격. 합격생 수 리턴 메서드
		// 예   4) 2명
		int cnt = e.test4(scores);
		System.out.println("cnt = " + cnt);

		// 문제5) 인덱스를 전달받아 성적 리턴 메서드
		// 정답5) 인덱스 입력 : 1	성적 : 11점
		int score = e.test5(scores, 1);
		System.out.println("score = " + score);
		
		// 문제6) 성적을 전달받아 인덱스 리턴 메서드
		//		  단, 없는 성적 입력 시 예외처리
		// 정답6) 성적 입력 : 11	인덱스 : 1
		int idx = e.test6(scores, 11);
		if(idx == -1) {
			System.out.println("해당 성적은 존재하지 않습니다.");
		}else {
			System.out.println("idx = " + idx);
		}
		
		// 문제7) 학번을 전달받아 성적 리턴 메서드
		// 		  단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당 학번은 존재하지 않습니다.
		score = e.test7(hakbuns, scores, 1000);
		if(score == -1) {
			System.out.println("해당 학번은 존재하지 않습니다.");
		}else {
			System.out.println("score = " + score);
		}
		
		// 문제8) 1등학생의 학번과 성적을 클래스 타입(Student 클래스)으로 리턴 메서드
		// 정답8) 1004번(98점)
		Student22 temp = e.test8(hakbuns, scores);
		System.out.println(temp.hakbun + "(" + temp.score + ")점");
		
	}
}
