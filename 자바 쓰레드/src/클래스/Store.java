package Ŭ����;

import java.util.Scanner;

public class Store {

	Scanner scan = new Scanner(System.in);
	//�ʵ�
	void store(Knight knight) {
		Weapon weapon = new Weapon(); // ���� Ŭ���� ��ü����
		Armor armor = new Armor(); // �Ƹ� Ŭ���� ��ü����
		Media Town = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);

		
		System.out.println("");
		System.out.println(">>������ ���Ű��� ȯ���մϴ�!!");
		System.out.println(">>�������� �ʿ��� ��ǰ�� ��带 �̿��� �� �� �ֽ��ϴ�.");
		System.out.println("");
		
		
		
		
		while(true) 
		{
			System.out.println("1. ���� / 2. �� / 3. ������ ���ư���");
			int List = 0;
			try {	
				List = scan.nextInt();
			} catch (Exception e) {
				
				scan = new Scanner(System.in);
				
				System.out.println("");
			}
		if(List == 1)
		{	Town.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�Һ�.wav", +6.0f);
			weapon.Sword(); // �����ǰ �ҷ�����
			System.out.println("");
			System.out.println("�������������������������������������  ");
			System.out.println("���� ������� : "+knight.Gold);
			System.out.println("�������������������������������������  ");
			System.out.println("");
			System.out.println("");
			System.out.println("� ��ǰ�� ��ðڽ��ϱ�?");
			System.out.println("1. ���̾�ҵ� / 2. �ǹ��ҵ� / 3. ���ҵ� / 4. ���̾Ƽҵ� / 5. �ڷΰ��� / 6. ������ ���ư���");
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
				
				if(knight.Gold>=100) //���̾�ҵ� ����
				{	Town.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav", +6.0f);
					System.out.println("���̾�ҵ带 100G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ����� �ڵ������˴ϴ�.");
					knight.Gold-=100;
					knight.Power+=10;
					System.out.println("���� ������� : "+knight.Gold);
					System.out.println("���� ���ݷ�    : "+knight.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav", +6.0f);
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // ���� �����ҋ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
				}
				System.out.println("");
			}
			else if(Num9 == 2)
			{
				if(knight.Gold>=200) //�ǹ��ҵ� ����
				{	Town.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav", +6.0f);
					System.out.println("�ǹ��ҵ带 200G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ����� �ڵ������˴ϴ�.");
					knight.Gold-=200;
					knight.Power+=20;
					System.out.println("���� ������� : "+knight.Gold);
					System.out.println("���� ���ݷ�    : "+knight.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav", +6.0f);
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // ���� �����Ҷ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
				}
				System.out.println("");
			}
			else if(Num9 == 3)
			{
				if(knight.Gold>=300) //���ҵ� ����
				{	Town.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav", +6.0f);
					System.out.println("���ҵ带 300G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ����� �ڵ������˴ϴ�.");
					knight.Gold-=300;
					knight.Power+=30;
					System.out.println("���� ������� : "+knight.Gold);
					System.out.println("���� ���ݷ�    : "+knight.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav", +6.0f);
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // ���� �����Ҷ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
				}
				System.out.println("");
			}
			else if(Num9 == 4)
			{
				if(knight.Gold>=400) //���̾Ƽҵ� ����
				{	Town.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav", +6.0f);
					System.out.println("���̾Ƽҵ带 400G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ����� �ڵ������˴ϴ�.");
					knight.Gold-=400;
					knight.Power+=40;
					System.out.println("���� ������� : "+knight.Gold);
					System.out.println("���� ���ݷ�    : "+knight.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav", +6.0f);
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				
				else // ���� �����Ҷ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
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
				System.out.println("�߸������̽��ϴ�.");
			}
		}
		else if(List == 2)
		{	Town.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�Һ�.wav", +6.0f);
			armor.Armor(); // �����ǰ �ҷ�����
			System.out.println("");
			System.out.println("�������������������������������������  ");
			System.out.println("���� ������� : "+knight.Gold);
			System.out.println("�������������������������������������  ");
			System.out.println("");
			System.out.println("");
			System.out.println("� ��ǰ�� ��ðڽ��ϱ�?");
			System.out.println("1. ���̾�Ƹ� / 2. �ǹ��Ƹ� / 3. ���Ƹ� / 4. ���̾ƾƸ� / 5. �ڷΰ��� / 6. ������ ���ư���");
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
				
				if(knight.Gold>=100) //���̾�Ƹ� ����
				{	Town.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav", +6.0f);
					System.out.println("���̾�ƸӸ� 100G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ���� �ڵ������˴ϴ�.");
					knight.Gold-=100;
					knight.Depense+=10;
					System.out.println("���� ������� : "+knight.Gold);
					System.out.println("���� ����    : "+knight.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					
				}
				else // ���� �����ҋ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
				}
				System.out.println("");
			}
			else if(Armor == 2)
			{
				if(knight.Gold>=200) //�ǹ��Ƹ� ����
				{	Town.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav", +6.0f);
					System.out.println("�ǹ��ƸӸ� 200G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ���� �ڵ������˴ϴ�.");
					knight.Gold-=200;
					knight.Depense+=20;
					System.out.println("���� ������� : "+knight.Gold);
					System.out.println("���� ����    : "+knight.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				else // ���� �����Ҷ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
				}
				System.out.println("");
			}
			else if(Armor == 3)
			{
				if(knight.Gold>=300) //���Ƹ� ����
				{	Town.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav", +6.0f);
					System.out.println("���ƸӸ� 300G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ���� �ڵ������˴ϴ�.");
					knight.Gold-=300;
					knight.Depense+=30;
					System.out.println("���� ������� : "+knight.Gold);
					System.out.println("���� ����    : "+knight.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					
					try {
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // ���� �����Ҷ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
				}
				System.out.println("");
			}
			else if(Armor == 4)
			{
				if(knight.Gold>=400) //���̾ƾƸ� ����
				{	Town.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav", +6.0f);
					System.out.println("���̾ƾƸӸ� 400G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ���� �ڵ������˴ϴ�.");
					knight.Gold-=400;
					knight.Depense+=40;
					System.out.println("���� ������� : "+knight.Gold);
					System.out.println("���� ����    : "+knight.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // ���� �����Ҷ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
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
				System.out.println("�߸������̽��ϴ�.");
			}
		}
		else if(List == 3)
		{
			System.out.println("");
			break;
		}
		else 
		{
			System.out.println("�߸������̽��ϴ�.");
		}
		}
	}
	
	
	
	void Thi_sto(Thief thief) { //����
		Weapon weapon = new Weapon(); // ���� Ŭ���� ��ü����
		Armor armor = new Armor(); // �Ƹ� Ŭ���� ��ü����
		Media Town = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);

		
		System.out.println("");
		System.out.println(">>������ ���Ű��� ȯ���մϴ�!!");
		System.out.println(">>�������� �ʿ��� ��ǰ�� ��带 �̿��� �� �� �ֽ��ϴ�.");
		System.out.println("");
		
		
		
		while(true) 
		{
			System.out.println("1. ���� / 2. �� / 3. �����ε��ư���");
			int List2 = 0;
			try {
				List2 = scan.nextInt();
			} catch (Exception e) {
				
				scan = new Scanner(System.in);
				
				System.out.println("");
			}
		if(List2 == 1)
		{	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�Һ�.wav");
			weapon.Knife(); // �����ǰ �ҷ�����
			System.out.println("");
			System.out.println("�������������������������������������  ");
			System.out.println("���� ������� : "+thief.Gold);
			System.out.println("�������������������������������������  ");
			System.out.println("");
			System.out.println("");
			System.out.println("� ��ǰ�� ��ðڽ��ϱ�?");
			System.out.println("1. ���̾����� / 2. �ǹ������� / 3. ��峪���� / 4. ���̾Ƴ����� / 5. �ڷΰ��� / 6. ������ ���ư���");
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
				
				if(thief.Gold>=100) //���̾����� ����
				{	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav");
					System.out.println("���̾������� 100G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ����� �ڵ������˴ϴ�.");
					thief.Gold-=100;
					thief.Power+=10;
					System.out.println("���� ������� : "+thief.Gold);
					System.out.println("���� ���ݷ�    : "+thief.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
					Town.Stop();
				}
				else // ���� �����ҋ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
				}
				System.out.println("");
			}
			else if(Num10 == 2)
			{
				if(thief.Gold>=200) //�ǹ������� ����
				{	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav");
					System.out.println("�ǹ��������� 200G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ����� �ڵ������˴ϴ�.");
					thief.Gold-=200;
					thief.Power+=20;
					System.out.println("���� ������� : "+thief.Gold);
					System.out.println("���� ���ݷ�    : "+thief.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // ���� �����Ҷ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
				}
				System.out.println("");
			}
			else if(Num10 == 3)
			{
				if(thief.Gold>=300) //��峪���� ����
				{	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav");
					System.out.println("��峪������ 300G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ����� �ڵ������˴ϴ�.");
					thief.Gold-=300;
					thief.Power+=30;
					System.out.println("���� ������� : "+thief.Gold);
					System.out.println("���� ���ݷ�    : "+thief.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // ���� �����Ҷ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
				}
				System.out.println("");
			}
			else if(Num10 == 4)
			{
				if(thief.Gold>=400) //���̾Ƴ����� ����
				{	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav");
					System.out.println("���̾Ƴ������� 400G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ����� �ڵ������˴ϴ�.");
					thief.Gold-=400;
					thief.Power+=40;
					System.out.println("���� ������� : "+thief.Gold);
					System.out.println("���� ���ݷ�    : "+thief.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // ���� �����Ҷ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
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
				System.out.println("�߸������̽��ϴ�.");
			}
		
		}
		else if(List2 == 2)
		{	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�Һ�.wav");
			armor.Armor(); // �����ǰ �ҷ�����
			System.out.println("");
			System.out.println("�������������������������������������  ");
			System.out.println("���� ������� : "+thief.Gold);
			System.out.println("�������������������������������������  ");
			System.out.println("");
			System.out.println("");
			System.out.println("� ��ǰ�� ��ðڽ��ϱ�?");
			System.out.println("1. ���̾�Ƹ� / 2. �ǹ��Ƹ� / 3. ���Ƹ� / 4. ���̾ƾƸ� / 5. �ڷΰ��� / 6. ������ ���ư���");
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
				
				if(thief.Gold>=100) //���̾�Ƹ� ����
				{	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav");
					System.out.println("���̾�ƸӸ� 100G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ���� �ڵ������˴ϴ�.");
					thief.Gold-=100;
					thief.Depense+=10;
					System.out.println("���� ������� : "+thief.Gold);
					System.out.println("���� ����    : "+thief.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // ���� �����ҋ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
				}
				System.out.println("");
			}
			else if(Armor == 2)
			{
				if(thief.Gold>=200) //�ǹ��Ƹ� ����
				{	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav");
					System.out.println("�ǹ��ƸӸ� 200G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ���� �ڵ������˴ϴ�.");
					thief.Gold-=200;
					thief.Depense+=20;
					System.out.println("���� ������� : "+thief.Gold);
					System.out.println("���� ����    : "+thief.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // ���� �����Ҷ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
				}
				System.out.println("");
			}
			else if(Armor == 3)
			{
				if(thief.Gold>=300) //���Ƹ� ����
				{	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav");
					System.out.println("���ƸӸ� 300G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ���� �ڵ������˴ϴ�.");
					thief.Gold-=300;
					thief.Depense+=30;
					System.out.println("���� ������� : "+thief.Gold);
					System.out.println("���� ����    : "+thief.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					
				}
				else // ���� �����Ҷ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
				}
				System.out.println("");
			}
			else if(Armor == 4)
			{
				if(thief.Gold>=400) //���̾ƾƸ� ����
				{	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav");
					System.out.println("���̾ƾƸӸ� 400G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ���� �ڵ������˴ϴ�.");
					thief.Gold-=400;
					thief.Depense+=40;
					System.out.println("���� ������� : "+thief.Gold);
					System.out.println("���� ����    : "+thief.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // ���� �����Ҷ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
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
				System.out.println("�߸������̽��ϴ�.");
			}
			}
		else if(List2 == 3)
		{
			System.out.println("");
			break;
		}
		}	
	}
	void Arc_sto(Archer archer) { // ����
		Weapon weapon = new Weapon(); // ���� Ŭ���� ��ü����
		Armor armor = new Armor(); // �Ƹ� Ŭ���� ��ü����
		Media Town = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);

		
		System.out.println("");
		System.out.println(">>������ ���Ű��� ȯ���մϴ�!!");
		System.out.println(">>�������� �ʿ��� ��ǰ�� ��带 �̿��� �� �� �ֽ��ϴ�.");
		System.out.println("");
		
		
		
		while(true) 
		{
			System.out.println("1. ���� / 2. �� / 3. ������ ���ư���");
			int List3 = 0;
			try {
				List3 = scan.nextInt();
			} catch (Exception e) {
				
				scan = new Scanner(System.in);
				
				System.out.println("");
			}
		
		if(List3 == 1)
		{	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�Һ�.wav");
			weapon.Bow(); // �����ǰ �ҷ�����
			System.out.println("");
			System.out.println("�������������������������������������  ");
			System.out.println("���� ������� : "+archer.Gold);
			System.out.println("�������������������������������������  ");
			System.out.println("");
			System.out.println("");
			System.out.println("� ��ǰ�� ��ðڽ��ϱ�?");
			System.out.println("1. ���̾𺸿� / 2. �ǹ����� / 3. ��庸�� / 4. ���̾ƺ��� / 5. �ڷΰ��� / 6. ������ ���ư���");
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
				
				if(archer.Gold>=100) //���̾𺸿� ����
				{	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav");
					System.out.println("���̾𺸿츦 100G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ����� �ڵ������˴ϴ�.");
					archer.Gold-=100;
					archer.Power+=10;
					System.out.println("���� ������� : "+archer.Gold);
					System.out.println("���� ���ݷ�    : "+archer.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // ���� �����ҋ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
				}
				System.out.println("");
			}
			else if(Num11 == 2)
			{
				if(archer.Gold>=200) //�ǹ����� ����
				{	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav");
					System.out.println("�ǹ����츦 200G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ����� �ڵ������˴ϴ�.");
					archer.Gold-=200;
					archer.Power+=20;
					System.out.println("���� ������� : "+archer.Gold);
					System.out.println("���� ���ݷ�    : "+archer.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // ���� �����Ҷ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
				}
				System.out.println("");
			}
			else if(Num11 == 3)
			{
				if(archer.Gold>=300) //��庸�� ����
				{	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav");
					System.out.println("��庸�츦 300G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ����� �ڵ������˴ϴ�.");
					archer.Gold-=300;
					archer.Power+=30;
					System.out.println("���� ������� : "+archer.Gold);
					System.out.println("���� ���ݷ�    : "+archer.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // ���� �����Ҷ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
				}
				System.out.println("");
			}
			else if(Num11 == 4)
			{
				if(archer.Gold>=400) //���̾ƺ��� ����
				{	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav");
					System.out.println("���̾ƺ��츦 400G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ����� �ڵ������˴ϴ�.");
					archer.Gold-=400;
					archer.Power+=40;
					System.out.println("���� ������� : "+archer.Gold);
					System.out.println("���� ���ݷ�    : "+archer.Power);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // ���� �����Ҷ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
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
				System.out.println("�߸������̽��ϴ�.");
			}
		
		}
		else if(List3 == 2)
		{	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�Һ�.wav");
			armor.Armor(); // �����ǰ �ҷ�����
			System.out.println("");
			System.out.println("�������������������������������������  ");
			System.out.println("���� ������� : "+archer.Gold);
			System.out.println("�������������������������������������  ");
			System.out.println("");
			System.out.println("");
			System.out.println("� ��ǰ�� ��ðڽ��ϱ�?");
			System.out.println("1. ���̾�Ƹ� / 2. �ǹ��Ƹ� / 3. ���Ƹ� / 4. ���̾ƾƸ� / 5. �ڷΰ��� / 6. ������ ���ư���");
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
				
				if(archer.Gold>=100) //���̾�Ƹ� ����
				{	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav");
					System.out.println("���̾�ƸӸ� 100G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ���� �ڵ������˴ϴ�.");
					archer.Gold-=100;
					archer.Depense+=10;
					System.out.println("���� ������� : "+archer.Gold);
					System.out.println("���� ����    : "+archer.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // ���� �����ҋ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
				}
				System.out.println("");
			}
			else if(Armor == 2)
			{
				if(archer.Gold>=200) //�ǹ��Ƹ� ����
				{	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav");
					System.out.println("�ǹ��ƸӸ� 200G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ���� �ڵ������˴ϴ�.");
					archer.Gold-=200;
					archer.Depense+=20;
					System.out.println("���� ������� : "+archer.Gold);
					System.out.println("���� ����    : "+archer.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // ���� �����Ҷ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
				}
				System.out.println("");
			}
			else if(Armor == 3)
			{
				if(archer.Gold>=300) //���Ƹ� ����
				{	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav");
					System.out.println("���ƸӸ� 300G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ���� �ڵ������˴ϴ�.");
					archer.Gold-=300;
					archer.Depense+=30;
					System.out.println("���� ������� : "+archer.Gold);
					System.out.println("���� ����    : "+archer.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // ���� �����Ҷ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
				}
				System.out.println("");
			}
			else if(Armor == 4)
			{
				if(archer.Gold>=400) //���̾ƾƸ� ����
				{	Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav");
					System.out.println("���̾ƾƸӸ� 400G�� �����ϼ̽��ϴ�.");
					System.out.println("�����Ͻ� ���� �ڵ������˴ϴ�.");
					archer.Gold-=400;
					archer.Depense+=40;
					System.out.println("���� ������� : "+archer.Gold);
					System.out.println("���� ����    : "+archer.Depense);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
					try {
						Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/��������.wav");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Town.Stop();
				}
				else // ���� �����Ҷ�
				{
					System.out.println("");
					System.out.println("�����Ͻ� ��尡 �����մϴ�.");
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
				System.out.println("�߸������̽��ϴ�.");
			}
		}
		else if(List3 == 3)
		{
			System.out.println("");
			break;
		}
		else 
		{
			System.out.println("�߸������̽��ϴ�.");
		}
	}
}


		
		

}
