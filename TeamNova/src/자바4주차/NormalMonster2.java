package 자바4주차;

public class NormalMonster2 extends Monster {

	int MaxHp = 60;
	int Hp_Chipmunk = 60;
	int Hp_Slime= 60;
	int Hp_Skeleton = 60;
	int Power = 10;
	int Denpense = 0;
	int Gold = 120;
	
	public void Chipmunk() { // 박쥐 스탯
		String Name = "다람쥐";
		System.out.println("=====================");
		System.out.println("이름        : "+Name);
		System.out.println("최대체력  : "+MaxHp);
		System.out.println("현재체력  : "+Hp_Chipmunk);
		System.out.println("공격력     : "+Power);
		System.out.println("방어력     : "+Depense);
		System.out.println("골드        : "+Gold);
		System.out.println("=====================");
	}
	
	public void Slime() { // 달팽이 스탯
		String Name = "슬라임";
		System.out.println("=====================");
		System.out.println("이름        : "+Name);
		System.out.println("최대체력  : "+MaxHp);
		System.out.println("현재체력  : "+Hp_Slime);
		System.out.println("공격력     : "+Power);
		System.out.println("방어력     : "+Depense);
		System.out.println("골드        : "+Gold);
		System.out.println("=====================");
	}
	
	public void Skeleton() {
		String Name = "스켈레톤";
		System.out.println("=====================");
		System.out.println("이름        : "+Name);
		System.out.println("최대체력  : "+MaxHp);
		System.out.println("현재체력  : "+Hp_Skeleton);
		System.out.println("공격력     : "+Power);
		System.out.println("방어력     : "+Depense);
		System.out.println("골드        : "+Gold);
		System.out.println("=====================");
	}
	
	public int Attack() { // 기본공격
		System.out.println("상대방의 체력이 "+Power+" 감소하였습니다.");
		return Power;
	}
	
	public void Attacked_Chipmunk(int sum) { //공격 받는 함수
		//방어력이 받은 데미지보다 큰 경우
		if(Depense >= sum)
			Hp_Chipmunk=Hp_Chipmunk-0;
		else
			Hp_Chipmunk = Hp_Chipmunk+Depense-sum;
		
	}
	public void Attacked_Slime(int sum) { //공격 받는 함수
			//방어력이 받은 데미지보다 큰 경우
		if(Depense >= sum)
			Hp_Slime=Hp_Slime-0;
		else
			Hp_Slime = Hp_Slime+Depense-sum;
		}
	public void Attacked_Skeleton(int sum) { //공격 받는 함수
				//방어력이 받은 데미지보다 큰 경우
		if(Depense >= sum)
			Hp_Skeleton=Hp_Skeleton-0;
		else
			Hp_Skeleton = Hp_Skeleton+Depense-sum;	
		
	}
	
	
			
}
