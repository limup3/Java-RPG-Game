package Ŭ����;


public class Life {

	
	//�ʵ�
		int MaxHp;  // �ִ�ü��
		int Hp; // ����ü��
		int Power; // ���ݷ�
		int Depense; // ����
		String Name; // �̸�
		int Gold; // ������ ���

		
	/*	public int Attack() {
			return Power; // ���ϰ��� �����ش�.
		}*/
		public int Attack() { // �⺻����
			System.out.println("");
			System.out.println(""+Power+"�� ���ظ� �������ϴ�.");
			System.out.println("");
			return Power;
		}
		
		public void Attacked(int sum) { //���� �޴� �Լ�
			//������ ���� ���������� ū ���
			if(Depense >= sum)
				Hp=Hp-0;
			else
				Hp = Hp+Depense-sum;
		}

}
