package step7;

import java.util.Scanner;

class Ticket {
	boolean check;

	void showData() {
		if (check == true) {
			System.out.print("■ ");
		} else {
			System.out.print("□ ");
		}
	}
}

public class ClassArr04Ticket_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Ticket[] tickets = new Ticket[8];
		for (int i = 0; i < tickets.length; i++) {
			tickets[i] = new Ticket(); // 제일많이 실수.
		}

		while(true) {
			for(int i = 0; i< tickets.length; i++) {
				tickets[i].showData();
			}
			

			System.out.println("자리입력");
			int seat = scan.nextInt();
			tickets[seat].check = true;
			
		}


	}

}
