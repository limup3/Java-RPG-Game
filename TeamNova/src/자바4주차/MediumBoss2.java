package 자바4주차;

public class MediumBoss2 extends Monster {

	int MaxHp = 130;
	int Hp = 130; 
	int Power = 30;
	int Depense = 20;
	int Gold = 400;
	
	public void Envoy() {
		String Name = "사신";
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
	
	public void Attacked_Envoy(int sum) { //공격 받는 함수
		//방어력이 받은 데미지보다 큰 경우
		if(Depense >= sum)
			Hp=Hp-0;
		else
			Hp = Hp+Depense-sum;
		
	}
	
}
