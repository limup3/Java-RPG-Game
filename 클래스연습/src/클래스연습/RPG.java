package 클래스연습;

import java.util.Scanner;



public class RPG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 

		System.out.println("                                                                                                    \r\n" + 
				"       EeeeeeW                                                                                      \r\n" + 
				"     #eeD  uGK                                                                                      \r\n" + 
				"     EeE       ee#   Dee  eGyueeE  yeeE  5e# #eeX  EeeX     9eeez   WeE Xee9     Deee5   eeW ee     \r\n" + 
				"      GeeeX    eeE   zee  eee9Deeeeezeee yeeezDeeee#Deee  GeeDXGee9 Keee9zeee  WeeK Wee  eeeeee     \r\n" + 
				"        Xeeee  eez   5ee  ee#   Eey   9e Kee   DGe   ,ee  ee     ee  ee    Ge  ee5   eez eeE        \r\n" + 
				"           #eG eeD   yee  eeX   9eW   Ee uee   5ee    ee  eE     ee  ee    ee  ee559zyX, eeX        \r\n" + 
				"    ,e9,  uee9 Gee  Weee  ee#   ee5   ee Wee   Dee   ,ee  eeE   Gee uee    eeu EeG    u  eez        \r\n" + 
				"     eeeeeeeX   GeeeeXee  ee#  ,eeX   ee Xee   #ee   Kee   #eeeee5  yee,   eey  Deeeeee  ee#        \r\n" + 
				"                                                                                                    \r\n" + 
				"                                                                                                    \r\n" + 
				"                                                                                                    \r\n" + 
				"                                                                                                    \r\n" + 
				"                                                                                                    \r\n" + 
				"                             Eeeeeez,         eeeeee#,            9eeeeeX                           \r\n" + 
				"                             eeE Xeeee        eeGKzGeee        XeeeEXX#eG,                          \r\n" + 
				"                             Gey   uee        eeX   ueeu      5eeK                                  \r\n" + 
				"                             GeX  yeez        ee5   9ee       eeX   ,   ,                           \r\n" + 
				"                             Geeeeey          eeeeeeee        ee5  DeeeeeK                          \r\n" + 
				"                             GeK  EeG         eeD             EeE      Ee                           \r\n" + 
				"                             ee#   9ee        ee#              eee5   uee,                          \r\n" + 
				"                             eee    Eeey      eee               5eeeeeeee,");
		
		
		Creature creature = new Creature(); // Creature 클래스 불러오기

		
		int Blank =0; //화면 넘기기
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("당신은 이세계의 주인공입니다.");
		System.out.println("시험의 탑으로 가서 1층부터 최종보스까지 클리어하세요");
		System.out.println("자 그러면 시작합니다.");
		System.out.println("");
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		System.out.println();
		System.out.println("당신은 소환수를 고를수있습니다.");
		System.out.println("소환수는 총 3마리입니다.");
		System.out.println("소환수에 대한 설명을 들으시겠습니까?");
		System.out.println("1. 듣는다 / 2. 안듣겠다.");
		
		Scanner scan = new Scanner(System.in);
		
		
		do {
			int Num = scan.nextInt();
		if(Num == 1)
		{
			System.out.println("");
			System.out.println("1. 기사 : 칼을 사용하는 전형적인 기사 불속성 패시브로 체력이 증가한다.");
			System.out.println("         1차스킬 : 슬래시");
			System.out.println("         2차스킬 : 일검");
			System.out.println("2. 도적 : 삐에로형상의 도적 풍속성 패시브로 인하여 스킬데미지가 증가하며 "
									+   "나이프를 이용하여 싸우지만 스킬을 이용하여 카드로 적을 해치운다.");
			System.out.println("         1차스킬 : 카드날리기");
			System.out.println("         2차스킬 : 절단 마술");
			System.out.println("3. 궁수 : 활을 이용하여 적을 해치우는 궁수 불속성 패시브로 공격력이 증가한다 .");
			System.out.println("         1차스킬 : 더블샷");
			System.out.println("         2차스킬 : 마법화살");
			System.out.println("");
			break;
		}
		else if(Num == 2)
		{
			break;
		}
		else 
		{
		System.out.println("잘못누르셧습니다.");	
		}
		
		}while(true);
		
		
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		System.out.println();
		System.out.println("소환수 3가지 중 1가지를 고르세요.");
		System.out.println("1. 기사 / 2. 도적 / 3. 궁수");
		
		int Num2 = scan.nextInt();

		if(Num2 == 1)
		{	
			System.out.print("기사");
			
			System.out.println(" 소환수를 선택하셨군요. ");
			
			System.out.println("소환수의 이름을 말해주세요. ");
			
			creature.Name = scan.next();
			
			System.out.println(creature.Name+" 소환수를 육성하여 게임을 클리어하세요 !!");
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");
			System.out.println("프롤로그");
			System.out.println("");
			System.out.println("주인공 : ...!?");
			System.out.println("주인공 : 여기가 어디지..?"); 
			System.out.println("주인공 : 난 분명 집에서 잠을 자고 있었는데..?");
			System.out.println("주인공 : 뭐야 꿈인가 ?");
			System.out.println("주인공 : (볼을 꼬집는다)");
			System.out.println("주인공 : 아얏!.. 꿈은 아닌데…");
			System.out.println(">>안녕하세요 당신은 이세계의 주인공 입니다.");
			System.out.println("주인공 : !? 어디서 들리는거지?");
			System.out.println(">>시험의 탑에가서 각 몬스터를 쓰러뜨리고 최종보스까지 무찌르세요.");
			System.out.println(">>그러면 당신이 원래 살던곳 으로 갈수 있습니다.");
			System.out.println("주인공 : ..? 뭐지 여기가 이세계라고?");
			System.out.println(">> 오른쪽을 보면 당신 옆에 소환수가 있을겁니다. 소환수를 육성하여 최종보스를 쓰러뜨리세요!!");
			System.out.println("(여기서 각 고른 소환수 등장)");
			System.out.println("");
			System.out.println(creature.Name+" : …");
			System.out.println("주인공 : 이것이 소환수인가..?");
			System.out.println("주인공 : 일단 시험의 탑에 가볼까.");
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");
			System.out.println("");
			System.out.println("시험의 탑 1층");
			System.out.println("");
			System.out.println(">>시험의 탑 1층입니다.");
			System.out.println(">>초반에 기본공격으로 몬스터를 제압하고 중반에 스킬을 배울수 있습니다.");
			System.out.println(">>몬스터를 모두 제압하고 던전을 클리어하세요 !!");
			Knight knight = new Knight();//기사 클래스 인스턴스 생성
			NormalMonster normalMonster = new NormalMonster();//노말몬스터 클래스 불러오기
			System.out.println("");
			System.out.println("박쥐등장!!");
			System.out.println("");
			normalMonster.Bat();
			System.out.println("");
			System.out.println("######################");
			System.out.println("1. 공격하기");
			
			int Battle_Bat = scan.nextInt();
			
			while(true) { //전투 반복
				if(Battle_Bat == 1)
				{	System.out.println("");
					System.out.println("소환수"+"의 공격입니다.");
					normalMonster.Attacked_Bat(knight.Attack());
					System.out.println("박쥐 체력 : "+normalMonster.Hp_Bat);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(normalMonster.Hp_Bat<=0)
					{	
						System.out.println("");
						System.out.println("박쥐가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster.Gold+"를 획득하셨습니다.");
						knight.Gold+=normalMonster.Gold;
						break;
					}
					System.out.println("");
					System.out.println("박쥐의 공격입니다.");
					knight.Attacked(normalMonster.Attack());
					System.out.println("소환수"+" 체력 : "+knight.Hp);
					System.out.println(normalMonster.Power);
					if(knight.Hp <=0)
					{	System.out.println("");
						System.out.println("소환수"+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						knight.Hp = 1;
						System.out.println("소환수"+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}
			
			System.out.println("");
			System.out.println("달팽이 등장!!");
			normalMonster.Snail();
			System.out.println("");
			System.out.println("######################");
			System.out.println("1. 공격하기");

			int Battle_Snail = scan.nextInt();
		
			while(true) {
				if(Battle_Snail == 1)
				{	System.out.println("");
					System.out.println("소환수"+"의 공격입니다.");
					normalMonster.Attacked_Snail(knight.Attack());
					System.out.println("달팽이 체력 : "+normalMonster.Hp_Snail);
					//몬스터의 체력이 0보다 작거나 같은 경우
					
					if(normalMonster.Hp_Snail<=0)
					{	
						System.out.println("");
						System.out.println("달팽이가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster.Gold+"를 획득하셨습니다.");
						knight.Gold+=normalMonster.Gold;
						break;
					}
					System.out.println("");
					System.out.println("달팽이의 공격입니다.");
					System.out.println("");
					knight.Attacked(normalMonster.Attack());
					System.out.println("소환수"+" 체력 : "+knight.Hp);
					if(knight.Hp <=0)
					{	System.out.println("");
						System.out.println("소환수"+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						knight.Hp = 1;
						System.out.println("소환수"+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}
			
			System.out.println("");
			System.out.println("토끼 등장!!");
			normalMonster.Rabbit();
			System.out.println("");
			System.out.println("######################");
			System.out.println("1. 공격하기");

			int Battle_Rabbit = scan.nextInt();
		
			while(true) {
				if(Battle_Rabbit == 1)
				{	System.out.println("");
					System.out.println("소환수"+"의 공격입니다.");
					normalMonster.Attacked_Rabbit(knight.Attack());
					System.out.println("토끼 체력 : "+normalMonster.Hp_Rabbit);
					//몬스터의 체력이 0보다 작거나 같은 경우
					
					if(normalMonster.Hp_Rabbit<=0)
					{	
						System.out.println("");
						System.out.println("토끼가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster.Gold+"를 획득하셨습니다.");
						knight.Gold+=normalMonster.Gold;
						break;
					}
					System.out.println("");
					System.out.println("토끼의 공격입니다.");
					knight.Attacked(normalMonster.Attack());
					System.out.println("소환수"+" 체력 : "+knight.Hp);
					if(knight.Hp <=0)
					{	System.out.println("");
						System.out.println("소환수"+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						knight.Hp = 1;
						System.out.println("소환수"+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}
			
			System.out.println("");
			System.out.println("");
			knight.Fatigue+=40;
			System.out.println(">>시험의 탑 1층을 클리어하셨습니다!!!!");
			System.out.println(">>마을로 갑니다.");
			System.out.println("");
			knight.Hp=100;
			
			Weapon weapon = new Weapon(); // 무기 클래스 객체생성
			Armor armor = new Armor(); // 아머 클래스 객체생성
			
			
			while(true) {
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				int Floor2 = scan.nextInt();
			if (Floor2 ==1) //스탯창
			{
				System.out.println("");
				
				knight.knight();
				System.out.println("1. 뒤로가기");
				int Num7 = scan.nextInt();
				if(Num7 ==1)
				{
					System.out.println("");
				}
			}	
			else if(Floor2 ==2) // 상점
			{
				Store store = new Store();
				store.store(knight);
			}
				
			else if(Floor2 ==3) //여관
			{
				Inn Inn = new Inn();
				Inn.inn(knight);
			}
			else if (Floor2 ==4) //시험의 탑
			{
				System.out.println("시험의 탑 다음층으로 갑니다.");
				System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
				System.out.println("1. 예 / 2. 아니오");
				
				int Floor2_1 = scan.nextInt();
				if(Floor2_1 ==1)
				{
					System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
					break;
				}
			
				else if(Floor2_1==2)
				{
					System.out.println("마을로 돌아갑니다. 정비해주세요");
					System.out.println("");
				}
			
			}
			
			else
			{
				System.out.println("잘못누르셨습니다.");
			}
	}
			
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("시험의 탑 2층");
			System.out.println("");
			System.out.println(">>2층과 4층은 중간보스가 출현합니다.");
			System.out.println(">>중간보스를 무찌르면 스킬을 배우실 수 있습니다.");
			
			MediumBoss mediumBoss = new MediumBoss();//중간보스 클래스 불러오기

			System.out.println("");
			System.out.println("오우거 등장!!");
			System.out.println("");
			mediumBoss.Ogre();
			System.out.println("");
			System.out.println("######################");
			System.out.println("1. 공격하기");
			int Battle_Ogre = scan.nextInt();
			while(true) { //전투 반복
				
				if(Battle_Ogre == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					mediumBoss.Attacked_Ogre(knight.Attack());
					System.out.println("오우거 체력 : "+mediumBoss.Hp);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(mediumBoss.Hp<=0)
					{	
						System.out.println("");
						System.out.println("오우거가 죽었습니다.");
						System.out.println("몬스터골드"+mediumBoss.Gold+"를 획득하셨습니다.");
						knight.Gold+=mediumBoss.Gold;
						break;
					}
					System.out.println("");
					System.out.println("오우거의 공격입니다.");
					knight.Attacked(mediumBoss.Attack());
					System.out.println(creature.Name+" 체력 : "+knight.Hp);
					if(knight.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						knight.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}
			
			System.out.println(">>대단해요 !! 중간보스를 쓰러트리셨어요!!");
			System.out.println(">>중간보스를 쓰러트려서 스킬을 배우셨습니다.");
			System.out.println("");
			System.out.println("1차스킬 슬래시를 배웠다!!");
			System.out.println("");
			knight.Skill ="슬래시";
			System.out.println(">>마을로 돌아갑니다.");
			knight.Hp = 100;
			knight.Fatigue +=40;
			
			while(true) {
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				int Floor3 = scan.nextInt();
			if (Floor3 ==1) //스탯창
			{
				System.out.println("");
				
				knight.knight();
				System.out.println("1. 뒤로가기");
				int Num7 = scan.nextInt();
				if(Num7 ==1)
				{
					System.out.println("");
				}
			}	
			else if(Floor3 ==2) // 상점
			{
				Store store = new Store();
				store.store(knight);
			
			}
			else if(Floor3 ==3) //여관
			{
				Inn Inn = new Inn();
				Inn.inn(knight);
			}
			else if (Floor3 ==4) //시험의 탑
			{
				System.out.println("시험의 탑 다음층으로 갑니다.");
				System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
				System.out.println("1. 예 / 2. 아니오");
				
				int Floor3_1 = scan.nextInt();
				if(Floor3_1 ==1)
				{
					System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
					break;
				}
			
				else if(Floor3_1==2)
				{
					System.out.println("마을로 돌아갑니다. 정비해주세요");
					System.out.println("");
				}
			
			}
			
			else
			{
				System.out.println("잘못누르셨습니다.");
			}
		
			
		}
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("시험의 탑 3층");
			System.out.println("");
			System.out.println(">>스킬을 배우셨으니 스킬과 일반공격을 적절히 사용해서 적을 해치우세요");
		
			NormalMonster2 normalMonster2 = new NormalMonster2(); //3층 몬스터 불러오기
			
			System.out.println("");
			System.out.println("다람쥐 등장!!");
			System.out.println("");
			normalMonster2.Chipmunk();
			System.out.println("");
			System.out.println("######################");
			
			while(true) { //전투 반복
				System.out.println("1. 공격하기 / 2. 스킬사용");
				int Num3_1 = scan.nextInt(); //3층의 첫번째 몬스터	
				if(Num3_1 == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					normalMonster2.Attacked_Chipmunk(knight.Attack());
					System.out.println("다람쥐 체력 : "+normalMonster2.Hp_Chipmunk);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(normalMonster2.Hp_Chipmunk<=0)
					{	
						System.out.println("");
						System.out.println("다람쥐가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
						knight.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("다람쥐의 공격입니다.");
					knight.Attacked(normalMonster2.Attack());
					System.out.println(creature.Name+" 체력 : "+knight.Hp);
					if(knight.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						knight.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				else if(Num3_1 ==2)
				{
					System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					normalMonster2.Attacked_Chipmunk(knight.Skill());
					System.out.println("다람쥐 체력 : "+normalMonster2.Hp_Chipmunk);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(normalMonster2.Hp_Chipmunk<=0)
					{	
						System.out.println("");
						System.out.println("다람쥐가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
						knight.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("다람쥐의 공격입니다.");
					knight.Attacked(normalMonster2.Attack());
					System.out.println(creature.Name+" 체력 : "+knight.Hp);
					if(knight.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						knight.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}

	System.out.println("");
			System.out.println("슬라임 등장!!");
			System.out.println("");
			normalMonster2.Slime();
			System.out.println("");
			System.out.println("######################");
			
			
			while(true) { //전투 반복
				System.out.println("1. 공격하기 / 2. 스킬사용");
				int Num3_2 = scan.nextInt(); //3층의 2번째 몬스터
				if(Num3_2 == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					normalMonster2.Attacked_Slime(knight.Attack());
					System.out.println("슬라임 체력 : "+normalMonster2.Hp_Slime);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(normalMonster2.Hp_Slime<=0)
					{	
						System.out.println("");
						System.out.println("슬라임이 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
						knight.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("슬라임의 공격입니다.");
					knight.Attacked(normalMonster.Attack());
					System.out.println(creature.Name+" 체력 : "+knight.Hp);
					if(knight.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						knight.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				else if(Num3_2 ==2)
				{
					System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					normalMonster2.Attacked_Slime(knight.Skill());
					System.out.println("슬라임 체력 : "+normalMonster2.Hp_Slime);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(normalMonster2.Hp_Slime<=0)
					{	
						System.out.println("");
						System.out.println("슬라임이 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
						knight.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("슬라임의 공격입니다.");
					knight.Attacked(normalMonster2.Attack());
					System.out.println(creature.Name+" 체력 : "+knight.Hp);
					if(knight.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						knight.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}

			System.out.println("");
			System.out.println("스켈레톤 등장!!");
			System.out.println("");
			normalMonster2.Skeleton();
			System.out.println("");
			System.out.println("######################");
			
			
			while(true) { //전투 반복
				System.out.println("1. 공격하기 / 2. 스킬사용");
				int Num3_2 = scan.nextInt(); //3층의 2번째 몬스터
				if(Num3_2 == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					normalMonster2.Attacked_Skeleton(knight.Attack());
					System.out.println("스켈레톤 체력 : "+normalMonster2.Hp_Skeleton);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(normalMonster2.Hp_Skeleton<=0)
					{	
						System.out.println("");
						System.out.println("스켈레톤이 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
						knight.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("스켈레톤의 공격입니다.");
					knight.Attacked(normalMonster.Attack());
					System.out.println(creature.Name+" 체력 : "+knight.Hp);
					if(knight.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						knight.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				else if(Num3_2 ==2)
				{
					System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					normalMonster2.Attacked_Skeleton(knight.Skill());
					System.out.println("스켈레톤 체력 : "+normalMonster2.Hp_Skeleton);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(normalMonster2.Hp_Skeleton<=0)
					{	
						System.out.println("");
						System.out.println("스켈레톤이 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
						knight.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("스켈레톤의 공격입니다.");
					knight.Attacked(normalMonster2.Attack());
					System.out.println(creature.Name+" 체력 : "+knight.Hp);
					if(knight.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						knight.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}
			
			
			System.out.println(">>시험의 탑 3층을 클리어하셨습니다!!!!");
			System.out.println(">>마을로 갑니다.");
			System.out.println("");
			knight.Hp = 100;
			knight.Fatigue +=40;
			knight.Mp = 100;
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");

			while(true) {
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				int Floor3 = scan.nextInt();
			if (Floor3 ==1) //스탯창
			{
				System.out.println("");
				
				knight.knight();
				System.out.println("1. 뒤로가기");
				int Num7 = scan.nextInt();
				if(Num7 ==1)
				{
					System.out.println("");
				}
			}	
			else if(Floor3 ==2) // 상점
			{
				Store store = new Store();
				store.store(knight);
			}
				
			else if(Floor3 ==3) //여관
			{
				Inn Inn = new Inn();
				Inn.inn(knight);
			}
			else if (Floor3 ==4) //시험의 탑
			{
				System.out.println("시험의 탑 다음층으로 갑니다.");
				System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
				System.out.println("1. 예 / 2. 아니오");
				
				int Floor3_1 = scan.nextInt();
				if(Floor3_1 ==1)
				{
					System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
					break;
				}
			
				else if(Floor3_1==2)
				{
					System.out.println("마을로 돌아갑니다. 정비해주세요");
					System.out.println("");
				}
			
			}
			
			else
			{
				System.out.println("잘못누르셨습니다.");
			}
	}
		
			
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("시험의 탑 4층");
			System.out.println("");
			System.out.println(">>중간보스입니다.");
			System.out.println(">>중간보스를 해치우면 2차스킬을 배울수있습니다.");
	
			MediumBoss2 mediumBoss2 = new MediumBoss2();//중간보스 클래스 불러오기

			System.out.println("");
			System.out.println("사신 등장!!");
			System.out.println("");
			mediumBoss2.Envoy();
			System.out.println("");
			System.out.println("######################");

			while(true) { //전투 반복
				System.out.println("1. 공격하기 / 2. 스킬 사용");
				int Battle_Envoy = scan.nextInt();
				if(Battle_Envoy == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					mediumBoss2.Attacked_Envoy(knight.Attack());
					System.out.println("사신 체력 : "+mediumBoss2.Hp);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(mediumBoss2.Hp<=0)
					{	
						System.out.println("");
						System.out.println("사신가 죽었습니다.");
						System.out.println("몬스터골드"+mediumBoss2.Gold+"를 획득하셨습니다.");
						knight.Gold+=mediumBoss2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("사신의 공격입니다.");
					knight.Attacked(mediumBoss2.Attack());
					System.out.println(creature.Name+" 체력 : "+knight.Hp);
					if(knight.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						knight.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				else if(Battle_Envoy == 2)
					
				{	System.out.println("");
				System.out.println(creature.Name+"의 공격입니다.");
				mediumBoss2.Attacked_Envoy(knight.Skill());
				System.out.println("사신 체력 : "+mediumBoss2.Hp);

				//몬스터의 체력이 0보다 작거나 같은 경우				
				if(mediumBoss2.Hp<=0)
				{	
					System.out.println("");
					System.out.println("사신가 죽었습니다.");
					System.out.println("몬스터골드"+mediumBoss2.Gold+"를 획득하셨습니다.");
					knight.Gold+=mediumBoss2.Gold;
					break;
				}
				System.out.println("");
				System.out.println("사신의 공격입니다.");
				knight.Attacked(mediumBoss2.Attack());
				System.out.println(creature.Name+" 체력 : "+knight.Hp);
				if(knight.Hp <=0)
				{	System.out.println("");
					System.out.println(creature.Name+"가 죽었습니다.");
					//영웅체력 1로 만든다.
					knight.Hp = 1;
					System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
					break;
				}
			}
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}
			
			System.out.println(">>대단해요 !! 중간보스를 쓰러트리셨어요!!");
			System.out.println(">>중간보스를 쓰러트려서 스킬을 배우셨습니다.");
			System.out.println("");
			System.out.println("2차스킬 일검을 배웠다!!");
			System.out.println("");
			knight.Skill2 ="일검";
			System.out.println(">>마을로 돌아갑니다.");
			knight.Hp = 100;
			knight.Fatigue +=40;
			knight.Mp = 100;
			
			while(true) {
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				int Floor5_1 = scan.nextInt();
			if (Floor5_1 ==1) //스탯창
			{
				System.out.println("");
				
				knight.knight();
				System.out.println("1. 뒤로가기");
				int Num7 = scan.nextInt();
				if(Num7 ==1)
				{
					System.out.println("");
				}
			}	
			else if(Floor5_1 ==2) // 상점
			{
				Store store = new Store();
				store.store(knight);	
			}
			else if(Floor5_1 ==3) //여관
			{
				Inn Inn = new Inn();
				Inn.inn(knight);
			}
			else if (Floor5_1 ==4) //시험의 탑
			{
				System.out.println("시험의 탑 다음층으로 갑니다.");
				System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
				System.out.println("1. 예 / 2. 아니오");
				
				int Floor5_2 = scan.nextInt();
				if(Floor5_2 ==1)
				{
					System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
					break;
				}
			
				else if(Floor5_2==2)
				{
					System.out.println("마을로 돌아갑니다. 정비해주세요");
					System.out.println("");
				}
			
			}
			
			else
			{
				System.out.println("잘못누르셨습니다.");
			}
			
	}
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("시험의 탑 5층");
			System.out.println("");
			System.out.println("드디어 마지막 5층까지 오셨군요!!");
			System.out.println(">>최종보스입니다.");
			System.out.println(">>최종보스를 해치우면 원래살던세계로 돌아갈수있어요!!");
			
			FinalBoss finalBoss = new FinalBoss();//중간보스 클래스 불러오기

			System.out.println("");
			System.out.println("드래곤 등장!!");
			System.out.println("");
			finalBoss.Dragon();
			System.out.println("");
			System.out.println("######################");

			while(true) { //전투 반복
				System.out.println("1. 공격하기 / 2. 1차 스킬 사용 / 3. 2차 스킬 사용");
				int Batlle_Dragon = scan.nextInt();
				if(Batlle_Dragon == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					finalBoss.Attacked_Dragon(knight.Attack());
					System.out.println("드래곤 체력 : "+finalBoss.Hp);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(finalBoss.Hp<=0)
					{	
						System.out.println("");
						System.out.println("드래곤가 죽었습니다.");
						System.out.println("몬스터골드"+finalBoss.Gold+"를 획득하셨습니다.");
						knight.Gold+=finalBoss.Gold;
						break;
					}
					System.out.println("");
					System.out.println("드래곤의 공격입니다.");
					knight.Attacked(finalBoss.Attack());
					System.out.println(creature.Name+" 체력 : "+knight.Hp);
					if(knight.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						knight.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				else if(Batlle_Dragon == 2)
					
				{	System.out.println("");
				System.out.println(creature.Name+"의 공격입니다.");
				finalBoss.Attacked_Dragon(knight.Skill());
				System.out.println("드래곤 체력 : "+finalBoss.Hp);

				//몬스터의 체력이 0보다 작거나 같은 경우				
				if(finalBoss.Hp<=0)
				{	
					System.out.println("");
					System.out.println("드래곤가 죽었습니다.");
					System.out.println("몬스터골드"+finalBoss.Gold+"를 획득하셨습니다.");
					knight.Gold+=finalBoss.Gold;
					break;
				}
				System.out.println("");
				System.out.println("드래곤의 공격입니다.");
				knight.Attacked(finalBoss.Attack());
				System.out.println(creature.Name+" 체력 : "+knight.Hp);
				if(knight.Hp <=0)
				{	System.out.println("");
					System.out.println(creature.Name+"가 죽었습니다.");
					//영웅체력 1로 만든다.
					knight.Hp = 1;
					System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
					break;
				}
			}
				else if(Batlle_Dragon == 3)
					
				{	System.out.println("");
				System.out.println(creature.Name+"의 공격입니다.");
				finalBoss.Attacked_Dragon(knight.Skill2());
				System.out.println("드래곤 체력 : "+finalBoss.Hp);

				//몬스터의 체력이 0보다 작거나 같은 경우				
				if(finalBoss.Hp<=0)
				{	
					System.out.println("");
					System.out.println("드래곤가 죽었습니다.");
					System.out.println("몬스터골드"+finalBoss.Gold+"를 획득하셨습니다.");
					knight.Gold+=finalBoss.Gold;
					break;
				}
				System.out.println("");
				System.out.println("드래곤의 공격입니다.");
				knight.Attacked(finalBoss.Attack());
				System.out.println(creature.Name+" 체력 : "+knight.Hp);
				if(knight.Hp <=0)
				{	System.out.println("");
					System.out.println(creature.Name+"가 죽었습니다.");
					//영웅체력 1로 만든다.
					knight.Hp = 1;
					System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
					break;
				}
			}
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}
			System.out.println();
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("");
			System.out.println(">> 모든층을 클리어하셨군요 !! 역시 해내실 줄 아셨어요!");
			System.out.println(">> 이제 원래있던 세계로 돌아갑니다.");
			System.out.println(">> 여기서 있었던 기억은 다 없어지고 시간은 그대로입니다. 평상시 처럼 생활하게 되실겁니다.\r\n" + 
					"");
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("");
			System.out.println("주인공 : 뭔가 아쉬운걸 ..? 원래세계로 돌아가면 소환수를 다신 못보는데..");
			System.out.println(creature.Name+" : ....");
			System.out.println("주인공 : 고생했어 "+creature.Name+"야 !!");
			System.out.println(creature.Name+" : ..!!");
			System.out.println("");
			System.out.println("");
			System.out.println("******************************************");
			System.out.println("");
			System.out.println("\t 게임을 플레이 해주셔서 감사합니다~!");
			System.out.println("");
			System.out.println("");
			System.out.println("******************************************");
		}
		
		
		
		else if(Num2 == 2)
		{
			System.out.print("도적");
			System.out.println(" 소환수를 선택하셨군요. ");
			
			System.out.println("소환수의 이름을 말해주세요. ");
			
			creature.Name = scan.next();
			
			System.out.println(creature.Name+" 소환수를 육성하여 게임을 클리어하세요 !!");
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");
			System.out.println("프롤로그");
			System.out.println("");
			System.out.println("주인공 : ...!?");
			System.out.println("주인공 : 여기가 어디지..?"); 
			System.out.println("주인공 : 난 분명 집에서 잠을 자고 있었는데..?");
			System.out.println("주인공 : 뭐야 꿈인가 ?");
			System.out.println("주인공 : (볼을 꼬집는다)");
			System.out.println("주인공 : 아얏!.. 꿈은 아닌데…");
			System.out.println(">>안녕하세요 당신은 이세계의 주인공 입니다.");
			System.out.println("주인공 : !? 어디서 들리는거지?");
			System.out.println(">>시험의 탑에가서 각 몬스터를 쓰러뜨리고 최종보스까지 무찌르세요.");
			System.out.println(">>그러면 당신이 원래 살던곳 으로 갈수 있습니다.");
			System.out.println("주인공 : ..? 뭐지 여기가 이세계라고?");
			System.out.println(">> 오른쪽을 보면 당신 옆에 소환수가 있을겁니다. 소환수를 육성하여 최종보스를 쓰러뜨리세요!!");
			System.out.println("(여기서 각 고른 소환수 등장)");
			System.out.println("");
			System.out.println(creature.Name+" : …");
			System.out.println("주인공 : 이것이 소환수인가..?");
			System.out.println("주인공 : 일단 시험의 탑에 가볼까.");
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");
			System.out.println("");
			System.out.println("시험의 탑 1층");
			System.out.println("");
			System.out.println(">>시험의 탑 1층입니다.");
			System.out.println(">>초반에 기본공격으로 몬스터를 제압하고 중반에 스킬을 배울수 있습니다.");
			System.out.println(">>몬스터를 모두 제압하고 던전을 클리어하세요 !!");
			Thief thief = new Thief();//기사 클래스 인스턴스 생성
			NormalMonster normalMonster = new NormalMonster();//노말몬스터 클래스 불러오기
			System.out.println("");
			System.out.println("박쥐등장!!");
			System.out.println("");

			normalMonster.Bat();
			System.out.println("");
			System.out.println("######################");
			System.out.println("1. 공격하기");
			
			int Battle_Bat = scan.nextInt();
			
			while(true) { //전투 반복
				if(Battle_Bat == 1)
				{	System.out.println("");
					System.out.println("소환수"+"의 공격입니다.");
					normalMonster.Attacked_Bat(thief.Attack());
					System.out.println("박쥐 체력 : "+normalMonster.Hp_Bat);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(normalMonster.Hp_Bat<=0)
					{	
						System.out.println("");
						System.out.println("박쥐가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster.Gold+"를 획득하셨습니다.");
						thief.Gold+=normalMonster.Gold;
						break;
					}
					System.out.println("");
					System.out.println("박쥐의 공격입니다.");
					thief.Attacked(normalMonster.Attack());
					System.out.println("소환수"+" 체력 : "+thief.Hp);
					System.out.println(normalMonster.Power);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println("소환수"+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						thief.Hp = 1;
						System.out.println("소환수"+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}
			
			System.out.println("");
			System.out.println("달팽이 등장!!");
			normalMonster.Snail();
			System.out.println("");
			System.out.println("######################");
			System.out.println("1. 공격하기");

			int Battle_Snail = scan.nextInt();
		
			while(true) {
				if(Battle_Snail == 1)
				{	System.out.println("");
					System.out.println("소환수"+"의 공격입니다.");
					normalMonster.Attacked_Snail(thief.Attack());
					System.out.println("달팽이 체력 : "+normalMonster.Hp_Snail);
					//몬스터의 체력이 0보다 작거나 같은 경우
					
					if(normalMonster.Hp_Snail<=0)
					{	
						System.out.println("");
						System.out.println("달팽이가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster.Gold+"를 획득하셨습니다.");
						thief.Gold+=normalMonster.Gold;
						break;
					}
					System.out.println("");
					System.out.println("달팽이의 공격입니다.");
					System.out.println("");
					thief.Attacked(normalMonster.Attack());
					System.out.println("소환수"+" 체력 : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println("소환수"+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						thief.Hp = 1;
						System.out.println("소환수"+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}
			
			System.out.println("");
			System.out.println("토끼 등장!!");
			normalMonster.Rabbit();
			System.out.println("");
			System.out.println("######################");
			System.out.println("1. 공격하기");

			int Battle_Rabbit = scan.nextInt();
		
			while(true) {
				if(Battle_Rabbit == 1)
				{	System.out.println("");
					System.out.println("소환수"+"의 공격입니다.");
					normalMonster.Attacked_Rabbit(thief.Attack());
					System.out.println("토끼 체력 : "+normalMonster.Hp_Rabbit);
					//몬스터의 체력이 0보다 작거나 같은 경우
					
					if(normalMonster.Hp_Rabbit<=0)
					{	
						System.out.println("");
						System.out.println("토끼가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster.Gold+"를 획득하셨습니다.");
						thief.Gold+=normalMonster.Gold;
						break;
					}
					System.out.println("");
					System.out.println("토끼의 공격입니다.");
					thief.Attacked(normalMonster.Attack());
					System.out.println("소환수"+" 체력 : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println("소환수"+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						thief.Hp = 1;
						System.out.println("소환수"+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}
			
			System.out.println("");
			System.out.println("");
			thief.Fatigue+=40;
			System.out.println(">>시험의 탑 1층을 클리어하셨습니다!!!!");
			System.out.println(">>마을로 갑니다.");
			System.out.println("");
			thief.Hp=100;
			
			Weapon weapon = new Weapon(); // 무기 클래스 객체생성
			Armor armor = new Armor(); // 아머 클래스 객체생성
			
			
			while(true) {
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				int Floor2 = scan.nextInt();
			if (Floor2 ==1) //스탯창
			{
				System.out.println("");
				
				thief.thief();
				System.out.println("1. 뒤로가기");
				int Num7 = scan.nextInt();
				if(Num7 ==1)
				{
					System.out.println("");
				}
			}	
			else if(Floor2 ==2) // 상점
			{
				Store store = new Store();
				store.Thi_sto(thief);
			}
				
			else if(Floor2 ==3) //여관
			{
				Inn Inn = new Inn();
				Inn.Thi_in(thief);
			}
			else if (Floor2 ==4) //시험의 탑
			{
				System.out.println("시험의 탑 다음층으로 갑니다.");
				System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
				System.out.println("1. 예 / 2. 아니오");
				
				int Floor2_1 = scan.nextInt();
				if(Floor2_1 ==1)
				{
					System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
					break;
				}
			
				else if(Floor2_1==2)
				{
					System.out.println("마을로 돌아갑니다. 정비해주세요");
					System.out.println("");
				}
			
			}
			
			else
			{
				System.out.println("잘못누르셨습니다.");
			}
	}
			
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("시험의 탑 2층");
			System.out.println("");
			System.out.println(">>2층과 4층은 중간보스가 출현합니다.");
			System.out.println(">>중간보스를 무찌르면 스킬을 배우실 수 있습니다.");
			
			MediumBoss mediumBoss = new MediumBoss();//중간보스 클래스 불러오기

			System.out.println("");
			System.out.println("오우거 등장!!");
			System.out.println("");
			mediumBoss.Ogre();
			System.out.println("");
			System.out.println("######################");
			System.out.println("1. 공격하기");
			int Battle_Ogre = scan.nextInt();
			while(true) { //전투 반복
				
				if(Battle_Ogre == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					mediumBoss.Attacked_Ogre(thief.Attack());
					System.out.println("오우거 체력 : "+mediumBoss.Hp);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(mediumBoss.Hp<=0)
					{	
						System.out.println("");
						System.out.println("오우거가 죽었습니다.");
						System.out.println("몬스터골드"+mediumBoss.Gold+"를 획득하셨습니다.");
						thief.Gold+=mediumBoss.Gold;
						break;
					}
					System.out.println("");
					System.out.println("오우거의 공격입니다.");
					thief.Attacked(mediumBoss.Attack());
					System.out.println(creature.Name+" 체력 : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						thief.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}
			
			System.out.println(">>대단해요 !! 중간보스를 쓰러트리셨어요!!");
			System.out.println(">>중간보스를 쓰러트려서 스킬을 배우셨습니다.");
			System.out.println("");
			System.out.println("1차스킬 카드날리기를 배웠다!!");
			System.out.println("");
			thief.Skill ="카드날리기";
			System.out.println(">>마을로 돌아갑니다.");
			thief.Hp = 100;
			thief.Fatigue +=40;
			
			while(true) {
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				int Floor3 = scan.nextInt();
			if (Floor3 ==1) //스탯창
			{
				System.out.println("");
				
				thief.thief();
				System.out.println("1. 뒤로가기");
				int Num7 = scan.nextInt();
				if(Num7 ==1)
				{
					System.out.println("");
				}
			}	
			else if(Floor3 ==2) // 상점
			{
				Store store = new Store();
				store.Thi_sto(thief);
			
			}
			else if(Floor3 ==3) //여관
			{
				Inn Inn = new Inn();
				Inn.Thi_in(thief);
			}
			else if (Floor3 ==4) //시험의 탑
			{
				System.out.println("시험의 탑 다음층으로 갑니다.");
				System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
				System.out.println("1. 예 / 2. 아니오");
				
				int Floor3_1 = scan.nextInt();
				if(Floor3_1 ==1)
				{
					System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
					break;
				}
			
				else if(Floor3_1==2)
				{
					System.out.println("마을로 돌아갑니다. 정비해주세요");
					System.out.println("");
				}
			
			}
			
			else
			{
				System.out.println("잘못누르셨습니다.");
			}
		
			
		}
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("시험의 탑 3층");
			System.out.println("");
			System.out.println(">>스킬을 배우셨으니 스킬과 일반공격을 적절히 사용해서 적을 해치우세요");
		
			NormalMonster2 normalMonster2 = new NormalMonster2(); //3층 몬스터 불러오기
			
			System.out.println("");
			System.out.println("다람쥐 등장!!");
			System.out.println("");
			normalMonster2.Chipmunk();
			System.out.println("");
			System.out.println("######################");
			
			while(true) { //전투 반복
				System.out.println("1. 공격하기 / 2. 스킬사용");
				int Num3_1 = scan.nextInt(); //3층의 첫번째 몬스터	
				if(Num3_1 == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					normalMonster2.Attacked_Chipmunk(thief.Attack());
					System.out.println("다람쥐 체력 : "+normalMonster2.Hp_Chipmunk);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(normalMonster2.Hp_Chipmunk<=0)
					{	
						System.out.println("");
						System.out.println("다람쥐가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
						thief.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("다람쥐의 공격입니다.");
					thief.Attacked(normalMonster2.Attack());
					System.out.println(creature.Name+" 체력 : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						thief.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				else if(Num3_1 ==2)
				{
					System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					normalMonster2.Attacked_Chipmunk(thief.Skill());
					System.out.println("다람쥐 체력 : "+normalMonster2.Hp_Chipmunk);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(normalMonster2.Hp_Chipmunk<=0)
					{	
						System.out.println("");
						System.out.println("다람쥐가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
						thief.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("다람쥐의 공격입니다.");
					thief.Attacked(normalMonster2.Attack());
					System.out.println(creature.Name+" 체력 : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						thief.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}

	System.out.println("");
			System.out.println("슬라임 등장!!");
			System.out.println("");
			normalMonster2.Slime();
			System.out.println("");
			System.out.println("######################");
			
			
			while(true) { //전투 반복
				System.out.println("1. 공격하기 / 2. 스킬사용");
				int Num3_2 = scan.nextInt(); //3층의 2번째 몬스터
				if(Num3_2 == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					normalMonster2.Attacked_Slime(thief.Attack());
					System.out.println("슬라임 체력 : "+normalMonster2.Hp_Slime);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(normalMonster2.Hp_Slime<=0)
					{	
						System.out.println("");
						System.out.println("슬라임가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
						thief.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("슬라임의 공격입니다.");
					thief.Attacked(normalMonster.Attack());
					System.out.println(creature.Name+" 체력 : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						thief.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				else if(Num3_2 ==2)
				{
					System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					normalMonster2.Attacked_Slime(thief.Skill());
					System.out.println("슬라임 체력 : "+normalMonster2.Hp_Slime);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(normalMonster2.Hp_Slime<=0)
					{	
						System.out.println("");
						System.out.println("슬라임가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
						thief.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("슬라임의 공격입니다.");
					thief.Attacked(normalMonster2.Attack());
					System.out.println(creature.Name+" 체력 : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						thief.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}

			System.out.println("");
			System.out.println("스켈레톤 등장!!");
			System.out.println("");
			normalMonster2.Skeleton();
			System.out.println("");
			System.out.println("######################");
			
			
			while(true) { //전투 반복
				System.out.println("1. 공격하기 / 2. 스킬사용");
				int Num3_2 = scan.nextInt(); //3층의 2번째 몬스터
				if(Num3_2 == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					normalMonster2.Attacked_Skeleton(thief.Attack());
					System.out.println("슬라임 체력 : "+normalMonster2.Hp_Skeleton);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(normalMonster2.Hp_Skeleton<=0)
					{	
						System.out.println("");
						System.out.println("슬라임가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
						thief.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("슬라임의 공격입니다.");
					thief.Attacked(normalMonster.Attack());
					System.out.println(creature.Name+" 체력 : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						thief.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				else if(Num3_2 ==2)
				{
					System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					normalMonster2.Attacked_Skeleton(thief.Skill());
					System.out.println("슬라임 체력 : "+normalMonster2.Hp_Skeleton);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(normalMonster2.Hp_Skeleton<=0)
					{	
						System.out.println("");
						System.out.println("슬라임가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
						thief.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("슬라임의 공격입니다.");
					thief.Attacked(normalMonster2.Attack());
					System.out.println(creature.Name+" 체력 : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						thief.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}
			
			
			System.out.println(">>시험의 탑 3층을 클리어하셨습니다!!!!");
			System.out.println(">>마을로 갑니다.");
			System.out.println("");
			thief.Hp = 100;
			thief.Fatigue +=40;
			thief.Mp = 100;
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");

			while(true) {
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				int Floor3 = scan.nextInt();
			if (Floor3 ==1) //스탯창
			{
				System.out.println("");
				
				thief.thief();
				System.out.println("1. 뒤로가기");
				int Num7 = scan.nextInt();
				if(Num7 ==1)
				{
					System.out.println("");
				}
			}	
			else if(Floor3 ==2) // 상점
			{
				Store store = new Store();
				store.Thi_sto(thief);
			}
				
			else if(Floor3 ==3) //여관
			{
				Inn Inn = new Inn();
				Inn.Thi_in(thief);
			}
			else if (Floor3 ==4) //시험의 탑
			{
				System.out.println("시험의 탑 다음층으로 갑니다.");
				System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
				System.out.println("1. 예 / 2. 아니오");
				
				int Floor3_1 = scan.nextInt();
				if(Floor3_1 ==1)
				{
					System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
					break;
				}
			
				else if(Floor3_1==2)
				{
					System.out.println("마을로 돌아갑니다. 정비해주세요");
					System.out.println("");
				}
			
			}
			
			else
			{
				System.out.println("잘못누르셨습니다.");
			}
	}
		
			
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("시험의 탑 4층");
			System.out.println("");
			System.out.println(">>중간보스입니다.");
			System.out.println(">>중간보스를 해치우면 2차스킬을 배울수있습니다.");

			MediumBoss2 mediumBoss2 = new MediumBoss2();//중간보스 클래스 불러오기

			System.out.println("");
			System.out.println("사신 등장!!");
			System.out.println("");
			mediumBoss2.Envoy();
			System.out.println("");
			System.out.println("######################");

			while(true) { //전투 반복
				System.out.println("1. 공격하기 / 2. 스킬 사용");
				int Battle_Envoy = scan.nextInt();
				if(Battle_Envoy == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					mediumBoss2.Attacked_Envoy(thief.Attack());
					System.out.println("사신 체력 : "+mediumBoss2.Hp);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(mediumBoss2.Hp<=0)
					{	
						System.out.println("");
						System.out.println("사신가 죽었습니다.");
						System.out.println("몬스터골드"+mediumBoss2.Gold+"를 획득하셨습니다.");
						thief.Gold+=mediumBoss2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("사신의 공격입니다.");
					thief.Attacked(mediumBoss2.Attack());
					System.out.println(creature.Name+" 체력 : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						thief.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				else if(Battle_Envoy == 2)
					
				{	System.out.println("");
				System.out.println(creature.Name+"의 공격입니다.");
				mediumBoss2.Attacked_Envoy(thief.Skill());
				System.out.println("사신 체력 : "+mediumBoss2.Hp);

				//몬스터의 체력이 0보다 작거나 같은 경우				
				if(mediumBoss2.Hp<=0)
				{	
					System.out.println("");
					System.out.println("사신가 죽었습니다.");
					System.out.println("몬스터골드"+mediumBoss2.Gold+"를 획득하셨습니다.");
					thief.Gold+=mediumBoss2.Gold;
					break;
				}
				System.out.println("");
				System.out.println("사신의 공격입니다.");
				thief.Attacked(mediumBoss2.Attack());
				System.out.println(creature.Name+" 체력 : "+thief.Hp);
				if(thief.Hp <=0)
				{	System.out.println("");
					System.out.println(creature.Name+"가 죽었습니다.");
					//영웅체력 1로 만든다.
					thief.Hp = 1;
					System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
					break;
				}
			}
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}
			
			System.out.println(">>대단해요 !! 중간보스를 쓰러트리셨어요!!");
			System.out.println(">>중간보스를 쓰러트려서 스킬을 배우셨습니다.");
			System.out.println("");
			System.out.println("2차스킬 절단마술을 배웠다!!");
			System.out.println("");
			thief.Skill2 ="절단마술";
			System.out.println(">>마을로 돌아갑니다.");
			thief.Hp = 100;
			thief.Fatigue +=40;
			thief.Mp = 100;
			
			while(true) {
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				int Floor5_1 = scan.nextInt();
			if (Floor5_1 ==1) //스탯창
			{
				System.out.println("");
				
				thief.thief();
				System.out.println("1. 뒤로가기");
				int Num7 = scan.nextInt();
				if(Num7 ==1)
				{
					System.out.println("");
				}
			}	
			else if(Floor5_1 ==2) // 상점
			{
				Store store = new Store();
				store.Thi_sto(thief);	
			}
			else if(Floor5_1 ==3) //여관
			{
				Inn Inn = new Inn();
				Inn.Thi_in(thief);
			}
			else if (Floor5_1 ==4) //시험의 탑
			{
				System.out.println("시험의 탑 다음층으로 갑니다.");
				System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
				System.out.println("1. 예 / 2. 아니오");
				
				int Floor5_2 = scan.nextInt();
				if(Floor5_2 ==1)
				{
					System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
					break;
				}
			
				else if(Floor5_2==2)
				{
					System.out.println("마을로 돌아갑니다. 정비해주세요");
					System.out.println("");
				}
			
			}
			
			else
			{
				System.out.println("잘못누르셨습니다.");
			}
			
	}
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("시험의 탑 5층");
			System.out.println("");
			System.out.println("드디어 마지막 5층까지 오셨군요!!");
			System.out.println(">>최종보스입니다.");
			System.out.println(">>최종보스를 해치우면 원래살던세계로 돌아갈수있어요!!");
			
			FinalBoss finalBoss = new FinalBoss();//중간보스 클래스 불러오기

			System.out.println("");
			System.out.println("드래곤 등장!!");
			System.out.println("");
			finalBoss.Dragon();
			System.out.println("");
			System.out.println("######################");

			while(true) { //전투 반복
				System.out.println("1. 공격하기 / 2. 1차 스킬 사용 / 3. 2차 스킬 사용");
				int Batlle_Dragon = scan.nextInt();
				if(Batlle_Dragon == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					finalBoss.Attacked_Dragon(thief.Attack());
					System.out.println("드래곤 체력 : "+finalBoss.Hp);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(finalBoss.Hp<=0)
					{	
						System.out.println("");
						System.out.println("드래곤가 죽었습니다.");
						System.out.println("몬스터골드"+finalBoss.Gold+"를 획득하셨습니다.");
						thief.Gold+=finalBoss.Gold;
						break;
					}
					System.out.println("");
					System.out.println("드래곤의 공격입니다.");
					thief.Attacked(finalBoss.Attack());
					System.out.println(creature.Name+" 체력 : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						thief.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				else if(Batlle_Dragon == 2)
					
				{	System.out.println("");
				System.out.println(creature.Name+"의 공격입니다.");
				finalBoss.Attacked_Dragon(thief.Skill());
				System.out.println("드래곤 체력 : "+finalBoss.Hp);

				//몬스터의 체력이 0보다 작거나 같은 경우				
				if(finalBoss.Hp<=0)
				{	
					System.out.println("");
					System.out.println("드래곤가 죽었습니다.");
					System.out.println("몬스터골드"+finalBoss.Gold+"를 획득하셨습니다.");
					thief.Gold+=finalBoss.Gold;
					break;
				}
				System.out.println("");
				System.out.println("드래곤의 공격입니다.");
				thief.Attacked(finalBoss.Attack());
				System.out.println(creature.Name+" 체력 : "+thief.Hp);
				if(thief.Hp <=0)
				{	System.out.println("");
					System.out.println(creature.Name+"가 죽었습니다.");
					//영웅체력 1로 만든다.
					thief.Hp = 1;
					System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
					break;
				}
			}
				else if(Batlle_Dragon == 3)
					
				{	System.out.println("");
				System.out.println(creature.Name+"의 공격입니다.");
				finalBoss.Attacked_Dragon(thief.Skill2());
				System.out.println("드래곤 체력 : "+finalBoss.Hp);

				//몬스터의 체력이 0보다 작거나 같은 경우				
				if(finalBoss.Hp<=0)
				{	
					System.out.println("");
					System.out.println("드래곤가 죽었습니다.");
					System.out.println("몬스터골드"+finalBoss.Gold+"를 획득하셨습니다.");
					thief.Gold+=finalBoss.Gold;
					break;
				}
				System.out.println("");
				System.out.println("드래곤의 공격입니다.");
				thief.Attacked(finalBoss.Attack());
				System.out.println(creature.Name+" 체력 : "+thief.Hp);
				if(thief.Hp <=0)
				{	System.out.println("");
					System.out.println(creature.Name+"가 죽었습니다.");
					//영웅체력 1로 만든다.
					thief.Hp = 1;
					System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
					break;
				}
			}
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}
			System.out.println();
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("");
			System.out.println(">> 모든층을 클리어하셨군요 !! 역시 해내실 줄 아셨어요!");
			System.out.println(">> 이제 원래있던 세계로 돌아갑니다.");
			System.out.println(">> 여기서 있었던 기억은 다 없어지고 시간은 그대로입니다. 평상시 처럼 생활하게 되실겁니다.\r\n" + 
					"");
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("");
			System.out.println("주인공 : 뭔가 아쉬운걸 ..? 원래세계로 돌아가면 소환수를 다신 못보는데..");
			System.out.println(creature.Name+" : ....");
			System.out.println("주인공 : 고생했어 "+creature.Name+"야 !!");
			System.out.println(creature.Name+" : ..!!");
			System.out.println("");
			System.out.println("");
			System.out.println("******************************************");
			System.out.println("");
			System.out.println("\t 게임을 플레이 해주셔서 감사합니다~!");
			System.out.println("");
			System.out.println("");
			System.out.println("******************************************");
		}
		else if(Num2 == 3)
		{
			System.out.print("궁수");
			System.out.println(" 소환수를 선택하셨군요. ");
			
			System.out.println("소환수의 이름을 말해주세요. ");
			
			creature.Name = scan.next();
			
			System.out.println(creature.Name+" 소환수를 육성하여 게임을 클리어하세요 !!");
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");
			System.out.println("프롤로그");
			System.out.println("");
			System.out.println("주인공 : ...!?");
			System.out.println("주인공 : 여기가 어디지..?"); 
			System.out.println("주인공 : 난 분명 집에서 잠을 자고 있었는데..?");
			System.out.println("주인공 : 뭐야 꿈인가 ?");
			System.out.println("주인공 : (볼을 꼬집는다)");
			System.out.println("주인공 : 아얏!.. 꿈은 아닌데…");
			System.out.println(">>안녕하세요 당신은 이세계의 주인공 입니다.");
			System.out.println("주인공 : !? 어디서 들리는거지?");
			System.out.println(">>시험의 탑에가서 각 몬스터를 쓰러뜨리고 최종보스까지 무찌르세요.");
			System.out.println(">>그러면 당신이 원래 살던곳 으로 갈수 있습니다.");
			System.out.println("주인공 : ..? 뭐지 여기가 이세계라고?");
			System.out.println(">> 오른쪽을 보면 당신 옆에 소환수가 있을겁니다. 소환수를 육성하여 최종보스를 쓰러뜨리세요!!");
			System.out.println("(여기서 각 고른 소환수 등장)");
			System.out.println("");
			System.out.println(creature.Name+" : …");
			System.out.println("주인공 : 이것이 소환수인가..?");
			System.out.println("주인공 : 일단 시험의 탑에 가볼까.");
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");
			System.out.println("");
			System.out.println("시험의 탑 1층");
			System.out.println("");
			System.out.println(">>시험의 탑 1층입니다.");
			System.out.println(">>초반에 기본공격으로 몬스터를 제압하고 중반에 스킬을 배울수 있습니다.");
			System.out.println(">>몬스터를 모두 제압하고 던전을 클리어하세요 !!");
			Archer archer = new Archer();//기사 클래스 인스턴스 생성
			NormalMonster normalMonster = new NormalMonster();//노말몬스터 클래스 불러오기
			System.out.println("");
			System.out.println("박쥐등장!!");
			System.out.println("");
			normalMonster.Bat();
			System.out.println("");
			System.out.println("######################");
			System.out.println("1. 공격하기");
			
			int Battle_Bat = scan.nextInt();
			
			while(true) { //전투 반복
				if(Battle_Bat == 1)
				{	System.out.println("");
					System.out.println("소환수"+"의 공격입니다.");
					normalMonster.Attacked_Bat(archer.Attack());
					System.out.println("박쥐 체력 : "+normalMonster.Hp_Bat);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(normalMonster.Hp_Bat<=0)
					{	
						System.out.println("");
						System.out.println("박쥐가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster.Gold+"를 획득하셨습니다.");
						archer.Gold+=normalMonster.Gold;
						break;
					}
					System.out.println("");
					System.out.println("박쥐의 공격입니다.");
					archer.Attacked(normalMonster.Attack());
					System.out.println("소환수"+" 체력 : "+archer.Hp);
					System.out.println(normalMonster.Power);
					if(archer.Hp <=0)
					{	System.out.println("");
						System.out.println("소환수"+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						archer.Hp = 1;
						System.out.println("소환수"+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}
			
			System.out.println("");
			System.out.println("달팽이 등장!!");
			normalMonster.Snail();
			System.out.println("");
			System.out.println("######################");
			System.out.println("1. 공격하기");

			int Battle_Snail = scan.nextInt();
		
			while(true) {
				if(Battle_Snail == 1)
				{	System.out.println("");
					System.out.println("소환수"+"의 공격입니다.");
					normalMonster.Attacked_Snail(archer.Attack());
					System.out.println("달팽이 체력 : "+normalMonster.Hp_Snail);
					//몬스터의 체력이 0보다 작거나 같은 경우
					
					if(normalMonster.Hp_Snail<=0)
					{	
						System.out.println("");
						System.out.println("달팽이가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster.Gold+"를 획득하셨습니다.");
						archer.Gold+=normalMonster.Gold;
						break;
					}
					System.out.println("");
					System.out.println("달팽이의 공격입니다.");
					System.out.println("");
					archer.Attacked(normalMonster.Attack());
					System.out.println("소환수"+" 체력 : "+archer.Hp);
					if(archer.Hp <=0)
					{	System.out.println("");
						System.out.println("소환수"+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						archer.Hp = 1;
						System.out.println("소환수"+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}
			
			System.out.println("");
			System.out.println("토끼 등장!!");
			normalMonster.Rabbit();
			System.out.println("");
			System.out.println("######################");
			System.out.println("1. 공격하기");

			int Battle_Rabbit = scan.nextInt();
		
			while(true) {
				if(Battle_Rabbit == 1)
				{	System.out.println("");
					System.out.println("소환수"+"의 공격입니다.");
					normalMonster.Attacked_Rabbit(archer.Attack());
					System.out.println("토끼 체력 : "+normalMonster.Hp_Rabbit);
					//몬스터의 체력이 0보다 작거나 같은 경우
					
					if(normalMonster.Hp_Rabbit<=0)
					{	
						System.out.println("");
						System.out.println("토끼가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster.Gold+"를 획득하셨습니다.");
						archer.Gold+=normalMonster.Gold;
						break;
					}
					System.out.println("");
					System.out.println("토끼의 공격입니다.");
					archer.Attacked(normalMonster.Attack());
					System.out.println("소환수"+" 체력 : "+archer.Hp);
					if(archer.Hp <=0)
					{	System.out.println("");
						System.out.println("소환수"+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						archer.Hp = 1;
						System.out.println("소환수"+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}
			
			System.out.println("");
			System.out.println("");
			archer.Fatigue+=40;
			System.out.println(">>시험의 탑 1층을 클리어하셨습니다!!!!");
			System.out.println(">>마을로 갑니다.");
			System.out.println("");
			archer.Hp=100;

			Weapon weapon = new Weapon(); // 무기 클래스 객체생성
			Armor armor = new Armor(); // 아머 클래스 객체생성
			
			
			while(true) {
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				int Floor2 = scan.nextInt();
			if (Floor2 ==1) //스탯창
			{
				System.out.println("");
				
				archer.archer();
				System.out.println("1. 뒤로가기");
				int Num7 = scan.nextInt();
				if(Num7 ==1)
				{
					System.out.println("");
				}
			}	
			else if(Floor2 ==2) // 상점
			{
				Store store = new Store();
				store.Arc_sto(archer);
			}
				
			else if(Floor2 ==3) //여관
			{
				Inn Inn = new Inn();
				Inn.Arc_in(archer);
			}
			else if (Floor2 ==4) //시험의 탑
			{
				System.out.println("시험의 탑 다음층으로 갑니다.");
				System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
				System.out.println("1. 예 / 2. 아니오");
				
				int Floor2_1 = scan.nextInt();
				if(Floor2_1 ==1)
				{
					System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
					break;
				}
			
				else if(Floor2_1==2)
				{
					System.out.println("마을로 돌아갑니다. 정비해주세요");
					System.out.println("");
				}
			
			}
			
			else
			{
				System.out.println("잘못누르셨습니다.");
			}
	}
			
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("시험의 탑 2층");
			System.out.println("");
			System.out.println(">>2층과 4층은 중간보스가 출현합니다.");
			System.out.println(">>중간보스를 무찌르면 스킬을 배우실 수 있습니다.");
			
			MediumBoss mediumBoss = new MediumBoss();//중간보스 클래스 불러오기

			System.out.println("");
			System.out.println("오우거 등장!!");
			System.out.println("");
			mediumBoss.Ogre();
			System.out.println("");
			System.out.println("######################");
			System.out.println("1. 공격하기");
			int Battle_Ogre = scan.nextInt();
			while(true) { //전투 반복
				
				if(Battle_Ogre == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					mediumBoss.Attacked_Ogre(archer.Attack());
					System.out.println("오우거 체력 : "+mediumBoss.Hp);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(mediumBoss.Hp<=0)
					{	
						System.out.println("");
						System.out.println("오우거가 죽었습니다.");
						System.out.println("몬스터골드"+mediumBoss.Gold+"를 획득하셨습니다.");
						archer.Gold+=mediumBoss.Gold;
						break;
					}
					System.out.println("");
					System.out.println("오우거의 공격입니다.");
					archer.Attacked(mediumBoss.Attack());
					System.out.println(creature.Name+" 체력 : "+archer.Hp);
					if(archer.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						archer.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}
			
			System.out.println(">>대단해요 !! 중간보스를 쓰러트리셨어요!!");
			System.out.println(">>중간보스를 쓰러트려서 스킬을 배우셨습니다.");
			System.out.println("");
			System.out.println("1차스킬 더블샷을 배웠다!!");
			System.out.println("");
			archer.Skill ="더블샷";
			System.out.println(">>마을로 돌아갑니다.");
			archer.Hp = 100;
			archer.Fatigue +=40;
			
			while(true) {
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				int Floor3 = scan.nextInt();
			if (Floor3 ==1) //스탯창
			{
				System.out.println("");
				
				archer.archer();
				System.out.println("1. 뒤로가기");
				int Num7 = scan.nextInt();
				if(Num7 ==1)
				{
					System.out.println("");
				}
			}	
			else if(Floor3 ==2) // 상점
			{
				Store store = new Store();
				store.Arc_sto(archer);
			
			}
			else if(Floor3 ==3) //여관
			{
				Inn Inn = new Inn();
				Inn.Arc_in(archer);
			}
			else if (Floor3 ==4) //시험의 탑
			{
				System.out.println("시험의 탑 다음층으로 갑니다.");
				System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
				System.out.println("1. 예 / 2. 아니오");
				
				int Floor3_1 = scan.nextInt();
				if(Floor3_1 ==1)
				{
					System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
					break;
				}
			
				else if(Floor3_1==2)
				{
					System.out.println("마을로 돌아갑니다. 정비해주세요");
					System.out.println("");
				}
			
			}
			
			else
			{
				System.out.println("잘못누르셨습니다.");
			}
		
			
		}
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("시험의 탑 3층");
			System.out.println("");
			System.out.println(">>스킬을 배우셨으니 스킬과 일반공격을 적절히 사용해서 적을 해치우세요");
		
			NormalMonster2 normalMonster2 = new NormalMonster2(); //3층 몬스터 불러오기
			
			System.out.println("");
			System.out.println("다람쥐 등장!!");
			System.out.println("");
			normalMonster2.Chipmunk();
			System.out.println("");
			System.out.println("######################");
			
			while(true) { //전투 반복
				System.out.println("1. 공격하기 / 2. 스킬사용");
				int Num3_1 = scan.nextInt(); //3층의 첫번째 몬스터	
				if(Num3_1 == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					normalMonster2.Attacked_Chipmunk(archer.Attack());
					System.out.println("다람쥐 체력 : "+normalMonster2.Hp_Chipmunk);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(normalMonster2.Hp_Chipmunk<=0)
					{	
						System.out.println("");
						System.out.println("다람쥐가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
						archer.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("다람쥐의 공격입니다.");
					archer.Attacked(normalMonster2.Attack());
					System.out.println(creature.Name+" 체력 : "+archer.Hp);
					if(archer.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						archer.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				else if(Num3_1 ==2)
				{
					System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					normalMonster2.Attacked_Chipmunk(archer.Skill());
					System.out.println("다람쥐 체력 : "+normalMonster2.Hp_Chipmunk);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(normalMonster2.Hp_Chipmunk<=0)
					{	
						System.out.println("");
						System.out.println("다람쥐가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
						archer.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("다람쥐의 공격입니다.");
					archer.Attacked(normalMonster2.Attack());
					System.out.println(creature.Name+" 체력 : "+archer.Hp);
					if(archer.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						archer.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}

	System.out.println("");
			System.out.println("슬라임 등장!!");
			System.out.println("");
			normalMonster2.Slime();
			System.out.println("");
			System.out.println("######################");
			
			
			while(true) { //전투 반복
				System.out.println("1. 공격하기 / 2. 스킬사용");
				int Num3_2 = scan.nextInt(); //3층의 2번째 몬스터
				if(Num3_2 == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					normalMonster2.Attacked_Slime(archer.Attack());
					System.out.println("슬라임 체력 : "+normalMonster2.Hp_Slime);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(normalMonster2.Hp_Slime<=0)
					{	
						System.out.println("");
						System.out.println("슬라임가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
						archer.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("슬라임의 공격입니다.");
					archer.Attacked(normalMonster.Attack());
					System.out.println(creature.Name+" 체력 : "+archer.Hp);
					if(archer.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						archer.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				else if(Num3_2 ==2)
				{
					System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					normalMonster2.Attacked_Slime(archer.Skill());
					System.out.println("슬라임 체력 : "+normalMonster2.Hp_Slime);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(normalMonster2.Hp_Slime<=0)
					{	
						System.out.println("");
						System.out.println("슬라임가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
						archer.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("슬라임의 공격입니다.");
					archer.Attacked(normalMonster2.Attack());
					System.out.println(creature.Name+" 체력 : "+archer.Hp);
					if(archer.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						archer.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}

			System.out.println("");
			System.out.println("스켈레톤 등장!!");
			System.out.println("");
			normalMonster2.Skeleton();
			System.out.println("");
			System.out.println("######################");
			
			
			while(true) { //전투 반복
				System.out.println("1. 공격하기 / 2. 스킬사용");
				int Num3_2 = scan.nextInt(); //3층의 2번째 몬스터
				if(Num3_2 == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					normalMonster2.Attacked_Skeleton(archer.Attack());
					System.out.println("슬라임 체력 : "+normalMonster2.Hp_Skeleton);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(normalMonster2.Hp_Skeleton<=0)
					{	
						System.out.println("");
						System.out.println("슬라임가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
						archer.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("슬라임의 공격입니다.");
					archer.Attacked(normalMonster.Attack());
					System.out.println(creature.Name+" 체력 : "+archer.Hp);
					if(archer.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						archer.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				else if(Num3_2 ==2)
				{
					System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					normalMonster2.Attacked_Skeleton(archer.Skill());
					System.out.println("슬라임 체력 : "+normalMonster2.Hp_Skeleton);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(normalMonster2.Hp_Skeleton<=0)
					{	
						System.out.println("");
						System.out.println("슬라임가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
						archer.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("슬라임의 공격입니다.");
					archer.Attacked(normalMonster2.Attack());
					System.out.println(creature.Name+" 체력 : "+archer.Hp);
					if(archer.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						archer.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}
			
			
			System.out.println(">>시험의 탑 3층을 클리어하셨습니다!!!!");
			System.out.println(">>마을로 갑니다.");
			System.out.println("");
			archer.Hp = 100;
			archer.Fatigue +=40;
			archer.Mp = 100;
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");

			while(true) {
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				int Floor3 = scan.nextInt();
			if (Floor3 ==1) //스탯창
			{
				System.out.println("");
				
				archer.archer();
				System.out.println("1. 뒤로가기");
				int Num7 = scan.nextInt();
				if(Num7 ==1)
				{
					System.out.println("");
				}
			}	
			else if(Floor3 ==2) // 상점
			{
				Store store = new Store();
				store.Arc_sto(archer);
			}
				
			else if(Floor3 ==3) //여관
			{
				Inn Inn = new Inn();
				Inn.Arc_in(archer);
			}
			else if (Floor3 ==4) //시험의 탑
			{
				System.out.println("시험의 탑 다음층으로 갑니다.");
				System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
				System.out.println("1. 예 / 2. 아니오");
				
				int Floor3_1 = scan.nextInt();
				if(Floor3_1 ==1)
				{
					System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
					break;
				}
			
				else if(Floor3_1==2)
				{
					System.out.println("마을로 돌아갑니다. 정비해주세요");
					System.out.println("");
				}
			
			}
			
			else
			{
				System.out.println("잘못누르셨습니다.");
			}
	}
		
			
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("시험의 탑 4층");
			System.out.println("");
			System.out.println(">>중간보스입니다.");
			System.out.println(">>중간보스를 해치우면 2차스킬을 배울수있습니다.");

			MediumBoss2 mediumBoss2 = new MediumBoss2();//중간보스 클래스 불러오기

			System.out.println("");
			System.out.println("사신 등장!!");
			System.out.println("");
			mediumBoss2.Envoy();
			System.out.println("");
			System.out.println("######################");

			while(true) { //전투 반복
				System.out.println("1. 공격하기 / 2. 스킬 사용");
				int Battle_Envoy = scan.nextInt();
				if(Battle_Envoy == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					mediumBoss2.Attacked_Envoy(archer.Attack());
					System.out.println("사신 체력 : "+mediumBoss2.Hp);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(mediumBoss2.Hp<=0)
					{	
						System.out.println("");
						System.out.println("사신가 죽었습니다.");
						System.out.println("몬스터골드"+mediumBoss2.Gold+"를 획득하셨습니다.");
						archer.Gold+=mediumBoss2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("사신의 공격입니다.");
					archer.Attacked(mediumBoss2.Attack());
					System.out.println(creature.Name+" 체력 : "+archer.Hp);
					if(archer.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						archer.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				else if(Battle_Envoy == 2)
					
				{	System.out.println("");
				System.out.println(creature.Name+"의 공격입니다.");
				mediumBoss2.Attacked_Envoy(archer.Skill());
				System.out.println("사신 체력 : "+mediumBoss2.Hp);

				//몬스터의 체력이 0보다 작거나 같은 경우				
				if(mediumBoss2.Hp<=0)
				{	
					System.out.println("");
					System.out.println("사신가 죽었습니다.");
					System.out.println("몬스터골드"+mediumBoss2.Gold+"를 획득하셨습니다.");
					archer.Gold+=mediumBoss2.Gold;
					break;
				}
				System.out.println("");
				System.out.println("사신의 공격입니다.");
				archer.Attacked(mediumBoss2.Attack());
				System.out.println(creature.Name+" 체력 : "+archer.Hp);
				if(archer.Hp <=0)
				{	System.out.println("");
					System.out.println(creature.Name+"가 죽었습니다.");
					//영웅체력 1로 만든다.
					archer.Hp = 1;
					System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
					break;
				}
			}
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}
			
			System.out.println(">>대단해요 !! 중간보스를 쓰러트리셨어요!!");
			System.out.println(">>중간보스를 쓰러트려서 스킬을 배우셨습니다.");
			System.out.println("");
			System.out.println("2차스킬 마법화살을 배웠다!!");
			System.out.println("");
			archer.Skill2 ="마법화살";
			System.out.println(">>마을로 돌아갑니다.");
			archer.Hp = 100;
			archer.Fatigue +=40;
			archer.Mp = 100;
			
			while(true) {
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				int Floor5_1 = scan.nextInt();
			if (Floor5_1 ==1) //스탯창
			{
				System.out.println("");
				
				archer.archer();
				System.out.println("1. 뒤로가기");
				int Num7 = scan.nextInt();
				if(Num7 ==1)
				{
					System.out.println("");
				}
			}	
			else if(Floor5_1 ==2) // 상점
			{
				Store store = new Store();
				store.Arc_sto(archer);	
			}
			else if(Floor5_1 ==3) //여관
			{
				Inn Inn = new Inn();
				Inn.Arc_in(archer);
			}
			else if (Floor5_1 ==4) //시험의 탑
			{
				System.out.println("시험의 탑 다음층으로 갑니다.");
				System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
				System.out.println("1. 예 / 2. 아니오");
				
				int Floor5_2 = scan.nextInt();
				if(Floor5_2 ==1)
				{
					System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
					break;
				}
			
				else if(Floor5_2==2)
				{
					System.out.println("마을로 돌아갑니다. 정비해주세요");
					System.out.println("");
				}
			
			}
			
			else
			{
				System.out.println("잘못누르셨습니다.");
			}
			
	}
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("시험의 탑 5층");
			System.out.println("");
			System.out.println("드디어 마지막 5층까지 오셨군요!!");
			System.out.println(">>최종보스입니다.");
			System.out.println(">>최종보스를 해치우면 원래살던세계로 돌아갈수있어요!!");
			
			FinalBoss finalBoss = new FinalBoss();//중간보스 클래스 불러오기

			System.out.println("");
			System.out.println("드래곤 등장!!");
			System.out.println("");
			finalBoss.Dragon();
			System.out.println("");
			System.out.println("######################");

			while(true) { //전투 반복
				System.out.println("1. 공격하기 / 2. 1차 스킬 사용 / 3. 2차 스킬 사용");
				int Batlle_Dragon = scan.nextInt();
				if(Batlle_Dragon == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
					finalBoss.Attacked_Dragon(archer.Attack());
					System.out.println("드래곤 체력 : "+finalBoss.Hp);

					//몬스터의 체력이 0보다 작거나 같은 경우				
					if(finalBoss.Hp<=0)
					{	
						System.out.println("");
						System.out.println("드래곤가 죽었습니다.");
						System.out.println("몬스터골드"+finalBoss.Gold+"를 획득하셨습니다.");
						archer.Gold+=finalBoss.Gold;
						break;
					}
					System.out.println("");
					System.out.println("드래곤의 공격입니다.");
					archer.Attacked(finalBoss.Attack());
					System.out.println(creature.Name+" 체력 : "+archer.Hp);
					if(archer.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"가 죽었습니다.");
						//영웅체력 1로 만든다.
						archer.Hp = 1;
						System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
						break;
					}
				}
				else if(Batlle_Dragon == 2)
					
				{	System.out.println("");
				System.out.println(creature.Name+"의 공격입니다.");
				finalBoss.Attacked_Dragon(archer.Skill());
				System.out.println("드래곤 체력 : "+finalBoss.Hp);

				//몬스터의 체력이 0보다 작거나 같은 경우				
				if(finalBoss.Hp<=0)
				{	
					System.out.println("");
					System.out.println("드래곤가 죽었습니다.");
					System.out.println("몬스터골드"+finalBoss.Gold+"를 획득하셨습니다.");
					archer.Gold+=finalBoss.Gold;
					break;
				}
				System.out.println("");
				System.out.println("드래곤의 공격입니다.");
				archer.Attacked(finalBoss.Attack());
				System.out.println(creature.Name+" 체력 : "+archer.Hp);
				if(archer.Hp <=0)
				{	System.out.println("");
					System.out.println(creature.Name+"가 죽었습니다.");
					//영웅체력 1로 만든다.
					archer.Hp = 1;
					System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
					break;
				}
			}
				else if(Batlle_Dragon == 3)
					
				{	System.out.println("");
				System.out.println(creature.Name+"의 공격입니다.");
				finalBoss.Attacked_Dragon(archer.Skill2());
				System.out.println("드래곤 체력 : "+finalBoss.Hp);

				//몬스터의 체력이 0보다 작거나 같은 경우				
				if(finalBoss.Hp<=0)
				{	
					System.out.println("");
					System.out.println("드래곤가 죽었습니다.");
					System.out.println("몬스터골드"+finalBoss.Gold+"를 획득하셨습니다.");
					archer.Gold+=finalBoss.Gold;
					break;
				}
				System.out.println("");
				System.out.println("드래곤의 공격입니다.");
				archer.Attacked(finalBoss.Attack());
				System.out.println(creature.Name+" 체력 : "+archer.Hp);
				if(archer.Hp <=0)
				{	System.out.println("");
					System.out.println(creature.Name+"가 죽었습니다.");
					//영웅체력 1로 만든다.
					archer.Hp = 1;
					System.out.println(creature.Name+"이 체력 1로 부활하였습니다.");
					break;
				}
			}
				else
				{
					System.out.println("잘못누르셨습니다.");
				}
			}
			System.out.println();
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("");
			System.out.println(">> 모든층을 클리어하셨군요 !! 역시 해내실 줄 아셨어요!");
			System.out.println(">> 이제 원래있던 세계로 돌아갑니다.");
			System.out.println(">> 여기서 있었던 기억은 다 없어지고 시간은 그대로입니다. 평상시 처럼 생활하게 되실겁니다.\r\n" + 
					"");
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("");
			System.out.println("주인공 : 뭔가 아쉬운걸 ..? 원래세계로 돌아가면 소환수를 다신 못보는데..");
			System.out.println(creature.Name+" : ....");
			System.out.println("주인공 : 고생했어 "+creature.Name+"야 !!");
			System.out.println(creature.Name+" : ..!!");
			System.out.println("");
			System.out.println("");
			System.out.println("******************************************");
			System.out.println("");
			System.out.println("\t 게임을 플레이 해주셔서 감사합니다~!");
			System.out.println("");
			System.out.println("");
			System.out.println("******************************************");
		}
		else {
			System.out.println("잘못누르셨습니다.");
		}
	

}
}

