package step1_04.op;

public class OpEx08_Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��) 3�� ����̸鼭, ¦���̸� true ���
		int num = 12;
		System.out.println(num % 3 == 0 && num % 2 == 0);
		
		// ���� 1) ����
		// 3������ ����� 60�� �̻��̸�, true
		// ��, ��� �� �����̶� 50�� �̸��̸�, false
		int kor = 100;
		int eng = 87;
		int math = 41;
		int average = (kor + eng + math) / 3;
		
		System.out.println(average >= 60 && kor >49 && eng > 49 && math > 49);

		// ���� 2) Ű�� 200cm�̻��̰ų� �����԰� 200kg �̻��̸�, ����(true)
		int height1 = 199;
		int weight1 = 199;

		int height2 = 200;
		int weight2 = 68;
		System.out.println(height1 >= 200 || weight1 >= 200);
		System.out.println(height2 >= 200 || weight2 >= 200);
				
	}

}
