package 클래스;

import java.util.Scanner;

public class 최종보스전_테스트용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Knight knight = new Knight();
		Creature creature = new Creature(); 
		Scanner scan = new Scanner(System.in);
		Motion motion = new Motion();
		Media k_Attack = new Media(); //음악쓰레드 객체생 test.setDaemon(true);
		
		Media tower1 = new Media(); //음악쓰레드 객체생 test.setDaemon(true);
		
		
		Media Top5 = new Media(); //음악쓰레드 객체생 test.setDaemon(true);
		

		knight.Hp = 999;
		knight.MaxHp = 999;
		knight.Power = 100;
		Top5.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Final-Boss.wav");
		
		
		System.out.println("");
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("시험의 탑 5층");
		System.out.println("");
		System.out.println("드디어 마지막 5층까지 오셨군요!!");
		System.out.println(">>최종보스입니다.");
		System.out.println(">>최종보스를 해치우면 원래살던세계로 돌아갈수있어요!!");

		FinalBoss finalBoss = new FinalBoss();// 중간보스 클래스 불러오기
		motion.Devil();
		System.out.println("");
		System.out.println("마왕 등장!!");
		System.out.println("");
		finalBoss.Devil();
		System.out.println("");
		System.out.println("######################");

		while (true) { // 전투 반복
			System.out.println("1. 공격하기 / 2. 1차 스킬 사용 / 3. 2차 스킬 사용");
			int Battle_Devil = scan.nextInt();
			if (Battle_Devil == 1) {
				motion.K_Attack();
				k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/검소리2.wav");
				
				try {
					System.out.println("");
					System.out.println(creature.Name + "의 공격입니다.");
					finalBoss.Attacked_Devil(knight.Attack());
					if(finalBoss.Hp > 0)
					{
						System.out.println("마왕 체력 : " + finalBoss.Hp);
					}
					if(finalBoss.Hp <= 0)
					{
						finalBoss.Hp = 0;
					System.out.println("마왕 체력 : " + finalBoss.Hp);
					}
					
					Thread.sleep(1500);
				} catch (Exception e) {
					// TODO: handle exception
				}
				k_Attack.Stop();
				

				// 몬스터의 체력이 0보다 작거나 같은 경우
				if (finalBoss.Hp <= 0) {
					try {
						System.out.println("");
						System.out.println("마왕이 죽었습니다.");
						k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
						
						System.out.println("몬스터골드" + finalBoss.Gold + "를 획득하셨습니다.");
						knight.Gold += finalBoss.Gold;
						Thread.sleep(2000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					k_Attack.Stop();
					break;
				}
				tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/마왕공격2.wav");
				motion.Devil_Attack();

				
				
				
				try {
					System.out.println("");
					System.out.println("마왕의 공격입니다.");
					knight.Attacked(finalBoss.Attack());
					System.out.println(creature.Name + " 체력 : " + knight.Hp);
					Thread.sleep(1500);
				} catch (Exception e) {
					// TODO: handle exception
				}
				tower1.Stop();
				if (knight.Hp <= 0) {
					System.out.println("");
					System.out.println(creature.Name + "가 죽었습니다.");
					// 영웅체력 1로 만든다.
					knight.Hp = 1;
					System.out.println(creature.Name + "이 체력 1로 부활하였습니다.");
					
				}
			} else if (Battle_Devil == 2 && knight.Mp >= 30)

			{
				motion.K_Attack_Skill1();
				k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/슬래시.wav");
				
				try {
					System.out.println("");
					System.out.println(creature.Name + "의 공격입니다.");
					finalBoss.Attacked_Devil(knight.Skill());
					if(finalBoss.Hp > 0)
					{
						System.out.println("마왕 체력 : " + finalBoss.Hp);
					}
					if(finalBoss.Hp <= 0)
					{
						finalBoss.Hp = 0;
					System.out.println("마왕 체력 : " + finalBoss.Hp);
					}
					Thread.sleep(1500);
				} catch (Exception e) {
					// TODO: handle exception
				}
				k_Attack.Stop();
			

				// 몬스터의 체력이 0보다 작거나 같은 경우
				if (finalBoss.Hp <= 0) {
					try {
						System.out.println("");
						System.out.println("마왕이 죽었습니다.");
						k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
						
						System.out.println("몬스터골드" + finalBoss.Gold + "를 획득하셨습니다.");
						knight.Gold += finalBoss.Gold;
						Thread.sleep(2000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					k_Attack.Stop();
					break;
				}
				motion.Devil_Attack();
				tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/마왕공격1.wav");
				
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
				}
				tower1.Stop();
				tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/마왕공격2.wav");
				
				try {
					System.out.println("");
					System.out.println("마왕의 공격입니다.");
					knight.Attacked(finalBoss.Attack());
					System.out.println(creature.Name + " 체력 : " + knight.Hp);
					Thread.sleep(1500);
				} catch (Exception e) {
					// TODO: handle exception
				}
				tower1.Stop();
				if (knight.Hp <= 0) {
					System.out.println("");
					System.out.println(creature.Name + "가 죽었습니다.");
					// 영웅체력 1로 만든다.
					knight.Hp = 1;
					System.out.println(creature.Name + "이 체력 1로 부활하였습니다.");
					
				}
				

			} else if (Battle_Devil == 3 && knight.Mp >= 50)

			{	
				
				motion.K_Attack_Skill2();
				k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/일검.wav");
				
				try {
					System.out.println("");
					System.out.println(creature.Name + "의 공격입니다.");
					finalBoss.Attacked_Devil(knight.Skill2());
					if(finalBoss.Hp > 0)
					{
						System.out.println("마왕 체력 : " + finalBoss.Hp);
					}
					if(finalBoss.Hp <= 0)
					{
						finalBoss.Hp = 0;
					System.out.println("마왕 체력 : " + finalBoss.Hp);
					}
					Thread.sleep(1500);
				} catch (Exception e) {
					// TODO: handle exception
				}
				k_Attack.Stop();
				

				// 몬스터의 체력이 0보다 작거나 같은 경우
				if (finalBoss.Hp <= 0) {
					try {
						System.out.println("");
						System.out.println("마왕이 죽었습니다.");
						k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
						
						System.out.println("몬스터골드" + finalBoss.Gold + "를 획득하셨습니다.");
						knight.Gold += finalBoss.Gold;
						Thread.sleep(2000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					k_Attack.Stop();
					break;
				}
				
				motion.Devil_Attack();
				tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/마왕공격1.wav");
				
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
				}
				tower1.Stop();
				tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/마왕공격2.wav");
				
				try {
					System.out.println("");
					System.out.println("마왕의 공격입니다.");
					knight.Attacked(finalBoss.Attack());
					System.out.println(creature.Name + " 체력 : " + knight.Hp);
					Thread.sleep(1500);
				} catch (Exception e) {
					// TODO: handle exception
				}
				tower1.Stop();
				if (knight.Hp <= 0) {
					System.out.println("");
					System.out.println(creature.Name + "가 죽었습니다.");
					// 영웅체력 1로 만든다.
					knight.Hp = 1;
					System.out.println(creature.Name + "이 체력 1로 부활하였습니다.");
					
				}
			}
			else if (Battle_Devil == 2 && knight.Mp < 30)
			{
				System.out.println("마나가 부족합니다.");
				System.out.println("");
			}
			else if (Battle_Devil == 3 && knight.Mp < 50)
			{
				System.out.println("마나가 부족합니다.");
				System.out.println("");
			}
			
			else {
				System.out.println("잘못누르셨습니다.");
			}
		}
		
		tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/게임승리.wav");
		
		System.out.println();
		System.out.println("");
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println(">> 모든층을 클리어하셨군요 !! 역시 해내실 줄 아셨어요!");
		System.out.println("");
		System.out.println(">> 이제 원래있던 세계로 돌아갈수있습니다.");
		System.out.println(">> 원래세계로 가시게 되면 이곳에서 있었던 모든기억이 사라집니다.");
		System.out.println(">> 시험의 탑을 클리어하느라 고생많으셨고 , 건강하게 지내시길 바랄게요!!");
		System.out.println("");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		Top5.Stop();
		Top5.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/엔딩.wav");
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		System.out.println("엔딩");
		try {
			String end[] = {
					"",
					"",
					"(창문의 햇살을 통해 주인공은 눈을뜬다.)",
					"주인공 : 하아~ 잘잤다.", 
					"주인공 : 무슨꿈이였는지는 기억이 안나지만 뭔가 생생하고 묘한감정이야..",
					"주인공 : ...",
					"주인공 : 뭐지 .. 자고일어났는데 몸에 상처들이있네. ",
					"(흐릿한 기억이 스쳐 지나간다..)",
					"(" +creature.Name + " : ..!!)",
					"주인공 : " + creature.Name + "라.. 뭔가 익숙한 느낌이 들어.. ",
					"주인공 : ....",
					"주인공 : 에이 모르겠다..", 
					"주인공 : 아! 벌써 시간이 !! 학교 지각하겠다 빨리 준비해야지!",
					"...",
					"",
					"",
					"******************************************",
					"",
					"\t 게임을 플레이 해주셔서 감사합니다~!",
					"",
					"",
					"******************************************"				
			};
			

			for(int i =0; i<end.length ; i++)
			{
				System.out.println(end[i]);
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		Top5.Stop();

		return;
	}
	public static void clearScreen() {
		for (int i = 0; i < 80; i++)
			System.out.println("");
	}
}
