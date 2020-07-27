package step1_10.whileEx;

/*
 * # 369게임[2단계]
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 */

//20분
public class WhileEx12_A {

	public static void main(String[] args) {
		int i = 1;
		int clap = 0;
		
		while(i <= 50) {
			int y = i % 10; // 일의자리
			int x = i / 10; // 십의자리
			
			//일의자리가 (3,6,9,)면 짝,
			if(y == 3 || y == 6 || y == 9) { 
				clap += 1;
			}
			//십의자리가(3,6,9,)면 짝,
			if(x == 3 || x == 6 || x == 9) { 
				clap += 1;
			}
			
			if(clap == 1) {
				System.out.println("짝"+"("+i+")");
			}else if(clap ==2) {
				System.out.println("짝짝"+"("+i+")");
			}else if(clap ==0) {
				System.out.println(i);
			}
			
			
			i += 1;
			clap =0;
		}
	}

}
