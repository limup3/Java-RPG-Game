package Ŭ����;


public class MediumBoss2 extends Monster {

	 MediumBoss2() {
			this.MaxHp = 130;
			this.Hp = 130; 
			this.Power = 80;
			this.Depense = 30;
			this.Gold = 810;
	}

	
	public void Envoy() {
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
	

	public void Attacked_Envoy(int sum) { //���� �޴� �Լ�
		//������ ���� ���������� ū ���
		if(Depense >= sum)
			Hp=Hp-0;
		else
			Hp = Hp+Depense-sum;
		
	}
	
}
