package Ŭ����;

import java.util.Scanner;

public class RPG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creature creature = new Creature(); // Creature Ŭ���� �ҷ�����
		Scanner scan = new Scanner(System.in); // ��ĳ�� �Է�
		Media Title = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);

		 /* ���󾲷��� �̿� �� �κ��� ������ ������� �ʴ´�. ����Ʈ: ����==> : ���󾲷���� (���ξ����� �����
		  ���Ӿ������ �۾� �� �������� ���� ������� �Բ� ����ȴ�.)*/
		  
		  Title.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Adventure-Master-Title.wav");

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
			System.out.println("�߸������̽��ϴ�." + e.getMessage());
		}

		clearScreen();
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("����� �̼����� ���ΰ��Դϴ�.");
		System.out.println("������ ž���� ���� 1������ ������������ Ŭ�����ϼ���");
		System.out.println("�� �׷��� �����մϴ�.");
		System.out.println("");
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("Ʃ�丮���� ���ðڽ��ϱ�?");
		System.out.println("1. Ʃ�丮���� ����. / 2. Ʃ�丮���� �Ⱥ���.");

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
				"�ʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢ�", "",
				"\t���ΰ��� ���� ��ȯ���߿� �ϳ��� �����Ͽ� �����ϴ� ���丮 ������ �����Դϴ�.", "", "\t�ѹ� Ŭ���� �� ��(������ž)�� �ٽ� ���� �����ϴ�.", "",
				"\t������ Ŭ���� ������ ������ž�̶�� �������� 1������ 5�� ���������� ����Ʈ���� ������ Ŭ����˴ϴ�.", "",
				"\t������ �й��ҷδ� ������ž ������ ��ȯ�� ��� , �Ƿε� 100�� ������ �й��մϴ�.", "",
				"\t�Ƿε��� ������ Ŭ�����ϸ� ������ġ�� ���̴µ� �̰��� �������� ȸ�� ������ߵ˴ϴ�.", "",
				"\t������ž���� ���͸� ��� ��带 ���� ������ �̿��� ����� ���� �����ϼ���. ", "",
				"\tó������ ��ų�� ������ ������ž 2���� 4���� Ŭ�����ϸ� ��ų�� ȹ���Ҽ��ֽ��ϴ�.", "",
				"\t���濡�� ���ݷ¸�ŭ ���ط��� ǥ�õǸ� , ������ �Դ� ���ط��� ���ݷ� - (����+ü��) ���ط��Դϴ�.", "",
				 "\t��ȯ���� �����Ͽ� ������� Ŭ�����ϼ���!!", "",
				"�ʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢ�", "",

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
				System.out.println("�߸������˽��ϴ�.");
			}

		}

		
		while (true) {
			try {
				r2.join();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println("");
			System.out.println("��� �����Ͻðڽ��ϱ� ?");
			System.out.println("");
			System.out.println("1. �����Ѵ� / 2. �������� �ʴ´�");
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
				System.out.println("�߸������̽��ϴ�.");
				System.out.println("");
			}
		}
		
		while (true) {
			clearScreen();
			System.out.println("����� ��ȯ���� �����ֽ��ϴ�.");
			System.out.println("��ȯ���� �� 3�����Դϴ�.");
			System.out.println("��ȯ���� ���� ������ �����ðڽ��ϱ�?");
			System.out.println("1. ��´� / 2. �ȵ�ڴ�");

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
					System.out.println("1. ��� ���� / 2. ���� ����  / 3. �ü� ���� / 4. �������� �Ѿ��");
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
						System.out.println("�߸������̽��ϴ�.");
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
			System.out.println("�߸������˽��ϴ�.");	
			}
			
			}while(true);
			
			
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");
			System.out.println();
			System.out.println("��ȯ�� 3���� �� 1������ ������.");
			System.out.println("1. ��� / 2. ���� / 3. �ü�");
			
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
				System.out.print("���");
				
				System.out.println(" ��ȯ���� �����ϼ̱���. ");
				System.out.println("");
				System.out.println("��ȯ���� �̸��� �����ּ���. ");

				creature.Name = scan.next();

				System.out.println(creature.Name + " ��ȯ���� �����Ͽ� ������ Ŭ�����ϼ��� !!");
				System.out.println("");
				System.out.println("------------------------------------------");
				System.out.println("------------------------------------------");
				clearScreen();
				String Prolog[] = {
						"���ѷα�",
						"",
						"�ءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءء�",
						"�ءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءء�",
						"",
						"���ΰ� : ...!?",
						"���ΰ� : ���Ⱑ �����..?",
						"���ΰ� : �� �и� ������ ���� �ڰ� �־��µ�..?",
						"���ΰ� : ���� ���ΰ� ?",
						"���ΰ� : (���� �����´�)",
						"���ΰ� : �ƾ�!.. ���� �ƴѵ���",
						"",
						">>�ȳ��ϼ��� ����� �̼����� ���ΰ� �Դϴ�.",
						"",
						"���ΰ� : !? ��� �鸮�°���?",
						"",
						">>������ ž������ �� ���͸� �����߸��� ������������ �������.",
						">>�׷��� ����� ���� ����� ���� ���� �ֽ��ϴ�.",
						"",
						"���ΰ� : ..? ���� ���Ⱑ �̼�����?",
						">> �������� ���� ��� ���� ��ȯ���� �����̴ϴ�. ��ȯ���� �����Ͽ� ���������� �����߸�����!!",
						"(���⼭ �� �� ��ȯ�� ����)",
						"",
						creature.Name + " : ��",
						"���ΰ� : �̰��� ��ȯ���ΰ�..?",
						"���ΰ� : �ϴ� ������ ž�� ������.",
						"",
						"�ءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءء�",
						"�ءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءء�",
						""
				};
				MyThread t3 = new MyThread(Prolog, 1000);
				Thread r3 = new Thread(t3);		
				r3.start();
				
				try {
					r3.join();
					System.out.println("������ ž���� ���ðڽ��ϱ� ?");
					System.out.println("1. ���� / 2. �Ȱ���");
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
					System.out.println("�غ�ǽǶ����� ��ٸ��ڽ��ϴ�.");
					System.out.println("");
					System.out.println("������ ž���� ���ðڽ��ϱ� ?");
					System.out.println("1. ���� / 2. �Ȱ���");
				}
				else
				{
					System.out.println("�߸������̽��ϴ�.");
					System.out.println("");
				}
				}
				Title.Stop();
				System.out.println("");
				System.out.println("����������������������������");
				System.out.println("\t �ε���");
				for(int i = 0 ; i<20; i++)
				{
					
					System.out.print("��");
					
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
				Media Top1 = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);
				
				Top1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Dungeon-01.wav", +6.0f);

				System.out.println("");
				System.out.println("������ ž 1��");
				System.out.println("");
				System.out.println(">>������ ž 1���Դϴ�.");
				System.out.println(">>�ʹݿ� �⺻�������� ���͸� �����ϰ� �߹ݿ� ��ų�� ���� �ֽ��ϴ�.");
				System.out.println(">>���͸� ��� �����ϰ� ������ Ŭ�����ϼ��� !!");
				Knight knight = new Knight();//��� Ŭ���� �ν��Ͻ� ����
				NormalMonster normalMonster = new NormalMonster();//�븻���� Ŭ���� �ҷ�����
				System.out.println("");
				motion.Bat();
				System.out.println("�������!!");
				System.out.println("");
				normalMonster.Bat();
				System.out.println("");
				System.out.println("######################");

				Media k_Attack = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);
				Media tower1 = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);
				while(true) { //���� �ݺ�
					System.out.println("1. �����ϱ� / 2. ��ȯ�� ����â / 3. ���� ����â / 4. �ڵ� ����");
					int Battle_Bat = 0;
					try {
						Battle_Bat = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					
					if(Battle_Bat == 1)
						
					{	motion.K_Attack();
					

					k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�˼Ҹ�2.wav");

						try {
							System.out.println("");
							System.out.println(creature.Name+"�� �����Դϴ�.");
							normalMonster.Attacked_Bat(knight.Attack());
							if(normalMonster.Hp_Bat > 0)
							{
							System.out.println("���� ü�� : "+normalMonster.Hp_Bat);
							}
							if(normalMonster.Hp_Bat <= 0)
							{
								normalMonster.Hp_Bat = 0;
							System.out.println("���� ü�� : "+normalMonster.Hp_Bat);
							}
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
					k_Attack.Stop();

						//������ ü���� 0���� �۰ų� ���� ���				
						if(normalMonster.Hp_Bat<=0)
						{	try {
							System.out.println("");
							System.out.println("���㰡 �׾����ϴ�.");
							k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
							System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
							knight.Gold+=normalMonster.Gold;
							Thread.sleep(2000);
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();	
							break;
						}
						motion.Bat_Attack();


						tower1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����.wav", +6.0f);
						try {
							System.out.println("");
							System.out.println("������ �����Դϴ�.");
							knight.Attacked(normalMonster.Attack());
							System.out.println(creature.Name+" ü�� : "+knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if(knight.Hp <=0)
						{	System.out.println("");
							System.out.println(creature.Name+"�� �׾����ϴ�.");
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
								System.out.println(creature.Name+"�� �����Դϴ�.");
								normalMonster.Attacked_Bat(knight.Attack());
								if(normalMonster.Hp_Bat > 0)
								{
								System.out.println("���� ü�� : "+normalMonster.Hp_Bat);
								}
								if(normalMonster.Hp_Bat <= 0)
								{
									normalMonster.Hp_Bat = 0;
								System.out.println("���� ü�� : "+normalMonster.Hp_Bat);
								}

								//������ ü���� 0���� �۰ų� ���� ���				
								if(normalMonster.Hp_Bat<=0)
								{	
									try {
										System.out.println("");
										System.out.println("���㰡 �׾����ϴ�.");
										System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
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
								System.out.println("������ �����Դϴ�.");
								knight.Attacked(normalMonster.Attack());
								System.out.println(creature.Name+" ü�� : "+knight.Hp);
								System.out.println("");
								if(knight.Hp <=0)
								{	System.out.println("");
									System.out.println(creature.Name+"�� �׾����ϴ�.");
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
						System.out.println("�߸������̽��ϴ�.");
					}
				}
				
				System.out.println("");
				motion.Snail();
				System.out.println("������ ����!!");
				normalMonster.Snail();
				System.out.println("");
				System.out.println("######################");
				
			
				while(true) {
					System.out.println("1. �����ϱ� / 2. ��ȯ�� ����â / 3. ���� ����â / 4. �ڵ� ����");
					int Battle_Snail = 0;
					try {
						Battle_Snail = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if(Battle_Snail == 1)
						
					{	motion.K_Attack();
					k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�˼Ҹ�2.wav");
					try {
						System.out.println("");
						System.out.println(creature.Name+"�� �����Դϴ�.");
						normalMonster.Attacked_Snail(knight.Attack());
						if(normalMonster.Hp_Snail > 0)
						{
							System.out.println("������ ü�� : "+normalMonster.Hp_Snail);
						}
						if(normalMonster.Hp_Snail <= 0)
						{
							normalMonster.Hp_Snail = 0;
							System.out.println("������ ü�� : "+normalMonster.Hp_Snail);
						}
						Thread.sleep(1500);
					} catch (Exception e) {
						// TODO: handle exception
					}
					k_Attack.Stop();	
						//������ ü���� 0���� �۰ų� ���� ���
						
						if(normalMonster.Hp_Snail<=0)
						{	
							try {
								System.out.println("");
								System.out.println("�����̰� �׾����ϴ�.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
								System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
								knight.Gold+=normalMonster.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							break;
						}
						
						motion.Snail_Attack();
						tower1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/������.wav", +6.0f);
						try {
							System.out.println("");
							System.out.println("�������� �����Դϴ�.");
							System.out.println("");
							knight.Attacked(normalMonster.Attack());
							System.out.println(creature.Name+" ü�� : "+knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if(knight.Hp <=0)
						{	System.out.println("");
							System.out.println(creature.Name+"�� �׾����ϴ�.");
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
								System.out.println(creature.Name+"�� �����Դϴ�.");
								normalMonster.Attacked_Snail(knight.Attack());
								if(normalMonster.Hp_Snail > 0)
								{
									System.out.println("������ ü�� : "+normalMonster.Hp_Snail);
								}
								if(normalMonster.Hp_Snail <= 0)
								{
									normalMonster.Hp_Snail = 0;
									System.out.println("������ ü�� : "+normalMonster.Hp_Snail);
								}

								//������ ü���� 0���� �۰ų� ���� ���				
								if(normalMonster.Hp_Snail<=0)
								{	
									try {
										System.out.println("");
										System.out.println("�����̰� �׾����ϴ�.");
										System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
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
								System.out.println("�������� �����Դϴ�.");
								System.out.println("");
								knight.Attacked(normalMonster.Attack());
								System.out.println(creature.Name+" ü�� : "+knight.Hp);
								System.out.println("");
								if(knight.Hp <=0)
								{	System.out.println("");
									System.out.println(creature.Name+"�� �׾����ϴ�.");
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
						System.out.println("�߸������̽��ϴ�.");
					}
				}
				
				System.out.println("");
				motion.Rabbit();
				System.out.println("�䳢 ����!!");
				normalMonster.Rabbit();
				System.out.println("");
				System.out.println("######################");
				
			
				while(true) {
					System.out.println("1. �����ϱ� / 2. ��ȯ�� ����â / 3. ���� ����â / 4. �ڵ� ����");
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
						k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�˼Ҹ�2.wav");
						try {
							System.out.println("");
							System.out.println(creature.Name+"�� �����Դϴ�.");
							normalMonster.Attacked_Rabbit(knight.Attack());
							if(normalMonster.Hp_Rabbit > 0)
							{
								System.out.println("�䳢 ü�� : "+normalMonster.Hp_Rabbit);
							}
							if(normalMonster.Hp_Rabbit <= 0)
							{
								normalMonster.Hp_Rabbit = 0;
								System.out.println("�䳢 ü�� : "+normalMonster.Hp_Rabbit);
							}
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();
						//������ ü���� 0���� �۰ų� ���� ���
						
						if(normalMonster.Hp_Rabbit<=0)
						{	
							try {
								System.out.println("");
								System.out.println("�䳢�� �׾����ϴ�.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
								System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
								knight.Gold+=normalMonster.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							break;
						}
						
						motion.Rabbit_Attack();
						tower1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�䳢.wav", +6.0f);
						try {
							System.out.println("");
							System.out.println("�䳢�� �����Դϴ�.");
							System.out.println("");
							knight.Attacked(normalMonster.Attack());
							System.out.println(creature.Name+" ü�� : "+knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if(knight.Hp <=0)
						{	System.out.println("");
							System.out.println(creature.Name+"�� �׾����ϴ�.");
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
								System.out.println(creature.Name+"�� �����Դϴ�.");
								normalMonster.Attacked_Rabbit(knight.Attack());
								if(normalMonster.Hp_Rabbit > 0)
								{
									System.out.println("�䳢 ü�� : "+normalMonster.Hp_Rabbit);
								}
								if(normalMonster.Hp_Rabbit <= 0)
								{
									normalMonster.Hp_Rabbit = 0;
									System.out.println("�䳢 ü�� : "+normalMonster.Hp_Rabbit);
								}

								//������ ü���� 0���� �۰ų� ���� ���				
								if(normalMonster.Hp_Rabbit<=0)
								{	
									try {
										System.out.println("");
										System.out.println("�䳢�� �׾����ϴ�.");
										System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
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
								System.out.println("�䳢�� �����Դϴ�.");
								knight.Attacked(normalMonster.Attack());
								System.out.println(creature.Name+" ü�� : "+knight.Hp);
								System.out.println("");
								if(knight.Hp <=0)
								{	System.out.println("");
									System.out.println(creature.Name+"�� �׾����ϴ�.");
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
						System.out.println("�߸������̽��ϴ�.");
					}
				}

				System.out.println("");
				System.out.println("");
				knight.Fatigue += 40;
				tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���ӽ¸�.wav");
				System.out.println(">>������ ž 1���� Ŭ�����ϼ̽��ϴ�!!!!");
				System.out.println(">>������ ���ϴ�.");
				System.out.println("");
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				tower1.Stop();
				knight.Hp = 120;
				
				Weapon weapon = new Weapon(); // ���� Ŭ���� ��ü����
				Armor armor = new Armor(); // �Ƹ� Ŭ���� ��ü����
				Top1.Stop();
				System.out.println("");
				System.out.println("����������������������������");
				System.out.println("\t �ε���");
				for(int i = 0 ; i<20; i++)
				{
					
					System.out.print("��");
					
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
				
				Media Town = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);
				Town.setDaemon(true);
				System.out.println("");
				System.out.println("");
				Media Town1 = new Media(); //���� bgm

				Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
				
				System.out.println("������������������������������������������");
				System.out.println("\t\t\t �����򸻣�");
				System.out.println("");
				System.out.println("1. ����â���� ��ȯ���� ���¸� Ȯ���� �� �ֽ��ϴ�.");
				System.out.println("");
				System.out.println("2. ���������� �������� ȹ���� ��带 �̿��Ͽ� ����� ���� �����Ҽ��ֽ��ϴ�.");
				System.out.println("");
				System.out.println("3. ���������� �Ƿε��� ȸ�� �Ҽ��ֽ��ϴ�.");
				System.out.println("      �Ƿε��� 100�� ������� �й��ϰԵǴ� �����ϼ��� !!");
				System.out.println("");
				System.out.println("4. ����غ� �������� ������ž ���������� ���ø� �˴ϴ�.");
				System.out.println("������������������������������������������");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				while (true) {
					System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
					System.out.println("1. ����â  / 2. ����  / 3. ����  / 4. ������ž"); // �������� �̵����
					System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
					int Floor2 = 0;
					try {
						Floor2 = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if (Floor2 == 1) // ����â
					{
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����â2.wav");
						System.out.println("");

						knight.knight();
						System.out.println("1. �ڷΰ���");
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
							System.out.println("�߸������̽��ϴ�.");
						}
					} else if (Floor2 == 2) // ����
					{	Town1.Stop();
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����3.wav");
						Store store = new Store();
						store.store(knight);
						Town.Stop();
						Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
					}

					else if (Floor2 == 3) // ����
					{	Town1.Stop();
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����2.wav");
						Inn Inn = new Inn();
						Inn.inn(knight);
						Town.Stop();
						Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
					} else if (Floor2 == 4) // ������ ž
					{
						System.out.println("������ ž ���������� ���ϴ�.");
						System.out.println("������ ���� �� ��� �غ�� ��ġ�̳���?");
						System.out.println("1. �� / 2. �ƴϿ�");
						System.out.println("");
						System.out.println("�������������������  ");
						System.out.println("���� �Ƿε� : "+knight.Fatigue);
						System.out.println("������������������� ");
						
						
						int Floor2_1 = 0;
						try {
							Floor2_1 = scan.nextInt();
						} catch (Exception e) {
							
							scan = new Scanner(System.in);
							
							System.out.println("");
						}
						if (Floor2_1 == 1) {
							System.out.println("�˰ڽ��ϴ�. ������ž���� �̵��ϰڽ��ϴ�.");
							break;
						}

						else if (Floor2_1 == 2) {
							System.out.println("������ ���ư��ϴ�. �������ּ���");
							System.out.println("");
						}

					}

					else {
						System.out.println("�߸������̽��ϴ�.");
					}
				}

				Town1.Stop();
				System.out.println("");
				System.out.println("����������������������������");
				System.out.println("\t �ε���");
				for(int i = 0 ; i<20; i++)
				{
					
					System.out.print("��");
					
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
				System.out.println("");
				System.out.println("");
				Media Top2 = new Media(); //���� bgm

				
				Top2.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Dungeon-03.wav");
				
				System.out.println("");
				System.out.println("------------------------------------------");
				System.out.println("------------------------------------------");
				System.out.println("");
				System.out.println("������ ž 2��");
				System.out.println("");
				System.out.println(">>2���� 4���� �߰������� �����մϴ�.");
				System.out.println(">>�߰������� ����� ��ų�� ���� �� �ֽ��ϴ�.");

				MediumBoss mediumBoss = new MediumBoss();// �߰����� Ŭ���� �ҷ�����

				System.out.println("");
				motion.Ogre();
				System.out.println("����� ����!!");
				System.out.println("");
				mediumBoss.Ogre();
				System.out.println("");
				System.out.println("######################");
				
				while (true) { // ���� �ݺ�
					System.out.println("1. �����ϱ� / 2. ��ȯ�� ����â / 3. ���� ����â");
					int Battle_Ogre = 0;
					try {
						Battle_Ogre = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if (Battle_Ogre == 1) {
						
						motion.K_Attack();
						k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�˼Ҹ�2.wav");
						
						try {
							System.out.println("");
							System.out.println(creature.Name + "�� �����Դϴ�.");
							mediumBoss.Attacked_Ogre(knight.Attack());
							if(mediumBoss.Hp > 0)
							{
								System.out.println("����� ü�� : " + mediumBoss.Hp);
							}
							if(mediumBoss.Hp <= 0)
							{
								mediumBoss.Hp = 0;
								System.out.println("����� ü�� : " + mediumBoss.Hp);
							}
							
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();

						// ������ ü���� 0���� �۰ų� ���� ���
						if (mediumBoss.Hp <= 0) {
							try {
								System.out.println("");
								System.out.println("����Ű� �׾����ϴ�.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
								System.out.println("���Ͱ��" + mediumBoss.Gold + "�� ȹ���ϼ̽��ϴ�.");
								knight.Gold += mediumBoss.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							break;
						}
						motion.Ogre_Attack();
						tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����2.wav");
						try {
							System.out.println("");
							System.out.println("������� �����Դϴ�.");
							knight.Attacked(mediumBoss.Attack());
							System.out.println(creature.Name + " ü�� : " + knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
			
						if (knight.Hp <= 0) {
							System.out.println("");
							System.out.println(creature.Name + "�� �׾����ϴ�.");
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
						System.out.println("�߸������̽��ϴ�.");
					}
				}
				tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���ӽ¸�.wav");
				try {
					System.out.println(">>����ؿ� !! �߰������� ����Ʈ���̾��!!");
					System.out.println(">>�߰������� ����Ʈ���� ��ų�� ���̽��ϴ�.");
					System.out.println("");
					Thread.sleep(3000);
					tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��ųȿ����.wav");
					System.out.println("1����ų �����ø� �����!!");
					System.out.println("");
					knight.Skill = "������";
					System.out.println(">>������ ���ư��ϴ�.");
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
				System.out.println("����������������������������");
				System.out.println("\t �ε���");
				for(int i = 0 ; i<20; i++)
				{
					
					System.out.print("��");
					
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
				System.out.println("");
				System.out.println("");
				
				Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
				while (true) {
					System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
					System.out.println("1. ����â  / 2. ����  / 3. ����  / 4. ������ž"); // �������� �̵����
					System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
					int Floor3 = 0;
					try {
						Floor3 = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if (Floor3 == 1) // ����â
					{	
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����â2.wav");
						System.out.println("");

						knight.knight();
						System.out.println("1. �ڷΰ���");
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
							System.out.println("�߸������̽��ϴ�.");
						}
					} else if (Floor3 == 2) // ����
					{
						Town1.Stop();
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����3.wav");
						Store store = new Store();
						store.store(knight);
						Town.Stop();
						Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");

					} else if (Floor3 == 3) // ����
					{
						Town1.Stop();
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����2.wav");
						Inn Inn = new Inn();
						Inn.inn(knight);
						Town.Stop();
						Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
					} else if (Floor3 == 4) // ������ ž
					{
						System.out.println("������ ž ���������� ���ϴ�.");
						System.out.println("������ ���� �� ��� �غ�� ��ġ�̳���?");
						System.out.println("1. �� / 2. �ƴϿ�");
						System.out.println("");
						System.out.println("�������������������  ");
						System.out.println("���� �Ƿε� : "+knight.Fatigue);
						System.out.println("������������������� ");
						
						
						int Floor3_1 = 0;
						try {
							Floor3_1 = scan.nextInt();
						} catch (Exception e) {
							
							scan = new Scanner(System.in);
							
							System.out.println("");
						}
						if (Floor3_1 == 1) {
							System.out.println("�˰ڽ��ϴ�. ������ž���� �̵��ϰڽ��ϴ�.");
							break;
						}

						else if (Floor3_1 == 2) {
							System.out.println("������ ���ư��ϴ�. �������ּ���");
							System.out.println("");
						}

					}

					else {
						System.out.println("�߸������̽��ϴ�.");
					}

				}
				Town1.Stop();
				System.out.println("");
				System.out.println("����������������������������");
				System.out.println("\t �ε���");
				for(int i = 0 ; i<20; i++)
				{
					
					System.out.print("��");
					
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
				System.out.println("");
				System.out.println("");
				Media Top3 = new Media(); //���� bgm
				Top3.setDaemon(true);
				
				Top3.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Dungeon-01.wav");
				
				System.out.println("");
				System.out.println("------------------------------------------");
				System.out.println("------------------------------------------");
				System.out.println("");
				System.out.println("������ ž 3��");
				System.out.println("");
				System.out.println(">>��ų�� �������� ��ų�� �Ϲݰ����� ������ ����ؼ� ���� ��ġ�켼��");

				NormalMonster2 normalMonster2 = new NormalMonster2(); // 3�� ���� �ҷ�����

				System.out.println("");
				motion.Chipmunk();
				System.out.println("�ٶ��� ����!!");
				System.out.println("");
				normalMonster2.Chipmunk();
				System.out.println("");
				System.out.println("######################");

				while (true) { // ���� �ݺ�
					System.out.println("1. �����ϱ� / 2. ��ų��� / 3. ��ȯ�� ����â / 4. ���� ����â / 5. �ڵ� ����");
					int Num3_1 = 0;
					try {
						Num3_1 = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if (Num3_1 == 1) {
						motion.K_Attack();
						k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�˼Ҹ�2.wav");
						try {
							System.out.println("");
							System.out.println(creature.Name + "�� �����Դϴ�.");
							normalMonster2.Attacked_Chipmunk(knight.Attack());
							if(normalMonster2.Hp_Chipmunk > 0)
							{
								System.out.println("�ٶ��� ü�� : " + normalMonster2.Hp_Chipmunk);
							}
							if(normalMonster2.Hp_Chipmunk <= 0)
							{
								normalMonster2.Hp_Chipmunk = 0;
								System.out.println("�ٶ��� ü�� : " + normalMonster2.Hp_Chipmunk);
							}
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();

						// ������ ü���� 0���� �۰ų� ���� ���
						if (normalMonster2.Hp_Chipmunk <= 0) {
							
							try {
								System.out.println("");
								System.out.println("�ٶ��㰡 �׾����ϴ�.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
								System.out.println("���Ͱ��" + normalMonster2.Gold + "�� ȹ���ϼ̽��ϴ�.");
								knight.Gold += normalMonster2.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							break;
						}
						motion.Chipmunk_Attack();
						tower1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�ٶ���.wav", +6.0f);
						
						try {
							System.out.println("");
							System.out.println("�ٶ����� �����Դϴ�.");
							knight.Attacked(normalMonster2.Attack());
							System.out.println(creature.Name + " ü�� : " + knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if (knight.Hp <= 0) {
							System.out.println("");
							System.out.println(creature.Name + "�� �׾����ϴ�.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					} else if (Num3_1 == 2 && knight.Mp >= 30 ) {
						motion.K_Attack_Skill1();
						k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/������.wav");
						
						try {
							System.out.println("");
							System.out.println(creature.Name + "�� �����Դϴ�.");
							normalMonster2.Attacked_Chipmunk(knight.Skill());
							if(normalMonster2.Hp_Chipmunk > 0)
							{
								System.out.println("�ٶ��� ü�� : " + normalMonster2.Hp_Chipmunk);
							}
							if(normalMonster2.Hp_Chipmunk <= 0)
							{
								normalMonster2.Hp_Chipmunk = 0;
								System.out.println("�ٶ��� ü�� : " + normalMonster2.Hp_Chipmunk);
							}
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();

						// ������ ü���� 0���� �۰ų� ���� ���
						if (normalMonster2.Hp_Chipmunk <= 0) {
							try {
								System.out.println("");
								System.out.println("�ٶ��㰡 �׾����ϴ�.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
								System.out.println("���Ͱ��" + normalMonster2.Gold + "�� ȹ���ϼ̽��ϴ�.");
								knight.Gold += normalMonster2.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							break;
						}
						motion.Chipmunk_Attack();
						tower1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�ٶ���.wav", +6.0f);
						
						try {
							System.out.println("");
							System.out.println("�ٶ����� �����Դϴ�.");
							knight.Attacked(normalMonster2.Attack());
							System.out.println(creature.Name + " ü�� : " + knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if (knight.Hp <= 0) {
							System.out.println("");
							System.out.println(creature.Name + "�� �׾����ϴ�.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					}
					
					else if (Num3_1 == 2 && knight.Mp < 30)
					{
						System.out.println("������ �����մϴ�.");
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
								System.out.println(creature.Name + "�� �����Դϴ�.");
								normalMonster2.Attacked_Chipmunk(knight.Attack());
								if(normalMonster2.Hp_Chipmunk > 0)
								{
									System.out.println("�ٶ��� ü�� : " + normalMonster2.Hp_Chipmunk);
								}
								if(normalMonster2.Hp_Chipmunk <= 0)
								{
									normalMonster2.Hp_Chipmunk = 0;
									System.out.println("�ٶ��� ü�� : " + normalMonster2.Hp_Chipmunk);
								}

								//������ ü���� 0���� �۰ų� ���� ���				
								if(normalMonster2.Hp_Chipmunk<=0)
								{	
									try {
										System.out.println("");
										System.out.println("�ٶ��㰡 �׾����ϴ�.");
										System.out.println("���Ͱ��"+normalMonster2.Gold+"�� ȹ���ϼ̽��ϴ�.");
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
								System.out.println("�ٶ����� �����Դϴ�.");
								knight.Attacked(normalMonster2.Attack());
								System.out.println(creature.Name+" ü�� : "+knight.Hp);
								System.out.println("");
								if(knight.Hp <=0)
								{	System.out.println("");
									System.out.println(creature.Name+"�� �׾����ϴ�.");
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
						System.out.println("�߸������̽��ϴ�.");
					}
				}
				motion.Slime();
				System.out.println("");
				System.out.println("������ ����!!");
				System.out.println("");
				normalMonster2.Slime();
				System.out.println("");
				System.out.println("######################");

				while (true) { // ���� �ݺ�
					System.out.println("1. �����ϱ� / 2. ��ų��� / 3. ��ȯ�� ����â / 4. ���� ����â / 5. �ڵ� ����");
					int Num3_2 = 0;
					try {
						Num3_2 = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if (Num3_2 == 1) {
						
						motion.K_Attack();
						k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�˼Ҹ�2.wav");
						
						try {
							System.out.println("");
							System.out.println(creature.Name + "�� �����Դϴ�.");
							normalMonster2.Attacked_Slime(knight.Attack());
							if(normalMonster2.Hp_Slime > 0)
							{
								System.out.println("������ ü�� : " + normalMonster2.Hp_Slime);
							}
							if(normalMonster2.Hp_Slime <= 0)
							{
								normalMonster2.Hp_Slime = 0;
								System.out.println("������ ü�� : " + normalMonster2.Hp_Slime);
							}
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();

						// ������ ü���� 0���� �۰ų� ���� ���
						if (normalMonster2.Hp_Slime <= 0) {
							
							try {
								System.out.println("");
								System.out.println("�������� �׾����ϴ�.");
								System.out.println("���Ͱ��" + normalMonster2.Gold + "�� ȹ���ϼ̽��ϴ�.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
								knight.Gold += normalMonster2.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							break;
						}
						motion.Slime_Attack();
						tower1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/������.wav", +6.0f);
						
						try {
							System.out.println("");
							System.out.println("�������� �����Դϴ�.");
							knight.Attacked(normalMonster.Attack());
							System.out.println(creature.Name + " ü�� : " + knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if (knight.Hp <= 0) {
							System.out.println("");
							System.out.println(creature.Name + "�� �׾����ϴ�.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					} else if (Num3_2 == 2 && knight.Mp >= 30) {
						
						motion.K_Attack_Skill1();
						k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/������.wav");
						
						try {
							System.out.println("");
							System.out.println(creature.Name + "�� �����Դϴ�.");
							normalMonster2.Attacked_Slime(knight.Skill());
							if(normalMonster2.Hp_Slime > 0)
							{
								System.out.println("������ ü�� : " + normalMonster2.Hp_Slime);
							}
							if(normalMonster2.Hp_Slime <= 0)
							{
								normalMonster2.Hp_Slime = 0;
								System.out.println("������ ü�� : " + normalMonster2.Hp_Slime);
							}
							
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();
						

						// ������ ü���� 0���� �۰ų� ���� ���
						if (normalMonster2.Hp_Slime <= 0) {
							try {
								System.out.println("");
								System.out.println("�������� �׾����ϴ�.");
								System.out.println("���Ͱ��" + normalMonster2.Gold + "�� ȹ���ϼ̽��ϴ�.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
								knight.Gold += normalMonster2.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							break;
						}
						motion.Slime_Attack();
						tower1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/������.wav", +6.0f);
						
						try {
							System.out.println("");
							System.out.println("�������� �����Դϴ�.");
							knight.Attacked(normalMonster.Attack());
							System.out.println(creature.Name + " ü�� : " + knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if (knight.Hp <= 0) {
							System.out.println("");
							System.out.println(creature.Name + "�� �׾����ϴ�.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					}
					else if (Num3_2 == 2 && knight.Mp < 30)
					{
						System.out.println("������ �����մϴ�.");
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
								System.out.println(creature.Name + "�� �����Դϴ�.");
								normalMonster2.Attacked_Slime(knight.Attack());
								if(normalMonster2.Hp_Slime > 0)
								{
									System.out.println("������ ü�� : " + normalMonster2.Hp_Slime);
								}
								if(normalMonster2.Hp_Slime <= 0)
								{
									normalMonster2.Hp_Slime = 0;
									System.out.println("������ ü�� : " + normalMonster2.Hp_Slime);
								}

								//������ ü���� 0���� �۰ų� ���� ���				
								if(normalMonster2.Hp_Slime<=0)
								{	
									try {
										System.out.println("");
										System.out.println("�������� �׾����ϴ�.");
										System.out.println("���Ͱ��"+normalMonster2.Gold+"�� ȹ���ϼ̽��ϴ�.");
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
								System.out.println("�������� �����Դϴ�.");
								knight.Attacked(normalMonster.Attack());
								System.out.println(creature.Name+" ü�� : "+knight.Hp);
								System.out.println("");
								if(knight.Hp <=0)
								{	System.out.println("");
									System.out.println(creature.Name+"�� �׾����ϴ�.");
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
						System.out.println("�߸������̽��ϴ�.");
					}
				}
				
				System.out.println("");
				motion.Skeleton();
				System.out.println("���̷��� ����!!");
				System.out.println("");
				normalMonster2.Skeleton();
				System.out.println("");
				System.out.println("######################");

				while (true) { // ���� �ݺ�
					System.out.println("1. �����ϱ� / 2. ��ų��� / 3. ��ȯ�� ����â / 4. ���� ����â / 5.�ڵ� ����");
					int Num3_2 = 0;
					try {
						Num3_2 = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if (Num3_2 == 1) {
						
						motion.K_Attack();
						k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�˼Ҹ�2.wav");
						try {
							System.out.println("");
							System.out.println(creature.Name + "�� �����Դϴ�.");
							normalMonster2.Attacked_Skeleton(knight.Attack());
							if(normalMonster2.Hp_Skeleton > 0)
							{
								System.out.println("���̷��� ü�� : " + normalMonster2.Hp_Skeleton);
							}
							if(normalMonster2.Hp_Skeleton <= 0)
							{
								normalMonster2.Hp_Skeleton = 0;
								System.out.println("���̷��� ü�� : " + normalMonster2.Hp_Skeleton);
							}
							
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}k_Attack.Stop();
						

						// ������ ü���� 0���� �۰ų� ���� ���
						if (normalMonster2.Hp_Skeleton <= 0) {
							
							try {
								System.out.println("");
								System.out.println("���̷����� �׾����ϴ�.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
								System.out.println("���Ͱ��" + normalMonster2.Gold + "�� ȹ���ϼ̽��ϴ�.");
								knight.Gold += normalMonster2.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							
							
							break;
						}
						motion.Skeleton_Attack();
						tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���̷���.wav");
						
						try {
							System.out.println("");
							System.out.println("���̷����� �����Դϴ�.");
							System.out.println("");
							knight.Attacked(normalMonster.Attack());
							System.out.println(creature.Name + " ü�� : " + knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						
						if (knight.Hp <= 0) {
							System.out.println("");
							System.out.println(creature.Name + "�� �׾����ϴ�.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					} else if (Num3_2 == 2 && knight.Mp >= 30) {
						
						motion.K_Attack_Skill1();
						k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/������.wav");
						
						try {
							System.out.println("");
							System.out.println(creature.Name + "�� �����Դϴ�.");
							normalMonster2.Attacked_Skeleton(knight.Skill());
							if(normalMonster2.Hp_Skeleton > 0)
							{
								System.out.println("���̷��� ü�� : " + normalMonster2.Hp_Skeleton);
							}
							if(normalMonster2.Hp_Skeleton <= 0)
							{
								normalMonster2.Hp_Skeleton = 0;
								System.out.println("���̷��� ü�� : " + normalMonster2.Hp_Skeleton);
							}
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();
						

						// ������ ü���� 0���� �۰ų� ���� ���
						if (normalMonster2.Hp_Skeleton <= 0) {
							try {
								System.out.println("");
								System.out.println("���̷����� �׾����ϴ�.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
								System.out.println("���Ͱ��" + normalMonster2.Gold + "�� ȹ���ϼ̽��ϴ�.");
								knight.Gold += normalMonster2.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							break;
						}
						motion.Skeleton_Attack();
						tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���̷���.wav");
						
						try {
							System.out.println("");
							System.out.println("���̷����� �����Դϴ�.");
							System.out.println("");
							knight.Attacked(normalMonster.Attack());
							System.out.println(creature.Name + " ü�� : " + knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if (knight.Hp <= 0) {
							System.out.println("");
							System.out.println(creature.Name + "�� �׾����ϴ�.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					}
					else if (Num3_2 == 2 && knight.Mp < 30)
					{
						System.out.println("������ �����մϴ�.");
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
								System.out.println(creature.Name + "�� �����Դϴ�.");
								normalMonster2.Attacked_Skeleton(knight.Attack());
								if(normalMonster2.Hp_Skeleton > 0)
								{
									System.out.println("���̷��� ü�� : " + normalMonster2.Hp_Skeleton);
								}
								if(normalMonster2.Hp_Skeleton <= 0)
								{
									normalMonster2.Hp_Skeleton = 0;
									System.out.println("���̷��� ü�� : " + normalMonster2.Hp_Skeleton);
								}

								//������ ü���� 0���� �۰ų� ���� ���				
								if(normalMonster2.Hp_Skeleton<=0)
								{	
									try {
										System.out.println("");
										System.out.println("���̷����� �׾����ϴ�.");
										System.out.println("���Ͱ��"+normalMonster2.Gold+"�� ȹ���ϼ̽��ϴ�.");
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
								System.out.println("���̷����� �����Դϴ�.");
								knight.Attacked(normalMonster.Attack());
								System.out.println(creature.Name+" ü�� : "+knight.Hp);
								if(knight.Hp <=0)
								{	System.out.println("");
									System.out.println(creature.Name+"�� �׾����ϴ�.");
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
						System.out.println("�߸������̽��ϴ�.");
					}
				}
				tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���ӽ¸�.wav");
				System.out.println(">>������ ž 3���� Ŭ�����ϼ̽��ϴ�!!!!");
				System.out.println(">>������ ���ϴ�.");
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
					System.out.println("��..!!");
					System.out.println("��ȯ���� �ʹ� Ȥ����׳׿� ..");
					System.out.println("��ȯ���� �Ƿΰ� �׿� �׾����ϴ�.");
					System.out.println("");
					System.out.println("Game Over");
					return;
				}
				
				System.out.println("------------------------------------------");
				System.out.println("------------------------------------------");
				Top3.Stop();
				System.out.println("");
				System.out.println("����������������������������");
				System.out.println("\t �ε���");
				for(int i = 0 ; i<20; i++)
				{
					
					System.out.print("��");
					
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
				
				System.out.println("");
				System.out.println("");
				Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
				
				while (true) {
					System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
					System.out.println("1. ����â  / 2. ����  / 3. ����  / 4. ������ž"); // �������� �̵����
					System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
					int Floor3 = 0;
					try {
						Floor3 = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if (Floor3 == 1) // ����â
					{
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����â2.wav");
						System.out.println("");

						knight.knight();
						System.out.println("1. �ڷΰ���");
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
							System.out.println("�߸������̽��ϴ�.");
						}
					} else if (Floor3 == 2) // ����
					{
						Town1.Stop();
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����3.wav");
						Store store = new Store();
						store.store(knight);
						Town.Stop();
						Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
					}

					else if (Floor3 == 3) // ����
					{
						Town1.Stop();
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����2.wav");
						Inn Inn = new Inn();
						Inn.inn(knight);
						Town.Stop();
						Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
					} else if (Floor3 == 4) // ������ ž
					{
						System.out.println("������ ž ���������� ���ϴ�.");
						System.out.println("������ ���� �� ��� �غ�� ��ġ�̳���?");
						System.out.println("1. �� / 2. �ƴϿ�");
						System.out.println("");
						System.out.println("�������������������  ");
						System.out.println("���� �Ƿε� : "+knight.Fatigue);
						System.out.println("������������������� ");
						
						
						int Floor3_1 = 0;
						try {
							Floor3_1 = scan.nextInt();
						} catch (Exception e) {
							
							scan = new Scanner(System.in);
							
							System.out.println("");
						}
						if (Floor3_1 == 1) {
							System.out.println("�˰ڽ��ϴ�. ������ž���� �̵��ϰڽ��ϴ�.");
							break;
						}

						else if (Floor3_1 == 2) {
							System.out.println("������ ���ư��ϴ�. �������ּ���");
							System.out.println("");
						}

					}

					else {
						System.out.println("�߸������̽��ϴ�.");
					}
				}

				Town1.Stop();
				
				System.out.println("");
				System.out.println("����������������������������");
				System.out.println("\t �ε���");
				for(int i = 0 ; i<20; i++)
				{
					
					System.out.print("��");
					
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
				System.out.println("");
				System.out.println("");
				Top2.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Dungeon-03.wav");
				
				System.out.println("");
				System.out.println("------------------------------------------");
				System.out.println("------------------------------------------");
				System.out.println("");
				System.out.println("������ ž 4��");
				System.out.println("");
				System.out.println(">>�߰������Դϴ�.");
				System.out.println(">>�߰������� ��ġ��� 2����ų�� �����ֽ��ϴ�.");
				System.out.println("");
				System.out.println("");
				MediumBoss2 mediumBoss2 = new MediumBoss2();// �߰����� Ŭ���� �ҷ�����

				motion.Envoy();
				System.out.println("");
				System.out.println("���� ����!!");
				System.out.println("");
				mediumBoss2.Envoy();
				System.out.println("");
				System.out.println("######################");

				while (true) { // ���� �ݺ�
					System.out.println("1. �����ϱ� / 2. ��ų��� / 3. ��ȯ�� ����â / 4. ���� ����â");
					int Battle_Envoy = 0;
					try {
						Battle_Envoy = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if (Battle_Envoy == 1) {
						motion.K_Attack();
						k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�˼Ҹ�2.wav");
						
						try {
							System.out.println("");
							System.out.println(creature.Name + "�� �����Դϴ�.");
							mediumBoss2.Attacked_Envoy(knight.Attack());
							if(mediumBoss2.Hp > 0)
							{
								System.out.println("���� ü�� : " + mediumBoss2.Hp);
							}
							if(mediumBoss2.Hp <= 0)
							{
								mediumBoss2.Hp = 0;
								System.out.println("���� ü�� : " + mediumBoss2.Hp);
							}
							
							Thread.sleep(1500);						
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();
						
						// ������ ü���� 0���� �۰ų� ���� ���
						if (mediumBoss2.Hp <= 0) {
							
							try {
								System.out.println("");
								System.out.println("���డ �׾����ϴ�.");
								System.out.println("���Ͱ��" + mediumBoss2.Gold + "�� ȹ���ϼ̽��ϴ�.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
								knight.Gold += mediumBoss2.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							break;
						}
						motion.Envoy_Attack();
						tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����.wav");
						
						try {
							System.out.println("");
							System.out.println("������ �����Դϴ�.");
							knight.Attacked(mediumBoss2.Attack());
							System.out.println(creature.Name + " ü�� : " + knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if (knight.Hp <= 0) {
							System.out.println("");
							System.out.println(creature.Name + "�� �׾����ϴ�.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					} else if (Battle_Envoy == 2 && knight.Mp >= 30)

					{
						motion.K_Attack_Skill1();
						k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/������.wav");
						
						try {
							System.out.println("");
							System.out.println(creature.Name + "�� �����Դϴ�.");
							mediumBoss2.Attacked_Envoy(knight.Skill());
							if(mediumBoss2.Hp > 0)
							{
								System.out.println("���� ü�� : " + mediumBoss2.Hp);
							}
							if(mediumBoss2.Hp <= 0)
							{
								mediumBoss2.Hp = 0;
								System.out.println("���� ü�� : " + mediumBoss2.Hp);
							}
							
							
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();

						// ������ ü���� 0���� �۰ų� ���� ���
						if (mediumBoss2.Hp <= 0) {
							try {
								System.out.println("");
								System.out.println("���డ �׾����ϴ�.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
								System.out.println("���Ͱ��" + mediumBoss2.Gold + "�� ȹ���ϼ̽��ϴ�.");
								knight.Gold += mediumBoss2.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							
							
							break;
						}
						motion.Envoy_Attack();
						tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����.wav");
						try {
							System.out.println("");
							System.out.println("������ �����Դϴ�.");
							knight.Attacked(mediumBoss2.Attack());
							System.out.println(creature.Name + " ü�� : " + knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if (knight.Hp <= 0) {
							System.out.println("");
							System.out.println(creature.Name + "�� �׾����ϴ�.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
						
					}
					else if (Battle_Envoy == 2 && knight.Mp < 30)
					{
						System.out.println("������ �����մϴ�.");
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
						System.out.println("�߸������̽��ϴ�.");
					}
				}
				tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���ӽ¸�.wav");
				try {
					System.out.println(">>����ؿ� !! �߰������� ����Ʈ���̾��!!");
					System.out.println(">>�߰������� ����Ʈ���� ��ų�� ���̽��ϴ�.");
					System.out.println("");
					Thread.sleep(3000);
					tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��ųȿ����.wav");
					System.out.println("2����ų �ϰ��� �����!!");
					System.out.println("");
					knight.Skill2 = "�ϰ�";
					System.out.println(">>������ ���ư��ϴ�.");
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
					System.out.println("��..!!");
					System.out.println("��ȯ���� �ʹ� Ȥ����׳׿� ..");
					System.out.println("��ȯ���� �Ƿΰ� �׿� �׾����ϴ�.");
					System.out.println("");
					System.out.println("Game Over");
					return;
				}

				Top2.Stop();
				System.out.println("");
				System.out.println("����������������������������");
				System.out.println("\t �ε���");
				for(int i = 0 ; i<20; i++)
				{
					
					System.out.print("��");
					
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
				System.out.println("");
				System.out.println("");
				Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
				
				while (true) {
					System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
					System.out.println("1. ����â  / 2. ����  / 3. ����  / 4. ������ž"); // �������� �̵����
					System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
					int Floor5_1 = 0;
					try {
						Floor5_1 = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if (Floor5_1 == 1) // ����â
					{
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����â2.wav");
						System.out.println("");

						knight.knight();
						System.out.println("1. �ڷΰ���");
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
							System.out.println("�߸������̽��ϴ�.");
						}
						
					} else if (Floor5_1 == 2) // ����
					{
						Town1.Stop();
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����3.wav");
						Store store = new Store();
						store.store(knight);
						Town.Stop();
						Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
						
					} else if (Floor5_1 == 3) // ����
					{
						Town1.Stop();
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����2.wav");
						Inn Inn = new Inn();
						Inn.inn(knight);
						Town.Stop();
						Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
					} else if (Floor5_1 == 4) // ������ ž
					{
						System.out.println("������ ž ���������� ���ϴ�.");
						System.out.println("������ ���� �� ��� �غ�� ��ġ�̳���?");
						System.out.println("1. �� / 2. �ƴϿ�");
						System.out.println("");
						System.out.println("�������������������  ");
						System.out.println("���� �Ƿε� : "+knight.Fatigue);
						System.out.println("������������������� ");
						
						
						int Floor5_2 = 0;
						try {
							Floor5_2 = scan.nextInt();
						} catch (Exception e) {
							
							scan = new Scanner(System.in);
							
							System.out.println("");
						}
						if (Floor5_2 == 1) {
							System.out.println("�˰ڽ��ϴ�. ������ž���� �̵��ϰڽ��ϴ�.");
							break;
						}

						else if (Floor5_2 == 2) {
							System.out.println("������ ���ư��ϴ�. �������ּ���");
							System.out.println("");
						}

					}

					else {
						System.out.println("�߸������̽��ϴ�.");
					}

				}
				
				Town1.Stop();
				System.out.println("");
				System.out.println("����������������������������");
				System.out.println("\t �ε���");
				for(int i = 0 ; i<20; i++)
				{
					
					System.out.print("��");
					
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
				System.out.println("");
				System.out.println("");
				Media Top5 = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);
				Top5.setDaemon(true);
				
				Top5.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Final-Boss.wav");
				
				
				System.out.println("");
				System.out.println("------------------------------------------");
				System.out.println("------------------------------------------");
				System.out.println("");
				System.out.println("������ ž 5��");
				System.out.println("");
				System.out.println("���� ������ 5������ ���̱���!!");
				System.out.println(">>���������Դϴ�.");
				System.out.println(">>���������� ��ġ��� ������������ ���ư����־��!!");

				FinalBoss finalBoss = new FinalBoss();// �߰����� Ŭ���� �ҷ�����
				motion.Devil();
				System.out.println("");
				System.out.println("���� ����!!");
				System.out.println("");
				finalBoss.Devil();
				System.out.println("");
				System.out.println("######################");

				while (true) { // ���� �ݺ�
					System.out.println("1. �����ϱ� / 2. 1����ų��� / 3. 2����ų��� / 4. ��ȯ�� ����â / 5. ���� ����â");
					int Battle_Devil = 0;
					try {
						Battle_Devil = scan.nextInt();
					} catch (Exception e) {
						
						scan = new Scanner(System.in);
						
						System.out.println("");
					}
					if (Battle_Devil == 1) {
						motion.K_Attack();
						k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�˼Ҹ�2.wav");
						
						try {
							System.out.println("");
							System.out.println(creature.Name + "�� �����Դϴ�.");
							finalBoss.Attacked_Devil(knight.Attack());
							if(finalBoss.Hp > 0)
							{
								System.out.println("���� ü�� : " + finalBoss.Hp);
							}
							if(finalBoss.Hp <= 0)
							{
								finalBoss.Hp = 0;
							System.out.println("���� ü�� : " + finalBoss.Hp);
							}
							
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();
						

						// ������ ü���� 0���� �۰ų� ���� ���
						if (finalBoss.Hp <= 0) {
							try {
								System.out.println("");
								System.out.println("������ �׾����ϴ�.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
								
								System.out.println("���Ͱ��" + finalBoss.Gold + "�� ȹ���ϼ̽��ϴ�.");
								knight.Gold += finalBoss.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							break;
						}
						tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���հ���2.wav");
						motion.Devil_Attack();
						
						
						
						try {
							System.out.println("");
							System.out.println("������ �����Դϴ�.");
							knight.Attacked(finalBoss.Attack());
							System.out.println(creature.Name + " ü�� : " + knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if (knight.Hp <= 0) {
							System.out.println("");
							System.out.println(creature.Name + "�� �׾����ϴ�.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					} else if (Battle_Devil == 2 && knight.Mp >= 30)

					{
						motion.K_Attack_Skill1();
						k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/������.wav");
						
						try {
							System.out.println("");
							System.out.println(creature.Name + "�� �����Դϴ�.");
							finalBoss.Attacked_Devil(knight.Skill());
							if(finalBoss.Hp > 0)
							{
								System.out.println("���� ü�� : " + finalBoss.Hp);
							}
							if(finalBoss.Hp <= 0)
							{
								finalBoss.Hp = 0;
							System.out.println("���� ü�� : " + finalBoss.Hp);
							}
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();
					

						// ������ ü���� 0���� �۰ų� ���� ���
						if (finalBoss.Hp <= 0) {
							try {
								System.out.println("");
								System.out.println("������ �׾����ϴ�.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
								
								System.out.println("���Ͱ��" + finalBoss.Gold + "�� ȹ���ϼ̽��ϴ�.");
								knight.Gold += finalBoss.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							break;
						}
						tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���հ���2.wav");
						motion.Devil_Attack();
						
						
						
						try {
							System.out.println("");
							System.out.println("������ �����Դϴ�.");
							knight.Attacked(finalBoss.Attack());
							System.out.println(creature.Name + " ü�� : " + knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if (knight.Hp <= 0) {
							System.out.println("");
							System.out.println(creature.Name + "�� �׾����ϴ�.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
						

					} else if (Battle_Devil == 3 && knight.Mp >= 50)

					{	
						
						motion.K_Attack_Skill2();
						k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�ϰ�.wav");
						
						try {
							System.out.println("");
							System.out.println(creature.Name + "�� �����Դϴ�.");
							finalBoss.Attacked_Devil(knight.Skill2());
							if(finalBoss.Hp > 0)
							{
								System.out.println("���� ü�� : " + finalBoss.Hp);
							}
							if(finalBoss.Hp <= 0)
							{
								finalBoss.Hp = 0;
							System.out.println("���� ü�� : " + finalBoss.Hp);
							}
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						k_Attack.Stop();
						

						// ������ ü���� 0���� �۰ų� ���� ���
						if (finalBoss.Hp <= 0) {
							try {
								System.out.println("");
								System.out.println("������ �׾����ϴ�.");
								k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
								
								System.out.println("���Ͱ��" + finalBoss.Gold + "�� ȹ���ϼ̽��ϴ�.");
								knight.Gold += finalBoss.Gold;
								Thread.sleep(2000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							k_Attack.Stop();
							break;
						}
						tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���հ���2.wav");
						motion.Devil_Attack();
						
						
						
						try {
							System.out.println("");
							System.out.println("������ �����Դϴ�.");
							knight.Attacked(finalBoss.Attack());
							System.out.println(creature.Name + " ü�� : " + knight.Hp);
							Thread.sleep(1500);
						} catch (Exception e) {
							// TODO: handle exception
						}
						tower1.Stop();
						if (knight.Hp <= 0) {
							System.out.println("");
							System.out.println(creature.Name + "�� �׾����ϴ�.");
							System.out.println("");
							System.out.println("Game Over");
							return;
						}
					}
					else if (Battle_Devil == 2 && knight.Mp < 30)
					{
						System.out.println("������ �����մϴ�.");
						System.out.println("");
					}
					else if (Battle_Devil == 3 && knight.Mp < 50)
					{
						System.out.println("������ �����մϴ�.");
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
						System.out.println("�߸�"
								+ "�����̽��ϴ�.");
					}
				}
				
				tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���ӽ¸�.wav");
				
				System.out.println();
				System.out.println("");
				System.out.println("------------------------------------------");
				System.out.println("------------------------------------------");
				System.out.println("");
				System.out.println("");
				System.out.println(">> ������� Ŭ�����ϼ̱��� !! ���� �س��� �� �Ƽ̾��!");
				System.out.println("");
				System.out.println(">> ���� �����ִ� ����� ���ư����ֽ��ϴ�.");
				System.out.println(">> ��������� ���ð� �Ǹ� �̰����� �־��� ������� ������ϴ�.");
				System.out.println(">> ������ ž�� Ŭ�����ϴ��� ��������̰� , �ǰ��ϰ� �����ñ� �ٶ��Կ�!!");
				System.out.println("");
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				tower1.Stop();
				Top5.Stop();
				Top5.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����.wav");
				System.out.println("------------------------------------------");
				System.out.println("------------------------------------------");
				System.out.println("����");
				try {
					String end[] = {
							"",
							"",
							"(â���� �޻��� ���� ���ΰ��� �������.)",
							"���ΰ� : �Ͼ�~ �����.", 
							"���ΰ� : �������̿������� ����� �ȳ����� ���� �����ϰ� ���Ѱ����̾�..",
							"���ΰ� : ...",
							"���ΰ� : ���� .. �ڰ��Ͼ�µ� ���� ��ó�����ֳ�. ",
							"(�帴�� ����� ���� ��������..)",
							"(" +creature.Name + " : ..!!)",
							"���ΰ� : " + creature.Name + "��.. ���� �ͼ��� ������ ���.. ",
							"���ΰ� : ....",
							"���ΰ� : ���� �𸣰ڴ�..", 
							"���ΰ� : ��! ���� �ð��� !! �б� �����ϰڴ� ���� �غ��ؾ���!",
							"...",
							"",
							"",
							"******************************************",
							"",
							"\t ������ �÷��� ���ּż� �����մϴ�~!",
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
				System.out.print("����");

				System.out.println(" ��ȯ���� �����ϼ̱���. ");
				System.out.println("");
				System.out.println("��ȯ���� �̸��� �����ּ���. ");

				creature.Name = scan.next();

				System.out.println(creature.Name + " ��ȯ���� �����Ͽ� ������ Ŭ�����ϼ��� !!");
				System.out.println("");
				System.out.println("------------------------------------------");
				System.out.println("------------------------------------------");
				clearScreen();
				String Prolog[] = {
						"���ѷα�",
						"",
						"�ءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءء�",
						"�ءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءء�",
						"",
						"���ΰ� : ...!?",
						"���ΰ� : ���Ⱑ �����..?",
						"���ΰ� : �� �и� ������ ���� �ڰ� �־��µ�..?",
						"���ΰ� : ���� ���ΰ� ?",
						"���ΰ� : (���� �����´�)",
						"���ΰ� : �ƾ�!.. ���� �ƴѵ���",
						"",
						">>�ȳ��ϼ��� ����� �̼����� ���ΰ� �Դϴ�.",
						"",
						"���ΰ� : !? ��� �鸮�°���?",
						"",
						">>������ ž������ �� ���͸� �����߸��� ������������ �������.",
						">>�׷��� ����� ���� ����� ���� ���� �ֽ��ϴ�.",
						"",
						"���ΰ� : ..? ���� ���Ⱑ �̼�����?",
						">> �������� ���� ��� ���� ��ȯ���� �����̴ϴ�. ��ȯ���� �����Ͽ� ���������� �����߸�����!!",
						"(���⼭ �� �� ��ȯ�� ����)",
						"",
						creature.Name + " : ��",
						"���ΰ� : �̰��� ��ȯ���ΰ�..?",
						"���ΰ� : �ϴ� ������ ž�� ������.",
						"",
						"�ءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءء�",
						"�ءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءء�",
						""
						};
				MyThread t3 = new MyThread(Prolog, 100);
				Thread r3 = new Thread(t3);		
				r3.start();

try {
	r3.join();
	System.out.println("������ ž���� ���ðڽ��ϱ� ?");
	System.out.println("1. ���� / 2. �Ȱ���");
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
	System.out.println("�غ�ǽǶ����� ��ٸ��ڽ��ϴ�.");
	System.out.println("");
	System.out.println("������ ž���� ���ðڽ��ϱ� ?");
	System.out.println("1. ���� / 2. �Ȱ���");
}
else
{
	System.out.println("�߸������̽��ϴ�.");
	System.out.println("");
}
}
Title.Stop();
System.out.println("");
System.out.println("����������������������������");
System.out.println("\t �ε���");
for(int i = 0 ; i<20; i++)
{
	
	System.out.print("��");
	
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
Media Top1 = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);

Top1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Dungeon-01.wav", +6.0f);

System.out.println("");
System.out.println("������ ž 1��");
System.out.println("");
System.out.println(">>������ ž 1���Դϴ�.");
System.out.println(">>�ʹݿ� �⺻�������� ���͸� �����ϰ� �߹ݿ� ��ų�� ���� �ֽ��ϴ�.");
System.out.println(">>���͸� ��� �����ϰ� ������ Ŭ�����ϼ��� !!");
Thief thief = new Thief(); // ���� Ŭ���� �ν��Ͻ� ����
NormalMonster normalMonster = new NormalMonster();//�븻���� Ŭ���� �ҷ�����
System.out.println("");
motion.Bat();
System.out.println("�������!!");
System.out.println("");
normalMonster.Bat();
System.out.println("");
System.out.println("######################");

Media k_Attack = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);
Media tower1 = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);
while(true) { //���� �ݺ�
	System.out.println("1. �����ϱ� / 2. ��ȯ�� ����â / 3. ���� ����â / 4. �ڵ� ����");
	int Battle_Bat = 0;
	try {
		Battle_Bat = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	
	if(Battle_Bat == 1)
		
	{	motion.T_Attack();
	

	k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�������Ҹ�2.wav");

		try {
			System.out.println("");
			System.out.println(creature.Name+"�� �����Դϴ�.");
			normalMonster.Attacked_Bat(thief.Attack());
			if(normalMonster.Hp_Bat > 0)
			{
			System.out.println("���� ü�� : "+normalMonster.Hp_Bat);
			}
			if(normalMonster.Hp_Bat <= 0)
			{
				normalMonster.Hp_Bat = 0;
			System.out.println("���� ü�� : "+normalMonster.Hp_Bat);
			}
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
	k_Attack.Stop();

		//������ ü���� 0���� �۰ų� ���� ���				
		if(normalMonster.Hp_Bat<=0)
		{	try {
			System.out.println("");
			System.out.println("���㰡 �׾����ϴ�.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
			System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
			thief.Gold+=normalMonster.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();	
			break;
		}
		motion.Bat_Attack();


		tower1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����.wav", +6.0f);
		try {
			System.out.println("");
			System.out.println("������ �����Դϴ�.");
			thief.Attacked(normalMonster.Attack());
			System.out.println(creature.Name+" ü�� : "+thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if(thief.Hp <=0)
		{	System.out.println("");
			System.out.println(creature.Name+"�� �׾����ϴ�.");
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
				System.out.println(creature.Name+"�� �����Դϴ�.");
				normalMonster.Attacked_Bat(thief.Attack());
				if(normalMonster.Hp_Bat > 0)
				{
				System.out.println("���� ü�� : "+normalMonster.Hp_Bat);
				}
				if(normalMonster.Hp_Bat <= 0)
				{
					normalMonster.Hp_Bat = 0;
				System.out.println("���� ü�� : "+normalMonster.Hp_Bat);
				}

				//������ ü���� 0���� �۰ų� ���� ���				
				if(normalMonster.Hp_Bat<=0)
				{	
					try {
						System.out.println("");
						System.out.println("���㰡 �׾����ϴ�.");
						System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
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
				System.out.println("������ �����Դϴ�.");
				thief.Attacked(normalMonster.Attack());
				System.out.println(creature.Name+" ü�� : "+thief.Hp);
				System.out.println("");
				if(thief.Hp <=0)
				{	System.out.println("");
					System.out.println(creature.Name+"�� �׾����ϴ�.");
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
		System.out.println("�߸������̽��ϴ�.");
	}
}

System.out.println("");
motion.Snail();
System.out.println("������ ����!!");
normalMonster.Snail();
System.out.println("");
System.out.println("######################");


while(true) {
	System.out.println("1. �����ϱ� / 2. ��ȯ�� ����â / 3. ���� ����â / 4. �ڵ� ����");
	int Battle_Snail = 0;
	try {
		Battle_Snail = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if(Battle_Snail == 1)
		
	{	motion.T_Attack();
	k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�������Ҹ�2.wav");
	try {
		System.out.println("");
		System.out.println(creature.Name+"�� �����Դϴ�.");
		normalMonster.Attacked_Snail(thief.Attack());
		if(normalMonster.Hp_Snail > 0)
		{
			System.out.println("������ ü�� : "+normalMonster.Hp_Snail);
		}
		if(normalMonster.Hp_Snail <= 0)
		{
			normalMonster.Hp_Snail = 0;
			System.out.println("������ ü�� : "+normalMonster.Hp_Snail);
		}
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();	
		//������ ü���� 0���� �۰ų� ���� ���
		
		if(normalMonster.Hp_Snail<=0)
		{	
			try {
				System.out.println("");
				System.out.println("�����̰� �׾����ϴ�.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
				System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
				thief.Gold+=normalMonster.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			k_Attack.Stop();
			break;
		}
		
		motion.Snail_Attack();
		tower1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/������.wav", +6.0f);
		try {
			System.out.println("");
			System.out.println("�������� �����Դϴ�.");
			System.out.println("");
			thief.Attacked(normalMonster.Attack());
			System.out.println(creature.Name+" ü�� : "+thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if(thief.Hp <=0)
		{	System.out.println("");
			System.out.println(creature.Name+"�� �׾����ϴ�.");
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
				System.out.println(creature.Name+"�� �����Դϴ�.");
				normalMonster.Attacked_Snail(thief.Attack());
				if(normalMonster.Hp_Snail > 0)
				{
					System.out.println("������ ü�� : "+normalMonster.Hp_Snail);
				}
				if(normalMonster.Hp_Snail <= 0)
				{
					normalMonster.Hp_Snail = 0;
					System.out.println("������ ü�� : "+normalMonster.Hp_Snail);
				}

				//������ ü���� 0���� �۰ų� ���� ���				
				if(normalMonster.Hp_Snail<=0)
				{	
					try {
						System.out.println("");
						System.out.println("�����̰� �׾����ϴ�.");
						System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
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
				System.out.println("�������� �����Դϴ�.");
				System.out.println("");
				thief.Attacked(normalMonster.Attack());
				System.out.println(creature.Name+" ü�� : "+thief.Hp);
				System.out.println("");
				if(thief.Hp <=0)
				{	System.out.println("");
					System.out.println(creature.Name+"�� �׾����ϴ�.");
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
		System.out.println("�߸������̽��ϴ�.");
	}
}

System.out.println("");
motion.Rabbit();
System.out.println("�䳢 ����!!");
normalMonster.Rabbit();
System.out.println("");
System.out.println("######################");


while(true) {
	System.out.println("1. �����ϱ� / 2. ��ȯ�� ����â / 3. ���� ����â / 4. �ڵ� ����");
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
		k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�������Ҹ�2.wav");
		try {
			System.out.println("");
			System.out.println(creature.Name+"�� �����Դϴ�.");
			normalMonster.Attacked_Rabbit(thief.Attack());
			if(normalMonster.Hp_Rabbit > 0)
			{
				System.out.println("�䳢 ü�� : "+normalMonster.Hp_Rabbit);
			}
			if(normalMonster.Hp_Rabbit <= 0)
			{
				normalMonster.Hp_Rabbit = 0;
				System.out.println("�䳢 ü�� : "+normalMonster.Hp_Rabbit);
			}
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		//������ ü���� 0���� �۰ų� ���� ���
		
		if(normalMonster.Hp_Rabbit<=0)
		{	
			try {
				System.out.println("");
				System.out.println("�䳢�� �׾����ϴ�.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
				System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
				thief.Gold+=normalMonster.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			k_Attack.Stop();
			break;
		}
		
		motion.Rabbit_Attack();
		tower1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�䳢.wav", +6.0f);
		try {
			System.out.println("");
			System.out.println("�䳢�� �����Դϴ�.");
			System.out.println("");
			thief.Attacked(normalMonster.Attack());
			System.out.println(creature.Name+" ü�� : "+thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if(thief.Hp <=0)
		{	System.out.println("");
			System.out.println(creature.Name+"�� �׾����ϴ�.");
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
				System.out.println(creature.Name+"�� �����Դϴ�.");
				normalMonster.Attacked_Rabbit(thief.Attack());
				if(normalMonster.Hp_Rabbit > 0)
				{
					System.out.println("�䳢 ü�� : "+normalMonster.Hp_Rabbit);
				}
				if(normalMonster.Hp_Rabbit <= 0)
				{
					normalMonster.Hp_Rabbit = 0;
					System.out.println("�䳢 ü�� : "+normalMonster.Hp_Rabbit);
				}

				//������ ü���� 0���� �۰ų� ���� ���				
				if(normalMonster.Hp_Rabbit<=0)
				{	
					try {
						System.out.println("");
						System.out.println("�䳢�� �׾����ϴ�.");
						System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
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
				System.out.println("�䳢�� �����Դϴ�.");
				thief.Attacked(normalMonster.Attack());
				System.out.println(creature.Name+" ü�� : "+thief.Hp);
				System.out.println("");
				if(thief.Hp <=0)
				{	System.out.println("");
					System.out.println(creature.Name+"�� �׾����ϴ�.");
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
		System.out.println("�߸������̽��ϴ�.");
	}
}

System.out.println("");
System.out.println("");
thief.Fatigue += 40;
tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���ӽ¸�.wav");
System.out.println(">>������ ž 1���� Ŭ�����ϼ̽��ϴ�!!!!");
System.out.println(">>������ ���ϴ�.");
System.out.println("");
try {
	Thread.sleep(3000);
} catch (Exception e) {
	// TODO: handle exception
}
tower1.Stop();
thief.Hp = 100;

Weapon weapon = new Weapon(); // ���� Ŭ���� ��ü����
Armor armor = new Armor(); // �Ƹ� Ŭ���� ��ü����
Top1.Stop();
System.out.println("");
System.out.println("����������������������������");
System.out.println("\t �ε���");
for(int i = 0 ; i<20; i++)
{
	
	System.out.print("��");
	
	try {
		Thread.sleep(100);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}

Media Town = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);
Town.setDaemon(true);
System.out.println("");
System.out.println("");
Media Town1 = new Media(); //���� bgm

Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");

System.out.println("������������������������������������������");
System.out.println("\t\t\t �����򸻣�");
System.out.println("");
System.out.println("1. ����â���� ��ȯ���� ���¸� Ȯ���� �� �ֽ��ϴ�.");
System.out.println("");
System.out.println("2. ���������� �������� ȹ���� ��带 �̿��Ͽ� ����� ���� �����Ҽ��ֽ��ϴ�.");
System.out.println("");
System.out.println("3. ���������� �Ƿε��� ȸ�� �Ҽ��ֽ��ϴ�.");
System.out.println("      �Ƿε��� 100�� ������� �й��ϰԵǴ� �����ϼ��� !!");
System.out.println("");
System.out.println("4. ����غ� �������� ������ž ���������� ���ø� �˴ϴ�.");
System.out.println("������������������������������������������");
System.out.println("");
System.out.println("");
System.out.println("");
while (true) {
	System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
	System.out.println("1. ����â  / 2. ����  / 3. ����  / 4. ������ž"); // �������� �̵����
	System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
	int Floor2 = 0;
	try {
		Floor2 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Floor2 == 1) // ����â
	{
		Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����â2.wav");
		System.out.println("");

		thief.thief();
		System.out.println("1. �ڷΰ���");
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
			System.out.println("�߸������̽��ϴ�.");
		}
	} else if (Floor2 == 2) // ����
	{	Town1.Stop();
		Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����3.wav");
		Store store = new Store();
		store.Thi_sto(thief);
		Town.Stop();
		Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
	}

	else if (Floor2 == 3) // ����
	{	Town1.Stop();
		Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����2.wav");
		Inn Inn = new Inn();
		Inn.Thi_in(thief);
		Town.Stop();
		Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
	} else if (Floor2 == 4) // ������ ž
	{
		System.out.println("������ ž ���������� ���ϴ�.");
		System.out.println("������ ���� �� ��� �غ�� ��ġ�̳���?");
		System.out.println("1. �� / 2. �ƴϿ�");
		System.out.println("");
		System.out.println("�������������������  ");
		System.out.println("���� �Ƿε� : "+thief.Fatigue);
		System.out.println("������������������� ");
		
		
		int Floor2_1 = 0;
		try {
			Floor2_1 = scan.nextInt();
		} catch (Exception e) {
			
			scan = new Scanner(System.in);
			
			System.out.println("");
		}
		if (Floor2_1 == 1) {
			System.out.println("�˰ڽ��ϴ�. ������ž���� �̵��ϰڽ��ϴ�.");
			break;
		}

		else if (Floor2_1 == 2) {
			System.out.println("������ ���ư��ϴ�. �������ּ���");
			System.out.println("");
		}

	}

	else {
		System.out.println("�߸������̽��ϴ�.");
	}
}

Town1.Stop();
System.out.println("");
System.out.println("����������������������������");
System.out.println("\t �ε���");
for(int i = 0 ; i<20; i++)
{
	
	System.out.print("��");
	
	try {
		Thread.sleep(100);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}
System.out.println("");
System.out.println("");
Media Top2 = new Media(); //���� bgm


Top2.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Dungeon-03.wav");

System.out.println("");
System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
System.out.println("");
System.out.println("������ ž 2��");
System.out.println("");
System.out.println(">>2���� 4���� �߰������� �����մϴ�.");
System.out.println(">>�߰������� ����� ��ų�� ���� �� �ֽ��ϴ�.");

MediumBoss mediumBoss = new MediumBoss();// �߰����� Ŭ���� �ҷ�����

System.out.println("");
motion.Ogre();
System.out.println("����� ����!!");
System.out.println("");
mediumBoss.Ogre();
System.out.println("");
System.out.println("######################");

while (true) { // ���� �ݺ�
	System.out.println("1. �����ϱ� / 2. ��ȯ�� ����â / 3. ���� ����â");
	int Battle_Ogre = 0;
	try {
		Battle_Ogre = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Battle_Ogre == 1) {
		
		motion.T_Attack();
		k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�������Ҹ�2.wav");
		
		try {
			System.out.println("");
			System.out.println(creature.Name + "�� �����Դϴ�.");
			mediumBoss.Attacked_Ogre(thief.Attack());
			if(mediumBoss.Hp > 0)
			{
				System.out.println("����� ü�� : " + mediumBoss.Hp);
			}
			if(mediumBoss.Hp <= 0)
			{
				mediumBoss.Hp = 0;
				System.out.println("����� ü�� : " + mediumBoss.Hp);
			}
			
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();

		// ������ ü���� 0���� �۰ų� ���� ���
		if (mediumBoss.Hp <= 0) {
			try {
				System.out.println("");
				System.out.println("����Ű� �׾����ϴ�.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
				System.out.println("���Ͱ��" + mediumBoss.Gold + "�� ȹ���ϼ̽��ϴ�.");
				thief.Gold += mediumBoss.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			k_Attack.Stop();
			break;
		}
		motion.Ogre_Attack();
		tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����2.wav");
		try {
			System.out.println("");
			System.out.println("������� �����Դϴ�.");
			thief.Attacked(mediumBoss.Attack());
			System.out.println(creature.Name + " ü�� : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();

		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "�� �׾����ϴ�.");
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
		System.out.println("�߸������̽��ϴ�.");
	}
}
tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���ӽ¸�.wav");
try {
	System.out.println(">>����ؿ� !! �߰������� ����Ʈ���̾��!!");
	System.out.println(">>�߰������� ����Ʈ���� ��ų�� ���̽��ϴ�.");
	System.out.println("");
	Thread.sleep(3000);
	tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��ųȿ����.wav");
	System.out.println("1����ų ǥâ �����⸦ �����!!");
	System.out.println("");
	thief.Skill = "ǥâ������";
	System.out.println(">>������ ���ư��ϴ�.");
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
System.out.println("����������������������������");
System.out.println("\t �ε���");
for(int i = 0 ; i<20; i++)
{
	
	System.out.print("��");
	
	try {
		Thread.sleep(100);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}
System.out.println("");
System.out.println("");

Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
while (true) {
	System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
	System.out.println("1. ����â  / 2. ����  / 3. ����  / 4. ������ž"); // �������� �̵����
	System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
	int Floor3 = 0;
	try {
		Floor3 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Floor3 == 1) // ����â
	{	
		Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����â2.wav");
		System.out.println("");

		thief.thief();
		System.out.println("1. �ڷΰ���");
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
			System.out.println("�߸������̽��ϴ�.");
		}
	} else if (Floor3 == 2) // ����
	{
		Town1.Stop();
		Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����3.wav");
		Store store = new Store();
		store.Thi_sto(thief);
		Town.Stop();
		Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");

	} else if (Floor3 == 3) // ����
	{
		Town1.Stop();
		Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����2.wav");
		Inn Inn = new Inn();
		Inn.Thi_in(thief);
		Town.Stop();
		Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
	} else if (Floor3 == 4) // ������ ž
	{
		System.out.println("������ ž ���������� ���ϴ�.");
		System.out.println("������ ���� �� ��� �غ�� ��ġ�̳���?");
		System.out.println("1. �� / 2. �ƴϿ�");
		System.out.println("");
		System.out.println("�������������������  ");
		System.out.println("���� �Ƿε� : "+thief.Fatigue);
		System.out.println("������������������� ");
		
		
		int Floor3_1 = 0;
		try {
			Floor3_1 = scan.nextInt();
		} catch (Exception e) {
			
			scan = new Scanner(System.in);
			
			System.out.println("");
		}
		if (Floor3_1 == 1) {
			System.out.println("�˰ڽ��ϴ�. ������ž���� �̵��ϰڽ��ϴ�.");
			break;
		}

		else if (Floor3_1 == 2) {
			System.out.println("������ ���ư��ϴ�. �������ּ���");
			System.out.println("");
		}

	}

	else {
		System.out.println("�߸������̽��ϴ�.");
	}

}
Town1.Stop();
System.out.println("");
System.out.println("����������������������������");
System.out.println("\t �ε���");
for(int i = 0 ; i<20; i++)
{
	
	System.out.print("��");
	
	try {
		Thread.sleep(100);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}
System.out.println("");
System.out.println("");
Media Top3 = new Media(); //���� bgm
Top3.setDaemon(true);

Top3.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Dungeon-01.wav");

System.out.println("");
System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
System.out.println("");
System.out.println("������ ž 3��");
System.out.println("");
System.out.println(">>��ų�� �������� ��ų�� �Ϲݰ����� ������ ����ؼ� ���� ��ġ�켼��");

NormalMonster2 normalMonster2 = new NormalMonster2(); // 3�� ���� �ҷ�����

System.out.println("");
motion.Chipmunk();
System.out.println("�ٶ��� ����!!");
System.out.println("");
normalMonster2.Chipmunk();
System.out.println("");
System.out.println("######################");

while (true) { // ���� �ݺ�
	System.out.println("1. �����ϱ� / 2. ��ų��� / 3. ��ȯ�� ����â / 4. ���� ����â / 5. �ڵ� ����");
	int Num3_1 = 0;
	try {
		Num3_1 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Num3_1 == 1) {
		motion.T_Attack();
		k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�������Ҹ�2.wav");
		try {
			System.out.println("");
			System.out.println(creature.Name + "�� �����Դϴ�.");
			normalMonster2.Attacked_Chipmunk(thief.Attack());
			if(normalMonster2.Hp_Chipmunk > 0)
			{
				System.out.println("�ٶ��� ü�� : " + normalMonster2.Hp_Chipmunk);
			}
			if(normalMonster2.Hp_Chipmunk <= 0)
			{
				normalMonster2.Hp_Chipmunk = 0;
				System.out.println("�ٶ��� ü�� : " + normalMonster2.Hp_Chipmunk);
			}
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();

		// ������ ü���� 0���� �۰ų� ���� ���
		if (normalMonster2.Hp_Chipmunk <= 0) {
			
			try {
				System.out.println("");
				System.out.println("�ٶ��㰡 �׾����ϴ�.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
				System.out.println("���Ͱ��" + normalMonster2.Gold + "�� ȹ���ϼ̽��ϴ�.");
				thief.Gold += normalMonster2.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			k_Attack.Stop();
			break;
		}
		motion.Chipmunk_Attack();
		tower1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�ٶ���.wav", +6.0f);
		
		try {
			System.out.println("");
			System.out.println("�ٶ����� �����Դϴ�.");
			thief.Attacked(normalMonster2.Attack());
			System.out.println(creature.Name + " ü�� : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "�� �׾����ϴ�.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
	} else if (Num3_1 == 2 && thief.Mp >= 30 ) {
		motion.T_Attack_Skill1();
		k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/������.wav");
		
		try {
			System.out.println("");
			System.out.println(creature.Name + "�� �����Դϴ�.");
			normalMonster2.Attacked_Chipmunk(thief.Skill());
			if(normalMonster2.Hp_Chipmunk > 0)
			{
				System.out.println("�ٶ��� ü�� : " + normalMonster2.Hp_Chipmunk);
			}
			if(normalMonster2.Hp_Chipmunk <= 0)
			{
				normalMonster2.Hp_Chipmunk = 0;
				System.out.println("�ٶ��� ü�� : " + normalMonster2.Hp_Chipmunk);
			}
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();

		// ������ ü���� 0���� �۰ų� ���� ���
		if (normalMonster2.Hp_Chipmunk <= 0) {
			try {
				System.out.println("");
				System.out.println("�ٶ��㰡 �׾����ϴ�.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
				System.out.println("���Ͱ��" + normalMonster2.Gold + "�� ȹ���ϼ̽��ϴ�.");
				thief.Gold += normalMonster2.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			k_Attack.Stop();
			break;
		}
		motion.Chipmunk_Attack();
		tower1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�ٶ���.wav", +6.0f);
		
		try {
			System.out.println("");
			System.out.println("�ٶ����� �����Դϴ�.");
			thief.Attacked(normalMonster2.Attack());
			System.out.println(creature.Name + " ü�� : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "�� �׾����ϴ�.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
	}
	
	else if (Num3_1 == 2 && thief.Mp < 30)
	{
		System.out.println("������ �����մϴ�.");
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
				System.out.println(creature.Name + "�� �����Դϴ�.");
				normalMonster2.Attacked_Chipmunk(thief.Attack());
				if(normalMonster2.Hp_Chipmunk > 0)
				{
					System.out.println("�ٶ��� ü�� : " + normalMonster2.Hp_Chipmunk);
				}
				if(normalMonster2.Hp_Chipmunk <= 0)
				{
					normalMonster2.Hp_Chipmunk = 0;
					System.out.println("�ٶ��� ü�� : " + normalMonster2.Hp_Chipmunk);
				}

				//������ ü���� 0���� �۰ų� ���� ���				
				if(normalMonster2.Hp_Chipmunk<=0)
				{	
					try {
						System.out.println("");
						System.out.println("�ٶ��㰡 �׾����ϴ�.");
						System.out.println("���Ͱ��"+normalMonster2.Gold+"�� ȹ���ϼ̽��ϴ�.");
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
				System.out.println("�ٶ����� �����Դϴ�.");
				thief.Attacked(normalMonster2.Attack());
				System.out.println(creature.Name+" ü�� : "+thief.Hp);
				System.out.println("");
				if(thief.Hp <=0)
				{	System.out.println("");
					System.out.println(creature.Name+"�� �׾����ϴ�.");
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
		System.out.println("�߸������̽��ϴ�.");
	}
}
motion.Slime();
System.out.println("");
System.out.println("������ ����!!");
System.out.println("");
normalMonster2.Slime();
System.out.println("");
System.out.println("######################");

while (true) { // ���� �ݺ�
	System.out.println("1. �����ϱ� / 2. ��ų��� / 3. ��ȯ�� ����â / 4. ���� ����â / 5. �ڵ� ����");
	int Num3_2 = 0;
	try {
		Num3_2 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Num3_2 == 1) {
		
		motion.T_Attack();
		k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�������Ҹ�2.wav");
		
		try {
			System.out.println("");
			System.out.println(creature.Name + "�� �����Դϴ�.");
			normalMonster2.Attacked_Slime(thief.Attack());
			if(normalMonster2.Hp_Slime > 0)
			{
				System.out.println("������ ü�� : " + normalMonster2.Hp_Slime);
			}
			if(normalMonster2.Hp_Slime <= 0)
			{
				normalMonster2.Hp_Slime = 0;
				System.out.println("������ ü�� : " + normalMonster2.Hp_Slime);
			}
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();

		// ������ ü���� 0���� �۰ų� ���� ���
		if (normalMonster2.Hp_Slime <= 0) {
			
			try {
				System.out.println("");
				System.out.println("�������� �׾����ϴ�.");
				System.out.println("���Ͱ��" + normalMonster2.Gold + "�� ȹ���ϼ̽��ϴ�.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
				thief.Gold += normalMonster2.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			k_Attack.Stop();
			break;
		}
		motion.Slime_Attack();
		tower1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/������.wav", +6.0f);
		
		try {
			System.out.println("");
			System.out.println("�������� �����Դϴ�.");
			thief.Attacked(normalMonster.Attack());
			System.out.println(creature.Name + " ü�� : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "�� �׾����ϴ�.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
	} else if (Num3_2 == 2 && thief.Mp >= 30) {
		
		motion.T_Attack_Skill1();
		k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/������.wav");
		
		try {
			System.out.println("");
			System.out.println(creature.Name + "�� �����Դϴ�.");
			normalMonster2.Attacked_Slime(thief.Skill());
			if(normalMonster2.Hp_Slime > 0)
			{
				System.out.println("������ ü�� : " + normalMonster2.Hp_Slime);
			}
			if(normalMonster2.Hp_Slime <= 0)
			{
				normalMonster2.Hp_Slime = 0;
				System.out.println("������ ü�� : " + normalMonster2.Hp_Slime);
			}
			
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		

		// ������ ü���� 0���� �۰ų� ���� ���
		if (normalMonster2.Hp_Slime <= 0) {
			try {
				System.out.println("");
				System.out.println("�������� �׾����ϴ�.");
				System.out.println("���Ͱ��" + normalMonster2.Gold + "�� ȹ���ϼ̽��ϴ�.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
				thief.Gold += normalMonster2.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			k_Attack.Stop();
			break;
		}
		motion.Slime_Attack();
		tower1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/������.wav", +6.0f);
		
		try {
			System.out.println("");
			System.out.println("�������� �����Դϴ�.");
			thief.Attacked(normalMonster.Attack());
			System.out.println(creature.Name + " ü�� : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "�� �׾����ϴ�.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
	}
	else if (Num3_2 == 2 && thief.Mp < 30)
	{
		System.out.println("������ �����մϴ�.");
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
				System.out.println(creature.Name + "�� �����Դϴ�.");
				normalMonster2.Attacked_Slime(thief.Attack());
				if(normalMonster2.Hp_Slime > 0)
				{
					System.out.println("������ ü�� : " + normalMonster2.Hp_Slime);
				}
				if(normalMonster2.Hp_Slime <= 0)
				{
					normalMonster2.Hp_Slime = 0;
					System.out.println("������ ü�� : " + normalMonster2.Hp_Slime);
				}

				//������ ü���� 0���� �۰ų� ���� ���				
				if(normalMonster2.Hp_Slime<=0)
				{	
					try {
						System.out.println("");
						System.out.println("�������� �׾����ϴ�.");
						System.out.println("���Ͱ��"+normalMonster2.Gold+"�� ȹ���ϼ̽��ϴ�.");
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
				System.out.println("�������� �����Դϴ�.");
				thief.Attacked(normalMonster.Attack());
				System.out.println(creature.Name+" ü�� : "+thief.Hp);
				System.out.println("");
				if(thief.Hp <=0)
				{	System.out.println("");
					System.out.println(creature.Name+"�� �׾����ϴ�.");
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
		System.out.println("�߸������̽��ϴ�.");
	}
}

System.out.println("");
motion.Skeleton();
System.out.println("���̷��� ����!!");
System.out.println("");
normalMonster2.Skeleton();
System.out.println("");
System.out.println("######################");

while (true) { // ���� �ݺ�
	System.out.println("1. �����ϱ� / 2. ��ų��� / 3. ��ȯ�� ����â / 4. ���� ����â / 5.�ڵ� ����");
	int Num3_2 = 0;
	try {
		Num3_2 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Num3_2 == 1) {
		
		motion.T_Attack();
		k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�������Ҹ�2.wav");
		try {
			System.out.println("");
			System.out.println(creature.Name + "�� �����Դϴ�.");
			normalMonster2.Attacked_Skeleton(thief.Attack());
			if(normalMonster2.Hp_Skeleton > 0)
			{
				System.out.println("���̷��� ü�� : " + normalMonster2.Hp_Skeleton);
			}
			if(normalMonster2.Hp_Skeleton <= 0)
			{
				normalMonster2.Hp_Skeleton = 0;
				System.out.println("���̷��� ü�� : " + normalMonster2.Hp_Skeleton);
			}
			
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}k_Attack.Stop();
		

		// ������ ü���� 0���� �۰ų� ���� ���
		if (normalMonster2.Hp_Skeleton <= 0) {
			
			try {
				System.out.println("");
				System.out.println("���̷����� �׾����ϴ�.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
				System.out.println("���Ͱ��" + normalMonster2.Gold + "�� ȹ���ϼ̽��ϴ�.");
				thief.Gold += normalMonster2.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			break;
		}
		motion.Skeleton_Attack();
		tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���̷���.wav");
		
		try {
			System.out.println("");
			System.out.println("���̷����� �����Դϴ�.");
			System.out.println("");
			thief.Attacked(normalMonster.Attack());
			System.out.println(creature.Name + " ü�� : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "�� �׾����ϴ�.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
	} else if (Num3_2 == 2 && thief.Mp >= 30) {
		
		motion.T_Attack_Skill1();
		k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/������.wav");
		
		try {
			System.out.println("");
			System.out.println(creature.Name + "�� �����Դϴ�.");
			normalMonster2.Attacked_Skeleton(thief.Skill());
			if(normalMonster2.Hp_Skeleton > 0)
			{
				System.out.println("���̷��� ü�� : " + normalMonster2.Hp_Skeleton);
			}
			if(normalMonster2.Hp_Skeleton <= 0)
			{
				normalMonster2.Hp_Skeleton = 0;
				System.out.println("���̷��� ü�� : " + normalMonster2.Hp_Skeleton);
			}
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		

		// ������ ü���� 0���� �۰ų� ���� ���
		if (normalMonster2.Hp_Skeleton <= 0) {
			try {
				System.out.println("");
				System.out.println("���̷����� �׾����ϴ�.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
				System.out.println("���Ͱ��" + normalMonster2.Gold + "�� ȹ���ϼ̽��ϴ�.");
				thief.Gold += normalMonster2.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			k_Attack.Stop();
			break;
		}
		motion.Skeleton_Attack();
		tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���̷���.wav");
		
		try {
			System.out.println("");
			System.out.println("���̷����� �����Դϴ�.");
			System.out.println("");
			thief.Attacked(normalMonster.Attack());
			System.out.println(creature.Name + " ü�� : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "�� �׾����ϴ�.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
	}
	else if (Num3_2 == 2 && thief.Mp < 30)
	{
		System.out.println("������ �����մϴ�.");
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
				System.out.println(creature.Name + "�� �����Դϴ�.");
				normalMonster2.Attacked_Skeleton(thief.Attack());
				if(normalMonster2.Hp_Skeleton > 0)
				{
					System.out.println("���̷��� ü�� : " + normalMonster2.Hp_Skeleton);
				}
				if(normalMonster2.Hp_Skeleton <= 0)
				{
					normalMonster2.Hp_Skeleton = 0;
					System.out.println("���̷��� ü�� : " + normalMonster2.Hp_Skeleton);
				}

				//������ ü���� 0���� �۰ų� ���� ���				
				if(normalMonster2.Hp_Skeleton<=0)
				{	
					try {
						System.out.println("");
						System.out.println("���̷����� �׾����ϴ�.");
						System.out.println("���Ͱ��"+normalMonster2.Gold+"�� ȹ���ϼ̽��ϴ�.");
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
				System.out.println("���̷����� �����Դϴ�.");
				thief.Attacked(normalMonster.Attack());
				System.out.println(creature.Name+" ü�� : "+thief.Hp);
				if(thief.Hp <=0)
				{	System.out.println("");
					System.out.println(creature.Name+"�� �׾����ϴ�.");
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
		System.out.println("�߸������̽��ϴ�.");
	}
}
tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���ӽ¸�.wav");
System.out.println(">>������ ž 3���� Ŭ�����ϼ̽��ϴ�!!!!");
System.out.println(">>������ ���ϴ�.");
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
	System.out.println("��..!!");
	System.out.println("��ȯ���� �ʹ� Ȥ����׳׿� ..");
	System.out.println("��ȯ���� �Ƿΰ� �׿� �׾����ϴ�.");
	System.out.println("");
	System.out.println("Game Over");
	return;
}

System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
Top3.Stop();
System.out.println("");
System.out.println("����������������������������");
System.out.println("\t �ε���");
for(int i = 0 ; i<20; i++)
{
	
	System.out.print("��");
	
	try {
		Thread.sleep(100);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}

System.out.println("");
System.out.println("");
Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");

while (true) {
	System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
	System.out.println("1. ����â  / 2. ����  / 3. ����  / 4. ������ž"); // �������� �̵����
	System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
	int Floor3 = 0;
	try {
		Floor3 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Floor3 == 1) // ����â
	{
		Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����â2.wav");
		System.out.println("");

		thief.thief();
		System.out.println("1. �ڷΰ���");
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
			System.out.println("�߸������̽��ϴ�.");
		}
	} else if (Floor3 == 2) // ����
	{
		Town1.Stop();
		Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����3.wav");
		Store store = new Store();
		store.Thi_sto(thief);
		Town.Stop();
		Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
	}

	else if (Floor3 == 3) // ����
	{
		Town1.Stop();
		Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����2.wav");
		Inn Inn = new Inn();
		Inn.Thi_in(thief);
		Town.Stop();
		Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
	} else if (Floor3 == 4) // ������ ž
	{
		System.out.println("������ ž ���������� ���ϴ�.");
		System.out.println("������ ���� �� ��� �غ�� ��ġ�̳���?");
		System.out.println("1. �� / 2. �ƴϿ�");
		System.out.println("");
		System.out.println("�������������������  ");
		System.out.println("���� �Ƿε� : "+thief.Fatigue);
		System.out.println("������������������� ");
		
		
		int Floor3_1 = 0;
		try {
			Floor3_1 = scan.nextInt();
		} catch (Exception e) {
			
			scan = new Scanner(System.in);
			
			System.out.println("");
		}
		if (Floor3_1 == 1) {
			System.out.println("�˰ڽ��ϴ�. ������ž���� �̵��ϰڽ��ϴ�.");
			break;
		}

		else if (Floor3_1 == 2) {
			System.out.println("������ ���ư��ϴ�. �������ּ���");
			System.out.println("");
		}

	}

	else {
		System.out.println("�߸������̽��ϴ�.");
	}
}

Town1.Stop();

System.out.println("");
System.out.println("����������������������������");
System.out.println("\t �ε���");
for(int i = 0 ; i<20; i++)
{
	
	System.out.print("��");
	
	try {
		Thread.sleep(100);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}
System.out.println("");
System.out.println("");
Top2.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Dungeon-03.wav");

System.out.println("");
System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
System.out.println("");
System.out.println("������ ž 4��");
System.out.println("");
System.out.println(">>�߰������Դϴ�.");
System.out.println(">>�߰������� ��ġ��� 2����ų�� �����ֽ��ϴ�.");
System.out.println("");
System.out.println("");
MediumBoss2 mediumBoss2 = new MediumBoss2();// �߰����� Ŭ���� �ҷ�����

motion.Envoy();
System.out.println("");
System.out.println("���� ����!!");
System.out.println("");
mediumBoss2.Envoy();
System.out.println("");
System.out.println("######################");

while (true) { // ���� �ݺ�
	System.out.println("1. �����ϱ� / 2. ��ų��� / 3. ��ȯ�� ����â / 4. ���� ����â");
	int Battle_Envoy = 0;
	try {
		Battle_Envoy = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Battle_Envoy == 1) {
		motion.T_Attack();
		k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�������Ҹ�2.wav");
		
		try {
			System.out.println("");
			System.out.println(creature.Name + "�� �����Դϴ�.");
			mediumBoss2.Attacked_Envoy(thief.Attack());
			if(mediumBoss2.Hp > 0)
			{
				System.out.println("���� ü�� : " + mediumBoss2.Hp);
			}
			if(mediumBoss2.Hp <= 0)
			{
				mediumBoss2.Hp = 0;
				System.out.println("���� ü�� : " + mediumBoss2.Hp);
			}
			
			Thread.sleep(1500);						
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		
		// ������ ü���� 0���� �۰ų� ���� ���
		if (mediumBoss2.Hp <= 0) {
			
			try {
				System.out.println("");
				System.out.println("���డ �׾����ϴ�.");
				System.out.println("���Ͱ��" + mediumBoss2.Gold + "�� ȹ���ϼ̽��ϴ�.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
				thief.Gold += mediumBoss2.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			k_Attack.Stop();
			break;
		}
		motion.Envoy_Attack();
		tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����.wav");
		
		try {
			System.out.println("");
			System.out.println("������ �����Դϴ�.");
			thief.Attacked(mediumBoss2.Attack());
			System.out.println(creature.Name + " ü�� : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "�� �׾����ϴ�.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
	} else if (Battle_Envoy == 2 && thief.Mp >= 30)

	{
		motion.T_Attack_Skill1();
		k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/������.wav");
		
		try {
			System.out.println("");
			System.out.println(creature.Name + "�� �����Դϴ�.");
			mediumBoss2.Attacked_Envoy(thief.Skill());
			if(mediumBoss2.Hp > 0)
			{
				System.out.println("���� ü�� : " + mediumBoss2.Hp);
			}
			if(mediumBoss2.Hp <= 0)
			{
				mediumBoss2.Hp = 0;
				System.out.println("���� ü�� : " + mediumBoss2.Hp);
			}
			
			
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();

		// ������ ü���� 0���� �۰ų� ���� ���
		if (mediumBoss2.Hp <= 0) {
			try {
				System.out.println("");
				System.out.println("���డ �׾����ϴ�.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
				System.out.println("���Ͱ��" + mediumBoss2.Gold + "�� ȹ���ϼ̽��ϴ�.");
				thief.Gold += mediumBoss2.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			k_Attack.Stop();
			
			
			break;
		}
		motion.Envoy_Attack();
		tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����.wav");
		try {
			System.out.println("");
			System.out.println("������ �����Դϴ�.");
			thief.Attacked(mediumBoss2.Attack());
			System.out.println(creature.Name + " ü�� : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "�� �׾����ϴ�.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
		
	}
	else if (Battle_Envoy == 2 && thief.Mp < 30)
	{
		System.out.println("������ �����մϴ�.");
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
		System.out.println("�߸������̽��ϴ�.");
	}
}
tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���ӽ¸�.wav");
try {
	System.out.println(">>����ؿ� !! �߰������� ����Ʈ���̾��!!");
	System.out.println(">>�߰������� ����Ʈ���� ��ų�� ���̽��ϴ�.");
	System.out.println("");
	Thread.sleep(3000);
	tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��ųȿ����.wav");
	System.out.println("2����ų ���ܸ����� �����!!");
	System.out.println("");
	thief.Skill2 = "���ܸ���";
	System.out.println(">>������ ���ư��ϴ�.");
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
	System.out.println("��..!!");
	System.out.println("��ȯ���� �ʹ� Ȥ����׳׿� ..");
	System.out.println("��ȯ���� �Ƿΰ� �׿� �׾����ϴ�.");
	System.out.println("");
	System.out.println("Game Over");
	return;
}

Top2.Stop();
System.out.println("");
System.out.println("����������������������������");
System.out.println("\t �ε���");
for(int i = 0 ; i<20; i++)
{
	
	System.out.print("��");
	
	try {
		Thread.sleep(100);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}
System.out.println("");
System.out.println("");
Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");

while (true) {
	System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
	System.out.println("1. ����â  / 2. ����  / 3. ����  / 4. ������ž"); // �������� �̵����
	System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
	int Floor5_1 = 0;
	try {
		Floor5_1 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Floor5_1 == 1) // ����â
	{
		Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����â2.wav");
		System.out.println("");

		thief.thief();
		System.out.println("1. �ڷΰ���");
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
			System.out.println("�߸������̽��ϴ�.");
		}
		
	} else if (Floor5_1 == 2) // ����
	{
		Town1.Stop();
		Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����3.wav");
		Store store = new Store();
		store.Thi_sto(thief);
		Town.Stop();
		Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
		
	} else if (Floor5_1 == 3) // ����
	{
		Town1.Stop();
		Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����2.wav");
		Inn Inn = new Inn();
		Inn.Thi_in(thief);
		Town.Stop();
		Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
	} else if (Floor5_1 == 4) // ������ ž
	{
		System.out.println("������ ž ���������� ���ϴ�.");
		System.out.println("������ ���� �� ��� �غ�� ��ġ�̳���?");
		System.out.println("1. �� / 2. �ƴϿ�");
		System.out.println("");
		System.out.println("�������������������  ");
		System.out.println("���� �Ƿε� : "+thief.Fatigue);
		System.out.println("������������������� ");
		
		
		int Floor5_2 = 0;
		try {
			Floor5_2 = scan.nextInt();
		} catch (Exception e) {
			
			scan = new Scanner(System.in);
			
			System.out.println("");
		}
		if (Floor5_2 == 1) {
			System.out.println("�˰ڽ��ϴ�. ������ž���� �̵��ϰڽ��ϴ�.");
			break;
		}

		else if (Floor5_2 == 2) {
			System.out.println("������ ���ư��ϴ�. �������ּ���");
			System.out.println("");
		}

	}

	else {
		System.out.println("�߸������̽��ϴ�.");
	}

}

Town1.Stop();
System.out.println("");
System.out.println("����������������������������");
System.out.println("\t �ε���");
for(int i = 0 ; i<20; i++)
{
	
	System.out.print("��");
	
	try {
		Thread.sleep(100);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}
System.out.println("");
System.out.println("");
Media Top5 = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);
Top5.setDaemon(true);

Top5.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Final-Boss.wav");


System.out.println("");
System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
System.out.println("");
System.out.println("������ ž 5��");
System.out.println("");
System.out.println("���� ������ 5������ ���̱���!!");
System.out.println(">>���������Դϴ�.");
System.out.println(">>���������� ��ġ��� ������������ ���ư����־��!!");

FinalBoss finalBoss = new FinalBoss();// �߰����� Ŭ���� �ҷ�����
motion.Devil();
System.out.println("");
System.out.println("���� ����!!");
System.out.println("");
finalBoss.Devil();
System.out.println("");
System.out.println("######################");

while (true) { // ���� �ݺ�
	System.out.println("1. �����ϱ� / 2. 1����ų��� / 3. 2����ų��� / 4. ��ȯ�� ����â / 5. ���� ����â");
	int Battle_Devil = 0;
	try {
		Battle_Devil = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Battle_Devil == 1) {
		motion.T_Attack();
		k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�������Ҹ�2.wav");
		
		try {
			System.out.println("");
			System.out.println(creature.Name + "�� �����Դϴ�.");
			finalBoss.Attacked_Devil(thief.Attack());
			if(finalBoss.Hp > 0)
			{
				System.out.println("���� ü�� : " + finalBoss.Hp);
			}
			if(finalBoss.Hp <= 0)
			{
				finalBoss.Hp = 0;
			System.out.println("���� ü�� : " + finalBoss.Hp);
			}
			
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		

		// ������ ü���� 0���� �۰ų� ���� ���
		if (finalBoss.Hp <= 0) {
			try {
				System.out.println("");
				System.out.println("������ �׾����ϴ�.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
				
				System.out.println("���Ͱ��" + finalBoss.Gold + "�� ȹ���ϼ̽��ϴ�.");
				thief.Gold += finalBoss.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			k_Attack.Stop();
			break;
		}
		tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���հ���2.wav");
		motion.Devil_Attack();
		
		
		
		try {
			System.out.println("");
			System.out.println("������ �����Դϴ�.");
			thief.Attacked(finalBoss.Attack());
			System.out.println(creature.Name + " ü�� : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "�� �׾����ϴ�.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
	} else if (Battle_Devil == 2 && thief.Mp >= 30)

	{
		motion.T_Attack_Skill1();
		k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/������.wav");
		
		try {
			System.out.println("");
			System.out.println(creature.Name + "�� �����Դϴ�.");
			finalBoss.Attacked_Devil(thief.Skill());
			if(finalBoss.Hp > 0)
			{
				System.out.println("���� ü�� : " + finalBoss.Hp);
			}
			if(finalBoss.Hp <= 0)
			{
				finalBoss.Hp = 0;
			System.out.println("���� ü�� : " + finalBoss.Hp);
			}
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
	

		// ������ ü���� 0���� �۰ų� ���� ���
		if (finalBoss.Hp <= 0) {
			try {
				System.out.println("");
				System.out.println("������ �׾����ϴ�.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
				
				System.out.println("���Ͱ��" + finalBoss.Gold + "�� ȹ���ϼ̽��ϴ�.");
				thief.Gold += finalBoss.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			k_Attack.Stop();
			break;
		}
		tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���հ���2.wav");
		motion.Devil_Attack();
		
		
		
		try {
			System.out.println("");
			System.out.println("������ �����Դϴ�.");
			thief.Attacked(finalBoss.Attack());
			System.out.println(creature.Name + " ü�� : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "�� �׾����ϴ�.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
		

	} else if (Battle_Devil == 3 && thief.Mp >= 50)

	{	
		
		motion.T_Attack_Skill2();
		k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�ϰ�.wav");
		
		try {
			System.out.println("");
			System.out.println(creature.Name + "�� �����Դϴ�.");
			finalBoss.Attacked_Devil(thief.Skill2());
			if(finalBoss.Hp > 0)
			{
				System.out.println("���� ü�� : " + finalBoss.Hp);
			}
			if(finalBoss.Hp <= 0)
			{
				finalBoss.Hp = 0;
			System.out.println("���� ü�� : " + finalBoss.Hp);
			}
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		

		// ������ ü���� 0���� �۰ų� ���� ���
		if (finalBoss.Hp <= 0) {
			try {
				System.out.println("");
				System.out.println("������ �׾����ϴ�.");
				k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
				
				System.out.println("���Ͱ��" + finalBoss.Gold + "�� ȹ���ϼ̽��ϴ�.");
				thief.Gold += finalBoss.Gold;
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			k_Attack.Stop();
			break;
		}
		tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���հ���2.wav");
		motion.Devil_Attack();
		
		
		
		try {
			System.out.println("");
			System.out.println("������ �����Դϴ�.");
			thief.Attacked(finalBoss.Attack());
			System.out.println(creature.Name + " ü�� : " + thief.Hp);
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		tower1.Stop();
		if (thief.Hp <= 0) {
			System.out.println("");
			System.out.println(creature.Name + "�� �׾����ϴ�.");
			System.out.println("");
			System.out.println("Game Over");
			return;
		}
	}
	else if (Battle_Devil == 2 && thief.Mp < 30)
	{
		System.out.println("������ �����մϴ�.");
		System.out.println("");
	}
	else if (Battle_Devil == 3 && thief.Mp < 50)
	{
		System.out.println("������ �����մϴ�.");
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
		System.out.println("�߸�"
				+ "�����̽��ϴ�.");
	}
}

tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���ӽ¸�.wav");

System.out.println();
System.out.println("");
System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
System.out.println("");
System.out.println("");
System.out.println(">> ������� Ŭ�����ϼ̱��� !! ���� �س��� �� �Ƽ̾��!");
System.out.println("");
System.out.println(">> ���� �����ִ� ����� ���ư����ֽ��ϴ�.");
System.out.println(">> ��������� ���ð� �Ǹ� �̰����� �־��� ������� ������ϴ�.");
System.out.println(">> ������ ž�� Ŭ�����ϴ��� ��������̰� , �ǰ��ϰ� �����ñ� �ٶ��Կ�!!");
System.out.println("");
try {
	Thread.sleep(3000);
} catch (Exception e) {
	// TODO: handle exception
}
tower1.Stop();
Top5.Stop();
Top5.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����.wav");
System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
System.out.println("����");
try {
	String end[] = {
			"",
			"",
			"(â���� �޻��� ���� ���ΰ��� �������.)",
			"���ΰ� : �Ͼ�~ �����.", 
			"���ΰ� : �������̿������� ����� �ȳ����� ���� �����ϰ� ���Ѱ����̾�..",
			"���ΰ� : ...",
			"���ΰ� : ���� .. �ڰ��Ͼ�µ� ���� ��ó�����ֳ�. ",
			"(�帴�� ����� ���� ��������..)",
			"(" +creature.Name + " : ..!!)",
			"���ΰ� : " + creature.Name + "��.. ���� �ͼ��� ������ ���.. ",
			"���ΰ� : ....",
			"���ΰ� : ���� �𸣰ڴ�..", 
			"���ΰ� : ��! ���� �ð��� !! �б� �����ϰڴ� ���� �غ��ؾ���!",
			"...",
			"",
			"",
			"******************************************",
			"",
			"\t ������ �÷��� ���ּż� �����մϴ�~!",
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
			System.out.print("�ü�");

			System.out.println(" ��ȯ���� �����ϼ̱���. ");
			System.out.println("");
			System.out.println("��ȯ���� �̸��� �����ּ���. ");

			creature.Name = scan.next();

			System.out.println(creature.Name + " ��ȯ���� �����Ͽ� ������ Ŭ�����ϼ��� !!");
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");
			clearScreen();
			String Prolog[] = {
					"���ѷα�",
					"",
					"�ءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءء�",
					"�ءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءء�",
					"",
					"���ΰ� : ...!?",
					"���ΰ� : ���Ⱑ �����..?",
					"���ΰ� : �� �и� ������ ���� �ڰ� �־��µ�..?",
					"���ΰ� : ���� ���ΰ� ?",
					"���ΰ� : (���� �����´�)",
					"���ΰ� : �ƾ�!.. ���� �ƴѵ���",
					"",
					">>�ȳ��ϼ��� ����� �̼����� ���ΰ� �Դϴ�.",
					"",
					"���ΰ� : !? ��� �鸮�°���?",
					"",
					">>������ ž������ �� ���͸� �����߸��� ������������ �������.",
					">>�׷��� ����� ���� ����� ���� ���� �ֽ��ϴ�.",
					"",
					"���ΰ� : ..? ���� ���Ⱑ �̼�����?",
					">> �������� ���� ��� ���� ��ȯ���� �����̴ϴ�. ��ȯ���� �����Ͽ� ���������� �����߸�����!!",
					"(���⼭ �� �� ��ȯ�� ����)",
					"",
					creature.Name + " : ��",
					"���ΰ� : �̰��� ��ȯ���ΰ�..?",
					"���ΰ� : �ϴ� ������ ž�� ������.",
					"",
					"�ءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءء�",
					"�ءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءءء�",
					""
					};
			MyThread t3 = new MyThread(Prolog, 100);
			Thread r3 = new Thread(t3);		
			r3.start();

try {
r3.join();
System.out.println("������ ž���� ���ðڽ��ϱ� ?");
System.out.println("1. ���� / 2. �Ȱ���");
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
System.out.println("�غ�ǽǶ����� ��ٸ��ڽ��ϴ�.");
System.out.println("");
System.out.println("������ ž���� ���ðڽ��ϱ� ?");
System.out.println("1. ���� / 2. �Ȱ���");
}
else
{
System.out.println("�߸������̽��ϴ�.");
System.out.println("");
}
}
Title.Stop();
System.out.println("");
System.out.println("����������������������������");
System.out.println("\t �ε���");
for(int i = 0 ; i<20; i++)
{

System.out.print("��");

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
Media Top1 = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);

Top1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Dungeon-01.wav", +6.0f);

System.out.println("");
System.out.println("������ ž 1��");
System.out.println("");
System.out.println(">>������ ž 1���Դϴ�.");
System.out.println(">>�ʹݿ� �⺻�������� ���͸� �����ϰ� �߹ݿ� ��ų�� ���� �ֽ��ϴ�.");
System.out.println(">>���͸� ��� �����ϰ� ������ Ŭ�����ϼ��� !!");
Archer archer = new Archer(); // �ü� Ŭ���� �ν��Ͻ� ����
NormalMonster normalMonster = new NormalMonster();//�븻���� Ŭ���� �ҷ�����
System.out.println("");
motion.Bat();
archer.Power+=10; // �ҼӼ� ���ݷ� ����
System.out.println("�������!!");
System.out.println("");
normalMonster.Bat();
System.out.println("");
System.out.println("######################");

Media k_Attack = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);
Media tower1 = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);
while(true) { //���� �ݺ�
System.out.println("1. �����ϱ� / 2. ��ȯ�� ����â / 3. ���� ����â / 4. �ڵ� ����");
int Battle_Bat = 0;
try {
	Battle_Bat = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}

if(Battle_Bat == 1)
	
{	motion.A_Attack();


k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/ȭ��2.wav");

	try {
		System.out.println("");
		System.out.println(creature.Name+"�� �����Դϴ�.");
		normalMonster.Attacked_Bat(archer.Attack());
		if(normalMonster.Hp_Bat > 0)
		{
		System.out.println("���� ü�� : "+normalMonster.Hp_Bat);
		}
		if(normalMonster.Hp_Bat <= 0)
		{
			normalMonster.Hp_Bat = 0;
		System.out.println("���� ü�� : "+normalMonster.Hp_Bat);
		}
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
k_Attack.Stop();

	//������ ü���� 0���� �۰ų� ���� ���				
	if(normalMonster.Hp_Bat<=0)
	{	try {
		System.out.println("");
		System.out.println("���㰡 �׾����ϴ�.");
		k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
		System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
		archer.Gold+=normalMonster.Gold;
		Thread.sleep(2000);
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();	
		break;
	}
	motion.Bat_Attack();


	tower1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����.wav", +6.0f);
	try {
		System.out.println("");
		System.out.println("������ �����Դϴ�.");
		archer.Attacked(normalMonster.Attack());
		System.out.println(creature.Name+" ü�� : "+archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if(archer.Hp <=0)
	{	System.out.println("");
		System.out.println(creature.Name+"�� �׾����ϴ�.");
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
			System.out.println(creature.Name+"�� �����Դϴ�.");
			normalMonster.Attacked_Bat(archer.Attack());
			if(normalMonster.Hp_Bat > 0)
			{
			System.out.println("���� ü�� : "+normalMonster.Hp_Bat);
			}
			if(normalMonster.Hp_Bat <= 0)
			{
				normalMonster.Hp_Bat = 0;
			System.out.println("���� ü�� : "+normalMonster.Hp_Bat);
			}

			//������ ü���� 0���� �۰ų� ���� ���				
			if(normalMonster.Hp_Bat<=0)
			{	
				try {
					System.out.println("");
					System.out.println("���㰡 �׾����ϴ�.");
					System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
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
			System.out.println("������ �����Դϴ�.");
			archer.Attacked(normalMonster.Attack());
			System.out.println(creature.Name+" ü�� : "+archer.Hp);
			System.out.println("");
			if(archer.Hp <=0)
			{	System.out.println("");
				System.out.println(creature.Name+"�� �׾����ϴ�.");
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
	System.out.println("�߸������̽��ϴ�.");
}
}

System.out.println("");
motion.Snail();
System.out.println("������ ����!!");
normalMonster.Snail();
System.out.println("");
System.out.println("######################");


while(true) {
System.out.println("1. �����ϱ� / 2. ��ȯ�� ����â / 3. ���� ����â / 4. �ڵ� ����");
int Battle_Snail = 0;
try {
	Battle_Snail = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if(Battle_Snail == 1)
	
{	motion.A_Attack();
k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/ȭ��2.wav");
try {
	System.out.println("");
	System.out.println(creature.Name+"�� �����Դϴ�.");
	normalMonster.Attacked_Snail(archer.Attack());
	if(normalMonster.Hp_Snail > 0)
	{
		System.out.println("������ ü�� : "+normalMonster.Hp_Snail);
	}
	if(normalMonster.Hp_Snail <= 0)
	{
		normalMonster.Hp_Snail = 0;
		System.out.println("������ ü�� : "+normalMonster.Hp_Snail);
	}
	Thread.sleep(1500);
} catch (Exception e) {
	// TODO: handle exception
}
k_Attack.Stop();	
	//������ ü���� 0���� �۰ų� ���� ���
	
	if(normalMonster.Hp_Snail<=0)
	{	
		try {
			System.out.println("");
			System.out.println("�����̰� �׾����ϴ�.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
			System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
			archer.Gold+=normalMonster.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		break;
	}
	
	motion.Snail_Attack();
	tower1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/������.wav", +6.0f);
	try {
		System.out.println("");
		System.out.println("�������� �����Դϴ�.");
		System.out.println("");
		archer.Attacked(normalMonster.Attack());
		System.out.println(creature.Name+" ü�� : "+archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if(archer.Hp <=0)
	{	System.out.println("");
		System.out.println(creature.Name+"�� �׾����ϴ�.");
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
			System.out.println(creature.Name+"�� �����Դϴ�.");
			normalMonster.Attacked_Snail(archer.Attack());
			if(normalMonster.Hp_Snail > 0)
			{
				System.out.println("������ ü�� : "+normalMonster.Hp_Snail);
			}
			if(normalMonster.Hp_Snail <= 0)
			{
				normalMonster.Hp_Snail = 0;
				System.out.println("������ ü�� : "+normalMonster.Hp_Snail);
			}

			//������ ü���� 0���� �۰ų� ���� ���				
			if(normalMonster.Hp_Snail<=0)
			{	
				try {
					System.out.println("");
					System.out.println("�����̰� �׾����ϴ�.");
					System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
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
			System.out.println("�������� �����Դϴ�.");
			System.out.println("");
			archer.Attacked(normalMonster.Attack());
			System.out.println(creature.Name+" ü�� : "+archer.Hp);
			System.out.println("");
			if(archer.Hp <=0)
			{	System.out.println("");
				System.out.println(creature.Name+"�� �׾����ϴ�.");
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
	System.out.println("�߸������̽��ϴ�.");
}
}

System.out.println("");
motion.Rabbit();
System.out.println("�䳢 ����!!");
normalMonster.Rabbit();
System.out.println("");
System.out.println("######################");


while(true) {
System.out.println("1. �����ϱ� / 2. ��ȯ�� ����â / 3. ���� ����â / 4. �ڵ� ����");
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
	k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/ȭ��2.wav");
	try {
		System.out.println("");
		System.out.println(creature.Name+"�� �����Դϴ�.");
		normalMonster.Attacked_Rabbit(archer.Attack());
		if(normalMonster.Hp_Rabbit > 0)
		{
			System.out.println("�䳢 ü�� : "+normalMonster.Hp_Rabbit);
		}
		if(normalMonster.Hp_Rabbit <= 0)
		{
			normalMonster.Hp_Rabbit = 0;
			System.out.println("�䳢 ü�� : "+normalMonster.Hp_Rabbit);
		}
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();
	//������ ü���� 0���� �۰ų� ���� ���
	
	if(normalMonster.Hp_Rabbit<=0)
	{	
		try {
			System.out.println("");
			System.out.println("�䳢�� �׾����ϴ�.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
			System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
			archer.Gold+=normalMonster.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		break;
	}
	
	motion.Rabbit_Attack();
	tower1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�䳢.wav", +6.0f);
	try {
		System.out.println("");
		System.out.println("�䳢�� �����Դϴ�.");
		System.out.println("");
		archer.Attacked(normalMonster.Attack());
		System.out.println(creature.Name+" ü�� : "+archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if(archer.Hp <=0)
	{	System.out.println("");
		System.out.println(creature.Name+"�� �׾����ϴ�.");
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
			System.out.println(creature.Name+"�� �����Դϴ�.");
			normalMonster.Attacked_Rabbit(archer.Attack());
			if(normalMonster.Hp_Rabbit > 0)
			{
				System.out.println("�䳢 ü�� : "+normalMonster.Hp_Rabbit);
			}
			if(normalMonster.Hp_Rabbit <= 0)
			{
				normalMonster.Hp_Rabbit = 0;
				System.out.println("�䳢 ü�� : "+normalMonster.Hp_Rabbit);
			}

			//������ ü���� 0���� �۰ų� ���� ���				
			if(normalMonster.Hp_Rabbit<=0)
			{	
				try {
					System.out.println("");
					System.out.println("�䳢�� �׾����ϴ�.");
					System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
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
			System.out.println("�䳢�� �����Դϴ�.");
			archer.Attacked(normalMonster.Attack());
			System.out.println(creature.Name+" ü�� : "+archer.Hp);
			System.out.println("");
			if(archer.Hp <=0)
			{	System.out.println("");
				System.out.println(creature.Name+"�� �׾����ϴ�.");
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
	System.out.println("�߸������̽��ϴ�.");
}
}

System.out.println("");
System.out.println("");
archer.Fatigue += 40;
tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���ӽ¸�.wav");
System.out.println(">>������ ž 1���� Ŭ�����ϼ̽��ϴ�!!!!");
System.out.println(">>������ ���ϴ�.");
System.out.println("");
try {
Thread.sleep(3000);
} catch (Exception e) {
// TODO: handle exception
}
tower1.Stop();
archer.Hp = 100;

Weapon weapon = new Weapon(); // ���� Ŭ���� ��ü����
Armor armor = new Armor(); // �Ƹ� Ŭ���� ��ü����
Top1.Stop();
System.out.println("");
System.out.println("����������������������������");
System.out.println("\t �ε���");
for(int i = 0 ; i<20; i++)
{

System.out.print("��");

try {
	Thread.sleep(100);
} catch (Exception e) {
	// TODO: handle exception
}

}

Media Town = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);
Town.setDaemon(true);
System.out.println("");
System.out.println("");
Media Town1 = new Media(); //���� bgm

Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");

System.out.println("������������������������������������������");
System.out.println("\t\t\t �����򸻣�");
System.out.println("");
System.out.println("1. ����â���� ��ȯ���� ���¸� Ȯ���� �� �ֽ��ϴ�.");
System.out.println("");
System.out.println("2. ���������� �������� ȹ���� ��带 �̿��Ͽ� ����� ���� �����Ҽ��ֽ��ϴ�.");
System.out.println("");
System.out.println("3. ���������� �Ƿε��� ȸ�� �Ҽ��ֽ��ϴ�.");
System.out.println("      �Ƿε��� 100�� ������� �й��ϰԵǴ� �����ϼ��� !!");
System.out.println("");
System.out.println("4. ����غ� �������� ������ž ���������� ���ø� �˴ϴ�.");
System.out.println("������������������������������������������");
System.out.println("");
System.out.println("");
System.out.println("");
while (true) {
System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
System.out.println("1. ����â  / 2. ����  / 3. ����  / 4. ������ž"); // �������� �̵����
System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
int Floor2 = 0;
try {
	Floor2 = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if (Floor2 == 1) // ����â
{
	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����â2.wav");
	System.out.println("");

	archer.archer();
	System.out.println("1. �ڷΰ���");
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
		System.out.println("�߸������̽��ϴ�.");
	}
} else if (Floor2 == 2) // ����
{	Town1.Stop();
	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����3.wav");
	Store store = new Store();
	store.Arc_sto(archer);
	Town.Stop();
	Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
}

else if (Floor2 == 3) // ����
{	Town1.Stop();
	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����2.wav");
	Inn Inn = new Inn();
	Inn.Arc_in(archer);
	Town.Stop();
	Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
} else if (Floor2 == 4) // ������ ž
{
	System.out.println("������ ž ���������� ���ϴ�.");
	System.out.println("������ ���� �� ��� �غ�� ��ġ�̳���?");
	System.out.println("1. �� / 2. �ƴϿ�");
	System.out.println("");
	System.out.println("�������������������  ");
	System.out.println("���� �Ƿε� : "+archer.Fatigue);
	System.out.println("������������������� ");
	
	
	int Floor2_1 = 0;
	try {
		Floor2_1 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Floor2_1 == 1) {
		System.out.println("�˰ڽ��ϴ�. ������ž���� �̵��ϰڽ��ϴ�.");
		break;
	}

	else if (Floor2_1 == 2) {
		System.out.println("������ ���ư��ϴ�. �������ּ���");
		System.out.println("");
	}

}

else {
	System.out.println("�߸������̽��ϴ�.");
}
}

Town1.Stop();
System.out.println("");
System.out.println("����������������������������");
System.out.println("\t �ε���");
for(int i = 0 ; i<20; i++)
{

System.out.print("��");

try {
	Thread.sleep(100);
} catch (Exception e) {
	// TODO: handle exception
}

}
System.out.println("");
System.out.println("");
Media Top2 = new Media(); //���� bgm


Top2.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Dungeon-03.wav");

System.out.println("");
System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
System.out.println("");
System.out.println("������ ž 2��");
System.out.println("");
System.out.println(">>2���� 4���� �߰������� �����մϴ�.");
System.out.println(">>�߰������� ����� ��ų�� ���� �� �ֽ��ϴ�.");

MediumBoss mediumBoss = new MediumBoss();// �߰����� Ŭ���� �ҷ�����

System.out.println("");
motion.Ogre();
System.out.println("����� ����!!");
System.out.println("");
mediumBoss.Ogre();
System.out.println("");
System.out.println("######################");

while (true) { // ���� �ݺ�
System.out.println("1. �����ϱ� / 2. ��ȯ�� ����â / 3. ���� ����â");
int Battle_Ogre = 0;
try {
	Battle_Ogre = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if (Battle_Ogre == 1) {
	
	motion.A_Attack();
	k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/ȭ��2.wav");
	
	try {
		System.out.println("");
		System.out.println(creature.Name + "�� �����Դϴ�.");
		mediumBoss.Attacked_Ogre(archer.Attack());
		if(mediumBoss.Hp > 0)
		{
			System.out.println("����� ü�� : " + mediumBoss.Hp);
		}
		if(mediumBoss.Hp <= 0)
		{
			mediumBoss.Hp = 0;
			System.out.println("����� ü�� : " + mediumBoss.Hp);
		}
		
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();

	// ������ ü���� 0���� �۰ų� ���� ���
	if (mediumBoss.Hp <= 0) {
		try {
			System.out.println("");
			System.out.println("����Ű� �׾����ϴ�.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
			System.out.println("���Ͱ��" + mediumBoss.Gold + "�� ȹ���ϼ̽��ϴ�.");
			archer.Gold += mediumBoss.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		break;
	}
	motion.Ogre_Attack();
	tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����2.wav");
	try {
		System.out.println("");
		System.out.println("������� �����Դϴ�.");
		archer.Attacked(mediumBoss.Attack());
		System.out.println(creature.Name + " ü�� : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();

	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "�� �׾����ϴ�.");
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
	System.out.println("�߸������̽��ϴ�.");
}
}
tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���ӽ¸�.wav");
try {
System.out.println(">>����ؿ� !! �߰������� ����Ʈ���̾��!!");
System.out.println(">>�߰������� ����Ʈ���� ��ų�� ���̽��ϴ�.");
System.out.println("");
Thread.sleep(3000);
tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��ųȿ����.wav");
System.out.println("1����ų ������ �����!!");
System.out.println("");
archer.Skill = "����";
System.out.println(">>������ ���ư��ϴ�.");
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
System.out.println("����������������������������");
System.out.println("\t �ε���");
for(int i = 0 ; i<20; i++)
{

System.out.print("��");

try {
	Thread.sleep(100);
} catch (Exception e) {
	// TODO: handle exception
}

}
System.out.println("");
System.out.println("");

Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
while (true) {
System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
System.out.println("1. ����â  / 2. ����  / 3. ����  / 4. ������ž"); // �������� �̵����
System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
int Floor3 = 0;
try {
	Floor3 = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if (Floor3 == 1) // ����â
{	
	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����â2.wav");
	System.out.println("");

	archer.archer();
	System.out.println("1. �ڷΰ���");
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
		System.out.println("�߸������̽��ϴ�.");
	}
} else if (Floor3 == 2) // ����
{
	Town1.Stop();
	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����3.wav");
	Store store = new Store();
	store.Arc_sto(archer);
	Town.Stop();
	Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");

} else if (Floor3 == 3) // ����
{
	Town1.Stop();
	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����2.wav");
	Inn Inn = new Inn();
	Inn.Arc_in(archer);
	Town.Stop();
	Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
} else if (Floor3 == 4) // ������ ž
{
	System.out.println("������ ž ���������� ���ϴ�.");
	System.out.println("������ ���� �� ��� �غ�� ��ġ�̳���?");
	System.out.println("1. �� / 2. �ƴϿ�");
	System.out.println("");
	System.out.println("�������������������  ");
	System.out.println("���� �Ƿε� : "+archer.Fatigue);
	System.out.println("������������������� ");
	
	
	int Floor3_1 = 0;
	try {
		Floor3_1 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Floor3_1 == 1) {
		System.out.println("�˰ڽ��ϴ�. ������ž���� �̵��ϰڽ��ϴ�.");
		break;
	}

	else if (Floor3_1 == 2) {
		System.out.println("������ ���ư��ϴ�. �������ּ���");
		System.out.println("");
	}

}

else {
	System.out.println("�߸������̽��ϴ�.");
}

}
Town1.Stop();
System.out.println("");
System.out.println("����������������������������");
System.out.println("\t �ε���");
for(int i = 0 ; i<20; i++)
{

System.out.print("��");

try {
	Thread.sleep(100);
} catch (Exception e) {
	// TODO: handle exception
}

}
System.out.println("");
System.out.println("");
Media Top3 = new Media(); //���� bgm
Top3.setDaemon(true);

Top3.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Dungeon-01.wav");

System.out.println("");
System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
System.out.println("");
System.out.println("������ ž 3��");
System.out.println("");
System.out.println(">>��ų�� �������� ��ų�� �Ϲݰ����� ������ ����ؼ� ���� ��ġ�켼��");

NormalMonster2 normalMonster2 = new NormalMonster2(); // 3�� ���� �ҷ�����

System.out.println("");
motion.Chipmunk();
System.out.println("�ٶ��� ����!!");
System.out.println("");
normalMonster2.Chipmunk();
System.out.println("");
System.out.println("######################");

while (true) { // ���� �ݺ�
System.out.println("1. �����ϱ� / 2. ��ų��� / 3. ��ȯ�� ����â / 4. ���� ����â / 5. �ڵ� ����");
int Num3_1 = 0;
try {
	Num3_1 = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if (Num3_1 == 1) {
	motion.A_Attack();
	k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/ȭ��2.wav");
	try {
		System.out.println("");
		System.out.println(creature.Name + "�� �����Դϴ�.");
		normalMonster2.Attacked_Chipmunk(archer.Attack());
		if(normalMonster2.Hp_Chipmunk > 0)
		{
			System.out.println("�ٶ��� ü�� : " + normalMonster2.Hp_Chipmunk);
		}
		if(normalMonster2.Hp_Chipmunk <= 0)
		{
			normalMonster2.Hp_Chipmunk = 0;
			System.out.println("�ٶ��� ü�� : " + normalMonster2.Hp_Chipmunk);
		}
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();

	// ������ ü���� 0���� �۰ų� ���� ���
	if (normalMonster2.Hp_Chipmunk <= 0) {
		
		try {
			System.out.println("");
			System.out.println("�ٶ��㰡 �׾����ϴ�.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
			System.out.println("���Ͱ��" + normalMonster2.Gold + "�� ȹ���ϼ̽��ϴ�.");
			archer.Gold += normalMonster2.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		break;
	}
	motion.Chipmunk_Attack();
	tower1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�ٶ���.wav", +6.0f);
	
	try {
		System.out.println("");
		System.out.println("�ٶ����� �����Դϴ�.");
		archer.Attacked(normalMonster2.Attack());
		System.out.println(creature.Name + " ü�� : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "�� �׾����ϴ�.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
} else if (Num3_1 == 2 && archer.Mp >= 30 ) {
	motion.A_Attack_Skill1();
	k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/ȭ��3.wav");
	
	try {
		System.out.println("");
		System.out.println(creature.Name + "�� �����Դϴ�.");
		normalMonster2.Attacked_Chipmunk(archer.Skill());
		if(normalMonster2.Hp_Chipmunk > 0)
		{
			System.out.println("�ٶ��� ü�� : " + normalMonster2.Hp_Chipmunk);
		}
		if(normalMonster2.Hp_Chipmunk <= 0)
		{
			normalMonster2.Hp_Chipmunk = 0;
			System.out.println("�ٶ��� ü�� : " + normalMonster2.Hp_Chipmunk);
		}
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();

	// ������ ü���� 0���� �۰ų� ���� ���
	if (normalMonster2.Hp_Chipmunk <= 0) {
		try {
			System.out.println("");
			System.out.println("�ٶ��㰡 �׾����ϴ�.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
			System.out.println("���Ͱ��" + normalMonster2.Gold + "�� ȹ���ϼ̽��ϴ�.");
			archer.Gold += normalMonster2.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		break;
	}
	motion.Chipmunk_Attack();
	tower1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�ٶ���.wav", +6.0f);
	
	try {
		System.out.println("");
		System.out.println("�ٶ����� �����Դϴ�.");
		archer.Attacked(normalMonster2.Attack());
		System.out.println(creature.Name + " ü�� : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "�� �׾����ϴ�.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
}

else if (Num3_1 == 2 && archer.Mp < 30)
{
	System.out.println("������ �����մϴ�.");
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
			System.out.println(creature.Name + "�� �����Դϴ�.");
			normalMonster2.Attacked_Chipmunk(archer.Attack());
			if(normalMonster2.Hp_Chipmunk > 0)
			{
				System.out.println("�ٶ��� ü�� : " + normalMonster2.Hp_Chipmunk);
			}
			if(normalMonster2.Hp_Chipmunk <= 0)
			{
				normalMonster2.Hp_Chipmunk = 0;
				System.out.println("�ٶ��� ü�� : " + normalMonster2.Hp_Chipmunk);
			}

			//������ ü���� 0���� �۰ų� ���� ���				
			if(normalMonster2.Hp_Chipmunk<=0)
			{	
				try {
					System.out.println("");
					System.out.println("�ٶ��㰡 �׾����ϴ�.");
					System.out.println("���Ͱ��"+normalMonster2.Gold+"�� ȹ���ϼ̽��ϴ�.");
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
			System.out.println("�ٶ����� �����Դϴ�.");
			archer.Attacked(normalMonster2.Attack());
			System.out.println(creature.Name+" ü�� : "+archer.Hp);
			System.out.println("");
			if(archer.Hp <=0)
			{	System.out.println("");
				System.out.println(creature.Name+"�� �׾����ϴ�.");
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
	System.out.println("�߸������̽��ϴ�.");
}
}
motion.Slime();
System.out.println("");
System.out.println("������ ����!!");
System.out.println("");
normalMonster2.Slime();
System.out.println("");
System.out.println("######################");

while (true) { // ���� �ݺ�
System.out.println("1. �����ϱ� / 2. ��ų��� / 3. ��ȯ�� ����â / 4. ���� ����â / 5. �ڵ� ����");
int Num3_2 = 0;
try {
	Num3_2 = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if (Num3_2 == 1) {
	
	motion.A_Attack();
	k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/ȭ��2.wav");
	
	try {
		System.out.println("");
		System.out.println(creature.Name + "�� �����Դϴ�.");
		normalMonster2.Attacked_Slime(archer.Attack());
		if(normalMonster2.Hp_Slime > 0)
		{
			System.out.println("������ ü�� : " + normalMonster2.Hp_Slime);
		}
		if(normalMonster2.Hp_Slime <= 0)
		{
			normalMonster2.Hp_Slime = 0;
			System.out.println("������ ü�� : " + normalMonster2.Hp_Slime);
		}
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();

	// ������ ü���� 0���� �۰ų� ���� ���
	if (normalMonster2.Hp_Slime <= 0) {
		
		try {
			System.out.println("");
			System.out.println("�������� �׾����ϴ�.");
			System.out.println("���Ͱ��" + normalMonster2.Gold + "�� ȹ���ϼ̽��ϴ�.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
			archer.Gold += normalMonster2.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		break;
	}
	motion.Slime_Attack();
	tower1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/������.wav", +6.0f);
	
	try {
		System.out.println("");
		System.out.println("�������� �����Դϴ�.");
		archer.Attacked(normalMonster.Attack());
		System.out.println(creature.Name + " ü�� : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "�� �׾����ϴ�.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
} else if (Num3_2 == 2 && archer.Mp >= 30) {
	
	motion.A_Attack_Skill1();
	k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/ȭ��3.wav");
	
	try {
		System.out.println("");
		System.out.println(creature.Name + "�� �����Դϴ�.");
		normalMonster2.Attacked_Slime(archer.Skill());
		if(normalMonster2.Hp_Slime > 0)
		{
			System.out.println("������ ü�� : " + normalMonster2.Hp_Slime);
		}
		if(normalMonster2.Hp_Slime <= 0)
		{
			normalMonster2.Hp_Slime = 0;
			System.out.println("������ ü�� : " + normalMonster2.Hp_Slime);
		}
		
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();
	

	// ������ ü���� 0���� �۰ų� ���� ���
	if (normalMonster2.Hp_Slime <= 0) {
		try {
			System.out.println("");
			System.out.println("�������� �׾����ϴ�.");
			System.out.println("���Ͱ��" + normalMonster2.Gold + "�� ȹ���ϼ̽��ϴ�.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
			archer.Gold += normalMonster2.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		break;
	}
	motion.Slime_Attack();
	tower1.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/������.wav", +6.0f);
	
	try {
		System.out.println("");
		System.out.println("�������� �����Դϴ�.");
		archer.Attacked(normalMonster.Attack());
		System.out.println(creature.Name + " ü�� : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "�� �׾����ϴ�.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
}
else if (Num3_2 == 2 && archer.Mp < 30)
{
	System.out.println("������ �����մϴ�.");
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
			System.out.println(creature.Name + "�� �����Դϴ�.");
			normalMonster2.Attacked_Slime(archer.Attack());
			if(normalMonster2.Hp_Slime > 0)
			{
				System.out.println("������ ü�� : " + normalMonster2.Hp_Slime);
			}
			if(normalMonster2.Hp_Slime <= 0)
			{
				normalMonster2.Hp_Slime = 0;
				System.out.println("������ ü�� : " + normalMonster2.Hp_Slime);
			}

			//������ ü���� 0���� �۰ų� ���� ���				
			if(normalMonster2.Hp_Slime<=0)
			{	
				try {
					System.out.println("");
					System.out.println("�������� �׾����ϴ�.");
					System.out.println("���Ͱ��"+normalMonster2.Gold+"�� ȹ���ϼ̽��ϴ�.");
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
			System.out.println("�������� �����Դϴ�.");
			archer.Attacked(normalMonster.Attack());
			System.out.println(creature.Name+" ü�� : "+archer.Hp);
			System.out.println("");
			if(archer.Hp <=0)
			{	System.out.println("");
				System.out.println(creature.Name+"�� �׾����ϴ�.");
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
	System.out.println("�߸������̽��ϴ�.");
}
}

System.out.println("");
motion.Skeleton();
System.out.println("���̷��� ����!!");
System.out.println("");
normalMonster2.Skeleton();
System.out.println("");
System.out.println("######################");

while (true) { // ���� �ݺ�
System.out.println("1. �����ϱ� / 2. ��ų��� / 3. ��ȯ�� ����â / 4. ���� ����â / 5.�ڵ� ����");
int Num3_2 = 0;
try {
	Num3_2 = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if (Num3_2 == 1) {
	
	motion.A_Attack();
	k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/ȭ��2.wav");
	try {
		System.out.println("");
		System.out.println(creature.Name + "�� �����Դϴ�.");
		normalMonster2.Attacked_Skeleton(archer.Attack());
		if(normalMonster2.Hp_Skeleton > 0)
		{
			System.out.println("���̷��� ü�� : " + normalMonster2.Hp_Skeleton);
		}
		if(normalMonster2.Hp_Skeleton <= 0)
		{
			normalMonster2.Hp_Skeleton = 0;
			System.out.println("���̷��� ü�� : " + normalMonster2.Hp_Skeleton);
		}
		
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}k_Attack.Stop();
	

	// ������ ü���� 0���� �۰ų� ���� ���
	if (normalMonster2.Hp_Skeleton <= 0) {
		
		try {
			System.out.println("");
			System.out.println("���̷����� �׾����ϴ�.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
			System.out.println("���Ͱ��" + normalMonster2.Gold + "�� ȹ���ϼ̽��ϴ�.");
			archer.Gold += normalMonster2.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		break;
	}
	motion.Skeleton_Attack();
	tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���̷���.wav");
	
	try {
		System.out.println("");
		System.out.println("���̷����� �����Դϴ�.");
		System.out.println("");
		archer.Attacked(normalMonster.Attack());
		System.out.println(creature.Name + " ü�� : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "�� �׾����ϴ�.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
} else if (Num3_2 == 2 && archer.Mp >= 30) {
	
	motion.A_Attack_Skill1();
	k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/ȭ��3.wav");
	
	try {
		System.out.println("");
		System.out.println(creature.Name + "�� �����Դϴ�.");
		normalMonster2.Attacked_Skeleton(archer.Skill());
		if(normalMonster2.Hp_Skeleton > 0)
		{
			System.out.println("���̷��� ü�� : " + normalMonster2.Hp_Skeleton);
		}
		if(normalMonster2.Hp_Skeleton <= 0)
		{
			normalMonster2.Hp_Skeleton = 0;
			System.out.println("���̷��� ü�� : " + normalMonster2.Hp_Skeleton);
		}
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();
	

	// ������ ü���� 0���� �۰ų� ���� ���
	if (normalMonster2.Hp_Skeleton <= 0) {
		try {
			System.out.println("");
			System.out.println("���̷����� �׾����ϴ�.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
			System.out.println("���Ͱ��" + normalMonster2.Gold + "�� ȹ���ϼ̽��ϴ�.");
			archer.Gold += normalMonster2.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		break;
	}
	motion.Skeleton_Attack();
	tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���̷���.wav");
	
	try {
		System.out.println("");
		System.out.println("���̷����� �����Դϴ�.");
		System.out.println("");
		archer.Attacked(normalMonster.Attack());
		System.out.println(creature.Name + " ü�� : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "�� �׾����ϴ�.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
}
else if (Num3_2 == 2 && archer.Mp < 30)
{
	System.out.println("������ �����մϴ�.");
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
			System.out.println(creature.Name + "�� �����Դϴ�.");
			normalMonster2.Attacked_Skeleton(archer.Attack());
			if(normalMonster2.Hp_Skeleton > 0)
			{
				System.out.println("���̷��� ü�� : " + normalMonster2.Hp_Skeleton);
			}
			if(normalMonster2.Hp_Skeleton <= 0)
			{
				normalMonster2.Hp_Skeleton = 0;
				System.out.println("���̷��� ü�� : " + normalMonster2.Hp_Skeleton);
			}

			//������ ü���� 0���� �۰ų� ���� ���				
			if(normalMonster2.Hp_Skeleton<=0)
			{	
				try {
					System.out.println("");
					System.out.println("���̷����� �׾����ϴ�.");
					System.out.println("���Ͱ��"+normalMonster2.Gold+"�� ȹ���ϼ̽��ϴ�.");
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
			System.out.println("���̷����� �����Դϴ�.");
			archer.Attacked(normalMonster.Attack());
			System.out.println(creature.Name+" ü�� : "+archer.Hp);
			if(archer.Hp <=0)
			{	System.out.println("");
				System.out.println(creature.Name+"�� �׾����ϴ�.");
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
	System.out.println("�߸������̽��ϴ�.");
}
}
tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���ӽ¸�.wav");
System.out.println(">>������ ž 3���� Ŭ�����ϼ̽��ϴ�!!!!");
System.out.println(">>������ ���ϴ�.");
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
System.out.println("��..!!");
System.out.println("��ȯ���� �ʹ� Ȥ����׳׿� ..");
System.out.println("��ȯ���� �Ƿΰ� �׿� �׾����ϴ�.");
System.out.println("");
System.out.println("Game Over");
return;
}

System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
Top3.Stop();
System.out.println("");
System.out.println("����������������������������");
System.out.println("\t �ε���");
for(int i = 0 ; i<20; i++)
{

System.out.print("��");

try {
	Thread.sleep(100);
} catch (Exception e) {
	// TODO: handle exception
}

}

System.out.println("");
System.out.println("");
Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");

while (true) {
System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
System.out.println("1. ����â  / 2. ����  / 3. ����  / 4. ������ž"); // �������� �̵����
System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
int Floor3 = 0;
try {
	Floor3 = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if (Floor3 == 1) // ����â
{
	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����â2.wav");
	System.out.println("");

	archer.archer();
	System.out.println("1. �ڷΰ���");
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
		System.out.println("�߸������̽��ϴ�.");
	}
} else if (Floor3 == 2) // ����
{
	Town1.Stop();
	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����3.wav");
	Store store = new Store();
	store.Arc_sto(archer);
	Town.Stop();
	Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
}

else if (Floor3 == 3) // ����
{
	Town1.Stop();
	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����2.wav");
	Inn Inn = new Inn();
	Inn.Arc_in(archer);
	Town.Stop();
	Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
} else if (Floor3 == 4) // ������ ž
{
	System.out.println("������ ž ���������� ���ϴ�.");
	System.out.println("������ ���� �� ��� �غ�� ��ġ�̳���?");
	System.out.println("1. �� / 2. �ƴϿ�");
	System.out.println("");
	System.out.println("�������������������  ");
	System.out.println("���� �Ƿε� : "+archer.Fatigue);
	System.out.println("������������������� ");
	
	
	int Floor3_1 = 0;
	try {
		Floor3_1 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Floor3_1 == 1) {
		System.out.println("�˰ڽ��ϴ�. ������ž���� �̵��ϰڽ��ϴ�.");
		break;
	}

	else if (Floor3_1 == 2) {
		System.out.println("������ ���ư��ϴ�. �������ּ���");
		System.out.println("");
	}

}

else {
	System.out.println("�߸������̽��ϴ�.");
}
}

Town1.Stop();

System.out.println("");
System.out.println("����������������������������");
System.out.println("\t �ε���");
for(int i = 0 ; i<20; i++)
{

System.out.print("��");

try {
	Thread.sleep(100);
} catch (Exception e) {
	// TODO: handle exception
}

}
System.out.println("");
System.out.println("");
Top2.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Dungeon-03.wav");

System.out.println("");
System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
System.out.println("");
System.out.println("������ ž 4��");
System.out.println("");
System.out.println(">>�߰������Դϴ�.");
System.out.println(">>�߰������� ��ġ��� 2����ų�� �����ֽ��ϴ�.");
System.out.println("");
System.out.println("");
MediumBoss2 mediumBoss2 = new MediumBoss2();// �߰����� Ŭ���� �ҷ�����

motion.Envoy();
System.out.println("");
System.out.println("���� ����!!");
System.out.println("");
mediumBoss2.Envoy();
System.out.println("");
System.out.println("######################");

while (true) { // ���� �ݺ�
System.out.println("1. �����ϱ� / 2. ��ų��� / 3. ��ȯ�� ����â / 4. ���� ����â");
int Battle_Envoy = 0;
try {
	Battle_Envoy = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if (Battle_Envoy == 1) {
	motion.A_Attack();
	k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/ȭ��2.wav");
	
	try {
		System.out.println("");
		System.out.println(creature.Name + "�� �����Դϴ�.");
		mediumBoss2.Attacked_Envoy(archer.Attack());
		if(mediumBoss2.Hp > 0)
		{
			System.out.println("���� ü�� : " + mediumBoss2.Hp);
		}
		if(mediumBoss2.Hp <= 0)
		{
			mediumBoss2.Hp = 0;
			System.out.println("���� ü�� : " + mediumBoss2.Hp);
		}
		
		Thread.sleep(1500);						
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();
	
	// ������ ü���� 0���� �۰ų� ���� ���
	if (mediumBoss2.Hp <= 0) {
		
		try {
			System.out.println("");
			System.out.println("���డ �׾����ϴ�.");
			System.out.println("���Ͱ��" + mediumBoss2.Gold + "�� ȹ���ϼ̽��ϴ�.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
			archer.Gold += mediumBoss2.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		break;
	}
	motion.Envoy_Attack();
	tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����.wav");
	
	try {
		System.out.println("");
		System.out.println("������ �����Դϴ�.");
		archer.Attacked(mediumBoss2.Attack());
		System.out.println(creature.Name + " ü�� : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "�� �׾����ϴ�.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
} else if (Battle_Envoy == 2 && archer.Mp >= 30)

{
	motion.A_Attack_Skill1();
	k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/ȭ��3.wav");
	
	try {
		System.out.println("");
		System.out.println(creature.Name + "�� �����Դϴ�.");
		mediumBoss2.Attacked_Envoy(archer.Skill());
		if(mediumBoss2.Hp > 0)
		{
			System.out.println("���� ü�� : " + mediumBoss2.Hp);
		}
		if(mediumBoss2.Hp <= 0)
		{
			mediumBoss2.Hp = 0;
			System.out.println("���� ü�� : " + mediumBoss2.Hp);
		}
		
		
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();

	// ������ ü���� 0���� �۰ų� ���� ���
	if (mediumBoss2.Hp <= 0) {
		try {
			System.out.println("");
			System.out.println("���డ �׾����ϴ�.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
			System.out.println("���Ͱ��" + mediumBoss2.Gold + "�� ȹ���ϼ̽��ϴ�.");
			archer.Gold += mediumBoss2.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		
		
		break;
	}
	motion.Envoy_Attack();
	tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����.wav");
	try {
		System.out.println("");
		System.out.println("������ �����Դϴ�.");
		archer.Attacked(mediumBoss2.Attack());
		System.out.println(creature.Name + " ü�� : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "�� �׾����ϴ�.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
	
}
else if (Battle_Envoy == 2 && archer.Mp < 30)
{
	System.out.println("������ �����մϴ�.");
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
	System.out.println("�߸������̽��ϴ�.");
}
}
tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���ӽ¸�.wav");
try {
System.out.println(">>����ؿ� !! �߰������� ����Ʈ���̾��!!");
System.out.println(">>�߰������� ����Ʈ���� ��ų�� ���̽��ϴ�.");
System.out.println("");
Thread.sleep(3000);
tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��ųȿ����.wav");
System.out.println("2����ų ����ȭ���� �����!!");
System.out.println("");
archer.Skill2 = "����ȭ��";
System.out.println(">>������ ���ư��ϴ�.");
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
System.out.println("��..!!");
System.out.println("��ȯ���� �ʹ� Ȥ����׳׿� ..");
System.out.println("��ȯ���� �Ƿΰ� �׿� �׾����ϴ�.");
System.out.println("");
System.out.println("Game Over");
return;
}

Top2.Stop();
System.out.println("");
System.out.println("����������������������������");
System.out.println("\t �ε���");
for(int i = 0 ; i<20; i++)
{

System.out.print("��");

try {
	Thread.sleep(100);
} catch (Exception e) {
	// TODO: handle exception
}

}
System.out.println("");
System.out.println("");
Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");

while (true) {
System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
System.out.println("1. ����â  / 2. ����  / 3. ����  / 4. ������ž"); // �������� �̵����
System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
int Floor5_1 = 0;
try {
	Floor5_1 = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if (Floor5_1 == 1) // ����â
{
	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����â2.wav");
	System.out.println("");

	archer.archer();
	System.out.println("1. �ڷΰ���");
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
		System.out.println("�߸������̽��ϴ�.");
	}
	
} else if (Floor5_1 == 2) // ����
{
	Town1.Stop();
	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����3.wav");
	Store store = new Store();
	store.Arc_sto(archer);
	Town.Stop();
	Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
	
} else if (Floor5_1 == 3) // ����
{
	Town1.Stop();
	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����2.wav");
	Inn Inn = new Inn();
	Inn.Arc_in(archer);
	Town.Stop();
	Town1.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Conversation-Parade.wav");
} else if (Floor5_1 == 4) // ������ ž
{
	System.out.println("������ ž ���������� ���ϴ�.");
	System.out.println("������ ���� �� ��� �غ�� ��ġ�̳���?");
	System.out.println("1. �� / 2. �ƴϿ�");
	System.out.println("");
	System.out.println("�������������������  ");
	System.out.println("���� �Ƿε� : "+archer.Fatigue);
	System.out.println("������������������� ");
	
	
	int Floor5_2 = 0;
	try {
		Floor5_2 = scan.nextInt();
	} catch (Exception e) {
		
		scan = new Scanner(System.in);
		
		System.out.println("");
	}
	if (Floor5_2 == 1) {
		System.out.println("�˰ڽ��ϴ�. ������ž���� �̵��ϰڽ��ϴ�.");
		break;
	}

	else if (Floor5_2 == 2) {
		System.out.println("������ ���ư��ϴ�. �������ּ���");
		System.out.println("");
	}

}

else {
	System.out.println("�߸������̽��ϴ�.");
}

}

Town1.Stop();
System.out.println("");
System.out.println("����������������������������");
System.out.println("\t �ε���");
for(int i = 0 ; i<20; i++)
{

System.out.print("��");

try {
	Thread.sleep(100);
} catch (Exception e) {
	// TODO: handle exception
}

}
System.out.println("");
System.out.println("");
Media Top5 = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);
Top5.setDaemon(true);

Top5.Music("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/Final-Boss.wav");


System.out.println("");
System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
System.out.println("");
System.out.println("������ ž 5��");
System.out.println("");
System.out.println("���� ������ 5������ ���̱���!!");
System.out.println(">>���������Դϴ�.");
System.out.println(">>���������� ��ġ��� ������������ ���ư����־��!!");

FinalBoss finalBoss = new FinalBoss();// �߰����� Ŭ���� �ҷ�����
motion.Devil();
System.out.println("");
System.out.println("���� ����!!");
System.out.println("");
finalBoss.Devil();
System.out.println("");
System.out.println("######################");

while (true) { // ���� �ݺ�
System.out.println("1. �����ϱ� / 2. 1����ų��� / 3. 2����ų��� / 4. ��ȯ�� ����â / 5. ���� ����â");
int Battle_Devil = 0;
try {
	Battle_Devil = scan.nextInt();
} catch (Exception e) {
	
	scan = new Scanner(System.in);
	
	System.out.println("");
}
if (Battle_Devil == 1) {
	motion.A_Attack();
	k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/ȭ��2.wav");
	
	try {
		System.out.println("");
		System.out.println(creature.Name + "�� �����Դϴ�.");
		finalBoss.Attacked_Devil(archer.Attack());
		if(finalBoss.Hp > 0)
		{
			System.out.println("���� ü�� : " + finalBoss.Hp);
		}
		if(finalBoss.Hp <= 0)
		{
			finalBoss.Hp = 0;
		System.out.println("���� ü�� : " + finalBoss.Hp);
		}
		
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();
	

	// ������ ü���� 0���� �۰ų� ���� ���
	if (finalBoss.Hp <= 0) {
		try {
			System.out.println("");
			System.out.println("������ �׾����ϴ�.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
			
			System.out.println("���Ͱ��" + finalBoss.Gold + "�� ȹ���ϼ̽��ϴ�.");
			archer.Gold += finalBoss.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		break;
	}
	tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���հ���2.wav");
	motion.Devil_Attack();
	
	
	
	try {
		System.out.println("");
		System.out.println("������ �����Դϴ�.");
		archer.Attacked(finalBoss.Attack());
		System.out.println(creature.Name + " ü�� : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "�� �׾����ϴ�.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
} else if (Battle_Devil == 2 && archer.Mp >= 30)

{
	motion.A_Attack_Skill1();
	k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/ȭ��3.wav");
	
	try {
		System.out.println("");
		System.out.println(creature.Name + "�� �����Դϴ�.");
		finalBoss.Attacked_Devil(archer.Skill());
		if(finalBoss.Hp > 0)
		{
			System.out.println("���� ü�� : " + finalBoss.Hp);
		}
		if(finalBoss.Hp <= 0)
		{
			finalBoss.Hp = 0;
		System.out.println("���� ü�� : " + finalBoss.Hp);
		}
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();


	// ������ ü���� 0���� �۰ų� ���� ���
	if (finalBoss.Hp <= 0) {
		try {
			System.out.println("");
			System.out.println("������ �׾����ϴ�.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
			
			System.out.println("���Ͱ��" + finalBoss.Gold + "�� ȹ���ϼ̽��ϴ�.");
			archer.Gold += finalBoss.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		break;
	}
	tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���հ���2.wav");
	motion.Devil_Attack();
	
	
	
	try {
		System.out.println("");
		System.out.println("������ �����Դϴ�.");
		archer.Attacked(finalBoss.Attack());
		System.out.println(creature.Name + " ü�� : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "�� �׾����ϴ�.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
	

} else if (Battle_Devil == 3 && archer.Mp >= 50)

{	
	
	motion.A_Attack_Skill2();
	k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�ϰ�.wav");
	
	try {
		System.out.println("");
		System.out.println(creature.Name + "�� �����Դϴ�.");
		finalBoss.Attacked_Devil(archer.Skill2());
		if(finalBoss.Hp > 0)
		{
			System.out.println("���� ü�� : " + finalBoss.Hp);
		}
		if(finalBoss.Hp <= 0)
		{
			finalBoss.Hp = 0;
		System.out.println("���� ü�� : " + finalBoss.Hp);
		}
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	k_Attack.Stop();
	

	// ������ ü���� 0���� �۰ų� ���� ���
	if (finalBoss.Hp <= 0) {
		try {
			System.out.println("");
			System.out.println("������ �׾����ϴ�.");
			k_Attack.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�����.wav");
			
			System.out.println("���Ͱ��" + finalBoss.Gold + "�� ȹ���ϼ̽��ϴ�.");
			archer.Gold += finalBoss.Gold;
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		k_Attack.Stop();
		break;
	}
	tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���հ���2.wav");
	motion.Devil_Attack();
	
	
	
	try {
		System.out.println("");
		System.out.println("������ �����Դϴ�.");
		archer.Attacked(finalBoss.Attack());
		System.out.println(creature.Name + " ü�� : " + archer.Hp);
		Thread.sleep(1500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	tower1.Stop();
	if (archer.Hp <= 0) {
		System.out.println("");
		System.out.println(creature.Name + "�� �׾����ϴ�.");
		System.out.println("");
		System.out.println("Game Over");
		return;
	}
}
else if (Battle_Devil == 2 && archer.Mp < 30)
{
	System.out.println("������ �����մϴ�.");
	System.out.println("");
}
else if (Battle_Devil == 3 && archer.Mp < 50)
{
	System.out.println("������ �����մϴ�.");
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
	System.out.println("�߸�"
			+ "�����̽��ϴ�.");
}
}

tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���ӽ¸�.wav");

System.out.println();
System.out.println("");
System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
System.out.println("");
System.out.println("");
System.out.println(">> ������� Ŭ�����ϼ̱��� !! ���� �س��� �� �Ƽ̾��!");
System.out.println("");
System.out.println(">> ���� �����ִ� ����� ���ư����ֽ��ϴ�.");
System.out.println(">> ��������� ���ð� �Ǹ� �̰����� �־��� ������� ������ϴ�.");
System.out.println(">> ������ ž�� Ŭ�����ϴ��� ��������̰� , �ǰ��ϰ� �����ñ� �ٶ��Կ�!!");
System.out.println("");
try {
Thread.sleep(3000);
} catch (Exception e) {
// TODO: handle exception
}
tower1.Stop();
Top5.Stop();
Top5.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/����.wav");
System.out.println("------------------------------------------");
System.out.println("------------------------------------------");
System.out.println("����");
try {
String end[] = {
		"",
		"",
		"(â���� �޻��� ���� ���ΰ��� �������.)",
		"���ΰ� : �Ͼ�~ �����.", 
		"���ΰ� : �������̿������� ����� �ȳ����� ���� �����ϰ� ���Ѱ����̾�..",
		"���ΰ� : ...",
		"���ΰ� : ���� .. �ڰ��Ͼ�µ� ���� ��ó�����ֳ�. ",
		"(�帴�� ����� ���� ��������..)",
		"(" +creature.Name + " : ..!!)",
		"���ΰ� : " + creature.Name + "��.. ���� �ͼ��� ������ ���.. ",
		"���ΰ� : ....",
		"���ΰ� : ���� �𸣰ڴ�..", 
		"���ΰ� : ��! ���� �ð��� !! �б� �����ϰڴ� ���� �غ��ؾ���!",
		"...",
		"",
		"",
		"******************************************",
		"",
		"\t ������ �÷��� ���ּż� �����մϴ�~!",
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
				System.out.println("�߸������̽��ϴ�.");
			 }
		}

	}

	public static void clearScreen() {
		for (int i = 0; i < 80; i++)
			System.out.println("");
	}
}
