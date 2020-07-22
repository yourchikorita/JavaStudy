package step1_04.op;

public class OpEx06_Answer {
	public static void main(String[] args) {

		//예) 점수가 60점 이상이면 true 출력
        int score = 30;
        System.out.println(score >= 60);
        
        //문제1) 3의 배수이면 true 출력
        //힌트1) 숫자 % 3 == 0 (3의 배수)
        int num = 15;
        System.out.println(num % 3 == 0);
        
        //문제2) 짝수이면 true 출력
        //힌트2) 숫자 % 2 == 0 (짝수)
        //힌트2) 숫자 % 2 == 1 (홀수)
        num = 22;
        System.out.println(num % 2 == 0);
        
        //문제3)아래돈중 1000원짜리 이상화폐를 제외한
               // 1000원짜리가 3장 이상이면 true 출력
        int money = 178600;
        System.out.println((money % 5000 / 1000) >= 3);
        
	}


}
