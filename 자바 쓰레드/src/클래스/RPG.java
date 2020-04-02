package 클래스;

import java.util.Scanner;

public class RPG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				"\t처음에는 스킬이 없지만 시험의탑 2층과 4층을 클리어하면 스킬을 획득할수있습니다.", "",
				"\t상대방에게 공격력만큼 피해량이 표시되며 , 실제로 입는 피해량은 공격력 - (방어력+체력) 피해량입니다.", "",
				 "\t소환수를 육성하여 모든층을 클리어하세요!!", "",
				"▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧▧", "",

		};

		MyThread t2 = new MyThread(Tutorial2, 300);
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
				MyThread t3 = new MyThread(Prolog, 1000);
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
					System.out.println("1. 공격하기 / 2. 소환수 스탯창 / 3. 몬스터 스탯창 / 4. 자동 전투");
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
					System.out.println("1. 공격하기 / 2. 소환수 스탯창 / 3. 몬스터 스탯창 / 4. 자동 전투");
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
						while(true)
						{
							try {
								System.out.println("");
								System.out.println("--------------------------");
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

								//몬스터의 체력이 0보다 작거나 같은 경우				
								if(normalMonster.Hp_Snail<=0)
								{	
									try {
										System.out.println("");
										System.out.println("달팽이가 죽었습니다.");
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
				motion.Rabbit();
				System.out.println("토끼 등장!!");
				normalMonster.Rabbit();
				System.out.println("");
				System.out.println("######################");
				
			
				while(true) {
					System.out.println("1. 공격하기 / 2. 소환수 스탯창 / 3. 몬스터 스탯창 / 4. 자동 전투");
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
						while(true)
						{
							try {
								System.out.println("");
								System.out.println("--------------------------");
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

								//몬스터의 체력이 0보다 작거나 같은 경우				
								if(normalMonster.Hp_Rabbit<=0)
								{	
									try {
										System.out.println("");
										System.out.println("토끼가 죽었습니다.");
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
				while (true) {
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					int Floor2 = 0;
					try {
						Floor2 = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if (Floor2 == 1) // 스탯창
					{
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스탯창2.wav");
						System.out.println("");

						knight.knight();
						System.out.println("1. 뒤로가기");
						int Num7 = 0;
						try {
							Num7 = scan.nextInt();
						} catch (Exception e) {
							
							scan = new Scanner(System.in);
							
							System.out.println("");
						}
						Town.Stop();
						if (Num7 == 1) {
							System.out.println("");
						}
						else {
							System.out.println("잘못누르셨습니다.");
						}
					} else if (Floor2 == 2) // 상점
					{	Town1.Stop();
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/상점3.wav");
						Store store = new Store();
						store.store(knight);
						Town.Stop();
						Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
					}

					else if (Floor2 == 3) // 여관
					{	Town1.Stop();
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/여관2.wav");
						Inn Inn = new Inn();
						Inn.inn(knight);
						Town.Stop();
						Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
					} else if (Floor2 == 4) // 시험의 탑
					{
						System.out.println("시험의 탑 다음층으로 갑니다.");
						System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
						System.out.println("1. 예 / 2. 아니오");
						System.out.println("");
						System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
						System.out.println("현재 피로도 : "+knight.Fatigue);
						System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓 ");
						
						
						int Floor2_1 = 0;
						try {
							Floor2_1 = scan.nextInt();
						} catch (Exception e) {
							
							scan = new Scanner(System.in);
							
							System.out.println("");
						}
						if (Floor2_1 == 1) {
							System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
							break;
						}

						else if (Floor2_1 == 2) {
							System.out.println("마을로 돌아갑니다. 정비해주세요");
							System.out.println("");
						}

					}

					else {
						System.out.println("잘못누르셨습니다.");
					}
				}

				Town1.Stop();
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
				Media Top2 = new Media(); //마을 bgm

				
				Top2.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Dungeon-03.wav");
				
				System.out.println("");
				System.out.println("------------------------------------------");
				System.out.println("------------------------------------------");
				System.out.println("");
				System.out.println("시험의 탑 2층");
				System.out.println("");
				System.out.println(">>2층과 4층은 중간보스가 출현합니다.");
				System.out.println(">>중간보스를 무찌르면 스킬을 배우실 수 있습니다.");

				MediumBoss mediumBoss = new MediumBoss();// 중간보스 클래스 불러오기

				System.out.println("");
				motion.Ogre();
				System.out.println("오우거 등장!!");
				System.out.println("");
				mediumBoss.Ogre();
				System.out.println("");
				System.out.println("######################");
				
				while (true) { // 전투 반복
					System.out.println("1. 공격하기 / 2. 소환수 스탯창 / 3. 몬스터 스탯창");
					int Battle_Ogre = 0;
					try {
						Battle_Ogre = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if (Battle_Ogre == 1) {
						
						motion.K_Attack();
						k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/검소리2.wav");
						
						try {
							System.out.println("");
							System.out.println(creature.Name + "의 공격입니다.");
							mediumBoss.Attacked_Ogre(knight.Attack());
							if(mediumBoss.Hp > 0)
							{
								System.out.println("오우거 체력 : " + mediumBoss.Hp);
							}
							if(mediumBoss.Hp <= 0)
							{
								mediumBoss.Hp = 0;
								System.out.println("오우거 체력 : " + mediumBoss.Hp);
							}
							
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();

						// 몬스터의 체력이 0보다 작거나 같은 경우
						if (mediumBoss.Hp <= 0) {
							try {
								System.out.println("");
								System.out.println("오우거가 죽었습니다.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
								System.out.println("몬스터골드" + mediumBoss.Gold + "를 획득하셨습니다.");
								knight.Gold += mediumBoss.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							break;
						}
						motion.Ogre_Attack();
						tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/오우거2.wav");
						try {
							System.out.println("");
							System.out.println("오우거의 공격입니다.");
							knight.Attacked(mediumBoss.Attack());
							System.out.println(creature.Name + " 체력 : " + knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
			
						if (knight.Hp <= 0) {
							System.out.println("");
							System.out.println(creature.Name + "가 죽었습니다.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					}
					else if(Battle_Ogre == 2)
					{
						System.out.println("");
						knight.knight();
						System.out.println("");
					}
					else if(Battle_Ogre == 3)
					{
						System.out.println("");
						mediumBoss.Ogre();
						System.out.println("");
					}
					else {
						System.out.println("잘못누르셨습니다.");
					}
				}
				tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/게임승리.wav");
				try {
					System.out.println(">>대단해요 !! 중간보스를 쓰러트리셨어요!!");
					System.out.println(">>중간보스를 쓰러트려서 스킬을 배우셨습니다.");
					System.out.println("");
					Thread.sleep(3000);
					tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스킬효과음.wav");
					System.out.println("1차스킬 슬래시를 배웠다!!");
					System.out.println("");
					knight.Skill = "슬래시";
					System.out.println(">>마을로 돌아갑니다.");
					Thread.sleep(5000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				tower1.Stop();
				tower1.Stop();
				knight.Hp = 120;
				knight.Fatigue += 40;
				Top2.Stop();
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
				
				Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
				while (true) {
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					int Floor3 = 0;
					try {
						Floor3 = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if (Floor3 == 1) // 스탯창
					{	
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스탯창2.wav");
						System.out.println("");

						knight.knight();
						System.out.println("1. 뒤로가기");
						int Num7 = 0;
						try {
							Num7 = scan.nextInt();
						} catch (Exception e) {
							
							scan = new Scanner(System.in);
							
							System.out.println("");
						}
						if (Num7 == 1) {
							System.out.println("");
						}
						else {
							System.out.println("잘못누르셨습니다.");
						}
					} else if (Floor3 == 2) // 상점
					{
						Town1.Stop();
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/상점3.wav");
						Store store = new Store();
						store.store(knight);
						Town.Stop();
						Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");

					} else if (Floor3 == 3) // 여관
					{
						Town1.Stop();
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/여관2.wav");
						Inn Inn = new Inn();
						Inn.inn(knight);
						Town.Stop();
						Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
					} else if (Floor3 == 4) // 시험의 탑
					{
						System.out.println("시험의 탑 다음층으로 갑니다.");
						System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
						System.out.println("1. 예 / 2. 아니오");
						System.out.println("");
						System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
						System.out.println("현재 피로도 : "+knight.Fatigue);
						System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓 ");
						
						
						int Floor3_1 = 0;
						try {
							Floor3_1 = scan.nextInt();
						} catch (Exception e) {
							
							scan = new Scanner(System.in);
							
							System.out.println("");
						}
						if (Floor3_1 == 1) {
							System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
							break;
						}

						else if (Floor3_1 == 2) {
							System.out.println("마을로 돌아갑니다. 정비해주세요");
							System.out.println("");
						}

					}

					else {
						System.out.println("잘못누르셨습니다.");
					}

				}
				Town1.Stop();
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
				Media Top3 = new Media(); //마을 bgm
				Top3.setDaemon(true);
				
				Top3.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Dungeon-01.wav");
				
				System.out.println("");
				System.out.println("------------------------------------------");
				System.out.println("------------------------------------------");
				System.out.println("");
				System.out.println("시험의 탑 3층");
				System.out.println("");
				System.out.println(">>스킬을 배우셨으니 스킬과 일반공격을 적절히 사용해서 적을 해치우세요");

				NormalMonster2 normalMonster2 = new NormalMonster2(); // 3층 몬스터 불러오기

				System.out.println("");
				motion.Chipmunk();
				System.out.println("다람쥐 등장!!");
				System.out.println("");
				normalMonster2.Chipmunk();
				System.out.println("");
				System.out.println("######################");

				while (true) { // 전투 반복
					System.out.println("1. 공격하기 / 2. 스킬사용 / 3. 소환수 스탯창 / 4. 몬스터 스탯창 / 5. 자동 전투");
					int Num3_1 = 0;
					try {
						Num3_1 = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if (Num3_1 == 1) {
						motion.K_Attack();
						k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/검소리2.wav");
						try {
							System.out.println("");
							System.out.println(creature.Name + "의 공격입니다.");
							normalMonster2.Attacked_Chipmunk(knight.Attack());
							if(normalMonster2.Hp_Chipmunk > 0)
							{
								System.out.println("다람쥐 체력 : " + normalMonster2.Hp_Chipmunk);
							}
							if(normalMonster2.Hp_Chipmunk <= 0)
							{
								normalMonster2.Hp_Chipmunk = 0;
								System.out.println("다람쥐 체력 : " + normalMonster2.Hp_Chipmunk);
							}
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();

						// 몬스터의 체력이 0보다 작거나 같은 경우
						if (normalMonster2.Hp_Chipmunk <= 0) {
							
							try {
								System.out.println("");
								System.out.println("다람쥐가 죽었습니다.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
								System.out.println("몬스터골드" + normalMonster2.Gold + "를 획득하셨습니다.");
								knight.Gold += normalMonster2.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							break;
						}
						motion.Chipmunk_Attack();
						tower1.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/다람쥐.wav", +6.0f);
						
						try {
							System.out.println("");
							System.out.println("다람쥐의 공격입니다.");
							knight.Attacked(normalMonster2.Attack());
							System.out.println(creature.Name + " 체력 : " + knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if (knight.Hp <= 0) {
							System.out.println("");
							System.out.println(creature.Name + "가 죽었습니다.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					} else if (Num3_1 == 2 && knight.Mp >= 30 ) {
						motion.K_Attack_Skill1();
						k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/슬래시.wav");
						
						try {
							System.out.println("");
							System.out.println(creature.Name + "의 공격입니다.");
							normalMonster2.Attacked_Chipmunk(knight.Skill());
							if(normalMonster2.Hp_Chipmunk > 0)
							{
								System.out.println("다람쥐 체력 : " + normalMonster2.Hp_Chipmunk);
							}
							if(normalMonster2.Hp_Chipmunk <= 0)
							{
								normalMonster2.Hp_Chipmunk = 0;
								System.out.println("다람쥐 체력 : " + normalMonster2.Hp_Chipmunk);
							}
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();

						// 몬스터의 체력이 0보다 작거나 같은 경우
						if (normalMonster2.Hp_Chipmunk <= 0) {
							try {
								System.out.println("");
								System.out.println("다람쥐가 죽었습니다.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
								System.out.println("몬스터골드" + normalMonster2.Gold + "를 획득하셨습니다.");
								knight.Gold += normalMonster2.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							break;
						}
						motion.Chipmunk_Attack();
						tower1.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/다람쥐.wav", +6.0f);
						
						try {
							System.out.println("");
							System.out.println("다람쥐의 공격입니다.");
							knight.Attacked(normalMonster2.Attack());
							System.out.println(creature.Name + " 체력 : " + knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if (knight.Hp <= 0) {
							System.out.println("");
							System.out.println(creature.Name + "가 죽었습니다.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					}
					
					else if (Num3_1 == 2 && knight.Mp < 30)
					{
						System.out.println("마나가 부족합니다.");
						System.out.println("");
					}
					else if(Num3_1 == 3)
					{
						System.out.println("");
						knight.knight();
						System.out.println("");
					}
					else if(Num3_1 == 4)
					{
						System.out.println("");
						normalMonster2.Chipmunk();
						System.out.println("");
					}
					else if(Num3_1 == 5)
					{
						while(true)
						{
							try {
								System.out.println("");
								System.out.println("--------------------------");
								System.out.println("");
								System.out.println(creature.Name + "의 공격입니다.");
								normalMonster2.Attacked_Chipmunk(knight.Attack());
								if(normalMonster2.Hp_Chipmunk > 0)
								{
									System.out.println("다람쥐 체력 : " + normalMonster2.Hp_Chipmunk);
								}
								if(normalMonster2.Hp_Chipmunk <= 0)
								{
									normalMonster2.Hp_Chipmunk = 0;
									System.out.println("다람쥐 체력 : " + normalMonster2.Hp_Chipmunk);
								}

								//몬스터의 체력이 0보다 작거나 같은 경우				
								if(normalMonster2.Hp_Chipmunk<=0)
								{	
									try {
										System.out.println("");
										System.out.println("다람쥐가 죽었습니다.");
										System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
										knight.Gold+=normalMonster2.Gold;
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
								System.out.println("---------------");
								System.out.println("");
								System.out.println("다람쥐의 공격입니다.");
								knight.Attacked(normalMonster2.Attack());
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

					else {
						System.out.println("잘못누르셨습니다.");
					}
				}
				motion.Slime();
				System.out.println("");
				System.out.println("슬라임 등장!!");
				System.out.println("");
				normalMonster2.Slime();
				System.out.println("");
				System.out.println("######################");

				while (true) { // 전투 반복
					System.out.println("1. 공격하기 / 2. 스킬사용 / 3. 소환수 스탯창 / 4. 몬스터 스탯창 / 5. 자동 전투");
					int Num3_2 = 0;
					try {
						Num3_2 = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if (Num3_2 == 1) {
						
						motion.K_Attack();
						k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/검소리2.wav");
						
						try {
							System.out.println("");
							System.out.println(creature.Name + "의 공격입니다.");
							normalMonster2.Attacked_Slime(knight.Attack());
							if(normalMonster2.Hp_Slime > 0)
							{
								System.out.println("슬라임 체력 : " + normalMonster2.Hp_Slime);
							}
							if(normalMonster2.Hp_Slime <= 0)
							{
								normalMonster2.Hp_Slime = 0;
								System.out.println("슬라임 체력 : " + normalMonster2.Hp_Slime);
							}
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();

						// 몬스터의 체력이 0보다 작거나 같은 경우
						if (normalMonster2.Hp_Slime <= 0) {
							
							try {
								System.out.println("");
								System.out.println("슬라임이 죽었습니다.");
								System.out.println("몬스터골드" + normalMonster2.Gold + "를 획득하셨습니다.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
								knight.Gold += normalMonster2.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							break;
						}
						motion.Slime_Attack();
						tower1.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/슬라임.wav", +6.0f);
						
						try {
							System.out.println("");
							System.out.println("슬라임의 공격입니다.");
							knight.Attacked(normalMonster.Attack());
							System.out.println(creature.Name + " 체력 : " + knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if (knight.Hp <= 0) {
							System.out.println("");
							System.out.println(creature.Name + "가 죽었습니다.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					} else if (Num3_2 == 2 && knight.Mp >= 30) {
						
						motion.K_Attack_Skill1();
						k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/슬래시.wav");
						
						try {
							System.out.println("");
							System.out.println(creature.Name + "의 공격입니다.");
							normalMonster2.Attacked_Slime(knight.Skill());
							if(normalMonster2.Hp_Slime > 0)
							{
								System.out.println("슬라임 체력 : " + normalMonster2.Hp_Slime);
							}
							if(normalMonster2.Hp_Slime <= 0)
							{
								normalMonster2.Hp_Slime = 0;
								System.out.println("슬라임 체력 : " + normalMonster2.Hp_Slime);
							}
							
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();
						

						// 몬스터의 체력이 0보다 작거나 같은 경우
						if (normalMonster2.Hp_Slime <= 0) {
							try {
								System.out.println("");
								System.out.println("슬라임이 죽었습니다.");
								System.out.println("몬스터골드" + normalMonster2.Gold + "를 획득하셨습니다.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
								knight.Gold += normalMonster2.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							break;
						}
						motion.Slime_Attack();
						tower1.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/슬라임.wav", +6.0f);
						
						try {
							System.out.println("");
							System.out.println("슬라임의 공격입니다.");
							knight.Attacked(normalMonster.Attack());
							System.out.println(creature.Name + " 체력 : " + knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if (knight.Hp <= 0) {
							System.out.println("");
							System.out.println(creature.Name + "가 죽었습니다.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					}
					else if (Num3_2 == 2 && knight.Mp < 30)
					{
						System.out.println("마나가 부족합니다.");
						System.out.println("");
					}
					else if(Num3_2 == 3)
					{
						System.out.println("");
						knight.knight();
						System.out.println("");
					}
					else if(Num3_2 == 4)
					{
						System.out.println("");
						normalMonster2.Slime();
						System.out.println("");
					}
					else if(Num3_2 == 5)
					{
						while(true)
						{
							try {
								System.out.println("");
								System.out.println("--------------------------");
								System.out.println("");
								System.out.println(creature.Name + "의 공격입니다.");
								normalMonster2.Attacked_Slime(knight.Attack());
								if(normalMonster2.Hp_Slime > 0)
								{
									System.out.println("슬라임 체력 : " + normalMonster2.Hp_Slime);
								}
								if(normalMonster2.Hp_Slime <= 0)
								{
									normalMonster2.Hp_Slime = 0;
									System.out.println("슬라임 체력 : " + normalMonster2.Hp_Slime);
								}

								//몬스터의 체력이 0보다 작거나 같은 경우				
								if(normalMonster2.Hp_Slime<=0)
								{	
									try {
										System.out.println("");
										System.out.println("슬라임이 죽었습니다.");
										System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
										knight.Gold+=normalMonster2.Gold;
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
								System.out.println("---------------");
								System.out.println("");
								System.out.println("슬라임의 공격입니다.");
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
					else {
						System.out.println("잘못누르셨습니다.");
					}
				}
				
				System.out.println("");
				motion.Skeleton();
				System.out.println("스켈레톤 등장!!");
				System.out.println("");
				normalMonster2.Skeleton();
				System.out.println("");
				System.out.println("######################");

				while (true) { // 전투 반복
					System.out.println("1. 공격하기 / 2. 스킬사용 / 3. 소환수 스탯창 / 4. 몬스터 스탯창 / 5.자동 전투");
					int Num3_2 = 0;
					try {
						Num3_2 = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if (Num3_2 == 1) {
						
						motion.K_Attack();
						k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/검소리2.wav");
						try {
							System.out.println("");
							System.out.println(creature.Name + "의 공격입니다.");
							normalMonster2.Attacked_Skeleton(knight.Attack());
							if(normalMonster2.Hp_Skeleton > 0)
							{
								System.out.println("스켈레톤 체력 : " + normalMonster2.Hp_Skeleton);
							}
							if(normalMonster2.Hp_Skeleton <= 0)
							{
								normalMonster2.Hp_Skeleton = 0;
								System.out.println("스켈레톤 체력 : " + normalMonster2.Hp_Skeleton);
							}
							
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}k_Attack.Stop();
						

						// 몬스터의 체력이 0보다 작거나 같은 경우
						if (normalMonster2.Hp_Skeleton <= 0) {
							
							try {
								System.out.println("");
								System.out.println("스켈레톤이 죽었습니다.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
								System.out.println("몬스터골드" + normalMonster2.Gold + "를 획득하셨습니다.");
								knight.Gold += normalMonster2.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							
							
							break;
						}
						motion.Skeleton_Attack();
						tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스켈레톤.wav");
						
						try {
							System.out.println("");
							System.out.println("스켈레톤의 공격입니다.");
							System.out.println("");
							knight.Attacked(normalMonster.Attack());
							System.out.println(creature.Name + " 체력 : " + knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						
						if (knight.Hp <= 0) {
							System.out.println("");
							System.out.println(creature.Name + "가 죽었습니다.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					} else if (Num3_2 == 2 && knight.Mp >= 30) {
						
						motion.K_Attack_Skill1();
						k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/슬래시.wav");
						
						try {
							System.out.println("");
							System.out.println(creature.Name + "의 공격입니다.");
							normalMonster2.Attacked_Skeleton(knight.Skill());
							if(normalMonster2.Hp_Skeleton > 0)
							{
								System.out.println("스켈레톤 체력 : " + normalMonster2.Hp_Skeleton);
							}
							if(normalMonster2.Hp_Skeleton <= 0)
							{
								normalMonster2.Hp_Skeleton = 0;
								System.out.println("스켈레톤 체력 : " + normalMonster2.Hp_Skeleton);
							}
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();
						

						// 몬스터의 체력이 0보다 작거나 같은 경우
						if (normalMonster2.Hp_Skeleton <= 0) {
							try {
								System.out.println("");
								System.out.println("스켈레톤이 죽었습니다.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
								System.out.println("몬스터골드" + normalMonster2.Gold + "를 획득하셨습니다.");
								knight.Gold += normalMonster2.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							break;
						}
						motion.Skeleton_Attack();
						tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스켈레톤.wav");
						
						try {
							System.out.println("");
							System.out.println("스켈레톤의 공격입니다.");
							System.out.println("");
							knight.Attacked(normalMonster.Attack());
							System.out.println(creature.Name + " 체력 : " + knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if (knight.Hp <= 0) {
							System.out.println("");
							System.out.println(creature.Name + "가 죽었습니다.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					}
					else if (Num3_2 == 2 && knight.Mp < 30)
					{
						System.out.println("마나가 부족합니다.");
						System.out.println("");
					}
					else if(Num3_2 == 3)
					{
						System.out.println("");
						knight.knight();
						System.out.println("");
					}
					else if(Num3_2 == 4)
					{
						System.out.println("");
						normalMonster2.Skeleton();
						System.out.println("");
					}
					else if(Num3_2 == 5)
					{
						
						while(true)
						{
							try {
								System.out.println("");
								System.out.println("--------------------------");
								System.out.println("");
								System.out.println(creature.Name + "의 공격입니다.");
								normalMonster2.Attacked_Skeleton(knight.Attack());
								if(normalMonster2.Hp_Skeleton > 0)
								{
									System.out.println("스켈레톤 체력 : " + normalMonster2.Hp_Skeleton);
								}
								if(normalMonster2.Hp_Skeleton <= 0)
								{
									normalMonster2.Hp_Skeleton = 0;
									System.out.println("스켈레톤 체력 : " + normalMonster2.Hp_Skeleton);
								}

								//몬스터의 체력이 0보다 작거나 같은 경우				
								if(normalMonster2.Hp_Skeleton<=0)
								{	
									try {
										System.out.println("");
										System.out.println("스켈레톤이 죽었습니다.");
										System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
										knight.Gold+=normalMonster2.Gold;
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
								System.out.println("---------------");
								System.out.println("");
								System.out.println("스켈레톤의 공격입니다.");
								knight.Attacked(normalMonster.Attack());
								System.out.println(creature.Name+" 체력 : "+knight.Hp);
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

					else {
						System.out.println("잘못누르셨습니다.");
					}
				}
				tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/게임승리.wav");
				System.out.println(">>시험의 탑 3층을 클리어하셨습니다!!!!");
				System.out.println(">>마을로 갑니다.");
				System.out.println("");
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				tower1.Stop();
				knight.Hp = 120;
				knight.Fatigue += 40;
				knight.Mp = 100;
				
				if(knight.Fatigue > 100)
				{
					System.out.println("앗..!!");
					System.out.println("소환수를 너무 혹사시켰네요 ..");
					System.out.println("소환수의 피로가 쌓여 죽었습니다.");
					System.out.println("");
					System.out.println("Game Over");
					return;
				}
				
				System.out.println("------------------------------------------");
				System.out.println("------------------------------------------");
				Top3.Stop();
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
				Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
				
				while (true) {
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					int Floor3 = 0;
					try {
						Floor3 = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if (Floor3 == 1) // 스탯창
					{
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스탯창2.wav");
						System.out.println("");

						knight.knight();
						System.out.println("1. 뒤로가기");
						int Num7 = 0;
						try {
							Num7 = scan.nextInt();
						} catch (Exception e) {
							
							scan = new Scanner(System.in);
							
							System.out.println("");
						}
						if (Num7 == 1) {
							System.out.println("");
						}
						else {
							System.out.println("잘못누르셨습니다.");
						}
					} else if (Floor3 == 2) // 상점
					{
						Town1.Stop();
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/상점3.wav");
						Store store = new Store();
						store.store(knight);
						Town.Stop();
						Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
					}

					else if (Floor3 == 3) // 여관
					{
						Town1.Stop();
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/여관2.wav");
						Inn Inn = new Inn();
						Inn.inn(knight);
						Town.Stop();
						Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
					} else if (Floor3 == 4) // 시험의 탑
					{
						System.out.println("시험의 탑 다음층으로 갑니다.");
						System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
						System.out.println("1. 예 / 2. 아니오");
						System.out.println("");
						System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
						System.out.println("현재 피로도 : "+knight.Fatigue);
						System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓 ");
						
						
						int Floor3_1 = 0;
						try {
							Floor3_1 = scan.nextInt();
						} catch (Exception e) {
							
							scan = new Scanner(System.in);
							
							System.out.println("");
						}
						if (Floor3_1 == 1) {
							System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
							break;
						}

						else if (Floor3_1 == 2) {
							System.out.println("마을로 돌아갑니다. 정비해주세요");
							System.out.println("");
						}

					}

					else {
						System.out.println("잘못누르셨습니다.");
					}
				}

				Town1.Stop();
				
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
				Top2.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Dungeon-03.wav");
				
				System.out.println("");
				System.out.println("------------------------------------------");
				System.out.println("------------------------------------------");
				System.out.println("");
				System.out.println("시험의 탑 4층");
				System.out.println("");
				System.out.println(">>중간보스입니다.");
				System.out.println(">>중간보스를 해치우면 2차스킬을 배울수있습니다.");
				System.out.println("");
				System.out.println("");
				MediumBoss2 mediumBoss2 = new MediumBoss2();// 중간보스 클래스 불러오기

				motion.Envoy();
				System.out.println("");
				System.out.println("마녀 등장!!");
				System.out.println("");
				mediumBoss2.Envoy();
				System.out.println("");
				System.out.println("######################");

				while (true) { // 전투 반복
					System.out.println("1. 공격하기 / 2. 스킬사용 / 3. 소환수 스탯창 / 4. 몬스터 스탯창");
					int Battle_Envoy = 0;
					try {
						Battle_Envoy = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if (Battle_Envoy == 1) {
						motion.K_Attack();
						k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/검소리2.wav");
						
						try {
							System.out.println("");
							System.out.println(creature.Name + "의 공격입니다.");
							mediumBoss2.Attacked_Envoy(knight.Attack());
							if(mediumBoss2.Hp > 0)
							{
								System.out.println("마녀 체력 : " + mediumBoss2.Hp);
							}
							if(mediumBoss2.Hp <= 0)
							{
								mediumBoss2.Hp = 0;
								System.out.println("마녀 체력 : " + mediumBoss2.Hp);
							}
							
							Thread.sleep(1500);						
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();
						
						// 몬스터의 체력이 0보다 작거나 같은 경우
						if (mediumBoss2.Hp <= 0) {
							
							try {
								System.out.println("");
								System.out.println("마녀가 죽었습니다.");
								System.out.println("몬스터골드" + mediumBoss2.Gold + "를 획득하셨습니다.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
								knight.Gold += mediumBoss2.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							break;
						}
						motion.Envoy_Attack();
						tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/마녀.wav");
						
						try {
							System.out.println("");
							System.out.println("마녀의 공격입니다.");
							knight.Attacked(mediumBoss2.Attack());
							System.out.println(creature.Name + " 체력 : " + knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if (knight.Hp <= 0) {
							System.out.println("");
							System.out.println(creature.Name + "가 죽었습니다.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					} else if (Battle_Envoy == 2 && knight.Mp >= 30)

					{
						motion.K_Attack_Skill1();
						k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/슬래시.wav");
						
						try {
							System.out.println("");
							System.out.println(creature.Name + "의 공격입니다.");
							mediumBoss2.Attacked_Envoy(knight.Skill());
							if(mediumBoss2.Hp > 0)
							{
								System.out.println("마녀 체력 : " + mediumBoss2.Hp);
							}
							if(mediumBoss2.Hp <= 0)
							{
								mediumBoss2.Hp = 0;
								System.out.println("마녀 체력 : " + mediumBoss2.Hp);
							}
							
							
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();

						// 몬스터의 체력이 0보다 작거나 같은 경우
						if (mediumBoss2.Hp <= 0) {
							try {
								System.out.println("");
								System.out.println("마녀가 죽었습니다.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
								System.out.println("몬스터골드" + mediumBoss2.Gold + "를 획득하셨습니다.");
								knight.Gold += mediumBoss2.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							
							
							break;
						}
						motion.Envoy_Attack();
						tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/마녀.wav");
						try {
							System.out.println("");
							System.out.println("마녀의 공격입니다.");
							knight.Attacked(mediumBoss2.Attack());
							System.out.println(creature.Name + " 체력 : " + knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if (knight.Hp <= 0) {
							System.out.println("");
							System.out.println(creature.Name + "가 죽었습니다.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
						
					}
					else if (Battle_Envoy == 2 && knight.Mp < 30)
					{
						System.out.println("마나가 부족합니다.");
						System.out.println("");
					}
					else if(Battle_Envoy == 3)
					{
						System.out.println("");
						knight.knight();
						System.out.println("");
					}
					else if(Battle_Envoy == 4)
					{
						System.out.println("");
						mediumBoss2.Envoy();
						System.out.println("");
					}
					else {
						System.out.println("잘못누르셨습니다.");
					}
				}
				tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/게임승리.wav");
				try {
					System.out.println(">>대단해요 !! 중간보스를 쓰러트리셨어요!!");
					System.out.println(">>중간보스를 쓰러트려서 스킬을 배우셨습니다.");
					System.out.println("");
					Thread.sleep(3000);
					tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스킬효과음.wav");
					System.out.println("2차스킬 일검을 배웠다!!");
					System.out.println("");
					knight.Skill2 = "일검";
					System.out.println(">>마을로 돌아갑니다.");
					Thread.sleep(5000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				tower1.Stop();
				tower1.Stop();
				knight.Hp = 120;
				knight.Fatigue += 40;
				knight.Mp = 100;
				if(knight.Fatigue > 100)
				{
					System.out.println("앗..!!");
					System.out.println("소환수를 너무 혹사시켰네요 ..");
					System.out.println("소환수의 피로가 쌓여 죽었습니다.");
					System.out.println("");
					System.out.println("Game Over");
					return;
				}

				Top2.Stop();
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
				Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
				
				while (true) {
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					int Floor5_1 = 0;
					try {
						Floor5_1 = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if (Floor5_1 == 1) // 스탯창
					{
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스탯창2.wav");
						System.out.println("");

						knight.knight();
						System.out.println("1. 뒤로가기");
						int Num7 = 0;
						try {
							Num7 = scan.nextInt();
						} catch (Exception e) {
							
							scan = new Scanner(System.in);
							
							System.out.println("");
						}
						if (Num7 == 1) {
							System.out.println("");
						}
						else
						{
							System.out.println("잘못누르셨습니다.");
						}
						
					} else if (Floor5_1 == 2) // 상점
					{
						Town1.Stop();
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/상점3.wav");
						Store store = new Store();
						store.store(knight);
						Town.Stop();
						Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
						
					} else if (Floor5_1 == 3) // 여관
					{
						Town1.Stop();
						Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/여관2.wav");
						Inn Inn = new Inn();
						Inn.inn(knight);
						Town.Stop();
						Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
					} else if (Floor5_1 == 4) // 시험의 탑
					{
						System.out.println("시험의 탑 다음층으로 갑니다.");
						System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
						System.out.println("1. 예 / 2. 아니오");
						System.out.println("");
						System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
						System.out.println("현재 피로도 : "+knight.Fatigue);
						System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓 ");
						
						
						int Floor5_2 = 0;
						try {
							Floor5_2 = scan.nextInt();
						} catch (Exception e) {
							
							scan = new Scanner(System.in);
							
							System.out.println("");
						}
						if (Floor5_2 == 1) {
							System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
							break;
						}

						else if (Floor5_2 == 2) {
							System.out.println("마을로 돌아갑니다. 정비해주세요");
							System.out.println("");
						}

					}

					else {
						System.out.println("잘못누르셨습니다.");
					}

				}
				
				Town1.Stop();
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
				Media Top5 = new Media(); //음악쓰레드 객체생 test.setDaemon(true);
				Top5.setDaemon(true);
				
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
					System.out.println("1. 공격하기 / 2. 1차스킬사용 / 3. 2차스킬사용 / 4. 소환수 스탯창 / 5. 몬스터 스탯창");
					int Battle_Devil = 0;
					try {
						Battle_Devil = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
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
							System.out.println("");
							System.out.println("Game Over");
							return;
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
							System.out.println("");
							System.out.println("Game Over");
							return;
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
							System.out.println("");
							System.out.println("Game Over");
							return;
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
					else if(Battle_Devil == 4)
					{
						System.out.println("");
						knight.knight();
						System.out.println("");
					}
					else if(Battle_Devil == 5)
					{
						System.out.println("");
						finalBoss.Devil();
						System.out.println("");
					}
					else {
						System.out.println("잘못"
								+ "누르셨습니다.");
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

			else if (Num2 == 2) {
				System.out.println("");		
				System.out.println("");
				System.out.print("도적");

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
Thief thief = new Thief(); // 도적 클래스 인스턴스 생성
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
	System.out.println("1. 공격하기 / 2. 소환수 스탯창 / 3. 몬스터 스탯창 / 4. 자동 전투");
	int Battle_Bat = 0;
	try {
		Battle_Bat = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	
	if(Battle_Bat == 1)
		
	{	motion.T_Attack();
	

	k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/나이프소리2.wav");

		try {
			System.out.println("");
			System.out.println(creature.Name+"의 공격입니다.");
			normalMonster.Attacked_Bat(thief.Attack());
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
			thief.Gold+=normalMonster.Gold;
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
			thief.Attacked(normalMonster.Attack());
			System.out.println(creature.Name+" 체력 : "+thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if(thief.Hp <=0)
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
	
		thief.thief();
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
				normalMonster.Attacked_Bat(thief.Attack());
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
						thief.Gold+=normalMonster.Gold;
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
				thief.Attacked(normalMonster.Attack());
				System.out.println(creature.Name+" 체력 : "+thief.Hp);
				System.out.println("");
				if(thief.Hp <=0)
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
	System.out.println("1. 공격하기 / 2. 소환수 스탯창 / 3. 몬스터 스탯창 / 4. 자동 전투");
	int Battle_Snail = 0;
	try {
		Battle_Snail = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if(Battle_Snail == 1)
		
	{	motion.T_Attack();
	k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/나이프소리2.wav");
	try {
		System.out.println("");
		System.out.println(creature.Name+"의 공격입니다.");
		normalMonster.Attacked_Snail(thief.Attack());
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
				thief.Gold+=normalMonster.Gold;
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
			thief.Attacked(normalMonster.Attack());
			System.out.println(creature.Name+" 체력 : "+thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if(thief.Hp <=0)
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
		thief.thief();
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
		while(true)
		{
			try {
				System.out.println("");
				System.out.println("--------------------------");
				System.out.println("");
				System.out.println(creature.Name+"의 공격입니다.");
				normalMonster.Attacked_Snail(thief.Attack());
				if(normalMonster.Hp_Snail > 0)
				{
					System.out.println("달팽이 체력 : "+normalMonster.Hp_Snail);
				}
				if(normalMonster.Hp_Snail <= 0)
				{
					normalMonster.Hp_Snail = 0;
					System.out.println("달팽이 체력 : "+normalMonster.Hp_Snail);
				}

				//몬스터의 체력이 0보다 작거나 같은 경우				
				if(normalMonster.Hp_Snail<=0)
				{	
					try {
						System.out.println("");
						System.out.println("달팽이가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster.Gold+"를 획득하셨습니다.");
						thief.Gold+=normalMonster.Gold;
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
				System.out.println("달팽이의 공격입니다.");
				System.out.println("");
				thief.Attacked(normalMonster.Attack());
				System.out.println(creature.Name+" 체력 : "+thief.Hp);
				System.out.println("");
				if(thief.Hp <=0)
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
motion.Rabbit();
System.out.println("토끼 등장!!");
normalMonster.Rabbit();
System.out.println("");
System.out.println("######################");


while(true) {
	System.out.println("1. 공격하기 / 2. 소환수 스탯창 / 3. 몬스터 스탯창 / 4. 자동 전투");
	int Battle_Rabbit = 0;
	try {
		Battle_Rabbit = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if(Battle_Rabbit == 1)
	{	
		motion.T_Attack();
		k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/나이프소리2.wav");
		try {
			System.out.println("");
			System.out.println(creature.Name+"의 공격입니다.");
			normalMonster.Attacked_Rabbit(thief.Attack());
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
				thief.Gold+=normalMonster.Gold;
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
			thief.Attacked(normalMonster.Attack());
			System.out.println(creature.Name+" 체력 : "+thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if(thief.Hp <=0)
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
		thief.thief();
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
		while(true)
		{
			try {
				System.out.println("");
				System.out.println("--------------------------");
				System.out.println("");
				System.out.println(creature.Name+"의 공격입니다.");
				normalMonster.Attacked_Rabbit(thief.Attack());
				if(normalMonster.Hp_Rabbit > 0)
				{
					System.out.println("토끼 체력 : "+normalMonster.Hp_Rabbit);
				}
				if(normalMonster.Hp_Rabbit <= 0)
				{
					normalMonster.Hp_Rabbit = 0;
					System.out.println("토끼 체력 : "+normalMonster.Hp_Rabbit);
				}

				//몬스터의 체력이 0보다 작거나 같은 경우				
				if(normalMonster.Hp_Rabbit<=0)
				{	
					try {
						System.out.println("");
						System.out.println("토끼가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster.Gold+"를 획득하셨습니다.");
						thief.Gold+=normalMonster.Gold;
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
				System.out.println("---------------");
				System.out.println("");
				System.out.println("토끼의 공격입니다.");
				thief.Attacked(normalMonster.Attack());
				System.out.println(creature.Name+" 체력 : "+thief.Hp);
				System.out.println("");
				if(thief.Hp <=0)
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
System.out.println("");
thief.Fatigue += 40;
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
thief.Hp = 100;

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
while (true) {
	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	int Floor2 = 0;
	try {
		Floor2 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Floor2 == 1) // 스탯창
	{
		Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스탯창2.wav");
		System.out.println("");

		thief.thief();
		System.out.println("1. 뒤로가기");
		int Num7 = 0;
		try {
			Num7 = scan.nextInt();
		} catch (Exception e) {
			
			scan = new Scanner(System.in);
			
			System.out.println("");
		}
		Town.Stop();
		if (Num7 == 1) {
			System.out.println("");
		}
		else {
			System.out.println("잘못누르셨습니다.");
		}
	} else if (Floor2 == 2) // 상점
	{	Town1.Stop();
		Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/상점3.wav");
		Store store = new Store();
		store.Thi_sto(thief);
		Town.Stop();
		Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
	}

	else if (Floor2 == 3) // 여관
	{	Town1.Stop();
		Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/여관2.wav");
		Inn Inn = new Inn();
		Inn.Thi_in(thief);
		Town.Stop();
		Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
	} else if (Floor2 == 4) // 시험의 탑
	{
		System.out.println("시험의 탑 다음층으로 갑니다.");
		System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
		System.out.println("1. 예 / 2. 아니오");
		System.out.println("");
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
		System.out.println("현재 피로도 : "+thief.Fatigue);
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓 ");
		
		
		int Floor2_1 = 0;
		try {
			Floor2_1 = scan.nextInt();
		} catch (Exception e) {
			
			scan = new Scanner(System.in);
			
			System.out.println("");
		}
		if (Floor2_1 == 1) {
			System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
			break;
		}

		else if (Floor2_1 == 2) {
			System.out.println("마을로 돌아갑니다. 정비해주세요");
			System.out.println("");
		}

	}

	else {
		System.out.println("잘못누르셨습니다.");
	}
}

Town1.Stop();
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
Media Top2 = new Media(); //마을 bgm


Top2.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Dungeon-03.wav");

System.out.println("");
System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
System.out.println("");
System.out.println("시험의 탑 2층");
System.out.println("");
System.out.println(">>2층과 4층은 중간보스가 출현합니다.");
System.out.println(">>중간보스를 무찌르면 스킬을 배우실 수 있습니다.");

MediumBoss mediumBoss = new MediumBoss();// 중간보스 클래스 불러오기

System.out.println("");
motion.Ogre();
System.out.println("오우거 등장!!");
System.out.println("");
mediumBoss.Ogre();
System.out.println("");
System.out.println("######################");

while (true) { // 전투 반복
	System.out.println("1. 공격하기 / 2. 소환수 스탯창 / 3. 몬스터 스탯창");
	int Battle_Ogre = 0;
	try {
		Battle_Ogre = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Battle_Ogre == 1) {
		
		motion.T_Attack();
		k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/나이프소리2.wav");
		
		try {
			System.out.println("");
			System.out.println(creature.Name + "의 공격입니다.");
			mediumBoss.Attacked_Ogre(thief.Attack());
			if(mediumBoss.Hp > 0)
			{
				System.out.println("오우거 체력 : " + mediumBoss.Hp);
			}
			if(mediumBoss.Hp <= 0)
			{
				mediumBoss.Hp = 0;
				System.out.println("오우거 체력 : " + mediumBoss.Hp);
			}
			
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();

		// 몬스터의 체력이 0보다 작거나 같은 경우
		if (mediumBoss.Hp <= 0) {
			try {
				System.out.println("");
				System.out.println("오우거가 죽었습니다.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
				System.out.println("몬스터골드" + mediumBoss.Gold + "를 획득하셨습니다.");
				thief.Gold += mediumBoss.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			k_Attack.Stop();
			break;
		}
		motion.Ogre_Attack();
		tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/오우거2.wav");
		try {
			System.out.println("");
			System.out.println("오우거의 공격입니다.");
			thief.Attacked(mediumBoss.Attack());
			System.out.println(creature.Name + " 체력 : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();

		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "가 죽었습니다.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
	}
	else if(Battle_Ogre == 2)
	{
		System.out.println("");
		thief.thief();
		System.out.println("");
	}
	else if(Battle_Ogre == 3)
	{
		System.out.println("");
		mediumBoss.Ogre();
		System.out.println("");
	}
	else {
		System.out.println("잘못누르셨습니다.");
	}
}
tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/게임승리.wav");
try {
	System.out.println(">>대단해요 !! 중간보스를 쓰러트리셨어요!!");
	System.out.println(">>중간보스를 쓰러트려서 스킬을 배우셨습니다.");
	System.out.println("");
	Thread.sleep(3000);
	tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스킬효과음.wav");
	System.out.println("1차스킬 표창 날리기를 배웠다!!");
	System.out.println("");
	thief.Skill = "표창날리기";
	System.out.println(">>마을로 돌아갑니다.");
	Thread.sleep(5000);
} catch (Exception e) {
	// TODO: handle exception
}
tower1.Stop();
tower1.Stop();
thief.Hp = 100;
thief.Fatigue += 40;
Top2.Stop();
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

Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
while (true) {
	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	int Floor3 = 0;
	try {
		Floor3 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Floor3 == 1) // 스탯창
	{	
		Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스탯창2.wav");
		System.out.println("");

		thief.thief();
		System.out.println("1. 뒤로가기");
		int Num7 = 0;
		try {
			Num7 = scan.nextInt();
		} catch (Exception e) {
			
			scan = new Scanner(System.in);
			
			System.out.println("");
		}
		if (Num7 == 1) {
			System.out.println("");
		}
		else {
			System.out.println("잘못누르셨습니다.");
		}
	} else if (Floor3 == 2) // 상점
	{
		Town1.Stop();
		Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/상점3.wav");
		Store store = new Store();
		store.Thi_sto(thief);
		Town.Stop();
		Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");

	} else if (Floor3 == 3) // 여관
	{
		Town1.Stop();
		Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/여관2.wav");
		Inn Inn = new Inn();
		Inn.Thi_in(thief);
		Town.Stop();
		Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
	} else if (Floor3 == 4) // 시험의 탑
	{
		System.out.println("시험의 탑 다음층으로 갑니다.");
		System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
		System.out.println("1. 예 / 2. 아니오");
		System.out.println("");
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
		System.out.println("현재 피로도 : "+thief.Fatigue);
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓 ");
		
		
		int Floor3_1 = 0;
		try {
			Floor3_1 = scan.nextInt();
		} catch (Exception e) {
			
			scan = new Scanner(System.in);
			
			System.out.println("");
		}
		if (Floor3_1 == 1) {
			System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
			break;
		}

		else if (Floor3_1 == 2) {
			System.out.println("마을로 돌아갑니다. 정비해주세요");
			System.out.println("");
		}

	}

	else {
		System.out.println("잘못누르셨습니다.");
	}

}
Town1.Stop();
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
Media Top3 = new Media(); //마을 bgm
Top3.setDaemon(true);

Top3.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Dungeon-01.wav");

System.out.println("");
System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
System.out.println("");
System.out.println("시험의 탑 3층");
System.out.println("");
System.out.println(">>스킬을 배우셨으니 스킬과 일반공격을 적절히 사용해서 적을 해치우세요");

NormalMonster2 normalMonster2 = new NormalMonster2(); // 3층 몬스터 불러오기

System.out.println("");
motion.Chipmunk();
System.out.println("다람쥐 등장!!");
System.out.println("");
normalMonster2.Chipmunk();
System.out.println("");
System.out.println("######################");

while (true) { // 전투 반복
	System.out.println("1. 공격하기 / 2. 스킬사용 / 3. 소환수 스탯창 / 4. 몬스터 스탯창 / 5. 자동 전투");
	int Num3_1 = 0;
	try {
		Num3_1 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Num3_1 == 1) {
		motion.T_Attack();
		k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/나이프소리2.wav");
		try {
			System.out.println("");
			System.out.println(creature.Name + "의 공격입니다.");
			normalMonster2.Attacked_Chipmunk(thief.Attack());
			if(normalMonster2.Hp_Chipmunk > 0)
			{
				System.out.println("다람쥐 체력 : " + normalMonster2.Hp_Chipmunk);
			}
			if(normalMonster2.Hp_Chipmunk <= 0)
			{
				normalMonster2.Hp_Chipmunk = 0;
				System.out.println("다람쥐 체력 : " + normalMonster2.Hp_Chipmunk);
			}
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();

		// 몬스터의 체력이 0보다 작거나 같은 경우
		if (normalMonster2.Hp_Chipmunk <= 0) {
			
			try {
				System.out.println("");
				System.out.println("다람쥐가 죽었습니다.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
				System.out.println("몬스터골드" + normalMonster2.Gold + "를 획득하셨습니다.");
				thief.Gold += normalMonster2.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			k_Attack.Stop();
			break;
		}
		motion.Chipmunk_Attack();
		tower1.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/다람쥐.wav", +6.0f);
		
		try {
			System.out.println("");
			System.out.println("다람쥐의 공격입니다.");
			thief.Attacked(normalMonster2.Attack());
			System.out.println(creature.Name + " 체력 : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "가 죽었습니다.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
	} else if (Num3_1 == 2 && thief.Mp >= 30 ) {
		motion.T_Attack_Skill1();
		k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/슬래시.wav");
		
		try {
			System.out.println("");
			System.out.println(creature.Name + "의 공격입니다.");
			normalMonster2.Attacked_Chipmunk(thief.Skill());
			if(normalMonster2.Hp_Chipmunk > 0)
			{
				System.out.println("다람쥐 체력 : " + normalMonster2.Hp_Chipmunk);
			}
			if(normalMonster2.Hp_Chipmunk <= 0)
			{
				normalMonster2.Hp_Chipmunk = 0;
				System.out.println("다람쥐 체력 : " + normalMonster2.Hp_Chipmunk);
			}
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();

		// 몬스터의 체력이 0보다 작거나 같은 경우
		if (normalMonster2.Hp_Chipmunk <= 0) {
			try {
				System.out.println("");
				System.out.println("다람쥐가 죽었습니다.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
				System.out.println("몬스터골드" + normalMonster2.Gold + "를 획득하셨습니다.");
				thief.Gold += normalMonster2.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			k_Attack.Stop();
			break;
		}
		motion.Chipmunk_Attack();
		tower1.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/다람쥐.wav", +6.0f);
		
		try {
			System.out.println("");
			System.out.println("다람쥐의 공격입니다.");
			thief.Attacked(normalMonster2.Attack());
			System.out.println(creature.Name + " 체력 : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "가 죽었습니다.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
	}
	
	else if (Num3_1 == 2 && thief.Mp < 30)
	{
		System.out.println("마나가 부족합니다.");
		System.out.println("");
	}
	else if(Num3_1 == 3)
	{
		System.out.println("");
		thief.thief();
		System.out.println("");
	}
	else if(Num3_1 == 4)
	{
		System.out.println("");
		normalMonster2.Chipmunk();
		System.out.println("");
	}
	else if(Num3_1 == 5)
	{
		while(true)
		{
			try {
				System.out.println("");
				System.out.println("--------------------------");
				System.out.println("");
				System.out.println(creature.Name + "의 공격입니다.");
				normalMonster2.Attacked_Chipmunk(thief.Attack());
				if(normalMonster2.Hp_Chipmunk > 0)
				{
					System.out.println("다람쥐 체력 : " + normalMonster2.Hp_Chipmunk);
				}
				if(normalMonster2.Hp_Chipmunk <= 0)
				{
					normalMonster2.Hp_Chipmunk = 0;
					System.out.println("다람쥐 체력 : " + normalMonster2.Hp_Chipmunk);
				}

				//몬스터의 체력이 0보다 작거나 같은 경우				
				if(normalMonster2.Hp_Chipmunk<=0)
				{	
					try {
						System.out.println("");
						System.out.println("다람쥐가 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
						thief.Gold+=normalMonster2.Gold;
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
				System.out.println("---------------");
				System.out.println("");
				System.out.println("다람쥐의 공격입니다.");
				thief.Attacked(normalMonster2.Attack());
				System.out.println(creature.Name+" 체력 : "+thief.Hp);
				System.out.println("");
				if(thief.Hp <=0)
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

	else {
		System.out.println("잘못누르셨습니다.");
	}
}
motion.Slime();
System.out.println("");
System.out.println("슬라임 등장!!");
System.out.println("");
normalMonster2.Slime();
System.out.println("");
System.out.println("######################");

while (true) { // 전투 반복
	System.out.println("1. 공격하기 / 2. 스킬사용 / 3. 소환수 스탯창 / 4. 몬스터 스탯창 / 5. 자동 전투");
	int Num3_2 = 0;
	try {
		Num3_2 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Num3_2 == 1) {
		
		motion.T_Attack();
		k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/나이프소리2.wav");
		
		try {
			System.out.println("");
			System.out.println(creature.Name + "의 공격입니다.");
			normalMonster2.Attacked_Slime(thief.Attack());
			if(normalMonster2.Hp_Slime > 0)
			{
				System.out.println("슬라임 체력 : " + normalMonster2.Hp_Slime);
			}
			if(normalMonster2.Hp_Slime <= 0)
			{
				normalMonster2.Hp_Slime = 0;
				System.out.println("슬라임 체력 : " + normalMonster2.Hp_Slime);
			}
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();

		// 몬스터의 체력이 0보다 작거나 같은 경우
		if (normalMonster2.Hp_Slime <= 0) {
			
			try {
				System.out.println("");
				System.out.println("슬라임이 죽었습니다.");
				System.out.println("몬스터골드" + normalMonster2.Gold + "를 획득하셨습니다.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
				thief.Gold += normalMonster2.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			k_Attack.Stop();
			break;
		}
		motion.Slime_Attack();
		tower1.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/슬라임.wav", +6.0f);
		
		try {
			System.out.println("");
			System.out.println("슬라임의 공격입니다.");
			thief.Attacked(normalMonster.Attack());
			System.out.println(creature.Name + " 체력 : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "가 죽었습니다.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
	} else if (Num3_2 == 2 && thief.Mp >= 30) {
		
		motion.T_Attack_Skill1();
		k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/슬래시.wav");
		
		try {
			System.out.println("");
			System.out.println(creature.Name + "의 공격입니다.");
			normalMonster2.Attacked_Slime(thief.Skill());
			if(normalMonster2.Hp_Slime > 0)
			{
				System.out.println("슬라임 체력 : " + normalMonster2.Hp_Slime);
			}
			if(normalMonster2.Hp_Slime <= 0)
			{
				normalMonster2.Hp_Slime = 0;
				System.out.println("슬라임 체력 : " + normalMonster2.Hp_Slime);
			}
			
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		

		// 몬스터의 체력이 0보다 작거나 같은 경우
		if (normalMonster2.Hp_Slime <= 0) {
			try {
				System.out.println("");
				System.out.println("슬라임이 죽었습니다.");
				System.out.println("몬스터골드" + normalMonster2.Gold + "를 획득하셨습니다.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
				thief.Gold += normalMonster2.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			k_Attack.Stop();
			break;
		}
		motion.Slime_Attack();
		tower1.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/슬라임.wav", +6.0f);
		
		try {
			System.out.println("");
			System.out.println("슬라임의 공격입니다.");
			thief.Attacked(normalMonster.Attack());
			System.out.println(creature.Name + " 체력 : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "가 죽었습니다.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
	}
	else if (Num3_2 == 2 && thief.Mp < 30)
	{
		System.out.println("마나가 부족합니다.");
		System.out.println("");
	}
	else if(Num3_2 == 3)
	{
		System.out.println("");
		thief.thief();
		System.out.println("");
	}
	else if(Num3_2 == 4)
	{
		System.out.println("");
		normalMonster2.Slime();
		System.out.println("");
	}
	else if(Num3_2 == 5)
	{
		while(true)
		{
			try {
				System.out.println("");
				System.out.println("--------------------------");
				System.out.println("");
				System.out.println(creature.Name + "의 공격입니다.");
				normalMonster2.Attacked_Slime(thief.Attack());
				if(normalMonster2.Hp_Slime > 0)
				{
					System.out.println("슬라임 체력 : " + normalMonster2.Hp_Slime);
				}
				if(normalMonster2.Hp_Slime <= 0)
				{
					normalMonster2.Hp_Slime = 0;
					System.out.println("슬라임 체력 : " + normalMonster2.Hp_Slime);
				}

				//몬스터의 체력이 0보다 작거나 같은 경우				
				if(normalMonster2.Hp_Slime<=0)
				{	
					try {
						System.out.println("");
						System.out.println("슬라임이 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
						thief.Gold+=normalMonster2.Gold;
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
				System.out.println("---------------");
				System.out.println("");
				System.out.println("슬라임의 공격입니다.");
				thief.Attacked(normalMonster.Attack());
				System.out.println(creature.Name+" 체력 : "+thief.Hp);
				System.out.println("");
				if(thief.Hp <=0)
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
	else {
		System.out.println("잘못누르셨습니다.");
	}
}

System.out.println("");
motion.Skeleton();
System.out.println("스켈레톤 등장!!");
System.out.println("");
normalMonster2.Skeleton();
System.out.println("");
System.out.println("######################");

while (true) { // 전투 반복
	System.out.println("1. 공격하기 / 2. 스킬사용 / 3. 소환수 스탯창 / 4. 몬스터 스탯창 / 5.자동 전투");
	int Num3_2 = 0;
	try {
		Num3_2 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Num3_2 == 1) {
		
		motion.T_Attack();
		k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/나이프소리2.wav");
		try {
			System.out.println("");
			System.out.println(creature.Name + "의 공격입니다.");
			normalMonster2.Attacked_Skeleton(thief.Attack());
			if(normalMonster2.Hp_Skeleton > 0)
			{
				System.out.println("스켈레톤 체력 : " + normalMonster2.Hp_Skeleton);
			}
			if(normalMonster2.Hp_Skeleton <= 0)
			{
				normalMonster2.Hp_Skeleton = 0;
				System.out.println("스켈레톤 체력 : " + normalMonster2.Hp_Skeleton);
			}
			
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}k_Attack.Stop();
		

		// 몬스터의 체력이 0보다 작거나 같은 경우
		if (normalMonster2.Hp_Skeleton <= 0) {
			
			try {
				System.out.println("");
				System.out.println("스켈레톤이 죽었습니다.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
				System.out.println("몬스터골드" + normalMonster2.Gold + "를 획득하셨습니다.");
				thief.Gold += normalMonster2.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			break;
		}
		motion.Skeleton_Attack();
		tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스켈레톤.wav");
		
		try {
			System.out.println("");
			System.out.println("스켈레톤의 공격입니다.");
			System.out.println("");
			thief.Attacked(normalMonster.Attack());
			System.out.println(creature.Name + " 체력 : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "가 죽었습니다.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
	} else if (Num3_2 == 2 && thief.Mp >= 30) {
		
		motion.T_Attack_Skill1();
		k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/슬래시.wav");
		
		try {
			System.out.println("");
			System.out.println(creature.Name + "의 공격입니다.");
			normalMonster2.Attacked_Skeleton(thief.Skill());
			if(normalMonster2.Hp_Skeleton > 0)
			{
				System.out.println("스켈레톤 체력 : " + normalMonster2.Hp_Skeleton);
			}
			if(normalMonster2.Hp_Skeleton <= 0)
			{
				normalMonster2.Hp_Skeleton = 0;
				System.out.println("스켈레톤 체력 : " + normalMonster2.Hp_Skeleton);
			}
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		

		// 몬스터의 체력이 0보다 작거나 같은 경우
		if (normalMonster2.Hp_Skeleton <= 0) {
			try {
				System.out.println("");
				System.out.println("스켈레톤이 죽었습니다.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
				System.out.println("몬스터골드" + normalMonster2.Gold + "를 획득하셨습니다.");
				thief.Gold += normalMonster2.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			k_Attack.Stop();
			break;
		}
		motion.Skeleton_Attack();
		tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스켈레톤.wav");
		
		try {
			System.out.println("");
			System.out.println("스켈레톤의 공격입니다.");
			System.out.println("");
			thief.Attacked(normalMonster.Attack());
			System.out.println(creature.Name + " 체력 : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "가 죽었습니다.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
	}
	else if (Num3_2 == 2 && thief.Mp < 30)
	{
		System.out.println("마나가 부족합니다.");
		System.out.println("");
	}
	else if(Num3_2 == 3)
	{
		System.out.println("");
		thief.thief();
		System.out.println("");
	}
	else if(Num3_2 == 4)
	{
		System.out.println("");
		normalMonster2.Skeleton();
		System.out.println("");
	}
	else if(Num3_2 == 5)
	{
		
		while(true)
		{
			try {
				System.out.println("");
				System.out.println("--------------------------");
				System.out.println("");
				System.out.println(creature.Name + "의 공격입니다.");
				normalMonster2.Attacked_Skeleton(thief.Attack());
				if(normalMonster2.Hp_Skeleton > 0)
				{
					System.out.println("스켈레톤 체력 : " + normalMonster2.Hp_Skeleton);
				}
				if(normalMonster2.Hp_Skeleton <= 0)
				{
					normalMonster2.Hp_Skeleton = 0;
					System.out.println("스켈레톤 체력 : " + normalMonster2.Hp_Skeleton);
				}

				//몬스터의 체력이 0보다 작거나 같은 경우				
				if(normalMonster2.Hp_Skeleton<=0)
				{	
					try {
						System.out.println("");
						System.out.println("스켈레톤이 죽었습니다.");
						System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
						thief.Gold+=normalMonster2.Gold;
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
				System.out.println("---------------");
				System.out.println("");
				System.out.println("스켈레톤의 공격입니다.");
				thief.Attacked(normalMonster.Attack());
				System.out.println(creature.Name+" 체력 : "+thief.Hp);
				if(thief.Hp <=0)
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

	else {
		System.out.println("잘못누르셨습니다.");
	}
}
tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/게임승리.wav");
System.out.println(">>시험의 탑 3층을 클리어하셨습니다!!!!");
System.out.println(">>마을로 갑니다.");
System.out.println("");
try {
	Thread.sleep(3000);
} catch (Exception e) {
	// TODO: handle exception
}
tower1.Stop();
thief.Hp = 100;
thief.Fatigue += 40;
thief.Mp = 100;

if(thief.Fatigue > 100)
{
	System.out.println("앗..!!");
	System.out.println("소환수를 너무 혹사시켰네요 ..");
	System.out.println("소환수의 피로가 쌓여 죽었습니다.");
	System.out.println("");
	System.out.println("Game Over");
	return;
}

System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
Top3.Stop();
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
Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");

while (true) {
	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	int Floor3 = 0;
	try {
		Floor3 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Floor3 == 1) // 스탯창
	{
		Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스탯창2.wav");
		System.out.println("");

		thief.thief();
		System.out.println("1. 뒤로가기");
		int Num7 = 0;
		try {
			Num7 = scan.nextInt();
		} catch (Exception e) {
			
			scan = new Scanner(System.in);
			
			System.out.println("");
		}
		if (Num7 == 1) {
			System.out.println("");
		}
		else {
			System.out.println("잘못누르셨습니다.");
		}
	} else if (Floor3 == 2) // 상점
	{
		Town1.Stop();
		Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/상점3.wav");
		Store store = new Store();
		store.Thi_sto(thief);
		Town.Stop();
		Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
	}

	else if (Floor3 == 3) // 여관
	{
		Town1.Stop();
		Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/여관2.wav");
		Inn Inn = new Inn();
		Inn.Thi_in(thief);
		Town.Stop();
		Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
	} else if (Floor3 == 4) // 시험의 탑
	{
		System.out.println("시험의 탑 다음층으로 갑니다.");
		System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
		System.out.println("1. 예 / 2. 아니오");
		System.out.println("");
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
		System.out.println("현재 피로도 : "+thief.Fatigue);
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓 ");
		
		
		int Floor3_1 = 0;
		try {
			Floor3_1 = scan.nextInt();
		} catch (Exception e) {
			
			scan = new Scanner(System.in);
			
			System.out.println("");
		}
		if (Floor3_1 == 1) {
			System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
			break;
		}

		else if (Floor3_1 == 2) {
			System.out.println("마을로 돌아갑니다. 정비해주세요");
			System.out.println("");
		}

	}

	else {
		System.out.println("잘못누르셨습니다.");
	}
}

Town1.Stop();

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
Top2.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Dungeon-03.wav");

System.out.println("");
System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
System.out.println("");
System.out.println("시험의 탑 4층");
System.out.println("");
System.out.println(">>중간보스입니다.");
System.out.println(">>중간보스를 해치우면 2차스킬을 배울수있습니다.");
System.out.println("");
System.out.println("");
MediumBoss2 mediumBoss2 = new MediumBoss2();// 중간보스 클래스 불러오기

motion.Envoy();
System.out.println("");
System.out.println("마녀 등장!!");
System.out.println("");
mediumBoss2.Envoy();
System.out.println("");
System.out.println("######################");

while (true) { // 전투 반복
	System.out.println("1. 공격하기 / 2. 스킬사용 / 3. 소환수 스탯창 / 4. 몬스터 스탯창");
	int Battle_Envoy = 0;
	try {
		Battle_Envoy = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Battle_Envoy == 1) {
		motion.T_Attack();
		k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/나이프소리2.wav");
		
		try {
			System.out.println("");
			System.out.println(creature.Name + "의 공격입니다.");
			mediumBoss2.Attacked_Envoy(thief.Attack());
			if(mediumBoss2.Hp > 0)
			{
				System.out.println("마녀 체력 : " + mediumBoss2.Hp);
			}
			if(mediumBoss2.Hp <= 0)
			{
				mediumBoss2.Hp = 0;
				System.out.println("마녀 체력 : " + mediumBoss2.Hp);
			}
			
			Thread.sleep(1500);						
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		
		// 몬스터의 체력이 0보다 작거나 같은 경우
		if (mediumBoss2.Hp <= 0) {
			
			try {
				System.out.println("");
				System.out.println("마녀가 죽었습니다.");
				System.out.println("몬스터골드" + mediumBoss2.Gold + "를 획득하셨습니다.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
				thief.Gold += mediumBoss2.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			k_Attack.Stop();
			break;
		}
		motion.Envoy_Attack();
		tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/마녀.wav");
		
		try {
			System.out.println("");
			System.out.println("마녀의 공격입니다.");
			thief.Attacked(mediumBoss2.Attack());
			System.out.println(creature.Name + " 체력 : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "가 죽었습니다.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
	} else if (Battle_Envoy == 2 && thief.Mp >= 30)

	{
		motion.T_Attack_Skill1();
		k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/슬래시.wav");
		
		try {
			System.out.println("");
			System.out.println(creature.Name + "의 공격입니다.");
			mediumBoss2.Attacked_Envoy(thief.Skill());
			if(mediumBoss2.Hp > 0)
			{
				System.out.println("마녀 체력 : " + mediumBoss2.Hp);
			}
			if(mediumBoss2.Hp <= 0)
			{
				mediumBoss2.Hp = 0;
				System.out.println("마녀 체력 : " + mediumBoss2.Hp);
			}
			
			
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();

		// 몬스터의 체력이 0보다 작거나 같은 경우
		if (mediumBoss2.Hp <= 0) {
			try {
				System.out.println("");
				System.out.println("마녀가 죽었습니다.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
				System.out.println("몬스터골드" + mediumBoss2.Gold + "를 획득하셨습니다.");
				thief.Gold += mediumBoss2.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			k_Attack.Stop();
			
			
			break;
		}
		motion.Envoy_Attack();
		tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/마녀.wav");
		try {
			System.out.println("");
			System.out.println("마녀의 공격입니다.");
			thief.Attacked(mediumBoss2.Attack());
			System.out.println(creature.Name + " 체력 : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "가 죽었습니다.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
		
	}
	else if (Battle_Envoy == 2 && thief.Mp < 30)
	{
		System.out.println("마나가 부족합니다.");
		System.out.println("");
	}
	else if(Battle_Envoy == 3)
	{
		System.out.println("");
		thief.thief();
		System.out.println("");
	}
	else if(Battle_Envoy == 4)
	{
		System.out.println("");
		mediumBoss2.Envoy();
		System.out.println("");
	}
	else {
		System.out.println("잘못누르셨습니다.");
	}
}
tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/게임승리.wav");
try {
	System.out.println(">>대단해요 !! 중간보스를 쓰러트리셨어요!!");
	System.out.println(">>중간보스를 쓰러트려서 스킬을 배우셨습니다.");
	System.out.println("");
	Thread.sleep(3000);
	tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스킬효과음.wav");
	System.out.println("2차스킬 절단마술을 배웠다!!");
	System.out.println("");
	thief.Skill2 = "절단마술";
	System.out.println(">>마을로 돌아갑니다.");
	Thread.sleep(5000);
} catch (Exception e) {
	// TODO: handle exception
}
tower1.Stop();
tower1.Stop();
thief.Hp = 100;
thief.Fatigue += 40;
thief.Mp = 100;
if(thief.Fatigue > 100)
{
	System.out.println("앗..!!");
	System.out.println("소환수를 너무 혹사시켰네요 ..");
	System.out.println("소환수의 피로가 쌓여 죽었습니다.");
	System.out.println("");
	System.out.println("Game Over");
	return;
}

Top2.Stop();
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
Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");

while (true) {
	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	int Floor5_1 = 0;
	try {
		Floor5_1 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Floor5_1 == 1) // 스탯창
	{
		Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스탯창2.wav");
		System.out.println("");

		thief.thief();
		System.out.println("1. 뒤로가기");
		int Num7 = 0;
		try {
			Num7 = scan.nextInt();
		} catch (Exception e) {
			
			scan = new Scanner(System.in);
			
			System.out.println("");
		}
		if (Num7 == 1) {
			System.out.println("");
		}
		else
		{
			System.out.println("잘못누르셨습니다.");
		}
		
	} else if (Floor5_1 == 2) // 상점
	{
		Town1.Stop();
		Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/상점3.wav");
		Store store = new Store();
		store.Thi_sto(thief);
		Town.Stop();
		Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
		
	} else if (Floor5_1 == 3) // 여관
	{
		Town1.Stop();
		Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/여관2.wav");
		Inn Inn = new Inn();
		Inn.Thi_in(thief);
		Town.Stop();
		Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
	} else if (Floor5_1 == 4) // 시험의 탑
	{
		System.out.println("시험의 탑 다음층으로 갑니다.");
		System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
		System.out.println("1. 예 / 2. 아니오");
		System.out.println("");
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
		System.out.println("현재 피로도 : "+thief.Fatigue);
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓 ");
		
		
		int Floor5_2 = 0;
		try {
			Floor5_2 = scan.nextInt();
		} catch (Exception e) {
			
			scan = new Scanner(System.in);
			
			System.out.println("");
		}
		if (Floor5_2 == 1) {
			System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
			break;
		}

		else if (Floor5_2 == 2) {
			System.out.println("마을로 돌아갑니다. 정비해주세요");
			System.out.println("");
		}

	}

	else {
		System.out.println("잘못누르셨습니다.");
	}

}

Town1.Stop();
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
Media Top5 = new Media(); //음악쓰레드 객체생 test.setDaemon(true);
Top5.setDaemon(true);

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
	System.out.println("1. 공격하기 / 2. 1차스킬사용 / 3. 2차스킬사용 / 4. 소환수 스탯창 / 5. 몬스터 스탯창");
	int Battle_Devil = 0;
	try {
		Battle_Devil = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Battle_Devil == 1) {
		motion.T_Attack();
		k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/나이프소리2.wav");
		
		try {
			System.out.println("");
			System.out.println(creature.Name + "의 공격입니다.");
			finalBoss.Attacked_Devil(thief.Attack());
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
				thief.Gold += finalBoss.Gold;
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
			thief.Attacked(finalBoss.Attack());
			System.out.println(creature.Name + " 체력 : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "가 죽었습니다.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
	} else if (Battle_Devil == 2 && thief.Mp >= 30)

	{
		motion.T_Attack_Skill1();
		k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/슬래시.wav");
		
		try {
			System.out.println("");
			System.out.println(creature.Name + "의 공격입니다.");
			finalBoss.Attacked_Devil(thief.Skill());
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
				thief.Gold += finalBoss.Gold;
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
			thief.Attacked(finalBoss.Attack());
			System.out.println(creature.Name + " 체력 : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "가 죽었습니다.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
		

	} else if (Battle_Devil == 3 && thief.Mp >= 50)

	{	
		
		motion.T_Attack_Skill2();
		k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/일검.wav");
		
		try {
			System.out.println("");
			System.out.println(creature.Name + "의 공격입니다.");
			finalBoss.Attacked_Devil(thief.Skill2());
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
				thief.Gold += finalBoss.Gold;
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
			thief.Attacked(finalBoss.Attack());
			System.out.println(creature.Name + " 체력 : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "가 죽었습니다.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
	}
	else if (Battle_Devil == 2 && thief.Mp < 30)
	{
		System.out.println("마나가 부족합니다.");
		System.out.println("");
	}
	else if (Battle_Devil == 3 && thief.Mp < 50)
	{
		System.out.println("마나가 부족합니다.");
		System.out.println("");
	}
	else if(Battle_Devil == 4)
	{
		System.out.println("");
		thief.thief();
		System.out.println("");
	}
	else if(Battle_Devil == 5)
	{
		System.out.println("");
		finalBoss.Devil();
		System.out.println("");
	}
	else {
		System.out.println("잘못"
				+ "누르셨습니다.");
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
	

		else if (Num2 == 3) 
		{
			System.out.println("");		
			System.out.println("");
			System.out.print("궁수");

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
Archer archer = new Archer(); // 궁수 클래스 인스턴스 생성
NormalMonster normalMonster = new NormalMonster();//노말몬스터 클래스 불러오기
System.out.println("");
motion.Bat();
archer.Power+=10; // 불속성 공격력 증가
System.out.println("박쥐등장!!");
System.out.println("");
normalMonster.Bat();
System.out.println("");
System.out.println("######################");

Media k_Attack = new Media(); //음악쓰레드 객체생 test.setDaemon(true);
Media tower1 = new Media(); //음악쓰레드 객체생 test.setDaemon(true);
while(true) { //전투 반복
System.out.println("1. 공격하기 / 2. 소환수 스탯창 / 3. 몬스터 스탯창 / 4. 자동 전투");
int Battle_Bat = 0;
try {
	Battle_Bat = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}

if(Battle_Bat == 1)
	
{	motion.A_Attack();


k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/화살2.wav");

	try {
		System.out.println("");
		System.out.println(creature.Name+"의 공격입니다.");
		normalMonster.Attacked_Bat(archer.Attack());
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
		archer.Gold+=normalMonster.Gold;
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
		archer.Attacked(normalMonster.Attack());
		System.out.println(creature.Name+" 체력 : "+archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if(archer.Hp <=0)
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

	archer.archer();
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
			normalMonster.Attacked_Bat(archer.Attack());
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
					archer.Gold+=normalMonster.Gold;
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
			archer.Attacked(normalMonster.Attack());
			System.out.println(creature.Name+" 체력 : "+archer.Hp);
			System.out.println("");
			if(archer.Hp <=0)
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
System.out.println("1. 공격하기 / 2. 소환수 스탯창 / 3. 몬스터 스탯창 / 4. 자동 전투");
int Battle_Snail = 0;
try {
	Battle_Snail = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if(Battle_Snail == 1)
	
{	motion.A_Attack();
k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/화살2.wav");
try {
	System.out.println("");
	System.out.println(creature.Name+"의 공격입니다.");
	normalMonster.Attacked_Snail(archer.Attack());
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
			archer.Gold+=normalMonster.Gold;
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
		archer.Attacked(normalMonster.Attack());
		System.out.println(creature.Name+" 체력 : "+archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if(archer.Hp <=0)
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
	archer.archer();
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
	while(true)
	{
		try {
			System.out.println("");
			System.out.println("--------------------------");
			System.out.println("");
			System.out.println(creature.Name+"의 공격입니다.");
			normalMonster.Attacked_Snail(archer.Attack());
			if(normalMonster.Hp_Snail > 0)
			{
				System.out.println("달팽이 체력 : "+normalMonster.Hp_Snail);
			}
			if(normalMonster.Hp_Snail <= 0)
			{
				normalMonster.Hp_Snail = 0;
				System.out.println("달팽이 체력 : "+normalMonster.Hp_Snail);
			}

			//몬스터의 체력이 0보다 작거나 같은 경우				
			if(normalMonster.Hp_Snail<=0)
			{	
				try {
					System.out.println("");
					System.out.println("달팽이가 죽었습니다.");
					System.out.println("몬스터골드"+normalMonster.Gold+"를 획득하셨습니다.");
					archer.Gold+=normalMonster.Gold;
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
			System.out.println("달팽이의 공격입니다.");
			System.out.println("");
			archer.Attacked(normalMonster.Attack());
			System.out.println(creature.Name+" 체력 : "+archer.Hp);
			System.out.println("");
			if(archer.Hp <=0)
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
motion.Rabbit();
System.out.println("토끼 등장!!");
normalMonster.Rabbit();
System.out.println("");
System.out.println("######################");


while(true) {
System.out.println("1. 공격하기 / 2. 소환수 스탯창 / 3. 몬스터 스탯창 / 4. 자동 전투");
int Battle_Rabbit = 0;
try {
	Battle_Rabbit = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if(Battle_Rabbit == 1)
{	
	motion.A_Attack();
	k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/화살2.wav");
	try {
		System.out.println("");
		System.out.println(creature.Name+"의 공격입니다.");
		normalMonster.Attacked_Rabbit(archer.Attack());
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
			archer.Gold+=normalMonster.Gold;
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
		archer.Attacked(normalMonster.Attack());
		System.out.println(creature.Name+" 체력 : "+archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if(archer.Hp <=0)
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
	archer.archer();
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
	while(true)
	{
		try {
			System.out.println("");
			System.out.println("--------------------------");
			System.out.println("");
			System.out.println(creature.Name+"의 공격입니다.");
			normalMonster.Attacked_Rabbit(archer.Attack());
			if(normalMonster.Hp_Rabbit > 0)
			{
				System.out.println("토끼 체력 : "+normalMonster.Hp_Rabbit);
			}
			if(normalMonster.Hp_Rabbit <= 0)
			{
				normalMonster.Hp_Rabbit = 0;
				System.out.println("토끼 체력 : "+normalMonster.Hp_Rabbit);
			}

			//몬스터의 체력이 0보다 작거나 같은 경우				
			if(normalMonster.Hp_Rabbit<=0)
			{	
				try {
					System.out.println("");
					System.out.println("토끼가 죽었습니다.");
					System.out.println("몬스터골드"+normalMonster.Gold+"를 획득하셨습니다.");
					archer.Gold+=normalMonster.Gold;
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
			System.out.println("---------------");
			System.out.println("");
			System.out.println("토끼의 공격입니다.");
			archer.Attacked(normalMonster.Attack());
			System.out.println(creature.Name+" 체력 : "+archer.Hp);
			System.out.println("");
			if(archer.Hp <=0)
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
System.out.println("");
archer.Fatigue += 40;
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
archer.Hp = 100;

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
while (true) {
System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
int Floor2 = 0;
try {
	Floor2 = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if (Floor2 == 1) // 스탯창
{
	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스탯창2.wav");
	System.out.println("");

	archer.archer();
	System.out.println("1. 뒤로가기");
	int Num7 = 0;
	try {
		Num7 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	Town.Stop();
	if (Num7 == 1) {
		System.out.println("");
	}
	else {
		System.out.println("잘못누르셨습니다.");
	}
} else if (Floor2 == 2) // 상점
{	Town1.Stop();
	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/상점3.wav");
	Store store = new Store();
	store.Arc_sto(archer);
	Town.Stop();
	Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
}

else if (Floor2 == 3) // 여관
{	Town1.Stop();
	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/여관2.wav");
	Inn Inn = new Inn();
	Inn.Arc_in(archer);
	Town.Stop();
	Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
} else if (Floor2 == 4) // 시험의 탑
{
	System.out.println("시험의 탑 다음층으로 갑니다.");
	System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
	System.out.println("1. 예 / 2. 아니오");
	System.out.println("");
	System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
	System.out.println("현재 피로도 : "+archer.Fatigue);
	System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓 ");
	
	
	int Floor2_1 = 0;
	try {
		Floor2_1 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Floor2_1 == 1) {
		System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
		break;
	}

	else if (Floor2_1 == 2) {
		System.out.println("마을로 돌아갑니다. 정비해주세요");
		System.out.println("");
	}

}

else {
	System.out.println("잘못누르셨습니다.");
}
}

Town1.Stop();
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
Media Top2 = new Media(); //마을 bgm


Top2.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Dungeon-03.wav");

System.out.println("");
System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
System.out.println("");
System.out.println("시험의 탑 2층");
System.out.println("");
System.out.println(">>2층과 4층은 중간보스가 출현합니다.");
System.out.println(">>중간보스를 무찌르면 스킬을 배우실 수 있습니다.");

MediumBoss mediumBoss = new MediumBoss();// 중간보스 클래스 불러오기

System.out.println("");
motion.Ogre();
System.out.println("오우거 등장!!");
System.out.println("");
mediumBoss.Ogre();
System.out.println("");
System.out.println("######################");

while (true) { // 전투 반복
System.out.println("1. 공격하기 / 2. 소환수 스탯창 / 3. 몬스터 스탯창");
int Battle_Ogre = 0;
try {
	Battle_Ogre = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if (Battle_Ogre == 1) {
	
	motion.A_Attack();
	k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/화살2.wav");
	
	try {
		System.out.println("");
		System.out.println(creature.Name + "의 공격입니다.");
		mediumBoss.Attacked_Ogre(archer.Attack());
		if(mediumBoss.Hp > 0)
		{
			System.out.println("오우거 체력 : " + mediumBoss.Hp);
		}
		if(mediumBoss.Hp <= 0)
		{
			mediumBoss.Hp = 0;
			System.out.println("오우거 체력 : " + mediumBoss.Hp);
		}
		
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();

	// 몬스터의 체력이 0보다 작거나 같은 경우
	if (mediumBoss.Hp <= 0) {
		try {
			System.out.println("");
			System.out.println("오우거가 죽었습니다.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
			System.out.println("몬스터골드" + mediumBoss.Gold + "를 획득하셨습니다.");
			archer.Gold += mediumBoss.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		break;
	}
	motion.Ogre_Attack();
	tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/오우거2.wav");
	try {
		System.out.println("");
		System.out.println("오우거의 공격입니다.");
		archer.Attacked(mediumBoss.Attack());
		System.out.println(creature.Name + " 체력 : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();

	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "가 죽었습니다.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
}
else if(Battle_Ogre == 2)
{
	System.out.println("");
	archer.archer();
	System.out.println("");
}
else if(Battle_Ogre == 3)
{
	System.out.println("");
	mediumBoss.Ogre();
	System.out.println("");
}
else {
	System.out.println("잘못누르셨습니다.");
}
}
tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/게임승리.wav");
try {
System.out.println(">>대단해요 !! 중간보스를 쓰러트리셨어요!!");
System.out.println(">>중간보스를 쓰러트려서 스킬을 배우셨습니다.");
System.out.println("");
Thread.sleep(3000);
tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스킬효과음.wav");
System.out.println("1차스킬 더블샷을 배웠다!!");
System.out.println("");
archer.Skill = "더블샷";
System.out.println(">>마을로 돌아갑니다.");
Thread.sleep(5000);
} catch (Exception e) {
// TODO: handle exception
}
tower1.Stop();
tower1.Stop();
archer.Hp = 100;
archer.Fatigue += 40;
Top2.Stop();
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

Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
while (true) {
System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
int Floor3 = 0;
try {
	Floor3 = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if (Floor3 == 1) // 스탯창
{	
	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스탯창2.wav");
	System.out.println("");

	archer.archer();
	System.out.println("1. 뒤로가기");
	int Num7 = 0;
	try {
		Num7 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Num7 == 1) {
		System.out.println("");
	}
	else {
		System.out.println("잘못누르셨습니다.");
	}
} else if (Floor3 == 2) // 상점
{
	Town1.Stop();
	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/상점3.wav");
	Store store = new Store();
	store.Arc_sto(archer);
	Town.Stop();
	Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");

} else if (Floor3 == 3) // 여관
{
	Town1.Stop();
	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/여관2.wav");
	Inn Inn = new Inn();
	Inn.Arc_in(archer);
	Town.Stop();
	Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
} else if (Floor3 == 4) // 시험의 탑
{
	System.out.println("시험의 탑 다음층으로 갑니다.");
	System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
	System.out.println("1. 예 / 2. 아니오");
	System.out.println("");
	System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
	System.out.println("현재 피로도 : "+archer.Fatigue);
	System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓 ");
	
	
	int Floor3_1 = 0;
	try {
		Floor3_1 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Floor3_1 == 1) {
		System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
		break;
	}

	else if (Floor3_1 == 2) {
		System.out.println("마을로 돌아갑니다. 정비해주세요");
		System.out.println("");
	}

}

else {
	System.out.println("잘못누르셨습니다.");
}

}
Town1.Stop();
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
Media Top3 = new Media(); //마을 bgm
Top3.setDaemon(true);

Top3.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Dungeon-01.wav");

System.out.println("");
System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
System.out.println("");
System.out.println("시험의 탑 3층");
System.out.println("");
System.out.println(">>스킬을 배우셨으니 스킬과 일반공격을 적절히 사용해서 적을 해치우세요");

NormalMonster2 normalMonster2 = new NormalMonster2(); // 3층 몬스터 불러오기

System.out.println("");
motion.Chipmunk();
System.out.println("다람쥐 등장!!");
System.out.println("");
normalMonster2.Chipmunk();
System.out.println("");
System.out.println("######################");

while (true) { // 전투 반복
System.out.println("1. 공격하기 / 2. 스킬사용 / 3. 소환수 스탯창 / 4. 몬스터 스탯창 / 5. 자동 전투");
int Num3_1 = 0;
try {
	Num3_1 = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if (Num3_1 == 1) {
	motion.A_Attack();
	k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/화살2.wav");
	try {
		System.out.println("");
		System.out.println(creature.Name + "의 공격입니다.");
		normalMonster2.Attacked_Chipmunk(archer.Attack());
		if(normalMonster2.Hp_Chipmunk > 0)
		{
			System.out.println("다람쥐 체력 : " + normalMonster2.Hp_Chipmunk);
		}
		if(normalMonster2.Hp_Chipmunk <= 0)
		{
			normalMonster2.Hp_Chipmunk = 0;
			System.out.println("다람쥐 체력 : " + normalMonster2.Hp_Chipmunk);
		}
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();

	// 몬스터의 체력이 0보다 작거나 같은 경우
	if (normalMonster2.Hp_Chipmunk <= 0) {
		
		try {
			System.out.println("");
			System.out.println("다람쥐가 죽었습니다.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
			System.out.println("몬스터골드" + normalMonster2.Gold + "를 획득하셨습니다.");
			archer.Gold += normalMonster2.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		break;
	}
	motion.Chipmunk_Attack();
	tower1.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/다람쥐.wav", +6.0f);
	
	try {
		System.out.println("");
		System.out.println("다람쥐의 공격입니다.");
		archer.Attacked(normalMonster2.Attack());
		System.out.println(creature.Name + " 체력 : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "가 죽었습니다.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
} else if (Num3_1 == 2 && archer.Mp >= 30 ) {
	motion.A_Attack_Skill1();
	k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/화살3.wav");
	
	try {
		System.out.println("");
		System.out.println(creature.Name + "의 공격입니다.");
		normalMonster2.Attacked_Chipmunk(archer.Skill());
		if(normalMonster2.Hp_Chipmunk > 0)
		{
			System.out.println("다람쥐 체력 : " + normalMonster2.Hp_Chipmunk);
		}
		if(normalMonster2.Hp_Chipmunk <= 0)
		{
			normalMonster2.Hp_Chipmunk = 0;
			System.out.println("다람쥐 체력 : " + normalMonster2.Hp_Chipmunk);
		}
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();

	// 몬스터의 체력이 0보다 작거나 같은 경우
	if (normalMonster2.Hp_Chipmunk <= 0) {
		try {
			System.out.println("");
			System.out.println("다람쥐가 죽었습니다.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
			System.out.println("몬스터골드" + normalMonster2.Gold + "를 획득하셨습니다.");
			archer.Gold += normalMonster2.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		break;
	}
	motion.Chipmunk_Attack();
	tower1.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/다람쥐.wav", +6.0f);
	
	try {
		System.out.println("");
		System.out.println("다람쥐의 공격입니다.");
		archer.Attacked(normalMonster2.Attack());
		System.out.println(creature.Name + " 체력 : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "가 죽었습니다.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
}

else if (Num3_1 == 2 && archer.Mp < 30)
{
	System.out.println("마나가 부족합니다.");
	System.out.println("");
}
else if(Num3_1 == 3)
{
	System.out.println("");
	archer.archer();
	System.out.println("");
}
else if(Num3_1 == 4)
{
	System.out.println("");
	normalMonster2.Chipmunk();
	System.out.println("");
}
else if(Num3_1 == 5)
{
	while(true)
	{
		try {
			System.out.println("");
			System.out.println("--------------------------");
			System.out.println("");
			System.out.println(creature.Name + "의 공격입니다.");
			normalMonster2.Attacked_Chipmunk(archer.Attack());
			if(normalMonster2.Hp_Chipmunk > 0)
			{
				System.out.println("다람쥐 체력 : " + normalMonster2.Hp_Chipmunk);
			}
			if(normalMonster2.Hp_Chipmunk <= 0)
			{
				normalMonster2.Hp_Chipmunk = 0;
				System.out.println("다람쥐 체력 : " + normalMonster2.Hp_Chipmunk);
			}

			//몬스터의 체력이 0보다 작거나 같은 경우				
			if(normalMonster2.Hp_Chipmunk<=0)
			{	
				try {
					System.out.println("");
					System.out.println("다람쥐가 죽었습니다.");
					System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
					archer.Gold+=normalMonster2.Gold;
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
			System.out.println("---------------");
			System.out.println("");
			System.out.println("다람쥐의 공격입니다.");
			archer.Attacked(normalMonster2.Attack());
			System.out.println(creature.Name+" 체력 : "+archer.Hp);
			System.out.println("");
			if(archer.Hp <=0)
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

else {
	System.out.println("잘못누르셨습니다.");
}
}
motion.Slime();
System.out.println("");
System.out.println("슬라임 등장!!");
System.out.println("");
normalMonster2.Slime();
System.out.println("");
System.out.println("######################");

while (true) { // 전투 반복
System.out.println("1. 공격하기 / 2. 스킬사용 / 3. 소환수 스탯창 / 4. 몬스터 스탯창 / 5. 자동 전투");
int Num3_2 = 0;
try {
	Num3_2 = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if (Num3_2 == 1) {
	
	motion.A_Attack();
	k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/화살2.wav");
	
	try {
		System.out.println("");
		System.out.println(creature.Name + "의 공격입니다.");
		normalMonster2.Attacked_Slime(archer.Attack());
		if(normalMonster2.Hp_Slime > 0)
		{
			System.out.println("슬라임 체력 : " + normalMonster2.Hp_Slime);
		}
		if(normalMonster2.Hp_Slime <= 0)
		{
			normalMonster2.Hp_Slime = 0;
			System.out.println("슬라임 체력 : " + normalMonster2.Hp_Slime);
		}
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();

	// 몬스터의 체력이 0보다 작거나 같은 경우
	if (normalMonster2.Hp_Slime <= 0) {
		
		try {
			System.out.println("");
			System.out.println("슬라임이 죽었습니다.");
			System.out.println("몬스터골드" + normalMonster2.Gold + "를 획득하셨습니다.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
			archer.Gold += normalMonster2.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		break;
	}
	motion.Slime_Attack();
	tower1.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/슬라임.wav", +6.0f);
	
	try {
		System.out.println("");
		System.out.println("슬라임의 공격입니다.");
		archer.Attacked(normalMonster.Attack());
		System.out.println(creature.Name + " 체력 : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "가 죽었습니다.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
} else if (Num3_2 == 2 && archer.Mp >= 30) {
	
	motion.A_Attack_Skill1();
	k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/화살3.wav");
	
	try {
		System.out.println("");
		System.out.println(creature.Name + "의 공격입니다.");
		normalMonster2.Attacked_Slime(archer.Skill());
		if(normalMonster2.Hp_Slime > 0)
		{
			System.out.println("슬라임 체력 : " + normalMonster2.Hp_Slime);
		}
		if(normalMonster2.Hp_Slime <= 0)
		{
			normalMonster2.Hp_Slime = 0;
			System.out.println("슬라임 체력 : " + normalMonster2.Hp_Slime);
		}
		
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();
	

	// 몬스터의 체력이 0보다 작거나 같은 경우
	if (normalMonster2.Hp_Slime <= 0) {
		try {
			System.out.println("");
			System.out.println("슬라임이 죽었습니다.");
			System.out.println("몬스터골드" + normalMonster2.Gold + "를 획득하셨습니다.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
			archer.Gold += normalMonster2.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		break;
	}
	motion.Slime_Attack();
	tower1.Volume("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/슬라임.wav", +6.0f);
	
	try {
		System.out.println("");
		System.out.println("슬라임의 공격입니다.");
		archer.Attacked(normalMonster.Attack());
		System.out.println(creature.Name + " 체력 : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "가 죽었습니다.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
}
else if (Num3_2 == 2 && archer.Mp < 30)
{
	System.out.println("마나가 부족합니다.");
	System.out.println("");
}
else if(Num3_2 == 3)
{
	System.out.println("");
	archer.archer();
	System.out.println("");
}
else if(Num3_2 == 4)
{
	System.out.println("");
	normalMonster2.Slime();
	System.out.println("");
}
else if(Num3_2 == 5)
{
	while(true)
	{
		try {
			System.out.println("");
			System.out.println("--------------------------");
			System.out.println("");
			System.out.println(creature.Name + "의 공격입니다.");
			normalMonster2.Attacked_Slime(archer.Attack());
			if(normalMonster2.Hp_Slime > 0)
			{
				System.out.println("슬라임 체력 : " + normalMonster2.Hp_Slime);
			}
			if(normalMonster2.Hp_Slime <= 0)
			{
				normalMonster2.Hp_Slime = 0;
				System.out.println("슬라임 체력 : " + normalMonster2.Hp_Slime);
			}

			//몬스터의 체력이 0보다 작거나 같은 경우				
			if(normalMonster2.Hp_Slime<=0)
			{	
				try {
					System.out.println("");
					System.out.println("슬라임이 죽었습니다.");
					System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
					archer.Gold+=normalMonster2.Gold;
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
			System.out.println("---------------");
			System.out.println("");
			System.out.println("슬라임의 공격입니다.");
			archer.Attacked(normalMonster.Attack());
			System.out.println(creature.Name+" 체력 : "+archer.Hp);
			System.out.println("");
			if(archer.Hp <=0)
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
else {
	System.out.println("잘못누르셨습니다.");
}
}

System.out.println("");
motion.Skeleton();
System.out.println("스켈레톤 등장!!");
System.out.println("");
normalMonster2.Skeleton();
System.out.println("");
System.out.println("######################");

while (true) { // 전투 반복
System.out.println("1. 공격하기 / 2. 스킬사용 / 3. 소환수 스탯창 / 4. 몬스터 스탯창 / 5.자동 전투");
int Num3_2 = 0;
try {
	Num3_2 = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if (Num3_2 == 1) {
	
	motion.A_Attack();
	k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/화살2.wav");
	try {
		System.out.println("");
		System.out.println(creature.Name + "의 공격입니다.");
		normalMonster2.Attacked_Skeleton(archer.Attack());
		if(normalMonster2.Hp_Skeleton > 0)
		{
			System.out.println("스켈레톤 체력 : " + normalMonster2.Hp_Skeleton);
		}
		if(normalMonster2.Hp_Skeleton <= 0)
		{
			normalMonster2.Hp_Skeleton = 0;
			System.out.println("스켈레톤 체력 : " + normalMonster2.Hp_Skeleton);
		}
		
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}k_Attack.Stop();
	

	// 몬스터의 체력이 0보다 작거나 같은 경우
	if (normalMonster2.Hp_Skeleton <= 0) {
		
		try {
			System.out.println("");
			System.out.println("스켈레톤이 죽었습니다.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
			System.out.println("몬스터골드" + normalMonster2.Gold + "를 획득하셨습니다.");
			archer.Gold += normalMonster2.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		break;
	}
	motion.Skeleton_Attack();
	tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스켈레톤.wav");
	
	try {
		System.out.println("");
		System.out.println("스켈레톤의 공격입니다.");
		System.out.println("");
		archer.Attacked(normalMonster.Attack());
		System.out.println(creature.Name + " 체력 : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "가 죽었습니다.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
} else if (Num3_2 == 2 && archer.Mp >= 30) {
	
	motion.A_Attack_Skill1();
	k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/화살3.wav");
	
	try {
		System.out.println("");
		System.out.println(creature.Name + "의 공격입니다.");
		normalMonster2.Attacked_Skeleton(archer.Skill());
		if(normalMonster2.Hp_Skeleton > 0)
		{
			System.out.println("스켈레톤 체력 : " + normalMonster2.Hp_Skeleton);
		}
		if(normalMonster2.Hp_Skeleton <= 0)
		{
			normalMonster2.Hp_Skeleton = 0;
			System.out.println("스켈레톤 체력 : " + normalMonster2.Hp_Skeleton);
		}
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();
	

	// 몬스터의 체력이 0보다 작거나 같은 경우
	if (normalMonster2.Hp_Skeleton <= 0) {
		try {
			System.out.println("");
			System.out.println("스켈레톤이 죽었습니다.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
			System.out.println("몬스터골드" + normalMonster2.Gold + "를 획득하셨습니다.");
			archer.Gold += normalMonster2.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		break;
	}
	motion.Skeleton_Attack();
	tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스켈레톤.wav");
	
	try {
		System.out.println("");
		System.out.println("스켈레톤의 공격입니다.");
		System.out.println("");
		archer.Attacked(normalMonster.Attack());
		System.out.println(creature.Name + " 체력 : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "가 죽었습니다.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
}
else if (Num3_2 == 2 && archer.Mp < 30)
{
	System.out.println("마나가 부족합니다.");
	System.out.println("");
}
else if(Num3_2 == 3)
{
	System.out.println("");
	archer.archer();
	System.out.println("");
}
else if(Num3_2 == 4)
{
	System.out.println("");
	normalMonster2.Skeleton();
	System.out.println("");
}
else if(Num3_2 == 5)
{
	
	while(true)
	{
		try {
			System.out.println("");
			System.out.println("--------------------------");
			System.out.println("");
			System.out.println(creature.Name + "의 공격입니다.");
			normalMonster2.Attacked_Skeleton(archer.Attack());
			if(normalMonster2.Hp_Skeleton > 0)
			{
				System.out.println("스켈레톤 체력 : " + normalMonster2.Hp_Skeleton);
			}
			if(normalMonster2.Hp_Skeleton <= 0)
			{
				normalMonster2.Hp_Skeleton = 0;
				System.out.println("스켈레톤 체력 : " + normalMonster2.Hp_Skeleton);
			}

			//몬스터의 체력이 0보다 작거나 같은 경우				
			if(normalMonster2.Hp_Skeleton<=0)
			{	
				try {
					System.out.println("");
					System.out.println("스켈레톤이 죽었습니다.");
					System.out.println("몬스터골드"+normalMonster2.Gold+"를 획득하셨습니다.");
					archer.Gold+=normalMonster2.Gold;
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
			System.out.println("---------------");
			System.out.println("");
			System.out.println("스켈레톤의 공격입니다.");
			archer.Attacked(normalMonster.Attack());
			System.out.println(creature.Name+" 체력 : "+archer.Hp);
			if(archer.Hp <=0)
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

else {
	System.out.println("잘못누르셨습니다.");
}
}
tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/게임승리.wav");
System.out.println(">>시험의 탑 3층을 클리어하셨습니다!!!!");
System.out.println(">>마을로 갑니다.");
System.out.println("");
try {
Thread.sleep(3000);
} catch (Exception e) {
// TODO: handle exception
}
tower1.Stop();
archer.Hp = 100;
archer.Fatigue += 40;
archer.Mp = 100;

if(archer.Fatigue > 100)
{
System.out.println("앗..!!");
System.out.println("소환수를 너무 혹사시켰네요 ..");
System.out.println("소환수의 피로가 쌓여 죽었습니다.");
System.out.println("");
System.out.println("Game Over");
return;
}

System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
Top3.Stop();
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
Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");

while (true) {
System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
int Floor3 = 0;
try {
	Floor3 = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if (Floor3 == 1) // 스탯창
{
	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스탯창2.wav");
	System.out.println("");

	archer.archer();
	System.out.println("1. 뒤로가기");
	int Num7 = 0;
	try {
		Num7 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Num7 == 1) {
		System.out.println("");
	}
	else {
		System.out.println("잘못누르셨습니다.");
	}
} else if (Floor3 == 2) // 상점
{
	Town1.Stop();
	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/상점3.wav");
	Store store = new Store();
	store.Arc_sto(archer);
	Town.Stop();
	Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
}

else if (Floor3 == 3) // 여관
{
	Town1.Stop();
	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/여관2.wav");
	Inn Inn = new Inn();
	Inn.Arc_in(archer);
	Town.Stop();
	Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
} else if (Floor3 == 4) // 시험의 탑
{
	System.out.println("시험의 탑 다음층으로 갑니다.");
	System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
	System.out.println("1. 예 / 2. 아니오");
	System.out.println("");
	System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
	System.out.println("현재 피로도 : "+archer.Fatigue);
	System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓 ");
	
	
	int Floor3_1 = 0;
	try {
		Floor3_1 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Floor3_1 == 1) {
		System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
		break;
	}

	else if (Floor3_1 == 2) {
		System.out.println("마을로 돌아갑니다. 정비해주세요");
		System.out.println("");
	}

}

else {
	System.out.println("잘못누르셨습니다.");
}
}

Town1.Stop();

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
Top2.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Dungeon-03.wav");

System.out.println("");
System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
System.out.println("");
System.out.println("시험의 탑 4층");
System.out.println("");
System.out.println(">>중간보스입니다.");
System.out.println(">>중간보스를 해치우면 2차스킬을 배울수있습니다.");
System.out.println("");
System.out.println("");
MediumBoss2 mediumBoss2 = new MediumBoss2();// 중간보스 클래스 불러오기

motion.Envoy();
System.out.println("");
System.out.println("마녀 등장!!");
System.out.println("");
mediumBoss2.Envoy();
System.out.println("");
System.out.println("######################");

while (true) { // 전투 반복
System.out.println("1. 공격하기 / 2. 스킬사용 / 3. 소환수 스탯창 / 4. 몬스터 스탯창");
int Battle_Envoy = 0;
try {
	Battle_Envoy = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if (Battle_Envoy == 1) {
	motion.A_Attack();
	k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/화살2.wav");
	
	try {
		System.out.println("");
		System.out.println(creature.Name + "의 공격입니다.");
		mediumBoss2.Attacked_Envoy(archer.Attack());
		if(mediumBoss2.Hp > 0)
		{
			System.out.println("마녀 체력 : " + mediumBoss2.Hp);
		}
		if(mediumBoss2.Hp <= 0)
		{
			mediumBoss2.Hp = 0;
			System.out.println("마녀 체력 : " + mediumBoss2.Hp);
		}
		
		Thread.sleep(1500);						
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();
	
	// 몬스터의 체력이 0보다 작거나 같은 경우
	if (mediumBoss2.Hp <= 0) {
		
		try {
			System.out.println("");
			System.out.println("마녀가 죽었습니다.");
			System.out.println("몬스터골드" + mediumBoss2.Gold + "를 획득하셨습니다.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
			archer.Gold += mediumBoss2.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		break;
	}
	motion.Envoy_Attack();
	tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/마녀.wav");
	
	try {
		System.out.println("");
		System.out.println("마녀의 공격입니다.");
		archer.Attacked(mediumBoss2.Attack());
		System.out.println(creature.Name + " 체력 : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "가 죽었습니다.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
} else if (Battle_Envoy == 2 && archer.Mp >= 30)

{
	motion.A_Attack_Skill1();
	k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/화살3.wav");
	
	try {
		System.out.println("");
		System.out.println(creature.Name + "의 공격입니다.");
		mediumBoss2.Attacked_Envoy(archer.Skill());
		if(mediumBoss2.Hp > 0)
		{
			System.out.println("마녀 체력 : " + mediumBoss2.Hp);
		}
		if(mediumBoss2.Hp <= 0)
		{
			mediumBoss2.Hp = 0;
			System.out.println("마녀 체력 : " + mediumBoss2.Hp);
		}
		
		
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();

	// 몬스터의 체력이 0보다 작거나 같은 경우
	if (mediumBoss2.Hp <= 0) {
		try {
			System.out.println("");
			System.out.println("마녀가 죽었습니다.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/골드드랍.wav");
			System.out.println("몬스터골드" + mediumBoss2.Gold + "를 획득하셨습니다.");
			archer.Gold += mediumBoss2.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		
		
		break;
	}
	motion.Envoy_Attack();
	tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/마녀.wav");
	try {
		System.out.println("");
		System.out.println("마녀의 공격입니다.");
		archer.Attacked(mediumBoss2.Attack());
		System.out.println(creature.Name + " 체력 : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "가 죽었습니다.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
	
}
else if (Battle_Envoy == 2 && archer.Mp < 30)
{
	System.out.println("마나가 부족합니다.");
	System.out.println("");
}
else if(Battle_Envoy == 3)
{
	System.out.println("");
	archer.archer();
	System.out.println("");
}
else if(Battle_Envoy == 4)
{
	System.out.println("");
	mediumBoss2.Envoy();
	System.out.println("");
}
else {
	System.out.println("잘못누르셨습니다.");
}
}
tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/게임승리.wav");
try {
System.out.println(">>대단해요 !! 중간보스를 쓰러트리셨어요!!");
System.out.println(">>중간보스를 쓰러트려서 스킬을 배우셨습니다.");
System.out.println("");
Thread.sleep(3000);
tower1.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스킬효과음.wav");
System.out.println("2차스킬 마법화살을 배웠다!!");
System.out.println("");
archer.Skill2 = "마법화살";
System.out.println(">>마을로 돌아갑니다.");
Thread.sleep(5000);
} catch (Exception e) {
// TODO: handle exception
}
tower1.Stop();
tower1.Stop();
archer.Hp = 100;
archer.Fatigue += 40;
archer.Mp = 100;
if(archer.Fatigue > 100)
{
System.out.println("앗..!!");
System.out.println("소환수를 너무 혹사시켰네요 ..");
System.out.println("소환수의 피로가 쌓여 죽었습니다.");
System.out.println("");
System.out.println("Game Over");
return;
}

Top2.Stop();
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
Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");

while (true) {
System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
System.out.println("1. 스탯창  / 2. 상점  / 3. 여관  / 4. 시험의탑"); // 마을에서 이동요소
System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
int Floor5_1 = 0;
try {
	Floor5_1 = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if (Floor5_1 == 1) // 스탯창
{
	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/스탯창2.wav");
	System.out.println("");

	archer.archer();
	System.out.println("1. 뒤로가기");
	int Num7 = 0;
	try {
		Num7 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Num7 == 1) {
		System.out.println("");
	}
	else
	{
		System.out.println("잘못누르셨습니다.");
	}
	
} else if (Floor5_1 == 2) // 상점
{
	Town1.Stop();
	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/상점3.wav");
	Store store = new Store();
	store.Arc_sto(archer);
	Town.Stop();
	Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
	
} else if (Floor5_1 == 3) // 여관
{
	Town1.Stop();
	Town.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/여관2.wav");
	Inn Inn = new Inn();
	Inn.Arc_in(archer);
	Town.Stop();
	Town1.Music("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/Conversation-Parade.wav");
} else if (Floor5_1 == 4) // 시험의 탑
{
	System.out.println("시험의 탑 다음층으로 갑니다.");
	System.out.println("던전을 가기 전 모든 준비는 마치셨나요?");
	System.out.println("1. 예 / 2. 아니오");
	System.out.println("");
	System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓  ");
	System.out.println("현재 피로도 : "+archer.Fatigue);
	System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓 ");
	
	
	int Floor5_2 = 0;
	try {
		Floor5_2 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Floor5_2 == 1) {
		System.out.println("알겠습니다. 시험의탑으로 이동하겠습니다.");
		break;
	}

	else if (Floor5_2 == 2) {
		System.out.println("마을로 돌아갑니다. 정비해주세요");
		System.out.println("");
	}

}

else {
	System.out.println("잘못누르셨습니다.");
}

}

Town1.Stop();
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
Media Top5 = new Media(); //음악쓰레드 객체생 test.setDaemon(true);
Top5.setDaemon(true);

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
System.out.println("1. 공격하기 / 2. 1차스킬사용 / 3. 2차스킬사용 / 4. 소환수 스탯창 / 5. 몬스터 스탯창");
int Battle_Devil = 0;
try {
	Battle_Devil = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if (Battle_Devil == 1) {
	motion.A_Attack();
	k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/화살2.wav");
	
	try {
		System.out.println("");
		System.out.println(creature.Name + "의 공격입니다.");
		finalBoss.Attacked_Devil(archer.Attack());
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
			archer.Gold += finalBoss.Gold;
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
		archer.Attacked(finalBoss.Attack());
		System.out.println(creature.Name + " 체력 : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "가 죽었습니다.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
} else if (Battle_Devil == 2 && archer.Mp >= 30)

{
	motion.A_Attack_Skill1();
	k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/화살3.wav");
	
	try {
		System.out.println("");
		System.out.println(creature.Name + "의 공격입니다.");
		finalBoss.Attacked_Devil(archer.Skill());
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
			archer.Gold += finalBoss.Gold;
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
		archer.Attacked(finalBoss.Attack());
		System.out.println(creature.Name + " 체력 : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "가 죽었습니다.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
	

} else if (Battle_Devil == 3 && archer.Mp >= 50)

{	
	
	motion.A_Attack_Skill2();
	k_Attack.One("C:/Users/KM-notebook/Desktop/팀노바/5주차 자바 쓰레드/wav/일검.wav");
	
	try {
		System.out.println("");
		System.out.println(creature.Name + "의 공격입니다.");
		finalBoss.Attacked_Devil(archer.Skill2());
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
			archer.Gold += finalBoss.Gold;
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
		archer.Attacked(finalBoss.Attack());
		System.out.println(creature.Name + " 체력 : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "가 죽었습니다.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
}
else if (Battle_Devil == 2 && archer.Mp < 30)
{
	System.out.println("마나가 부족합니다.");
	System.out.println("");
}
else if (Battle_Devil == 3 && archer.Mp < 50)
{
	System.out.println("마나가 부족합니다.");
	System.out.println("");
}
else if(Battle_Devil == 4)
{
	System.out.println("");
	archer.archer();
	
	System.out.println("");
}
else if(Battle_Devil == 5)
{
	System.out.println("");
	finalBoss.Devil();
	System.out.println("");
}
else {
	System.out.println("잘못"
			+ "누르셨습니다.");
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
		else {
				System.out.println("잘못누르셨습니다.");
			 }
		}

	}

	public static void clearScreen() {
		for (int i = 0; i < 80; i++)
			System.out.println("");
	}
}
