package Ŭ����;

import java.util.Scanner;

public class ����2 {

	public static void main(String[] args) {
	
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
				"\tó������ ��ų�� ������ ������ž 2���� 4���� Ŭ�����ϸ� ��ų�� ȹ���Ҽ��ֽ��ϴ�.", "", "\t��ȯ���� �����Ͽ� ������� Ŭ�����ϼ���!!", "",
				"�ʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢʢ�", "",

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
					System.out.println("1. �����ϱ� / 2. ��ȯ�� ����â / 3. ���� ����â / 4. ���� ����");
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
					System.out.println("1. �����ϱ� / 2. ��ȯ�� ����â / 3. ���� ����â / 4. ���� ����");
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
						
						
						if(normalMonster.Hp_Snail<=0)
						{	
							System.out.println("");
							System.out.println("�����̰� �׾����ϴ�.");
							System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
							knight.Gold+=normalMonster.Gold;
							break;
						}
						
						System.out.println("");
						System.out.println("---------------");
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
					System.out.println("1. �����ϱ� / 2. ��ȯ�� ����â / 3. ���� ����â / 4. ���� ����");
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
						if(normalMonster.Hp_Rabbit<=0)
						{	
							System.out.println("");
							System.out.println("�䳢�� �׾����ϴ�.");
							System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
							knight.Gold+=normalMonster.Gold;
							break;
						}
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
			}
		}
		
	}
	public static void clearScreen() {
		for (int i = 0; i < 80; i++)
			System.out.println("");
	}
}
