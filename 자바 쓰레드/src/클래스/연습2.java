package 클래스;

import java.util.Scanner;

public class 연습2 {

	public static void main(String[] args) {
	
		Creature creature = new Creature(); // Creature 클래스 불러오기
		Scanner scan = new Scanner(System.in); // 스캐너 입력
		Media Title = new Media(); //음악쓰레드 객체생 test.setDaemon(true);

		 /* 데몬쓰레드 이용 이 부분이 없으면 종료되지 않는다. 디폴트: 독립==> : 데몬쓰레드로 (메인쓰레드 종료시
		  종속쓰레드는 작업 다 못끝내도 메인 쓰레드와 함께 종료된다.)*/
		  
		  Title.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Adventure-Master-Title.wav");

		String Intro[] = {
				"                                                                                                                                                      ",
				"    eeeeeeee                                                                                                                                          ",
				"  eeeeeeeeee                                                                                                                                          ",
				" eeeee                                                                                                                                                ",
				" eeee            eeee     eeee       eeeeee   eeeeee           eeeee   eeeeee           eeeeee           eeeeee           eeeeee           eeeeee     ",
				"  eeeeee         eeee     eeee      eeeeeeeeeeeeeeeeee       eeeeeeeeeeeeeeeeee      eeeeeeeeeeee      eeeeeeeeee       eeeeeeeeee      eeeeeeeee     ",
				"   eeeeeeeee     eeee     eeee     eeee   eeeeee  eeee      eeee   eeeeee   eeee    eeeeee  eeeee     eeeee  eeeee     eeee    eeee    eeeeeeeeee     ",
				"     eeeeeeee    eeee     eeee     eeee    eeee    eeee     eeee    eeee    eeee    eeee      eeee    eeee    eeee    eeee      eeee   eeee           ",
				"         eeeee   eeee     eeee     eeee    eeee    eeee     eeee    eeee    eeee    eeee      eeee    eeee    eeee    eeeeeeeeeeeeee   eeee           ",
				"          eeee   eeee     eeee     eeee    eeee    eeee     eeee    eeee    eeee    eeee      eeee    eeee    eeee    eeeeeeeeeeeeee   eeee           ",
				"          eeee   eeee     eeee     eeee    eeee    eeee     eeee    eeee    eeee    eeee      eeee    eeee    eeee    eeee             eeee           ",
				"   eeeeeeeeee    eeeee   eeeee     eeee    eeee    eeee     eeee    eeee    eeee    eeeee    eeeee    eeee    eeee     eeeee           eeee           ",
				"  eeeeeeeeee      eeeeeeeeeee      eeee    eeee    eeee     eeee    eeee    eeee     eeeeeeeeeeee     eeee    eeee      eeeeeeeeee     eeee           ",
				"  eeeeeeee          eeeeeee        eeee    eeee    eeee     eeee    eeee    eeee       eeeeeeee       eeee    eeee        eeeeeeee     eeee           ",
				"", "", "", "", "",
				"                            eeeeeeeeeeee                     eeeeeeeeeeee                        eeeeeeeeeee                  ",
				"                            eeeeeeeeeeeeee                   eeeeeeeeeeeeee                    eeeee  eeeee                   ",
				"                              eee       eee                    eee       eee                  eee        ee                   ",
				"                              eee       eee                    eee       eee                 eee         eee                  ",
				"                              eee       eee                    eee       eee                 eee         ee                   ",
				"                              eee      eee                     eee       eee                 eee                              ",
				"                              eeeeeeeeeee                      eeeeeeeeeeee                  eee    eeeeeeeeee                ",
				"                              eee    eee                       eeeeeeeeee                    eee         ee                   ",
				"                              eee     eeee                     eee                           eee         ee                   ",
				"                              eee      eee                     eee                            eee        ee                   ",
				"                            eeeeeee     eeeee                eeeeeeeee                        eeeee    eeee                   ",
				"                            eeeeeeee    eeeee                eeeeeeeee                          eeeeeeeeeee                   ",

		};

		MyThread t1 = new MyThread(Intro, 100);
		Thread r1 = new Thread(t1);

		r1.start();


		
		
		
		try {
			r1.join();
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t\t" + "" + "\t\t >> Press Any Key");
			String Intro2 = scan.nextLine();

		} catch (Exception e) {
			System.out.println("잘못누르셨습니다." + e.getMessage());
		}

		clearScreen();
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("당신은 이세계의 주인공입니다.");
		System.out.println("시험의 탑으로 가서 1층부터 최종보스까지 클리어하세요");
		System.out.println("자 그러면 시작합니다.");
		System.out.println("");
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("튜토리얼을 보시겠습니까?");
		System.out.println("1. 튜토리얼을 본다. / 2. 튜토리얼을 안본다.");

		String Tutorial2[] = {
				" eeeeeeeeeeeeee                                                        eee                 eeee      ",
				" ee     e     ee                   ee                                  ee                    ee      ",
				" e     ee     ee                   ee                                   e                    ee      ",
				"       ee        eeee     eeee   eeeeeee      eeeeee      eee  eeeee   eee       eeeeee      ee      ",
				"       ee          ee       ee     ee       eee    eee    ,eeee        eee    eee    ee      ee      ",
				"       ee          ee       ee     ee      ee        ee    ee           e     ee      ee     ee      ",
				"       ee          ee       ee     ee     ee         ee    e            e       eeeeeeee     ee      ",
				"       ee          ee       ee     ee     ee         ee    e            e     eee     ee     ee      ",
				"       ee          ee       ee     ee      ee        ee    e            e    ee       ee     ee      ",
				"        e           ee    eeee     ee       ee     eee     e            e    ee     eeee     ee      ",
				"     eeeeee          eeeeee         eeeee    eeeeeee     eeeeee       eeeee,  eeeeeee eeee eeeeee    ",
				"", "", 
				"▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧", "",
				"\t주인공이 여러 소환수중에 하나를 선택하여 육성하는 스토리 진행형 게임입니다.", "", "\t한번 클리어 한 층(시험의탑)은 다시 갈수 없습니다.", "",
				"\t게임의 클리어 조건은 시험의탑이라는 던전에서 1층부터 5층 최종보스를 쓰러트리면 게임이 클리어됩니다.", "",
				"\t게임의 패배요소로는 시험의탑 전투중 소환수 사망 , 피로도 100이 넘을때 패배합니다.", "",
				"\t피로도란 던전을 클리어하면 일정수치가 쌓이는데 이것을 여관에서 회복 시켜줘야됩니다.", "",
				"\t시험의탑에서 몬스터를 잡고 골드를 벌어 상점을 이용해 무기와 방어구를 구매하세요. ", "",
				"\t처음에는 스킬이 없지만 시험의탑 2층과 4층을 클리어하면 스킬을 획득할수있습니다.", "", "\t소환수를 육성하여 모든층을 클리어하세요!!", "",
				"▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧", "",

		};

		MyThread t2 = new MyThread(Tutorial2, 100);
		Thread r2 = new Thread(t2);
		while (true) {
			int Num = 0;
			try {
				Num = scan.nextInt();
			} catch (Exception e) {
				
				scan = new Scanner(System.in);
				
				System.out.println("");
			}
			
			if (Num == 1) {
				clearScreen();
				r2.start();

				break;

			} else if (Num == 2) {
				break;
			} else {
				System.out.println("잘못누르셧습니다.");
			}

		}

		
		while (true) {
			try {
				r2.join();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println("");
			System.out.println("계속 진행하시겠습니까 ?");
			System.out.println("");
			System.out.println("1. 진행한다 / 2. 진행하지 않는다");
			int Num = 0;
			try {
				Num = scan.nextInt();
			} catch (Exception e) {
				
				scan = new Scanner(System.in);
				
				System.out.println("");
			}
			if (Num == 1) {
				break;
			} else if (Num == 2) {
				System.out.println("GAME OVER");
				return;
			} else {
				System.out.println("잘못누르셨습니다.");
				System.out.println("");
			}
		}
		
		while (true) {
			clearScreen();
			System.out.println("당신은 소환수를 고를수있습니다.");
			System.out.println("소환수는 총 3마리입니다.");
			System.out.println("소환수에 대한 설명을 들으시겠습니까?");
			System.out.println("1. 듣는다 / 2. 안듣겠다");

			Motion motion = new Motion();
			do {
				int Num = 0;
				try {
					Num = scan.nextInt();
				} catch (Exception e) {
					
					scan = new Scanner(System.in);
					
					System.out.println("");
				}
			if(Num == 1)
			{

				while(true)
				{
					System.out.println("");
					System.out.println("1. 기사 설명 / 2. 도적 설명  / 3. 궁수 설명 / 4. 다음으로 넘어가기");
					System.out.println("");
					int mot1 = 0;
					try {
						mot1 = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if(mot1 == 1)
					{
						motion.K_motion();
						System.out.println("");
						System.out.println("");
						
					}
					else if (mot1 == 2)
					{
						motion.T_motion();
						System.out.println("");
						System.out.println("");
					}
					else if (mot1 == 3)
					{
						motion.A_motion();
						System.out.println("");
						System.out.println("");
					}
					
					else if (mot1 == 4)
					{
						System.out.println("");
						break;	
					}
					else
					{
						System.out.println("잘못누르셨습니다.");
						System.out.println("");
					}
				}
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
			
			int Num2 = 0;
			try {
				Num2 = scan.nextInt();
			} catch (Exception e) {
				
				scan = new Scanner(System.in);
				
				System.out.println("");
			}

			if(Num2 == 1)
			{	
				System.out.println("");
				System.out.print("기사");
				
				System.out.println(" 소환수를 선택하셨군요. ");
				System.out.println("");
				System.out.println("소환수의 이름을 말해주세요. ");

				creature.Name = scan.next();

				System.out.println(creature.Name + " 소환수를 육성하여 게임을 클리어하세요 !!");
				System.out.println("");
				System.out.println("------------------------------------------");
				System.out.println("------------------------------------------");
				clearScreen();
				String Prolog[] = {
						"프롤로그",
						"",
						"※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※",
						"※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※",
						"",
						"주인공 : ...!?",
						"주인공 : 여기가 어디지..?",
						"주인공 : 난 분명 집에서 잠을 자고 있었는데..?",
						"주인공 : 뭐야 꿈인가 ?",
						"주인공 : (볼을 꼬집는다)",
						"주인공 : 아얏!.. 꿈은 아닌데…",
						"",
						">>안녕하세요 당신은 이세계의 주인공 입니다.",
						"",
						"주인공 : !? 어디서 들리는거지?",
						"",
						">>시험의 탑에가서 각 몬스터를 쓰러뜨리고 최종보스까지 무찌르세요.",
						">>그러면 당신이 원래 살던곳 으로 갈수 있습니다.",
						"",
						"주인공 : ..? 뭐지 여기가 이세계라고?",
						">> 오른쪽을 보면 당신 옆에 소환수가 있을겁니다. 소환수를 육성하여 최종보스를 쓰러뜨리세요!!",
						"(여기서 각 고른 소환수 등장)",
						"",
						creature.Name + " : …",
						"주인공 : 이것이 소환수인가..?",
						"주인공 : 일단 시험의 탑에 가볼까.",
						"",
						"※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※",
						"※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※",
						""
				};
				MyThread t3 = new MyThread(Prolog, 100);
				Thread r3 = new Thread(t3);		
				r3.start();
				
				try {
					r3.join();
					System.out.println("시험의 탑으로 가시겠습니까 ?");
					System.out.println("1. 간다 / 2. 안간다");
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				while(true) {
					int Num = 0;
					try {
						Num = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}

				if(Num == 1)
				{
					break;
				}
				
				else if (Num == 2)
				{
					System.out.println("준비되실때까지 기다리겠습니다.");
					System.out.println("");
					System.out.println("시험의 탑으로 가시겠습니까 ?");
					System.out.println("1. 간다 / 2. 안간다");
				}
				else
				{
					System.out.println("잘못누르셨습니다.");
					System.out.println("");
				}
				}
				Title.Stop();
				System.out.println("");
				System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
				System.out.println("\t 로딩중");
				for(int i = 0 ; i<20; i++)
				{
					
					System.out.print("■");
					
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
				System.out.println("");
				System.out.println("");
				System.out.println("");
				clearScreen();
				Media Top1 = new Media(); //음악쓰레드 객체생 test.setDaemon(true);
				
				Top1.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Dungeon-01.wav", +6.0f);

				System.out.println("");
				System.out.println("시험의 탑 1층");
				System.out.println("");
				System.out.println(">>시험의 탑 1층입니다.");
				System.out.println(">>초반에 기본공격으로 몬스터를 제압하고 중반에 스킬을 배울수 있습니다.");
				System.out.println(">>몬스터를 모두 제압하고 던전을 클리어하세요 !!");
				Knight knight = new Knight();//기사 클래스 인스턴스 생성
				NormalMonster normalMonster = new NormalMonster();//노말몬스터 클래스 불러오기
				System.out.println("");
				motion.Bat();
				System.out.println("박쥐등장!!");
				System.out.println("");
				normalMonster.Bat();
				System.out.println("");
				System.out.println("######################");

				Media k_Attack = new Media(); //음악쓰레드 객체생 test.setDaemon(true);
				Media tower1 = new Media(); //음악쓰레드 객체생 test.setDaemon(true);
				while(true) { //전투 반복
					System.out.println("1. 공격하기 / 2. 소환수 스탯창 / 3. 몬스터 스탯창 / 4. 빠른 전투");
					int Battle_Bat = 0;
					try {
						Battle_Bat = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					
					if(Battle_Bat == 1)
						
					{	motion.K_Attack();
					

					k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/검소리2.wav");

						try {
							System.out.println("");
							System.out.println(creature.Name+"의 공격입니다.");
							normalMonster.Attacked_Bat(knight.Attack());
							if(normalMonster.Hp_Bat > 0)
							{
							System.out.println("박쥐 체력 : "+normalMonster.Hp_Bat);
							}
							if(normalMonster.Hp_Bat <= 0)
							{
								normalMonster.Hp_Bat = 0;
							System.out.println("박쥐 체력 : "+normalMonster.Hp_Bat);
							}
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
					k_Attack.Stop();

						//몬스터의 체력이 0보다 작거나 같은 경우				
						if(normalMonster.Hp_Bat<=0)
						{	try {
							System.out.println("");
							System.out.println("박쥐가 죽었습니다.");
							k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
							System.out.println("몬스터골드"+normalMonster.Gold+"를 획득하셨습니다.");
							knight.Gold+=normalMonster.Gold;
							Thread.sleep(2000);
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();	
							break;
						}
						motion.Bat_Attack();


						tower1.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/박쥐.wav", +6.0f);
						try {
							System.out.println("");
							System.out.println("박쥐의 공격입니다.");
							knight.Attacked(normalMonster.Attack());
							System.out.println(creature.Name+" 체력 : "+knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if(knight.Hp <=0)
						{	System.out.println("");
							System.out.println(creature.Name+"가 죽었습니다.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					}
					else if(Battle_Bat == 2)
					{
						System.out.println("");
						knight.knight();
						System.out.println("");
					}
					else if(Battle_Bat == 3)
					{
						System.out.println("");
						normalMonster.Bat();
						System.out.println("");
					}
					else if(Battle_Bat == 4)
					{
						while(true)
						{
							try {
								System.out.println("");
								System.out.println("--------------------------");
								System.out.println("");
								System.out.println(creature.Name+"의 공격입니다.");
								normalMonster.Attacked_Bat(knight.Attack());
								if(normalMonster.Hp_Bat > 0)
								{
								System.out.println("박쥐 체력 : "+normalMonster.Hp_Bat);
								}
								if(normalMonster.Hp_Bat <= 0)
								{
									normalMonster.Hp_Bat = 0;
								System.out.println("박쥐 체력 : "+normalMonster.Hp_Bat);
								}

								//몬스터의 체력이 0보다 작거나 같은 경우				
								if(normalMonster.Hp_Bat<=0)
								{	
									try {
										System.out.println("");
										System.out.println("박쥐가 죽었습니다.");
										System.out.println("몬스터골드"+normalMonster.Gold+"를 획득하셨습니다.");
										knight.Gold+=normalMonster.Gold;
										Thread.sleep(1000);
									} catch (Exception e) {
										// TODO: handle exception
									}
									
									break;
								}
								
								Thread.sleep(500);

							} catch (Exception e) {
								// TODO: handle exception
							}
							try {
								System.out.println("");
								System.out.println("--------------------------");
								System.out.println("");
								System.out.println("박쥐의 공격입니다.");
								knight.Attacked(normalMonster.Attack());
								System.out.println(creature.Name+" 체력 : "+knight.Hp);
								System.out.println("");
								if(knight.Hp <=0)
								{	System.out.println("");
									System.out.println(creature.Name+"가 죽었습니다.");
									System.out.println("");
									System.out.println("Game Over");
									return;
								}
								Thread.sleep(500);
							} catch (Exception e) {
								// TODO: handle exception
							}	
					
					}
						break;
					}
					else
					{
						System.out.println("잘못누르셨습니다.");
					}
				}
				
				System.out.println("");
				motion.Snail();
				System.out.println("달팽이 등장!!");
				normalMonster.Snail();
				System.out.println("");
				System.out.println("######################");
				
			
				while(true) {
					System.out.println("1. 공격하기 / 2. 소환수 스탯창 / 3. 몬스터 스탯창 / 4. 빠른 전투");
					int Battle_Snail = 0;
					try {
						Battle_Snail = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if(Battle_Snail == 1)
						
					{	motion.K_Attack();
					k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/검소리2.wav");
					try {
						System.out.println("");
						System.out.println(creature.Name+"의 공격입니다.");
						normalMonster.Attacked_Snail(knight.Attack());
						if(normalMonster.Hp_Snail > 0)
						{
							System.out.println("달팽이 체력 : "+normalMonster.Hp_Snail);
						}
						if(normalMonster.Hp_Snail <= 0)
						{
							normalMonster.Hp_Snail = 0;
							System.out.println("달팽이 체력 : "+normalMonster.Hp_Snail);
						}
						Thread.sleep(1500);
					} catch (Exception e) {
						// TODO: handle exception
					}
					k_Attack.Stop();	
						//몬스터의 체력이 0보다 작거나 같은 경우
						
						if(normalMonster.Hp_Snail<=0)
						{	
							try {
								System.out.println("");
								System.out.println("달팽이가 죽었습니다.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
								System.out.println("몬스터골드"+normalMonster.Gold+"를 획득하셨습니다.");
								knight.Gold+=normalMonster.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							break;
						}
						
						motion.Snail_Attack();
						tower1.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/달팽이.wav", +6.0f);
						try {
							System.out.println("");
							System.out.println("달팽이의 공격입니다.");
							System.out.println("");
							knight.Attacked(normalMonster.Attack());
							System.out.println(creature.Name+" 체력 : "+knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if(knight.Hp <=0)
						{	System.out.println("");
							System.out.println(creature.Name+"가 죽었습니다.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					}
					else if(Battle_Snail == 2)
					{
						System.out.println("");
						knight.knight();
						System.out.println("");
					}
					else if(Battle_Snail == 3)
					{
						System.out.println("");
						normalMonster.Snail();
						System.out.println("");
					}
					
					else if(Battle_Snail == 4)
					{
						System.out.println("");
						System.out.println(creature.Name+"의 공격입니다.");
						normalMonster.Attacked_Snail(knight.Attack());
						if(normalMonster.Hp_Snail > 0)
						{
							System.out.println("달팽이 체력 : "+normalMonster.Hp_Snail);
						}
						if(normalMonster.Hp_Snail <= 0)
						{
							normalMonster.Hp_Snail = 0;
							System.out.println("달팽이 체력 : "+normalMonster.Hp_Snail);
						}
						
						
						if(normalMonster.Hp_Snail<=0)
						{	
							System.out.println("");
							System.out.println("달팽이가 죽었습니다.");
							System.out.println("몬스터골드"+normalMonster.Gold+"를 획득하셨습니다.");
							knight.Gold+=normalMonster.Gold;
							break;
						}
						
						System.out.println("");
						System.out.println("---------------");
						System.out.println("");
						System.out.println("달팽이의 공격입니다.");
						System.out.println("");
						knight.Attacked(normalMonster.Attack());
						System.out.println(creature.Name+" 체력 : "+knight.Hp);
						System.out.println("");
						if(knight.Hp <=0)
						{	System.out.println("");
							System.out.println(creature.Name+"가 죽었습니다.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					}
					else
					{
						System.out.println("잘못누르셨습니다.");
					}
				}
				
				System.out.println("");
				motion.Rabbit();
				System.out.println("토끼 등장!!");
				normalMonster.Rabbit();
				System.out.println("");
				System.out.println("######################");
				
			
				while(true) {
					System.out.println("1. 공격하기 / 2. 소환수 스탯창 / 3. 몬스터 스탯창 / 4. 빠른 전투");
					int Battle_Rabbit = 0;
					try {
						Battle_Rabbit = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if(Battle_Rabbit == 1)
					{	
						motion.K_Attack();
						k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/검소리2.wav");
						try {
							System.out.println("");
							System.out.println(creature.Name+"의 공격입니다.");
							normalMonster.Attacked_Rabbit(knight.Attack());
							if(normalMonster.Hp_Rabbit > 0)
							{
								System.out.println("토끼 체력 : "+normalMonster.Hp_Rabbit);
							}
							if(normalMonster.Hp_Rabbit <= 0)
							{
								normalMonster.Hp_Rabbit = 0;
								System.out.println("토끼 체력 : "+normalMonster.Hp_Rabbit);
							}
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();
						//몬스터의 체력이 0보다 작거나 같은 경우
						
						if(normalMonster.Hp_Rabbit<=0)
						{	
							try {
								System.out.println("");
								System.out.println("토끼가 죽었습니다.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
								System.out.println("몬스터골드"+normalMonster.Gold+"를 획득하셨습니다.");
								knight.Gold+=normalMonster.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							break;
						}
						
						motion.Rabbit_Attack();
						tower1.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/토끼.wav", +6.0f);
						try {
							System.out.println("");
							System.out.println("토끼의 공격입니다.");
							System.out.println("");
							knight.Attacked(normalMonster.Attack());
							System.out.println(creature.Name+" 체력 : "+knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if(knight.Hp <=0)
						{	System.out.println("");
							System.out.println(creature.Name+"가 죽었습니다.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					}
					else if(Battle_Rabbit == 2)
					{
						System.out.println("");
						knight.knight();
						System.out.println("");
					}
					else if(Battle_Rabbit == 3)
					{
						System.out.println("");
						normalMonster.Rabbit();
						System.out.println("");
					}
					else if(Battle_Rabbit == 4)
					{
						System.out.println("");
						System.out.println(creature.Name+"의 공격입니다.");
						normalMonster.Attacked_Rabbit(knight.Attack());
						if(normalMonster.Hp_Rabbit > 0)
						{
							System.out.println("토끼 체력 : "+normalMonster.Hp_Rabbit);
						}
						if(normalMonster.Hp_Rabbit <= 0)
						{
							normalMonster.Hp_Rabbit = 0;
							System.out.println("토끼 체력 : "+normalMonster.Hp_Rabbit);
						}
						if(normalMonster.Hp_Rabbit<=0)
						{	
							System.out.println("");
							System.out.println("토끼가 죽었습니다.");
							System.out.println("몬스터골드"+normalMonster.Gold+"를 획득하셨습니다.");
							knight.Gold+=normalMonster.Gold;
							break;
						}
						System.out.println("");
						System.out.println("---------------");
						System.out.println("");
						System.out.println("토끼의 공격입니다.");
						knight.Attacked(normalMonster.Attack());
						System.out.println(creature.Name+" 체력 : "+knight.Hp);
						System.out.println("");
						if(knight.Hp <=0)
						{	System.out.println("");
							System.out.println(creature.Name+"가 죽었습니다.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					}
					else
					{
						System.out.println("잘못누르셨습니다.");
					}
				}

				System.out.println("");
				System.out.println("");
				knight.Fatigue += 40;
				tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/게임승리.wav");
				System.out.println(">>시험의 탑 1층을 클리어하셨습니다!!!!");
				System.out.println(">>마을로 갑니다.");
				System.out.println("");
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				tower1.Stop();
				knight.Hp = 120;
				
				Weapon weapon = new Weapon(); // 무기 클래스 객체생성
				Armor armor = new Armor(); // 아머 클래스 객체생성
				Top1.Stop();
				System.out.println("");
				System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
				System.out.println("\t 로딩중");
				for(int i = 0 ; i<20; i++)
				{
					
					System.out.print("■");
					
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
				
				Media Town = new Media(); //음악쓰레드 객체생 test.setDaemon(true);
				Town.setDaemon(true);
				System.out.println("");
				System.out.println("");
				Media Town1 = new Media(); //마을 bgm

				Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
				
				System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
				System.out.println("\t\t\t ＠도움말＠");
				System.out.println("");
				System.out.println("1. 스탯창에선 소환수의 상태를 확인할 수 있습니다.");
				System.out.println("");
				System.out.println("2. 상점에서는 몬스터한테 획득한 골드를 이용하여 무기와 방어구를 구매할수있습니다.");
				System.out.println("");
				System.out.println("3. 여관에서는 피로도를 회복 할수있습니다.");
				System.out.println("      피로도가 100이 넘을경우 패배하게되니 주의하세요 !!");
				System.out.println("");
				System.out.println("4. 모든준비를 마쳤으면 시험의탑 다음층으로 가시면 됩니다.");
				System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
				System.out.println("");
				System.out.println("");
				System.out.println("");
			}
		}
		
	}
	public static void clearScreen() {
		for (int i = 0; i < 80; i++)
			System.out.println("");
	}
}
