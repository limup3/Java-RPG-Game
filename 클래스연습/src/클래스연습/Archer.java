package 클래스연습;



public class Archer extends Creature {

	// 기본체력 보정
	int SkillPower; // 1차스킬 
	int SkillPower2; // 2차스킬
	String Skill =""; //1차스킬
	String Skill2 =""; //2차스킬
	
	Archer() {
		this.MaxHp = 100; //최대체력
		this.Hp = 100; //현재체력
		this.MaxMp = 100; //최대마나
		this.Mp = 100; //현재마나
		this.Power = 30; //공격력
		this.Depense = 10; //방어력
		this.Gold = 0; //현재 소지한 골드
		this.MaxFatigue = 100; //최대피로도
		this.Fatigue = 0; // 현재피로도
		this.SkillPower= Power*10; // 1차스킬
		this.SkillPower2 = Power*20; // 2차스킬
	}
	
	public void archer() { // 궁수 스탯
		String Job = "궁수";
		String Element = "불속성";
		System.out.println("=====================");
		System.out.println("직업          : "+Job);
		System.out.println("최대체력    : "+MaxHp);
		System.out.println("현재체력    : "+Hp);
		System.out.println("최대마나    : "+MaxMp);
		System.out.println("현재마나    : "+Mp);
		System.out.println("현재피로도 : "+MaxFatigue);
		System.out.println("최대피로도 : "+Fatigue);
		System.out.println("공격력      : "+Power);
		System.out.println("방어력      : "+Depense);
		System.out.println("골드         : "+Gold);
		System.out.println("속성         : "+Element);
		System.out.println("1차스킬    : "+Skill);
		System.out.println("2차스킬    : "+Skill2);
		System.out.println("=====================");
}
	public int Skill() {
		if(Mp>30)
		{
			System.out.println("더블샷 사용!!!");
			Mp-=30;
			System.out.println("30마나를 사용하셨습니다.");
			System.out.println("상대방의 체력이 "+SkillPower+" 감소하였습니다.");
		}
		if(Mp<30)
		{
			System.out.println("마나가 부족합니다.");
		}
		
		return SkillPower;

	}
	
	public int Skill2() {
		if(Mp>30)
		{
			System.out.println("마법화살 사용!!!");
			Mp-=50;
			System.out.println("50마나를 사용하셨습니다.");
			System.out.println("상대방의 체력이 "+SkillPower2+" 감소하였습니다.");
		}
		if(Mp<30)
		{
			System.out.println("마나가 부족합니다.");
		}
		
		return SkillPower2;

	}
	

}
