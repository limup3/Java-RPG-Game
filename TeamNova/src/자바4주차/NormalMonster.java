package 자바4주차;

public class NormalMonster extends Monster {

	int MaxHp = 20;
	int Hp_Bat = 20;
	int Hp_Snail= 20;
	int Hp_Rabbit = 20;
	int Power = 10;
	int Denpense = 0;
	int Gold = 60;
	
	public void Bat() { // 박쥐 스탯
		String Name = "박쥐";
		System.out.println("=====================");
		System.out.println("이름        : "+Name);
		System.out.println("최대체력  : "+MaxHp);
		System.out.println("현재체력  : "+Hp_Bat);
		System.out.println("공격력     : "+Power);
		System.out.println("방어력     : "+Depense);
		System.out.println("골드        : "+Gold);
		System.out.println("=====================");
	}
	
	public void Snail() { // 달팽이 스탯
		String Name = "달팽이";
		System.out.println("=====================");
		System.out.println("이름        : "+Name);
		System.out.println("최대체력  : "+MaxHp);
		System.out.println("현재체력  : "+Hp_Snail);
		System.out.println("공격력     : "+Power);
		System.out.println("방어력     : "+Depense);
		System.out.println("골드        : "+Gold);
		System.out.println("=====================");
	}
	
	public void Rabbit() {
		String Name = "토끼";
		System.out.println("=====================");
		System.out.println("이름        : "+Name);
		System.out.println("최대체력  : "+MaxHp);
		System.out.println("현재체력  : "+Hp_Rabbit);
		System.out.println("공격력     : "+Power);
		System.out.println("방어력     : "+Depense);
		System.out.println("골드        : "+Gold);
		System.out.println("=====================");
	}
	
	public int Attack() { // 기본공격
		System.out.println("상대방의 체력이 "+Power+" 감소하였습니다.");
		return Power;
	}
	
	public void Attacked_Bat(int sum) { //공격 받는 함수
		//방어력이 받은 데미지보다 큰 경우
		if(Depense >= sum)
			Hp_Bat=Hp_Bat-0;
		else
			Hp_Bat = Hp_Bat+Depense-sum;
		
	}
		public void Attacked_Snail(int sum) { //공격 받는 함수
			//방어력이 받은 데미지보다 큰 경우
			if(Depense >= sum)
				Hp_Snail=Hp_Snail-0;
			else
				Hp_Snail = Hp_Snail+Depense-sum;
		}
			public void Attacked_Rabbit(int sum) { //공격 받는 함수
				//방어력이 받은 데미지보다 큰 경우
				if(Depense >= sum)
					Hp_Rabbit=Hp_Rabbit-0;
				else
					Hp_Rabbit = Hp_Rabbit+Depense-sum;	
		
	}
}
