package �ڹ�4����;

public class FinalBoss {

	
	int MaxHp = 180;
	int Hp = 180; 
	int Power = 40;
	int Depense = 30;
	int Gold = 999;
	
	public void Dragon() {
		String Name = "�巡��";
		System.out.println("=====================");
		System.out.println("�̸�        : "+Name);
		System.out.println("�ִ�ü��  : "+MaxHp);
		System.out.println("����ü��  : "+Hp);
		System.out.println("���ݷ�     : "+Power);
		System.out.println("����     : "+Depense);
		System.out.println("���        : "+Gold);
		System.out.println("=====================");
	}
	
	public int Attack() { // �⺻����
		System.out.println("������ ü���� "+Power+" �����Ͽ����ϴ�.");
		return Power;
	}
	
	public void Attacked_Dragon(int sum) { //���� �޴� �Լ�
		//������ ���� ���������� ū ���
		if(Depense >= sum)
			Hp=Hp-0;
		else
			Hp = Hp+Depense-sum;
		
	}
}
