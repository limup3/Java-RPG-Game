package Ŭ����;


public class FinalBoss extends Monster {


	FinalBoss() {
		this.MaxHp = 250;
		this.Hp = 250; 
		this.Power = 150;
		this.Depense = 60;
		this.Gold = 999;
	}
	
	
	public void Devil() {
		String Name = "����";
		System.out.println("=====================");
		System.out.println("�̸�        : "+Name);
		System.out.println("�ִ�ü��  : "+MaxHp);
		System.out.println("����ü��  : "+Hp);
		System.out.println("���ݷ�     : "+Power);
		System.out.println("����     : "+Depense);
		System.out.println("���        : "+Gold);
		System.out.println("=====================");
	}
	

	
	public void Attacked_Devil(int sum) { //���� �޴� �Լ�
		//������ ���� ���������� ū ���
		if(Depense >= sum)
			Hp=Hp-0;
		else
			Hp = Hp+Depense-sum;
		
	}
}
