package 자바4주차;

public class MediumBoss extends Monster {

	
	int MaxHp = 60;
	int Hp = 60; 
	int Power = 20;
	int Denpense = 10;
	int Gold = 140;
	
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
	
	public int Attack() { // 기본공격
		System.out.println("상대방의 체력이 "+Power+" 감소하였습니다.");
		return Power;
	}
	
	public void Attacked_Ogre(int sum) { //공격 받는 함수
		//방어력이 받은 데미지보다 큰 경우
		if(Depense >= sum)
			Hp=Hp-0;
		else
			Hp = Hp+Depense-sum;
		
	}

	}

