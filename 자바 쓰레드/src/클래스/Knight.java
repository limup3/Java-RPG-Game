package 클래스;


public class Knight extends Creature {

	/*
	static int MaxHp = 100; //최대체력
	static int Hp = 100; //현재체력
	static int MaxMp = 100; //최대마나
	static int Mp = 100; //현재마나
	static int Power = 10; //공격력
	static int Denpense = 10; //방어력
	static int Gold = 0; //현재 소지한 골드
	static int MaxFatigue = 100; //최대피로도

	*/
	int SkillPower; // 1차스킬 
	int SkillPower2; // 2차스킬
	String Skill =""; //1차스킬
	String Skill2 =""; //2차스킬
/*
		int SkillPower = Power*10; // 1차스킬 
		int SkillPower2 = Power*20; // 2차스킬
		String Skill =""; //1차스킬
		String Skill2 =""; //2차스킬
*/		
/*		Knight(int MaxHp, int Hp, int MaxMp, int Power, int Depense, int Gold, int MaxFatigue,
				int Fatigue) {
			this.MaxHp = MaxHp; //최대체력
			this.Hp = Hp; //현재체력
			this.MaxMp = MaxMp; //최대마나
			this.Mp = Mp; //현재마나
			this.Power = Power; //공격력
			this.Depense = Depense; //방어력
			this.Gold = Gold; //현재 소지한 골드
			this.MaxFatigue = MaxFatigue; //최대피로도
			this.Fatigue = Fatigue; //현재 피로도
			
		}
*/
	
	
		
		Knight() { //K대문자
			this.MaxHp = 120; //최대체력
			this.Hp = 120; //현재체력
			this.MaxMp = 100; //최대마나
			this.Mp = 100; //현재마나
			this.Power = 10; //공격력
			this.Depense = 10; //방어력
			this.Gold = 0; //현재 소지한 골드
			this.MaxFatigue = 100; //최대피로도
			this.Fatigue = 0; // 현재피로도
			this.SkillPower= Power*10; // 1차스킬
			this.SkillPower2 = Power*20; // 2차스킬
		}
		

		public void knight() { // 기사 스탯, k소문자
			String Job = "기사";
			String Element = "물속성";
			System.out.println("=====================");
			System.out.println("직업          : "+Job);
			System.out.println("최대체력    : "+MaxHp);
			System.out.println("현재체력    : "+Hp);
			System.out.println("최대마나    : "+MaxMp);
			System.out.println("현재마나    : "+Mp);
			System.out.println("현재피로도 : "+Fatigue);
			System.out.println("최대피로도 : "+MaxFatigue);
			System.out.println("공격력      : "+Power);
			System.out.println("방어력      : "+Depense);
			System.out.println("골드         : "+Gold);
			System.out.println("속성         : "+Element);
			System.out.println("1차스킬    : "+Skill);
			System.out.println("2차스킬    : "+Skill2);
			System.out.println("=====================");
		
		
	}
		public int Skill() {
			if(Mp<30)
			{
				System.out.println("마나가 부족합니다.");
			}
			if(Mp>30)
			{
				System.out.println("슬래시 사용!!!");
				Mp-=30;
				System.out.println("30마나를 사용하셨습니다.");
				System.out.println("상대방에게 "+SkillPower+"의 피해를 입혔습니다.");
			}
			
			
			return SkillPower;

		}
		
		public int Skill2() {
			if(Mp<30)
			{
				System.out.println("마나가 부족합니다.");
			}
			
			
			if(Mp>30)
			{
				System.out.println("일검 사용!!!");
				Mp-=50;
				System.out.println("50마나를 사용하셨습니다.");
				System.out.println("상대방에게 "+SkillPower2+"의 피해를 입혔습니다.");
			}
			
			return SkillPower2;

		}
		

}
