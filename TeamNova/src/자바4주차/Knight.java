package 자바4주차;

public class Knight extends Creature {

		int MaxHp = 100; //최대체력
		int Hp = 100; //현재체력
		int MaxMp = 100; //최대마나
		int Mp = 100; //현재마나
		int Power = 10; //공격력
		int Denpense = 10; //방어력
		int Gold = 0; //현재 소지한 골드
		int MaxFatigue = 100; //최대피로도
		int SkillPower = Power*10; // 1차스킬 
		int SkillPower2 = Power*20; // 2차스킬
		String Skill =""; //1차스킬
		String Skill2 =""; //2차스킬
		
		
		
		public void Knight() { // 기사 스탯
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
			if(Mp>30)
			{
				System.out.println("슬래시 사용!!!");
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
				System.out.println("일검 사용!!!");
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
		
		public int Attack() { // 기본공격
			System.out.println("상대방의 체력이 "+Power+" 감소하였습니다.");
			return Power;
		}
		
		public void Attacked(int sum) { //공격 받는 함수
			//방어력이 받은 데미지보다 큰 경우
			if(Depense >= sum)
				Hp=Hp-0;
			else
				Hp = Hp+Depense-sum;
		}
}
