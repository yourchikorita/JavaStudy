package step1_03;

public class VarEx02_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��) ������ 1000���ִ�. 200��¥�� ���� ���� ��, �ܵ� ��� 
		int ���� = 1000;
		int ���� = 200;
		int �ܵ� = ���� - ����;
		System.out.println("�ܵ� = " + �ܵ� + "��");
		
		//����1) ������ 100���̴�. ������? (���� : ���� 10% ����)
		int ���� = 100;
		int �������� = ���� * 12;
		int ���� = �������� / 10;
		int ���Ŀ��� = �������� - ����;
		System.out.println("���Ŀ��� = " + ���Ŀ��� + "��");
		
		//����2) ���������� 30, 50, 4�� �� �޾Ҵ�. �����?
		int score1 = 30;
		int score2 = 50;
		int score3 = 4;
		int total = score1 + score2 + score3;
		double avg = total / 3.0;
		System.out.println("��� = " + avg + "��");
		
		//����3) ���ΰ� 3�̰� ���ΰ� 6�� �ﰢ�� ���� ���
		int width = 3;
		int height = 6;
		int triArea = width * height / 2;
		System.out.println("�ﰢ���� ���� = " + triArea);
		
		//����4) 100�ʸ� 1�� 40�ʷ� ���
		int time = 100;
		int minutes = time / 60;
		int seconds = time % 60;
		System.out.println(minutes + "�� " + seconds + "��");
		
		//����5) 800������ 500��¥�� ���� , 100��¥�� ����
		//����5) 500��(1��), 100��(3��)  
        int money = 800;
        int fivHund = money / 500;
        int oneHund = (money % 500) / 100;
        System.out.println("500���� ���� = " + fivHund);
        System.out.println("100���� ���� = " + oneHund);		
		


	}

}
