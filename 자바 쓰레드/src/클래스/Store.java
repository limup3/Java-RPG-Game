package 클래스;

import java.util.Scanner;

public class Store {

	Scanner scan = new Scanner(System.in);
	//필드
	void store(Knight knight) {
		Weapon weapon = new Weapon(); // 무기 클래스 객체생성
		Armor armor = new Armor(); // 아머 클래스 객체생성
		Media Town = new Media(); //음악쓰레드 객체생 test.setDaemon(true);

		
		System.out.println("");
		System.out.println(">>상점에 오신것을 환영합니다!!");
		System.out.println(">>상점에선 필요한 상품을 골드를 이용해 살 수 있습니다.");
		System.out.println("");
		
		
		
		
		while(true) 
		{
			System.out.println("1. 무기 / 2. 방어구 / 3. 마을로 돌아가기");
			int List = 0;
			try {	
				List = scan.nextInt();
			} catch (Exception e) {
				
				scan = new Scanner(System.in);
				
				System.out.println("");
			}
		if(List == 1)
		{	Town.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/소복.wav", +6.0f);
			weapon.Sword(); // 무기상품 불러오기
			System.out.println("");
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
			System.out.println("현재 소지골드 : "+knight.Gold);
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
			System.out.println("");
			System.out.println("");
			System.out.println("어떤 상품을 사시겠습니까?");
			System.out.println("1. 아이언소드 / 2. 실버소드 / 3. 골드소드 / 4. 다이아소드 / 5. 뒤로가기 / 6. 마을로 돌아가기");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			Town.Stop();
			int Num9 = 0;
			try {
				Num9 = scan.nextInt();
			} catch (Exception e) {
				
				scan = new Scanner(System.in);
				
				System.out.println("");
			}
			if(Num9 == 1 )
			{
				
				if(knight.Gold>=100) //아이언소드 구매
				{	Town.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav", +6.0f);
					System.out.println("아이언소드를 100G에 구매하셨습니다.");
					System.out.println("구매하신 무기는 자동장착됩니다.");
					knight.Gold-=100;
					knight.Power+=10;
					System.out.println("현재 소지골드 : "+knight.Gold);
					System.out.println("현재 공격력    : "+knight.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/무기장착.wav", +6.0f);
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // 돈이 부족할떄
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
			}
			else if(Num9 == 2)
			{
				if(knight.Gold>=200) //실버소드 구매
				{	Town.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav", +6.0f);
					System.out.println("실버소드를 200G에 구매하셨습니다.");
					System.out.println("구매하신 무기는 자동장착됩니다.");
					knight.Gold-=200;
					knight.Power+=20;
					System.out.println("현재 소지골드 : "+knight.Gold);
					System.out.println("현재 공격력    : "+knight.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/무기장착.wav", +6.0f);
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // 돈이 부족할때
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
			}
			else if(Num9 == 3)
			{
				if(knight.Gold>=300) //골드소드 구매
				{	Town.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav", +6.0f);
					System.out.println("골드소드를 300G에 구매하셨습니다.");
					System.out.println("구매하신 무기는 자동장착됩니다.");
					knight.Gold-=300;
					knight.Power+=30;
					System.out.println("현재 소지골드 : "+knight.Gold);
					System.out.println("현재 공격력    : "+knight.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/무기장착.wav", +6.0f);
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // 돈이 부족할때
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
			}
			else if(Num9 == 4)
			{
				if(knight.Gold>=400) //다이아소드 구매
				{	Town.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav", +6.0f);
					System.out.println("다이아소드를 400G에 구매하셨습니다.");
					System.out.println("구매하신 무기는 자동장착됩니다.");
					knight.Gold-=400;
					knight.Power+=40;
					System.out.println("현재 소지골드 : "+knight.Gold);
					System.out.println("현재 공격력    : "+knight.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/무기장착.wav", +6.0f);
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				
				else // 돈이 부족할때
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
				
			}
		
			else if(Num9 == 5)
			{	
				System.out.println("");
			}
			else if(Num9 == 6)
			{
				System.out.println("");
				break;
			}
			else 
			{
				System.out.println("잘못누르셨습니다.");
			}
		}
		else if(List == 2)
		{	Town.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/소복.wav", +6.0f);
			armor.Armor(); // 무기상품 불러오기
			System.out.println("");
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
			System.out.println("현재 소지골드 : "+knight.Gold);
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
			System.out.println("");
			System.out.println("");
			System.out.println("어떤 상품을 사시겠습니까?");
			System.out.println("1. 아이언아머 / 2. 실버아머 / 3. 골드아머 / 4. 다이아아머 / 5. 뒤로가기 / 6. 마을로 돌아가기");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			Town.Stop();
			int Armor = 0;
			try {
				Armor = scan.nextInt();
			} catch (Exception e) {
				
				scan = new Scanner(System.in);
				
				System.out.println("");
			}
			if(Armor == 1 )
			{
				
				if(knight.Gold>=100) //아이언아머 구매
				{	Town.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav", +6.0f);
					System.out.println("아이언아머를 100G에 구매하셨습니다.");
					System.out.println("구매하신 방어구는 자동장착됩니다.");
					knight.Gold-=100;
					knight.Depense+=10;
					System.out.println("현재 소지골드 : "+knight.Gold);
					System.out.println("현재 방어력    : "+knight.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/갑옷장착.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					
				}
				else // 돈이 부족할떄
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
			}
			else if(Armor == 2)
			{
				if(knight.Gold>=200) //실버아머 구매
				{	Town.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav", +6.0f);
					System.out.println("실버아머를 200G에 구매하셨습니다.");
					System.out.println("구매하신 방어구는 자동장착됩니다.");
					knight.Gold-=200;
					knight.Depense+=20;
					System.out.println("현재 소지골드 : "+knight.Gold);
					System.out.println("현재 방어력    : "+knight.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/갑옷장착.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				else // 돈이 부족할때
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
			}
			else if(Armor == 3)
			{
				if(knight.Gold>=300) //골드아머 구매
				{	Town.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav", +6.0f);
					System.out.println("골드아머를 300G에 구매하셨습니다.");
					System.out.println("구매하신 방어구는 자동장착됩니다.");
					knight.Gold-=300;
					knight.Depense+=30;
					System.out.println("현재 소지골드 : "+knight.Gold);
					System.out.println("현재 방어력    : "+knight.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					
					try {
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/갑옷장착.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // 돈이 부족할때
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
			}
			else if(Armor == 4)
			{
				if(knight.Gold>=400) //다이아아머 구매
				{	Town.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav", +6.0f);
					System.out.println("다이아아머를 400G에 구매하셨습니다.");
					System.out.println("구매하신 방어구는 자동장착됩니다.");
					knight.Gold-=400;
					knight.Depense+=40;
					System.out.println("현재 소지골드 : "+knight.Gold);
					System.out.println("현재 방어력    : "+knight.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/갑옷장착.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // 돈이 부족할때
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
			}
			else if (Armor == 5)
			{
				System.out.println("");
			}
			else if (Armor == 6)
			{
				System.out.println("");
				break;
			}
			else {
				System.out.println("잘못누르셨습니다.");
			}
		}
		else if(List == 3)
		{
			System.out.println("");
			break;
		}
		else 
		{
			System.out.println("잘못누르셨습니다.");
		}
		}
	}
	
	
	
	void Thi_sto(Thief thief) { //도적
		Weapon weapon = new Weapon(); // 무기 클래스 객체생성
		Armor armor = new Armor(); // 아머 클래스 객체생성
		Media Town = new Media(); //음악쓰레드 객체생 test.setDaemon(true);

		
		System.out.println("");
		System.out.println(">>상점에 오신것을 환영합니다!!");
		System.out.println(">>상점에선 필요한 상품을 골드를 이용해 살 수 있습니다.");
		System.out.println("");
		
		
		
		while(true) 
		{
			System.out.println("1. 무기 / 2. 방어구 / 3. 마을로돌아가기");
			int List2 = 0;
			try {
				List2 = scan.nextInt();
			} catch (Exception e) {
				
				scan = new Scanner(System.in);
				
				System.out.println("");
			}
		if(List2 == 1)
		{	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/소복.wav");
			weapon.Knife(); // 무기상품 불러오기
			System.out.println("");
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
			System.out.println("현재 소지골드 : "+thief.Gold);
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
			System.out.println("");
			System.out.println("");
			System.out.println("어떤 상품을 사시겠습니까?");
			System.out.println("1. 아이언나이프 / 2. 실버나이프 / 3. 골드나이프 / 4. 다이아나이프 / 5. 뒤로가기 / 6. 마을로 돌아가기");
			int Num10 = 0;
			try {
				Num10 = scan.nextInt();
			} catch (Exception e) {
				
				scan = new Scanner(System.in);
				
				System.out.println("");
			}
			Town.Stop();
			if(Num10 == 1 )
			{
				
				if(thief.Gold>=100) //아이언나이프 구매
				{	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav");
					System.out.println("아이언나이프를 100G에 구매하셨습니다.");
					System.out.println("구매하신 무기는 자동장착됩니다.");
					thief.Gold-=100;
					thief.Power+=10;
					System.out.println("현재 소지골드 : "+thief.Gold);
					System.out.println("현재 공격력    : "+thief.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/무기장착.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
					Town.Stop();
				}
				else // 돈이 부족할떄
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
			}
			else if(Num10 == 2)
			{
				if(thief.Gold>=200) //실버나이프 구매
				{	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav");
					System.out.println("실버나이프를 200G에 구매하셨습니다.");
					System.out.println("구매하신 무기는 자동장착됩니다.");
					thief.Gold-=200;
					thief.Power+=20;
					System.out.println("현재 소지골드 : "+thief.Gold);
					System.out.println("현재 공격력    : "+thief.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/무기장착.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // 돈이 부족할때
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
			}
			else if(Num10 == 3)
			{
				if(thief.Gold>=300) //골드나이프 구매
				{	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav");
					System.out.println("골드나이프를 300G에 구매하셨습니다.");
					System.out.println("구매하신 무기는 자동장착됩니다.");
					thief.Gold-=300;
					thief.Power+=30;
					System.out.println("현재 소지골드 : "+thief.Gold);
					System.out.println("현재 공격력    : "+thief.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/무기장착.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // 돈이 부족할때
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
			}
			else if(Num10 == 4)
			{
				if(thief.Gold>=400) //다이아나이프 구매
				{	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav");
					System.out.println("다이아나이프를 400G에 구매하셨습니다.");
					System.out.println("구매하신 무기는 자동장착됩니다.");
					thief.Gold-=400;
					thief.Power+=40;
					System.out.println("현재 소지골드 : "+thief.Gold);
					System.out.println("현재 공격력    : "+thief.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/무기장착.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // 돈이 부족할때
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
				
			
				
			}
			else if(Num10 == 5)
			{
				System.out.println("");
					
			}
			else if(Num10 == 6)
			{
				System.out.println("");
					break;
			}
			else 
			{
				System.out.println("잘못누르셨습니다.");
			}
		
		}
		else if(List2 == 2)
		{	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/소복.wav");
			armor.Armor(); // 무기상품 불러오기
			System.out.println("");
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
			System.out.println("현재 소지골드 : "+thief.Gold);
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
			System.out.println("");
			System.out.println("");
			System.out.println("어떤 상품을 사시겠습니까?");
			System.out.println("1. 아이언아머 / 2. 실버아머 / 3. 골드아머 / 4. 다이아아머 / 5. 뒤로가기 / 6. 마을로 돌아가기");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			Town.Stop();
			int Armor = 0;
			try {
				Armor = scan.nextInt();
			} catch (Exception e) {
				
				scan = new Scanner(System.in);
				
				System.out.println("");
			}
			if(Armor == 1 )
			{
				
				if(thief.Gold>=100) //아이언아머 구매
				{	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav");
					System.out.println("아이언아머를 100G에 구매하셨습니다.");
					System.out.println("구매하신 방어구는 자동장착됩니다.");
					thief.Gold-=100;
					thief.Depense+=10;
					System.out.println("현재 소지골드 : "+thief.Gold);
					System.out.println("현재 방어력    : "+thief.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/갑옷장착.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // 돈이 부족할떄
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
			}
			else if(Armor == 2)
			{
				if(thief.Gold>=200) //실버아머 구매
				{	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav");
					System.out.println("실버아머를 200G에 구매하셨습니다.");
					System.out.println("구매하신 방어구는 자동장착됩니다.");
					thief.Gold-=200;
					thief.Depense+=20;
					System.out.println("현재 소지골드 : "+thief.Gold);
					System.out.println("현재 방어력    : "+thief.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/갑옷장착.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // 돈이 부족할때
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
			}
			else if(Armor == 3)
			{
				if(thief.Gold>=300) //골드아머 구매
				{	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav");
					System.out.println("골드아머를 300G에 구매하셨습니다.");
					System.out.println("구매하신 방어구는 자동장착됩니다.");
					thief.Gold-=300;
					thief.Depense+=30;
					System.out.println("현재 소지골드 : "+thief.Gold);
					System.out.println("현재 방어력    : "+thief.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/갑옷장착.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					
				}
				else // 돈이 부족할때
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
			}
			else if(Armor == 4)
			{
				if(thief.Gold>=400) //다이아아머 구매
				{	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav");
					System.out.println("다이아아머를 400G에 구매하셨습니다.");
					System.out.println("구매하신 방어구는 자동장착됩니다.");
					thief.Gold-=400;
					thief.Depense+=40;
					System.out.println("현재 소지골드 : "+thief.Gold);
					System.out.println("현재 방어력    : "+thief.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/갑옷장착.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // 돈이 부족할때
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
				}
			else if(Armor == 5)
			{
				System.out.println("");
				
			}
			else if(Armor == 6)
			{
				System.out.println("");
				break;
			}
			else 
			{
				System.out.println("잘못누르셨습니다.");
			}
			}
		else if(List2 == 3)
		{
			System.out.println("");
			break;
		}
		}	
	}
	void Arc_sto(Archer archer) { // 아쳐
		Weapon weapon = new Weapon(); // 무기 클래스 객체생성
		Armor armor = new Armor(); // 아머 클래스 객체생성
		Media Town = new Media(); //음악쓰레드 객체생 test.setDaemon(true);

		
		System.out.println("");
		System.out.println(">>상점에 오신것을 환영합니다!!");
		System.out.println(">>상점에선 필요한 상품을 골드를 이용해 살 수 있습니다.");
		System.out.println("");
		
		
		
		while(true) 
		{
			System.out.println("1. 무기 / 2. 방어구 / 3. 마을로 돌아가기");
			int List3 = 0;
			try {
				List3 = scan.nextInt();
			} catch (Exception e) {
				
				scan = new Scanner(System.in);
				
				System.out.println("");
			}
		
		if(List3 == 1)
		{	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/소복.wav");
			weapon.Bow(); // 무기상품 불러오기
			System.out.println("");
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
			System.out.println("현재 소지골드 : "+archer.Gold);
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
			System.out.println("");
			System.out.println("");
			System.out.println("어떤 상품을 사시겠습니까?");
			System.out.println("1. 아이언보우 / 2. 실버보우 / 3. 골드보우 / 4. 다이아보우 / 5. 뒤로가기 / 6. 마을로 돌아가기");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			Town.Stop();
			int Num11 = 0;
			try {
				Num11 = scan.nextInt();
			} catch (Exception e) {
				
				scan = new Scanner(System.in);
				
				System.out.println("");
			}
			if(Num11 == 1 )
			{
				
				if(archer.Gold>=100) //아이언보우 구매
				{	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav");
					System.out.println("아이언보우를 100G에 구매하셨습니다.");
					System.out.println("구매하신 무기는 자동장착됩니다.");
					archer.Gold-=100;
					archer.Power+=10;
					System.out.println("현재 소지골드 : "+archer.Gold);
					System.out.println("현재 공격력    : "+archer.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/무기장착.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // 돈이 부족할떄
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
			}
			else if(Num11 == 2)
			{
				if(archer.Gold>=200) //실버보우 구매
				{	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav");
					System.out.println("실버보우를 200G에 구매하셨습니다.");
					System.out.println("구매하신 무기는 자동장착됩니다.");
					archer.Gold-=200;
					archer.Power+=20;
					System.out.println("현재 소지골드 : "+archer.Gold);
					System.out.println("현재 공격력    : "+archer.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/무기장착.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // 돈이 부족할때
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
			}
			else if(Num11 == 3)
			{
				if(archer.Gold>=300) //골드보우 구매
				{	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav");
					System.out.println("골드보우를 300G에 구매하셨습니다.");
					System.out.println("구매하신 무기는 자동장착됩니다.");
					archer.Gold-=300;
					archer.Power+=30;
					System.out.println("현재 소지골드 : "+archer.Gold);
					System.out.println("현재 공격력    : "+archer.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/무기장착.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // 돈이 부족할때
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
			}
			else if(Num11 == 4)
			{
				if(archer.Gold>=400) //다이아보우 구매
				{	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav");
					System.out.println("다이아보우를 400G에 구매하셨습니다.");
					System.out.println("구매하신 무기는 자동장착됩니다.");
					archer.Gold-=400;
					archer.Power+=40;
					System.out.println("현재 소지골드 : "+archer.Gold);
					System.out.println("현재 공격력    : "+archer.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/무기장착.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // 돈이 부족할때
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
			}
			else if(Num11 == 5)
			{
				System.out.println("");
				
			}
			else if(Num11 == 6)
			{
				System.out.println("");
				break;
			}
			else 
			{
				System.out.println("잘못누르셨습니다.");
			}
		
		}
		else if(List3 == 2)
		{	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/소복.wav");
			armor.Armor(); // 무기상품 불러오기
			System.out.println("");
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
			System.out.println("현재 소지골드 : "+archer.Gold);
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
			System.out.println("");
			System.out.println("");
			System.out.println("어떤 상품을 사시겠습니까?");
			System.out.println("1. 아이언아머 / 2. 실버아머 / 3. 골드아머 / 4. 다이아아머 / 5. 뒤로가기 / 6. 마을로 돌아가기");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			Town.Stop();
			int Armor = 0;
			try {
				Armor = scan.nextInt();
			} catch (Exception e) {
				
				scan = new Scanner(System.in);
				
				System.out.println("");
			}
			if(Armor == 1 )
			{
				
				if(archer.Gold>=100) //아이언아머 구매
				{	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav");
					System.out.println("아이언아머를 100G에 구매하셨습니다.");
					System.out.println("구매하신 방어구는 자동장착됩니다.");
					archer.Gold-=100;
					archer.Depense+=10;
					System.out.println("현재 소지골드 : "+archer.Gold);
					System.out.println("현재 방어력    : "+archer.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/갑옷장착.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // 돈이 부족할떄
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
			}
			else if(Armor == 2)
			{
				if(archer.Gold>=200) //실버아머 구매
				{	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav");
					System.out.println("실버아머를 200G에 구매하셨습니다.");
					System.out.println("구매하신 방어구는 자동장착됩니다.");
					archer.Gold-=200;
					archer.Depense+=20;
					System.out.println("현재 소지골드 : "+archer.Gold);
					System.out.println("현재 방어력    : "+archer.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/갑옷장착.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // 돈이 부족할때
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
			}
			else if(Armor == 3)
			{
				if(archer.Gold>=300) //골드아머 구매
				{	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav");
					System.out.println("골드아머를 300G에 구매하셨습니다.");
					System.out.println("구매하신 방어구는 자동장착됩니다.");
					archer.Gold-=300;
					archer.Depense+=30;
					System.out.println("현재 소지골드 : "+archer.Gold);
					System.out.println("현재 방어력    : "+archer.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/갑옷장착.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // 돈이 부족할때
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
			}
			else if(Armor == 4)
			{
				if(archer.Gold>=400) //다이아아머 구매
				{	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드소모.wav");
					System.out.println("다이아아머를 400G에 구매하셨습니다.");
					System.out.println("구매하신 방어구는 자동장착됩니다.");
					archer.Gold-=400;
					archer.Depense+=40;
					System.out.println("현재 소지골드 : "+archer.Gold);
					System.out.println("현재 방어력    : "+archer.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/갑옷장착.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // 돈이 부족할때
				{
					System.out.println("");
					System.out.println("보유하신 골드가 부족합니다.");
				}
				System.out.println("");
			}
			else if(Armor == 5)
				
			{
				System.out.println("");
				
			}
			else if(Armor == 6)
				
			{
				System.out.println("");
				break;
			}
			else 
			{
				System.out.println("잘못누르셨습니다.");
			}
		}
		else if(List3 == 3)
		{
			System.out.println("");
			break;
		}
		else 
		{
			System.out.println("잘못누르셨습니다.");
		}
	}
}


		
		

}
