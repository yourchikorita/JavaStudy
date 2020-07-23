package step1_03;

public class VarEx02_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력 
				int 현금 = 1000;
				int 과자 = 200;
				int 잔돈 = 현금 - 과자;
				System.out.println("잔돈 = " + 잔돈 + "원");
				
				//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
				int 월급 = 100;
				System.out.println("연봉은=" + 월급 * 12 * 0.9);
				//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
				int 시험1 = 30;
				int 시험2 = 50;
				int 시험3 = 4;
				System.out.println((시험1 + 시험2 + 시험3)/3);
				//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
				int 가로 = 3;
				int 세로 = 6;
				System.out.println(가로 * 세로 / 2);
				//문제4) 100초를 1분 40초로 출력
				int 분 = 60;
				System.out.println(100/분 + "분" + 100%분 + "초");
				//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
				int money = 800;
				int fiveHund = money / 500;
				int OneHund = (money % 500) /100;
				System.out.println("500원 짜리 개수="+ fiveHund);
				System.out.println("100원 짜리 개수=" + OneHund);
				//정답5) 500원(1개), 100원(3개)  

	}

}
