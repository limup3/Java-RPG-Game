package 클래스연습;

public class 연습5 {

	public static void main(String[] args) {
		void store3(Archer archer) {
			Weapon weapon = new Weapon(); // 무기 클래스 객체생성
			Armor armor = new Armor(); // 아머 클래스 객체생성
			
			
			System.out.println("");
			System.out.println(">>상점에 오신것을 환영합니다!!");
			System.out.println(">>상점에선 필요한 상품을 골드를 이용해 살 수 있습니다.");
			System.out.println("");
			
			
			System.out.println("1. 무기 / 2. 방어구");
			int List3 = scan.nextInt(); //스캐너 입력
			if(List3 == 1)
			{
				weapon.Bow(); // 무기상품 불러오기
				System.out.println("");
				System.out.println("어떤 상품을 사시겠습니까?");
				System.out.println("1. 아이언보우 / 2. 실버보우 / 3. 골드보우 / 4. 다이아보우");
				int Num11 = scan.nextInt(); //스캐너 입력
				if(Num11 == 1 )
				{
					
					if(archer.Gold>=100) //아이언보우 구매
					{
						System.out.println("아이언보우를 100G에 구매하셨습니다.");
						System.out.println("구매하신 무기는 자동장착됩니다.");
						archer.Gold-=100;
						archer.Power+=10;
						System.out.println("현재 소지골드 : "+archer.Gold);
						System.out.println("현재 공격력    : "+archer.Power);
					}
					else // 돈이 부족할떄
					{
						System.out.println("");
						System.out.println("보유하신 골드가 부족합니다. 상점에서 쫒겨납니다.");
					}
					System.out.println("");
				}
				else if(Num11 == 2)
				{
					if(archer.Gold>=200) //실버보우 구매
					{
						System.out.println("실버보우를 200G에 구매하셨습니다.");
						System.out.println("구매하신 무기는 자동장착됩니다.");
						archer.Gold-=200;
						archer.Power+=20;
						System.out.println("현재 소지골드 : "+archer.Gold);
						System.out.println("현재 공격력    : "+archer.Power);
					}
					else // 돈이 부족할때
					{
						System.out.println("");
						System.out.println("보유하신 골드가 부족합니다. 상점에서 쫒겨납니다.");
					}
					System.out.println("");
				}
				else if(Num11 == 3)
				{
					if(archer.Gold>=300) //골드보우 구매
					{
						System.out.println("골드보우를 300G에 구매하셨습니다.");
						System.out.println("구매하신 무기는 자동장착됩니다.");
						archer.Gold-=300;
						archer.Power+=30;
						System.out.println("현재 소지골드 : "+archer.Gold);
						System.out.println("현재 공격력    : "+archer.Power);
					}
					else // 돈이 부족할때
					{
						System.out.println("");
						System.out.println("보유하신 골드가 부족합니다. 상점에서 쫒겨납니다.");
					}
					System.out.println("");
				}
				else if(Num11 == 4)
				{
					if(archer.Gold>=400) //다이아보우 구매
					{
						System.out.println("다이아보우를 400G에 구매하셨습니다.");
						System.out.println("구매하신 무기는 자동장착됩니다.");
						archer.Gold-=400;
						archer.Power+=40;
						System.out.println("현재 소지골드 : "+archer.Gold);
						System.out.println("현재 공격력    : "+archer.Power);
					}
					else // 돈이 부족할때
					{
						System.out.println("");
						System.out.println("보유하신 골드가 부족합니다. 상점에서 쫒겨납니다.");
					}
					System.out.println("");
				}
			
			}
			else if(List3 == 2)
			{
				armor.Armor(); // 무기상품 불러오기
				System.out.println("");
				System.out.println("어떤 상품을 사시겠습니까?");
				System.out.println("1. 아이언아머 / 2. 실버아머 / 3. 골드아머 / 4. 다이아아머");
				int Armor = scan.nextInt(); //스캐너 입력
				if(Armor == 1 )
				{
					
					if(archer.Gold>=100) //아이언아머 구매
					{
						System.out.println("아이언아머를 100G에 구매하셨습니다.");
						System.out.println("구매하신 방어구는 자동장착됩니다.");
						archer.Gold-=100;
						archer.Depense+=10;
						System.out.println("현재 소지골드 : "+archer.Gold);
						System.out.println("현재 방어력    : "+archer.Depense);
					}
					else // 돈이 부족할떄
					{
						System.out.println("");
						System.out.println("보유하신 골드가 부족합니다. 상점에서 쫒겨납니다.");
					}
					System.out.println("");
				}
				else if(Armor == 2)
				{
					if(archer.Gold>=200) //실버아머 구매
					{
						System.out.println("실버아머를 200G에 구매하셨습니다.");
						System.out.println("구매하신 방어구는 자동장착됩니다.");
						archer.Gold-=200;
						archer.Depense+=20;
						System.out.println("현재 소지골드 : "+archer.Gold);
						System.out.println("현재 방어력    : "+archer.Depense);
					}
					else // 돈이 부족할때
					{
						System.out.println("");
						System.out.println("보유하신 골드가 부족합니다. 상점에서 쫒겨납니다.");
					}
					System.out.println("");
				}
				else if(Armor == 3)
				{
					if(archer.Gold>=300) //골드아머 구매
					{
						System.out.println("골드아머를 300G에 구매하셨습니다.");
						System.out.println("구매하신 방어구는 자동장착됩니다.");
						archer.Gold-=300;
						archer.Depense+=30;
						System.out.println("현재 소지골드 : "+archer.Gold);
						System.out.println("현재 방어력    : "+archer.Depense);
					}
					else // 돈이 부족할때
					{
						System.out.println("");
						System.out.println("보유하신 골드가 부족합니다. 상점에서 쫒겨납니다.");
					}
					System.out.println("");
				}
				else if(Armor == 4)
				{
					if(archer.Gold>=400) //다이아아머 구매
					{
						System.out.println("다이아아머를 400G에 구매하셨습니다.");
						System.out.println("구매하신 방어구는 자동장착됩니다.");
						archer.Gold-=400;
						archer.Depense+=40;
						System.out.println("현재 소지골드 : "+archer.Gold);
						System.out.println("현재 방어력    : "+archer.Depense);
					}
					else // 돈이 부족할때
					{
						System.out.println("");
						System.out.println("보유하신 골드가 부족합니다. 상점에서 쫒겨납니다.");
					}
					System.out.println("");
				}
			}
		
		}

	}

}
