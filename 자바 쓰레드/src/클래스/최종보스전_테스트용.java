package Ŭ����;

import java.util.Scanner;

public class ����������_�׽�Ʈ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Knight knight = new Knight();
		Creature creature = new Creature(); 
		Scanner scan = new Scanner(System.in);
		Motion motion = new Motion();
		Media k_Attack = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);
		
		Media tower1 = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);
		
		
		Media Top5 = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);
		

		knight.Hp = 999;
		knight.MaxHp = 999;
		knight.Power = 100;
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
			System.out.println("1. �����ϱ� / 2. 1�� ��ų ��� / 3. 2�� ��ų ���");
			int Battle_Devil = scan.nextInt();
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
					// ����ü�� 1�� �����.
					knight.Hp = 1;
					System.out.println(creature.Name + "�� ü�� 1�� ��Ȱ�Ͽ����ϴ�.");
					
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
				motion.Devil_Attack();
				tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���հ���1.wav");
				
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
				}
				tower1.Stop();
				tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���հ���2.wav");
				
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
					// ����ü�� 1�� �����.
					knight.Hp = 1;
					System.out.println(creature.Name + "�� ü�� 1�� ��Ȱ�Ͽ����ϴ�.");
					
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
				
				motion.Devil_Attack();
				tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���հ���1.wav");
				
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
				}
				tower1.Stop();
				tower1.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���հ���2.wav");
				
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
					// ����ü�� 1�� �����.
					knight.Hp = 1;
					System.out.println(creature.Name + "�� ü�� 1�� ��Ȱ�Ͽ����ϴ�.");
					
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
			
			else {
				System.out.println("�߸������̽��ϴ�.");
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
	public static void clearScreen() {
		for (int i = 0; i < 80; i++)
			System.out.println("");
	}
}
