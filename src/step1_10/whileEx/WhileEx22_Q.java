package step1_10.whileEx;

public class WhileEx22_Q {

	public static void main(String[] args) {
		/*
		 * 예)
		 * ###
		 * ###
		 * ### 2.5.8.11
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
				System.out.print("@");
			}
			System.out.println();
		}
		
		/*
		 * 문제 2)
		 * ###
		 * ##
		 * #
		 */

		/*
		 * 문제 3)
		 * @##
		 * @@#
		 * @@@
		 */

		/*
		 * 문제 4)
		 *   #
		 *  ###
		 * #####
		 */
		
	

	}

}
