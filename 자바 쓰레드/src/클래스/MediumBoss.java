package 클래스;


public class MediumBoss extends Monster {

	
	
	 MediumBoss() {
		 	this.MaxHp = 40;
			this.Hp = 40; 
			this.Power = 40;
			this.Depense = 10;
			this.Gold = 410 ;
	}
		

	public void Ogre() {
		String Name = "오우거";
		System.out.println("=====================");
		System.out.println("이름        : "+Name);
		System.out.println("최대체력  : "+MaxHp);
		System.out.println("현재체력  : "+Hp);
		System.out.println("공격력     : "+Power);
		System.out.println("방어력     : "+Depense);
		System.out.println("골드        : "+Gold);
		System.out.println("=====================");
	}
	

	
	public void Attacked_Ogre(int sum) { //공격 받는 함수
		//방어력이 받은 데미지보다 큰 경우
		if(Depense >= sum)
			Hp=Hp-0;
		else
			Hp = Hp+Depense-sum;
		
	}

	}

