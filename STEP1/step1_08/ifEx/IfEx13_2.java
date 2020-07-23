package step1_08.ifEx;

public class IfEx13_2 {
	public static void main(String[] args) {
		// if 옵션 (2종류)
		// 1) else  ==> if 의 조건이 거짓이면 무조건실행 
		// 2) else if ==> 
		int score = 80;
		if(score >= 60) {System.out.println("합격");}
		else {System.out.println("불합격");}
		//===========================================
		System.out.println("1.과자 2.음료수 3.라면");
		int select = 1;
		if(select == 1) { System.out.println("과자");}
		if(select == 2) { 
			System.out.println("음료수");
			}
		if(select == 3) {
			System.out.println("라면");
			}else {System.out.println("오류1");}
		//===========================================
		System.out.println("1.사과 2.포도 3.감");
		select = 1;
		if(select == 1) { 
			System.out.println("사과");
		}else if(select == 	2) { 
			System.out.println("포도");
		}else if(select == 3) {
			System.out.println("감");
		}else {
			System.out.println("오류2");
			}
	}
}
