package 자바4주차;

import java.util.Scanner;

public class 메인연습본2 {

	public static void main(String[] args) {
Creature creature = new Creature(); // Creature 클래스 불러오기

		
		int Blank =0; //화면 넘기기
		
		System.out.println("프롤로그");
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
			NormalMonster normalMonster = new NormalMonster();//노말몬스터 클래스 불러오기
			Knight knight = new Knight(); // 기사 클래스 불러오기
			System.out.println("");
			System.out.println("박쥐등장!!");
			System.out.println("");
			normalMonster.Bat();
			System.out.println("");
			System.out.println("######################");
			System.out.println("1. 공격하기");

			int Num3 = scan.nextInt();
		
			while(true) { //전투 반복
				if(Num3 == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
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
			System.out.println("달팽이 등장!!");
			normalMonster.Snail();
			System.out.println("");
			System.out.println("######################");
			System.out.println("1. 공격하기");

			int Num4 = scan.nextInt();
		
			while(true) {
				if(Num4 == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
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
			System.out.println("토끼 등장!!");
			normalMonster.Rabbit();
			System.out.println("");
			System.out.println("######################");
			System.out.println("1. 공격하기");

			int Num5 = scan.nextInt();
		
			while(true) {
				if(Num5 == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"의 공격입니다.");
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
			System.out.println("");
			knight.Fatigue+=40;
			System.out.println(">>시험의 탑 1층을 클리어하셨습니다!!!!");
			System.out.println(">>마을로 갑니다.");
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");
			System.out.println("");
			System.out.println("주인공 : 이것이 이세계의 전투구나…");
			System.out.println("주인공 : 무서웠어.. 죽는줄 알았어…");
			System.out.println("");
			System.out.println(">>고생하셨어요! 1층을 클리어하셧네요");
			System.out.println(">>획득한 골드를 이용하여 상점에서 아이템을 살수있습니다.");
			System.out.println(">>이 게임은 피로도 시스템이 존재합니다!!");
			System.out.println(">>여관에서 피로도를 회복하세요!");
			System.out.println(">>던전을 클리어할때마다 피로도가 증가합니다.");
			System.out.println(">>피로도가 100이되면 게임에 패배하게됩니다.");
			System.out.println(">>소환수를 더욱 강력하게 만드세요!!");
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			Item item = new Item(); // 아이템 클래스 불러오기
			
			
			
			
			while(true) {
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				int Num6 = scan.nextInt();
			if (Num6 ==1) //스탯창
			{
				System.out.println("");
				
				knight.Knight();
				System.out.println("1. 뒤로가기");
				int Num7 = scan.nextInt();
				if(Num7 ==1)
				{
					System.out.println("");
				}
			}	
			else if(Num6 ==2) // 상점
			{
				System.out.println("");
				System.out.println(">>상점에 오신것을 환영합니다!!");
				System.out.println(">>상점에선 필요한 상품을 골드를 이용해 살 수 있습니다.");
				System.out.println("");
				item.Sword(); // 무기상품 불러오기
				System.out.println("");
				System.out.println("어떤 상품을 사시겠습니까?");
				System.out.println("1. 아이언소드 / 2. 실버소드 / 3. 골드소드 / 4. 다이아소드");
				int Num9 = scan.nextInt(); //스캐너 입력
				if(Num9 == 1 )
				{
					
					if(knight.Gold>=100) //아이언소드 구매
					{
						System.out.println("아이언소드를 100G에 구매하셨습니다.");
						System.out.println("구매하신 무기는 자동장착됩니다.");
						knight.Gold-=100;
						knight.Power+=10;
						System.out.println("현재 소지골드 : "+knight.Gold);
						System.out.println("현재 공격력    : "+knight.Power);
					}
					else // 돈이 부족할떄
					{
						System.out.println("");
						System.out.println("보유하신 골드가 부족합니다. 상점에서 쫒겨납니다.");
					}
					System.out.println("");
				}
				else if(Num9 == 2)
				{
					if(knight.Gold>=200) //실버소드 구매
					{
						System.out.println("실버소드를 200G에 구매하셨습니다.");
						System.out.println("구매하신 무기는 자동장착됩니다.");
						knight.Gold-=200;
						knight.Power+=20;
						System.out.println("현재 소지골드 : "+knight.Gold);
						System.out.println("현재 공격력    : "+knight.Power);
					}
					else // 돈이 부족할때
					{
						System.out.println("");
						System.out.println("보유하신 골드가 부족합니다. 상점에서 쫒겨납니다.");
					}
					System.out.println("");
				}
				else if(Num9 == 3)
				{
					if(knight.Gold>=200) //골드소드 구매
					{
						System.out.println("골드소드를 300G에 구매하셨습니다.");
						System.out.println("구매하신 무기는 자동장착됩니다.");
						knight.Gold-=300;
						knight.Power+=30;
						System.out.println("현재 소지골드 : "+knight.Gold);
						System.out.println("현재 공격력    : "+knight.Power);
					}
					else // 돈이 부족할때
					{
						System.out.println("");
						System.out.println("보유하신 골드가 부족합니다. 상점에서 쫒겨납니다.");
					}
					System.out.println("");
				}
				else if(Num9 == 4)
				{
					if(knight.Gold>=200) //다이아소드 구매
					{
						System.out.println("다이아소드를 400G에 구매하셨습니다.");
						System.out.println("구매하신 무기는 자동장착됩니다.");
						knight.Gold-=400;
						knight.Power+=40;
						System.out.println("현재 소지골드 : "+knight.Gold);
						System.out.println("현재 공격력    : "+knight.Power);
					}
					else // 돈이 부족할때
					{
						System.out.println("");
						System.out.println("보유하신 골드가 부족합니다. 상점에서 쫒겨납니다.");
					}
					System.out.println("");
				}
			
			}
			else if(Num6 ==3) //여관
			{
				System.out.println("");
				System.out.println(">>여관에 오신것을 환영합니다!!");
				System.out.println(">>여관에선 시험의 탑에서 쌓인 피로도를 회복할수있습니다.");
				System.out.println(">>골드를 내고 여관에서 휴식하시겠습니까?");
				System.out.println("");
				System.out.println("피로도 상태 :"+knight.Fatigue);
				System.out.println("");
				System.out.println("1. 예 / 2. 아니오");
				int Num8 = scan.nextInt();
				if( Num8 ==1)
				{
					knight.Gold-=10;
					knight.Fatigue=0;
					System.out.println("10골드를 내고 휴식을 취합니다.");
					System.out.println("현재 소지골드 : "+knight.Gold);
					System.out.println("현재 피로도    : "+knight.Fatigue);
					System.out.println("");
				}
				else if(Num8 == 2)
				{
					System.out.println();
				}
			}
			else if (Num6 ==4) //시험의 탑
			{
				System.out.println("시험의 탑 다음층으로 갑니다.");
				System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
				System.out.println("1. 예 / 2. 아니오");
				
				int Num9 = scan.nextInt();
				if(Num9 ==1)
				{
					System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
					break;
				}
			
				else if(Num9==2)
				{
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
			
			
		}
		
		
		else if(Num2 == 2)
		{
			System.out.print("도적");
		}
		else if(Num2 == 3)
		{
			System.out.print("궁수");
		}
		else {
			System.out.println("잘못누르셨습니다.");
		}
		
	}

}
