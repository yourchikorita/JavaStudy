package step1_05.input;

import java.util.Scanner;

public class InputEx02_Question {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ���� 1) ���� 2���� �Է¹޾�, �� ���
		System.out.println("���� 2�� �Է��϶�");
		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();
		System.out.println("�Է¹��� ���� " + firstNum + "+" + secondNum + "=" + (firstNum + secondNum));
		// ���� 2) ���� 1���� �Է¹޾�, Ȧ���̸� true ���
		System.out.println("�����Է��ض�, Ȧ���� true");
		int number = scan.nextInt();
		System.out.println(number % 2 == 1);
		// ���� 3) ������ �Է¹޾�, 60�� �̻��̰� 100�� �����̸� true ���

	}

}
