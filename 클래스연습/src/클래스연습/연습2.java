package 클래스연습;

import java.util.Scanner;

public class 연습2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

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
		
		Item item = new Item(); // 아이템 클래스 객체생성
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
		
	}

}
