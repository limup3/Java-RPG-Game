package 클래스;


public class FinalBoss extends Monster {


	FinalBoss() {
		this.MaxHp = 250;
		this.Hp = 250; 
		this.Power = 150;
		this.Depense = 60;
		this.Gold = 999;
	}
	
	
	public void Devil() {
		String Name = "마왕";
		System.out.println("=====================");
		System.out.println("이름        : "+Name);
		System.out.println("최대체력  : "+MaxHp);
		System.out.println("현재체력  : "+Hp);
		System.out.println("공격력     : "+Power);
		System.out.println("방어력     : "+Depense);
		System.out.println("골드        : "+Gold);
		System.out.println("=====================");
	}
	

	
	public void Attacked_Devil(int sum) { //공격 받는 함수
		//방어력이 받은 데미지보다 큰 경우
		if(Depense >= sum)
			Hp=Hp-0;
		else
			Hp = Hp+Depense-sum;
		
	}
}
