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
				System.out.println("������=" + ���� * 12 * 0.9);
				//����2) ���������� 30, 50, 4�� �� �޾Ҵ�. �����?
				int ����1 = 30;
				int ����2 = 50;
				int ����3 = 4;
				System.out.println((����1 + ����2 + ����3)/3);
				//����3) ���ΰ� 3�̰� ���ΰ� 6�� �ﰢ�� ���� ���
				int ���� = 3;
				int ���� = 6;
				System.out.println(���� * ���� / 2);
				//����4) 100�ʸ� 1�� 40�ʷ� ���
				int �� = 60;
				System.out.println(100/�� + "��" + 100%�� + "��");
				//����5) 800������ 500��¥�� ���� , 100��¥�� ����
				int money = 800;
				int fiveHund = money / 500;
				int OneHund = (money % 500) /100;
				System.out.println("500�� ¥�� ����="+ fiveHund);
				System.out.println("100�� ¥�� ����=" + OneHund);
				//����5) 500��(1��), 100��(3��)  

	}

}
