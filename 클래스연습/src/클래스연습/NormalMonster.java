package 클래스연습;


public class NormalMonster extends Life {


	int Hp_Bat; // 박쥐 체력
	int Hp_Snail; // 달팽이 체력
	int Hp_Rabbit; // 토끼 체력
	

	
	NormalMonster() {
		this.MaxHp = 20;
		this.Hp_Bat = 20;
		this.Hp_Snail= 20;
		this.Hp_Rabbit = 20;
		this.Power = 20;
		this.Depense = 0;
		this.Gold = 120;
		
	}
	
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
