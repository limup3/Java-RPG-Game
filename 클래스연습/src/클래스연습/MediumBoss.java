package Ŭ��������;


public class MediumBoss extends Monster {

	
	
	 MediumBoss() {
		 	this.MaxHp = 40;
			this.Hp = 40; 
			this.Power = 40;
			this.Depense = 10;
			this.Gold = 260;
	}
		

	public void Ogre() {
		String Name = "�����";
		System.out.println("=====================");
		System.out.println("�̸�        : "+Name);
		System.out.println("�ִ�ü��  : "+MaxHp);
		System.out.println("����ü��  : "+Hp);
		System.out.println("���ݷ�     : "+Power);
		System.out.println("����     : "+Depense);
		System.out.println("���        : "+Gold);
		System.out.println("=====================");
	}
	

	
	public void Attacked_Ogre(int sum) { //���� �޴� �Լ�
		//������ ���� ���������� ū ���
		if(Depense >= sum)
			Hp=Hp-0;
		else
			Hp = Hp+Depense-sum;
		
	}

	}

