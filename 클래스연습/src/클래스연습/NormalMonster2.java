package Ŭ��������;


public class NormalMonster2 extends Monster {

	int Hp_Chipmunk = 60;
	int Hp_Slime= 60;
	int Hp_Skeleton = 60;
	
	 NormalMonster2() {
		 this.MaxHp = 60;
			this.Hp_Chipmunk = 60;
			this.Hp_Slime= 60;
			this.Hp_Skeleton = 60;
			this.Power = 50;
			this.Depense = 0;
			this.Gold = 210;
	}

	
	public void Chipmunk() { // ���� ����
		String Name = "�ٶ���";
		System.out.println("=====================");
		System.out.println("�̸�        : "+Name);
		System.out.println("�ִ�ü��  : "+MaxHp);
		System.out.println("����ü��  : "+Hp_Chipmunk);
		System.out.println("���ݷ�     : "+Power);
		System.out.println("����     : "+Depense);
		System.out.println("���        : "+Gold);
		System.out.println("=====================");
	}
	
	public void Slime() { // ������ ����
		String Name = "������";
		System.out.println("=====================");
		System.out.println("�̸�        : "+Name);
		System.out.println("�ִ�ü��  : "+MaxHp);
		System.out.println("����ü��  : "+Hp_Slime);
		System.out.println("���ݷ�     : "+Power);
		System.out.println("����     : "+Depense);
		System.out.println("���        : "+Gold);
		System.out.println("=====================");
	}
	
	public void Skeleton() {
		String Name = "���̷���";
		System.out.println("=====================");
		System.out.println("�̸�        : "+Name);
		System.out.println("�ִ�ü��  : "+MaxHp);
		System.out.println("����ü��  : "+Hp_Skeleton);
		System.out.println("���ݷ�     : "+Power);
		System.out.println("����     : "+Depense);
		System.out.println("���        : "+Gold);
		System.out.println("=====================");
	}
	

	
	public void Attacked_Chipmunk(int sum) { //���� �޴� �Լ�
		//������ ���� ���������� ū ���
		if(Depense >= sum)
			Hp_Chipmunk=Hp_Chipmunk-0;
		else
			Hp_Chipmunk = Hp_Chipmunk+Depense-sum;
		
	}
	public void Attacked_Slime(int sum) { //���� �޴� �Լ�
			//������ ���� ���������� ū ���
		if(Depense >= sum)
			Hp_Slime=Hp_Slime-0;
		else
			Hp_Slime = Hp_Slime+Depense-sum;
		}
	public void Attacked_Skeleton(int sum) { //���� �޴� �Լ�
				//������ ���� ���������� ū ���
		if(Depense >= sum)
			Hp_Skeleton=Hp_Skeleton-0;
		else
			Hp_Skeleton = Hp_Skeleton+Depense-sum;	
		
	}
	
	
			
}
