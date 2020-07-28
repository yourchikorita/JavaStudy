package step1_10.whileEx;

import java.util.Random;
import java.util.Scanner;

/*
 * ==== 가위 바위 보 (하나빼기) ====

1) 가위바위보 2개씩 저장
meleft 에 가위바위보 입력
meright 에 가위바위보 입력

comleft 에 가위바위보 입력 (랜덤)
comright 에 가위바위보 입력 (랜덤)

2) 둘중 하나만 저장 
me 에 meleft 또는 meright 저장(집접)
com 에 comleft 또는 comright 저장(랜덤)

3) 최종판정
 
*/
public class RockPaperScissorsSub {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("왼손 가위(1) 바위(2) 보(3)  입력");
		int meLeft = scan.nextInt();
		
		System.out.println("오른손 가위(1) 바위(2) 보(3)  입력");
		int meRight = scan.nextInt();
		
		System.out.println("나의 선택: 왼손 ="+ meLeft + " /오른손="+ meRight);
		
		int comLeft = ran.nextInt(3)+1;
		int comRight = ran.nextInt(3)+1;
		System.out.println("컴퓨터의 선택 : 왼손" + comLeft +" /오른손" + comRight);
		int comSave = ran.nextInt(2)+1;
		System.out.println("컴퓨터 왼손1/오른손2 : "+comSave);
		System.out.println("왼손(1) 오른손(2) 중 저장할 손 선택 하세요");
		int meSave = scan.nextInt();
		
		//내 점수
		int score = 0;
		
		if(meSave == 1) {
			score = meLeft;
		}else if(meSave == 2) {
			score = meRight;
		}
		//컴퓨터 점수
		int comScore = 0;
		
		if(comSave == 1) {
			System.out.println("컴퓨터는 왼손 선택");
			comScore = comLeft;
		}else if(comSave ==2) {
			System.out.println("컴퓨터는 오른손 선택");
			comScore = comRight;
		}
		
		//점수비교
		if(comScore > score) {
			System.out.println("컴퓨터 승");
		}else if(comScore < score) {
			System.out.println("나 승");
		}else if(comScore == score) {
			System.out.println("비겼다");
		}
	}

}
