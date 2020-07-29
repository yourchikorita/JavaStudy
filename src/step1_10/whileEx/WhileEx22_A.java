package step1_10.whileEx;

public class WhileEx22_A {

	public static void main(String[] args) {
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		
		for(int i=0; i<9; i++) {
			System.out.print("#");
			if(i % 3 == 2) {
				System.out.println();
			}
		}
		
		System.out.println();
		
		
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
		for(int i=0; i<3; i++) {
			System.out.print("#");
			for(int j=0; j<i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		 * 문제 2)
		 * ###
		 * ##
		 * #
		 */
		for(int i=0; i<3; i++) {
			for(int j=3; j>i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();


		
		
		/*
		 * 문제 3)
		 * @##
		 * @@#
		 * @@@
		 */
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<=i; j++) {
				System.out.print("@");
			}
			for(int j=1; j>=i; j--) {
				System.out.print("#");
			}
			
			System.out.println();
		}
		
		System.out.println();
		/*
		 * 문제 4)
		 *   #
		 *  ###
		 * #####
		 */
		
		int k = 0;
		for(int i=0; i<3; i++) {
			for(int j=2; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=k; j++) {
				System.out.print("#");
			}
			System.out.println();
			k += 2;
		}
		


		

	

	}

}
