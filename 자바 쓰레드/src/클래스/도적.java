package Ŭ����;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Creature creature = new Creature();
		System.out.println("��ȯ�� 3���� �� 1������ ������.");
		System.out.println("1. ��� / 2. ���� / 3. �ü�");
		
		int Num2 = scan.nextInt();

		if(Num2 == 1)
		{	
			System.out.print("����");
			System.out.println(" ��ȯ���� �����ϼ̱���. ");
			
			System.out.println("��ȯ���� �̸��� �����ּ���. ");
			
			creature.Name = scan.next();
			
			System.out.println(creature.Name+" ��ȯ���� �����Ͽ� ������ Ŭ�����ϼ��� !!");
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");
			System.out.println("���ѷα�");
			System.out.println("");
			System.out.println("���ΰ� : ...!?");
			System.out.println("���ΰ� : ���Ⱑ �����..?"); 
			System.out.println("���ΰ� : �� �и� ������ ���� �ڰ� �־��µ�..?");
			System.out.println("���ΰ� : ���� ���ΰ� ?");
			System.out.println("���ΰ� : (���� �����´�)");
			System.out.println("���ΰ� : �ƾ�!.. ���� �ƴѵ���");
			System.out.println(">>�ȳ��ϼ��� ����� �̼����� ���ΰ� �Դϴ�.");
			System.out.println("���ΰ� : !? ��� �鸮�°���?");
			System.out.println(">>������ ž������ �� ���͸� �����߸��� ������������ �������.");
			System.out.println(">>�׷��� ����� ���� ����� ���� ���� �ֽ��ϴ�.");
			System.out.println("���ΰ� : ..? ���� ���Ⱑ �̼�����?");
			System.out.println(">> �������� ���� ��� ���� ��ȯ���� �����̴ϴ�. ��ȯ���� �����Ͽ� ���������� �����߸�����!!");
			System.out.println("(���⼭ �� �� ��ȯ�� ����)");
			System.out.println("");
			System.out.println(creature.Name+" : ��");
			System.out.println("���ΰ� : �̰��� ��ȯ���ΰ�..?");
			System.out.println("���ΰ� : �ϴ� ������ ž�� ������.");
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");
			System.out.println("");
			System.out.println("������ ž 1��");
			System.out.println("");
			System.out.println(">>������ ž 1���Դϴ�.");
			System.out.println(">>�ʹݿ� �⺻�������� ���͸� �����ϰ� �߹ݿ� ��ų�� ���� �ֽ��ϴ�.");
			System.out.println(">>���͸� ��� �����ϰ� ������ Ŭ�����ϼ��� !!");
			Thief thief = new Thief();//��� Ŭ���� �ν��Ͻ� ����
			NormalMonster normalMonster = new NormalMonster();//�븻���� Ŭ���� �ҷ�����
			System.out.println("");
			System.out.println("�������!!");
			System.out.println("");
			thief.thief();
			normalMonster.Bat();
			System.out.println("");
			System.out.println("######################");
			System.out.println("1. �����ϱ�");
			
			int Battle_Bat = scan.nextInt();
			
			while(true) { //���� �ݺ�
				if(Battle_Bat == 1)
				{	System.out.println("");
					System.out.println("��ȯ��"+"�� �����Դϴ�.");
					normalMonster.Attacked_Bat(thief.Attack());
					System.out.println("���� ü�� : "+normalMonster.Hp_Bat);

					//������ ü���� 0���� �۰ų� ���� ���				
					if(normalMonster.Hp_Bat<=0)
					{	
						System.out.println("");
						System.out.println("���㰡 �׾����ϴ�.");
						System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
						thief.Gold+=normalMonster.Gold;
						break;
					}
					System.out.println("");
					System.out.println("������ �����Դϴ�.");
					thief.Attacked(normalMonster.Attack());
					System.out.println("��ȯ��"+" ü�� : "+thief.Hp);
					System.out.println(normalMonster.Power);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println("��ȯ��"+"�� �׾����ϴ�.");
						//����ü�� 1�� �����.
						thief.Hp = 1;
						System.out.println("��ȯ��"+"�� ü�� 1�� ��Ȱ�Ͽ����ϴ�.");
						break;
					}
				}
				
				else
				{
					System.out.println("�߸������̽��ϴ�.");
				}
			}
			
			System.out.println("");
			System.out.println("������ ����!!");
			normalMonster.Snail();
			System.out.println("");
			System.out.println("######################");
			System.out.println("1. �����ϱ�");

			int Battle_Snail = scan.nextInt();
		
			while(true) {
				if(Battle_Snail == 1)
				{	System.out.println("");
					System.out.println("��ȯ��"+"�� �����Դϴ�.");
					normalMonster.Attacked_Snail(thief.Attack());
					System.out.println("������ ü�� : "+normalMonster.Hp_Snail);
					//������ ü���� 0���� �۰ų� ���� ���
					
					if(normalMonster.Hp_Snail<=0)
					{	
						System.out.println("");
						System.out.println("�����̰� �׾����ϴ�.");
						System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
						thief.Gold+=normalMonster.Gold;
						break;
					}
					System.out.println("");
					System.out.println("�������� �����Դϴ�.");
					System.out.println("");
					thief.Attacked(normalMonster.Attack());
					System.out.println("��ȯ��"+" ü�� : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println("��ȯ��"+"�� �׾����ϴ�.");
						//����ü�� 1�� �����.
						thief.Hp = 1;
						System.out.println("��ȯ��"+"�� ü�� 1�� ��Ȱ�Ͽ����ϴ�.");
						break;
					}
				}
				
				else
				{
					System.out.println("�߸������̽��ϴ�.");
				}
			}
			
			System.out.println("");
			System.out.println("�䳢 ����!!");
			normalMonster.Rabbit();
			System.out.println("");
			System.out.println("######################");
			System.out.println("1. �����ϱ�");

			int Battle_Rabbit = scan.nextInt();
		
			while(true) {
				if(Battle_Rabbit == 1)
				{	System.out.println("");
					System.out.println("��ȯ��"+"�� �����Դϴ�.");
					normalMonster.Attacked_Rabbit(thief.Attack());
					System.out.println("�䳢 ü�� : "+normalMonster.Hp_Rabbit);
					//������ ü���� 0���� �۰ų� ���� ���
					
					if(normalMonster.Hp_Rabbit<=0)
					{	
						System.out.println("");
						System.out.println("�䳢�� �׾����ϴ�.");
						System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
						thief.Gold+=normalMonster.Gold;
						break;
					}
					System.out.println("");
					System.out.println("�䳢�� �����Դϴ�.");
					thief.Attacked(normalMonster.Attack());
					System.out.println("��ȯ��"+" ü�� : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println("��ȯ��"+"�� �׾����ϴ�.");
						//����ü�� 1�� �����.
						thief.Hp = 1;
						System.out.println("��ȯ��"+"�� ü�� 1�� ��Ȱ�Ͽ����ϴ�.");
						break;
					}
				}
				
				else
				{
					System.out.println("�߸������̽��ϴ�.");
				}
			}
			
			System.out.println("");
			System.out.println("");
			thief.Fatigue+=40;
			System.out.println(">>������ ž 1���� Ŭ�����ϼ̽��ϴ�!!!!");
			System.out.println(">>������ ���ϴ�.");
			System.out.println("");
			thief.Hp=100;
			
			Item item = new Item(); // ������ Ŭ���� ��ü����
			Weapon weapon = new Weapon(); // ���� Ŭ���� ��ü����
			Armor armor = new Armor(); // �Ƹ� Ŭ���� ��ü����
			
			
			while(true) {
				System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
				System.out.println("1. ����â  / 2. ����  / 3. ����  / 4. ������ž"); // �������� �̵����
				System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
				int Floor2 = scan.nextInt();
			if (Floor2 ==1) //����â
			{
				System.out.println("");
				
				thief.thief();
				System.out.println("1. �ڷΰ���");
				int Num7 = scan.nextInt();
				if(Num7 ==1)
				{
					System.out.println("");
				}
			}	
			else if(Floor2 ==2) // ����
			{
				Store store = new Store();
				store.Thi_sto(thief);
			}
				
			else if(Floor2 ==3) //����
			{
				Inn Inn = new Inn();
				Inn.Thi_in(thief);
			}
			else if (Floor2 ==4) //������ ž
			{
				System.out.println("������ ž ���������� ���ϴ�.");
				System.out.println("������ ���� �� ��� �غ�� ��ġ�̳���?");
				System.out.println("1. �� / 2. �ƴϿ�");
				
				int Floor2_1 = scan.nextInt();
				if(Floor2_1 ==1)
				{
					System.out.println("�˰ڽ��ϴ�. ������ž���� �̵��ϰڽ��ϴ�.");
					break;
				}
			
				else if(Floor2_1==2)
				{
					System.out.println("������ ���ư��ϴ�. �������ּ���");
					System.out.println("");
				}
			
			}
			
			else
			{
				System.out.println("�߸������̽��ϴ�.");
			}
	}
			
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("������ ž 2��");
			System.out.println("");
			System.out.println(">>2���� 4���� �߰������� �����մϴ�.");
			System.out.println(">>�߰������� ����� ��ų�� ���� �� �ֽ��ϴ�.");
			
			MediumBoss mediumBoss = new MediumBoss();//�߰����� Ŭ���� �ҷ�����

			System.out.println("");
			System.out.println("����� ����!!");
			System.out.println("");
			mediumBoss.Ogre();
			System.out.println("");
			System.out.println("######################");
			System.out.println("1. �����ϱ�");
			int Battle_Ogre = scan.nextInt();
			while(true) { //���� �ݺ�
				
				if(Battle_Ogre == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"�� �����Դϴ�.");
					mediumBoss.Attacked_Ogre(thief.Attack());
					System.out.println("����� ü�� : "+mediumBoss.Hp);

					//������ ü���� 0���� �۰ų� ���� ���				
					if(mediumBoss.Hp<=0)
					{	
						System.out.println("");
						System.out.println("����Ű� �׾����ϴ�.");
						System.out.println("���Ͱ��"+mediumBoss.Gold+"�� ȹ���ϼ̽��ϴ�.");
						thief.Gold+=mediumBoss.Gold;
						break;
					}
					System.out.println("");
					System.out.println("������� �����Դϴ�.");
					thief.Attacked(mediumBoss.Attack());
					System.out.println(creature.Name+" ü�� : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"�� �׾����ϴ�.");
						//����ü�� 1�� �����.
						thief.Hp = 1;
						System.out.println(creature.Name+"�� ü�� 1�� ��Ȱ�Ͽ����ϴ�.");
						break;
					}
				}
				
				else
				{
					System.out.println("�߸������̽��ϴ�.");
				}
			}
			
			System.out.println(">>����ؿ� !! �߰������� ����Ʈ���̾��!!");
			System.out.println(">>�߰������� ����Ʈ���� ��ų�� ���̽��ϴ�.");
			System.out.println("");
			System.out.println("1����ų ī�峯���⸦ �����!!");
			System.out.println("");
			thief.Skill ="ī�峯����";
			System.out.println(">>������ ���ư��ϴ�.");
			thief.Hp = 100;
			thief.Fatigue +=40;
			
			while(true) {
				System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
				System.out.println("1. ����â  / 2. ����  / 3. ����  / 4. ������ž"); // �������� �̵����
				System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
				int Floor3 = scan.nextInt();
			if (Floor3 ==1) //����â
			{
				System.out.println("");
				
				thief.thief();
				System.out.println("1. �ڷΰ���");
				int Num7 = scan.nextInt();
				if(Num7 ==1)
				{
					System.out.println("");
				}
			}	
			else if(Floor3 ==2) // ����
			{
				Store store = new Store();
				store.Thi_sto(thief);
			
			}
			else if(Floor3 ==3) //����
			{
				Inn Inn = new Inn();
				Inn.Thi_in(thief);
			}
			else if (Floor3 ==4) //������ ž
			{
				System.out.println("������ ž ���������� ���ϴ�.");
				System.out.println("������ ���� �� ��� �غ�� ��ġ�̳���?");
				System.out.println("1. �� / 2. �ƴϿ�");
				
				int Floor3_1 = scan.nextInt();
				if(Floor3_1 ==1)
				{
					System.out.println("�˰ڽ��ϴ�. ������ž���� �̵��ϰڽ��ϴ�.");
					break;
				}
			
				else if(Floor3_1==2)
				{
					System.out.println("������ ���ư��ϴ�. �������ּ���");
					System.out.println("");
				}
			
			}
			
			else
			{
				System.out.println("�߸������̽��ϴ�.");
			}
		
			
		}
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("������ ž 3��");
			System.out.println("");
			System.out.println(">>��ų�� �������� ��ų�� �Ϲݰ����� ������ ����ؼ� ���� ��ġ�켼��");
		
			NormalMonster2 normalMonster2 = new NormalMonster2(); //3�� ���� �ҷ�����
			
			System.out.println("");
			System.out.println("�ٶ��� ����!!");
			System.out.println("");
			normalMonster2.Chipmunk();
			System.out.println("");
			System.out.println("######################");
			
			while(true) { //���� �ݺ�
				System.out.println("1. �����ϱ� / 2. ��ų���");
				int Num3_1 = scan.nextInt(); //3���� ù��° ����	
				if(Num3_1 == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"�� �����Դϴ�.");
					normalMonster2.Attacked_Chipmunk(thief.Attack());
					System.out.println("�ٶ��� ü�� : "+normalMonster2.Hp_Chipmunk);

					//������ ü���� 0���� �۰ų� ���� ���				
					if(normalMonster2.Hp_Chipmunk<=0)
					{	
						System.out.println("");
						System.out.println("�ٶ��㰡 �׾����ϴ�.");
						System.out.println("���Ͱ��"+normalMonster2.Gold+"�� ȹ���ϼ̽��ϴ�.");
						thief.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("�ٶ����� �����Դϴ�.");
					thief.Attacked(normalMonster2.Attack());
					System.out.println(creature.Name+" ü�� : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"�� �׾����ϴ�.");
						//����ü�� 1�� �����.
						thief.Hp = 1;
						System.out.println(creature.Name+"�� ü�� 1�� ��Ȱ�Ͽ����ϴ�.");
						break;
					}
				}
				else if(Num3_1 ==2)
				{
					System.out.println("");
					System.out.println(creature.Name+"�� �����Դϴ�.");
					normalMonster2.Attacked_Chipmunk(thief.Skill());
					System.out.println("�ٶ��� ü�� : "+normalMonster2.Hp_Chipmunk);

					//������ ü���� 0���� �۰ų� ���� ���				
					if(normalMonster2.Hp_Chipmunk<=0)
					{	
						System.out.println("");
						System.out.println("�ٶ��㰡 �׾����ϴ�.");
						System.out.println("���Ͱ��"+normalMonster2.Gold+"�� ȹ���ϼ̽��ϴ�.");
						thief.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("�ٶ����� �����Դϴ�.");
					thief.Attacked(normalMonster2.Attack());
					System.out.println(creature.Name+" ü�� : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"�� �׾����ϴ�.");
						//����ü�� 1�� �����.
						thief.Hp = 1;
						System.out.println(creature.Name+"�� ü�� 1�� ��Ȱ�Ͽ����ϴ�.");
						break;
					}
				}
				
				else
				{
					System.out.println("�߸������̽��ϴ�.");
				}
			}

	System.out.println("");
			System.out.println("������ ����!!");
			System.out.println("");
			normalMonster2.Slime();
			System.out.println("");
			System.out.println("######################");
			
			
			while(true) { //���� �ݺ�
				System.out.println("1. �����ϱ� / 2. ��ų���");
				int Num3_2 = scan.nextInt(); //3���� 2��° ����
				if(Num3_2 == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"�� �����Դϴ�.");
					normalMonster2.Attacked_Slime(thief.Attack());
					System.out.println("������ ü�� : "+normalMonster2.Hp_Slime);

					//������ ü���� 0���� �۰ų� ���� ���				
					if(normalMonster2.Hp_Slime<=0)
					{	
						System.out.println("");
						System.out.println("�����Ӱ� �׾����ϴ�.");
						System.out.println("���Ͱ��"+normalMonster2.Gold+"�� ȹ���ϼ̽��ϴ�.");
						thief.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("�������� �����Դϴ�.");
					thief.Attacked(normalMonster.Attack());
					System.out.println(creature.Name+" ü�� : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"�� �׾����ϴ�.");
						//����ü�� 1�� �����.
						thief.Hp = 1;
						System.out.println(creature.Name+"�� ü�� 1�� ��Ȱ�Ͽ����ϴ�.");
						break;
					}
				}
				else if(Num3_2 ==2)
				{
					System.out.println("");
					System.out.println(creature.Name+"�� �����Դϴ�.");
					normalMonster2.Attacked_Slime(thief.Skill());
					System.out.println("������ ü�� : "+normalMonster2.Hp_Slime);

					//������ ü���� 0���� �۰ų� ���� ���				
					if(normalMonster2.Hp_Slime<=0)
					{	
						System.out.println("");
						System.out.println("�����Ӱ� �׾����ϴ�.");
						System.out.println("���Ͱ��"+normalMonster2.Gold+"�� ȹ���ϼ̽��ϴ�.");
						thief.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("�������� �����Դϴ�.");
					thief.Attacked(normalMonster2.Attack());
					System.out.println(creature.Name+" ü�� : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"�� �׾����ϴ�.");
						//����ü�� 1�� �����.
						thief.Hp = 1;
						System.out.println(creature.Name+"�� ü�� 1�� ��Ȱ�Ͽ����ϴ�.");
						break;
					}
				}
				
				else
				{
					System.out.println("�߸������̽��ϴ�.");
				}
			}

			System.out.println("");
			System.out.println("���̷��� ����!!");
			System.out.println("");
			normalMonster2.Skeleton();
			System.out.println("");
			System.out.println("######################");
			
			
			while(true) { //���� �ݺ�
				System.out.println("1. �����ϱ� / 2. ��ų���");
				int Num3_2 = scan.nextInt(); //3���� 2��° ����
				if(Num3_2 == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"�� �����Դϴ�.");
					normalMonster2.Attacked_Skeleton(thief.Attack());
					System.out.println("������ ü�� : "+normalMonster2.Hp_Skeleton);

					//������ ü���� 0���� �۰ų� ���� ���				
					if(normalMonster2.Hp_Skeleton<=0)
					{	
						System.out.println("");
						System.out.println("�����Ӱ� �׾����ϴ�.");
						System.out.println("���Ͱ��"+normalMonster2.Gold+"�� ȹ���ϼ̽��ϴ�.");
						thief.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("�������� �����Դϴ�.");
					thief.Attacked(normalMonster.Attack());
					System.out.println(creature.Name+" ü�� : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"�� �׾����ϴ�.");
						//����ü�� 1�� �����.
						thief.Hp = 1;
						System.out.println(creature.Name+"�� ü�� 1�� ��Ȱ�Ͽ����ϴ�.");
						break;
					}
				}
				else if(Num3_2 ==2)
				{
					System.out.println("");
					System.out.println(creature.Name+"�� �����Դϴ�.");
					normalMonster2.Attacked_Skeleton(thief.Skill());
					System.out.println("������ ü�� : "+normalMonster2.Hp_Skeleton);

					//������ ü���� 0���� �۰ų� ���� ���				
					if(normalMonster2.Hp_Skeleton<=0)
					{	
						System.out.println("");
						System.out.println("�����Ӱ� �׾����ϴ�.");
						System.out.println("���Ͱ��"+normalMonster2.Gold+"�� ȹ���ϼ̽��ϴ�.");
						thief.Gold+=normalMonster2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("�������� �����Դϴ�.");
					thief.Attacked(normalMonster2.Attack());
					System.out.println(creature.Name+" ü�� : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"�� �׾����ϴ�.");
						//����ü�� 1�� �����.
						thief.Hp = 1;
						System.out.println(creature.Name+"�� ü�� 1�� ��Ȱ�Ͽ����ϴ�.");
						break;
					}
				}
				
				else
				{
					System.out.println("�߸������̽��ϴ�.");
				}
			}
			
			
			System.out.println(">>������ ž 3���� Ŭ�����ϼ̽��ϴ�!!!!");
			System.out.println(">>������ ���ϴ�.");
			System.out.println("");
			thief.Hp = 100;
			thief.Fatigue +=40;
			thief.Mp = 100;
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");

			while(true) {
				System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
				System.out.println("1. ����â  / 2. ����  / 3. ����  / 4. ������ž"); // �������� �̵����
				System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
				int Floor3 = scan.nextInt();
			if (Floor3 ==1) //����â
			{
				System.out.println("");
				
				thief.thief();
				System.out.println("1. �ڷΰ���");
				int Num7 = scan.nextInt();
				if(Num7 ==1)
				{
					System.out.println("");
				}
			}	
			else if(Floor3 ==2) // ����
			{
				Store store = new Store();
				store.Thi_sto(thief);
			}
				
			else if(Floor3 ==3) //����
			{
				Inn Inn = new Inn();
				Inn.Thi_in(thief);
			}
			else if (Floor3 ==4) //������ ž
			{
				System.out.println("������ ž ���������� ���ϴ�.");
				System.out.println("������ ���� �� ��� �غ�� ��ġ�̳���?");
				System.out.println("1. �� / 2. �ƴϿ�");
				
				int Floor3_1 = scan.nextInt();
				if(Floor3_1 ==1)
				{
					System.out.println("�˰ڽ��ϴ�. ������ž���� �̵��ϰڽ��ϴ�.");
					break;
				}
			
				else if(Floor3_1==2)
				{
					System.out.println("������ ���ư��ϴ�. �������ּ���");
					System.out.println("");
				}
			
			}
			
			else
			{
				System.out.println("�߸������̽��ϴ�.");
			}
	}
		
			
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("������ ž 4��");
			System.out.println("");
			System.out.println(">>�߰������Դϴ�.");
			System.out.println(">>�߰������� ��ġ��� 2����ų�� �����ֽ��ϴ�.");

			MediumBoss2 mediumBoss2 = new MediumBoss2();//�߰����� Ŭ���� �ҷ�����

			System.out.println("");
			System.out.println("��� ����!!");
			System.out.println("");
			mediumBoss2.Envoy();
			System.out.println("");
			System.out.println("######################");

			while(true) { //���� �ݺ�
				System.out.println("1. �����ϱ� / 2. ��ų ���");
				int Battle_Envoy = scan.nextInt();
				if(Battle_Envoy == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"�� �����Դϴ�.");
					mediumBoss2.Attacked_Envoy(thief.Attack());
					System.out.println("��� ü�� : "+mediumBoss2.Hp);

					//������ ü���� 0���� �۰ų� ���� ���				
					if(mediumBoss2.Hp<=0)
					{	
						System.out.println("");
						System.out.println("��Ű� �׾����ϴ�.");
						System.out.println("���Ͱ��"+mediumBoss2.Gold+"�� ȹ���ϼ̽��ϴ�.");
						thief.Gold+=mediumBoss2.Gold;
						break;
					}
					System.out.println("");
					System.out.println("����� �����Դϴ�.");
					thief.Attacked(mediumBoss2.Attack());
					System.out.println(creature.Name+" ü�� : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"�� �׾����ϴ�.");
						//����ü�� 1�� �����.
						thief.Hp = 1;
						System.out.println(creature.Name+"�� ü�� 1�� ��Ȱ�Ͽ����ϴ�.");
						break;
					}
				}
				else if(Battle_Envoy == 2)
					
				{	System.out.println("");
				System.out.println(creature.Name+"�� �����Դϴ�.");
				mediumBoss2.Attacked_Envoy(thief.Skill());
				System.out.println("��� ü�� : "+mediumBoss2.Hp);

				//������ ü���� 0���� �۰ų� ���� ���				
				if(mediumBoss2.Hp<=0)
				{	
					System.out.println("");
					System.out.println("��Ű� �׾����ϴ�.");
					System.out.println("���Ͱ��"+mediumBoss2.Gold+"�� ȹ���ϼ̽��ϴ�.");
					thief.Gold+=mediumBoss2.Gold;
					break;
				}
				System.out.println("");
				System.out.println("����� �����Դϴ�.");
				thief.Attacked(mediumBoss2.Attack());
				System.out.println(creature.Name+" ü�� : "+thief.Hp);
				if(thief.Hp <=0)
				{	System.out.println("");
					System.out.println(creature.Name+"�� �׾����ϴ�.");
					//����ü�� 1�� �����.
					thief.Hp = 1;
					System.out.println(creature.Name+"�� ü�� 1�� ��Ȱ�Ͽ����ϴ�.");
					break;
				}
			}
				else
				{
					System.out.println("�߸������̽��ϴ�.");
				}
			}
			
			System.out.println(">>����ؿ� !! �߰������� ����Ʈ���̾��!!");
			System.out.println(">>�߰������� ����Ʈ���� ��ų�� ���̽��ϴ�.");
			System.out.println("");
			System.out.println("2����ų ���ܸ����� �����!!");
			System.out.println("");
			thief.Skill2 ="���ܸ���";
			System.out.println(">>������ ���ư��ϴ�.");
			thief.Hp = 100;
			thief.Fatigue +=40;
			thief.Mp = 100;
			
			while(true) {
				System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
				System.out.println("1. ����â  / 2. ����  / 3. ����  / 4. ������ž"); // �������� �̵����
				System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
				int Floor5_1 = scan.nextInt();
			if (Floor5_1 ==1) //����â
			{
				System.out.println("");
				
				thief.thief();
				System.out.println("1. �ڷΰ���");
				int Num7 = scan.nextInt();
				if(Num7 ==1)
				{
					System.out.println("");
				}
			}	
			else if(Floor5_1 ==2) // ����
			{
				Store store = new Store();
				store.Thi_sto(thief);	
			}
			else if(Floor5_1 ==3) //����
			{
				Inn Inn = new Inn();
				Inn.Thi_in(thief);
			}
			else if (Floor5_1 ==4) //������ ž
			{
				System.out.println("������ ž ���������� ���ϴ�.");
				System.out.println("������ ���� �� ��� �غ�� ��ġ�̳���?");
				System.out.println("1. �� / 2. �ƴϿ�");
				
				int Floor5_2 = scan.nextInt();
				if(Floor5_2 ==1)
				{
					System.out.println("�˰ڽ��ϴ�. ������ž���� �̵��ϰڽ��ϴ�.");
					break;
				}
			
				else if(Floor5_2==2)
				{
					System.out.println("������ ���ư��ϴ�. �������ּ���");
					System.out.println("");
				}
			
			}
			
			else
			{
				System.out.println("�߸������̽��ϴ�.");
			}
			
	}
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("������ ž 5��");
			System.out.println("");
			System.out.println("���� ������ 5������ ���̱���!!");
			System.out.println(">>���������Դϴ�.");
			System.out.println(">>���������� ��ġ��� ������������ ���ư����־��!!");
			
			FinalBoss finalBoss = new FinalBoss();//�߰����� Ŭ���� �ҷ�����

			System.out.println("");
			System.out.println("�巡�� ����!!");
			System.out.println("");
			finalBoss.Dragon();
			System.out.println("");
			System.out.println("######################");

			while(true) { //���� �ݺ�
				System.out.println("1. �����ϱ� / 2. 1�� ��ų ��� / 3. 2�� ��ų ���");
				int Batlle_Dragon = scan.nextInt();
				if(Batlle_Dragon == 1)
				{	System.out.println("");
					System.out.println(creature.Name+"�� �����Դϴ�.");
					finalBoss.Attacked_Dragon(thief.Attack());
					System.out.println("�巡�� ü�� : "+finalBoss.Hp);

					//������ ü���� 0���� �۰ų� ���� ���				
					if(finalBoss.Hp<=0)
					{	
						System.out.println("");
						System.out.println("�巡�ﰡ �׾����ϴ�.");
						System.out.println("���Ͱ��"+finalBoss.Gold+"�� ȹ���ϼ̽��ϴ�.");
						thief.Gold+=finalBoss.Gold;
						break;
					}
					System.out.println("");
					System.out.println("�巡���� �����Դϴ�.");
					thief.Attacked(finalBoss.Attack());
					System.out.println(creature.Name+" ü�� : "+thief.Hp);
					if(thief.Hp <=0)
					{	System.out.println("");
						System.out.println(creature.Name+"�� �׾����ϴ�.");
						//����ü�� 1�� �����.
						thief.Hp = 1;
						System.out.println(creature.Name+"�� ü�� 1�� ��Ȱ�Ͽ����ϴ�.");
						break;
					}
				}
				else if(Batlle_Dragon == 2)
					
				{	System.out.println("");
				System.out.println(creature.Name+"�� �����Դϴ�.");
				finalBoss.Attacked_Dragon(thief.Skill());
				System.out.println("�巡�� ü�� : "+finalBoss.Hp);

				//������ ü���� 0���� �۰ų� ���� ���				
				if(finalBoss.Hp<=0)
				{	
					System.out.println("");
					System.out.println("�巡�ﰡ �׾����ϴ�.");
					System.out.println("���Ͱ��"+finalBoss.Gold+"�� ȹ���ϼ̽��ϴ�.");
					thief.Gold+=finalBoss.Gold;
					break;
				}
				System.out.println("");
				System.out.println("�巡���� �����Դϴ�.");
				thief.Attacked(finalBoss.Attack());
				System.out.println(creature.Name+" ü�� : "+thief.Hp);
				if(thief.Hp <=0)
				{	System.out.println("");
					System.out.println(creature.Name+"�� �׾����ϴ�.");
					//����ü�� 1�� �����.
					thief.Hp = 1;
					System.out.println(creature.Name+"�� ü�� 1�� ��Ȱ�Ͽ����ϴ�.");
					break;
				}
			}
				else if(Batlle_Dragon == 3)
					
				{	System.out.println("");
				System.out.println(creature.Name+"�� �����Դϴ�.");
				finalBoss.Attacked_Dragon(thief.Skill2());
				System.out.println("�巡�� ü�� : "+finalBoss.Hp);

				//������ ü���� 0���� �۰ų� ���� ���				
				if(finalBoss.Hp<=0)
				{	
					System.out.println("");
					System.out.println("�巡�ﰡ �׾����ϴ�.");
					System.out.println("���Ͱ��"+finalBoss.Gold+"�� ȹ���ϼ̽��ϴ�.");
					thief.Gold+=finalBoss.Gold;
					break;
				}
				System.out.println("");
				System.out.println("�巡���� �����Դϴ�.");
				thief.Attacked(finalBoss.Attack());
				System.out.println(creature.Name+" ü�� : "+thief.Hp);
				if(thief.Hp <=0)
				{	System.out.println("");
					System.out.println(creature.Name+"�� �׾����ϴ�.");
					//����ü�� 1�� �����.
					thief.Hp = 1;
					System.out.println(creature.Name+"�� ü�� 1�� ��Ȱ�Ͽ����ϴ�.");
					break;
				}
			}
				else
				{
					System.out.println("�߸������̽��ϴ�.");
				}
			}
			System.out.println();
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("");
			System.out.println(">> ������� Ŭ�����ϼ̱��� !! ���� �س��� �� �Ƽ̾��!");
			System.out.println(">> ���� �����ִ� ����� ���ư��ϴ�.");
			System.out.println(">> ���⼭ �־��� ����� �� �������� �ð��� �״���Դϴ�. ���� ó�� ��Ȱ�ϰ� �ǽǰ̴ϴ�.\r\n" + 
					"");
			System.out.println("");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");	
			System.out.println("");
			System.out.println("");
			System.out.println("���ΰ� : ���� �ƽ���� ..? ��������� ���ư��� ��ȯ���� �ٽ� �����µ�..");
			System.out.println(creature.Name+" : ....");
			System.out.println("���ΰ� : ����߾� "+creature.Name+"�� !!");
			System.out.println(creature.Name+" : ..!!");
			System.out.println("");
			System.out.println("");
			System.out.println("******************************************");
			System.out.println("");
			System.out.println("\t ������ �÷��� ���ּż� �����մϴ�~!");
			System.out.println("");
			System.out.println("");
			System.out.println("******************************************");
	}
	}
	}