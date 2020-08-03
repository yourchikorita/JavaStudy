package step3_15.arrayEx;
//삼각형그리기
public class ArrayTestAd1 {

	public static void main(String[] args) {
		int k = 0;
		for(int i=1; i<10; i++) {
			for(int j=9; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=k; j++) {
				System.out.print(i);
			}
			System.out.println();
			k += 2;
		}


		
	}

}
