package Ŭ����;

import java.util.Scanner;



public class Inn {

	Scanner scan = new Scanner(System.in);
	
	
	

	
	public void inn(Knight knight) {
		Media Town = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);

		
		
		System.out.println("");
		System.out.println(">>������ ���Ű��� ȯ���մϴ�!!");
		System.out.println(">>�������� ������ ž���� ���� �Ƿε��� ȸ���Ҽ��ֽ��ϴ�.");
		System.out.println(">>��带 ���� �������� �޽��Ͻðڽ��ϱ�?");
		System.out.println("");
		System.out.println("�Ƿε� ���� :"+knight.Fatigue);
		System.out.println("");
		System.out.println("1. �� / 2. �ƴϿ�");
		int Num8 = 0;
		try {	
			Num8 = scan.nextInt();
		} catch (Exception e) {
			
			scan = new Scanner(System.in);
			
			System.out.println("");
		}
		if( Num8 ==1)
		{	Town.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav", +6.0f);
			knight.Gold-=10;
			knight.Fatigue=0;
			System.out.println("10��带 ���� �޽��� ���մϴ�.");
			System.out.println("���� ������� : "+knight.Gold);
			System.out.println("���� �Ƿε�    : "+knight.Fatigue);
			System.out.println("");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			Town.Stop();
			try {
				Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�Ƿε�ȸ��.wav");
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			Town.Stop();
		}
		else if(Num8 == 2)
		{	
			System.out.println("������ ���ư��ϴ�.");
			System.out.println();
			
		}
		
	}
		public void Arc_in(Archer archer) {
			Media Town = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);



			System.out.println("");
			System.out.println(">>������ ���Ű��� ȯ���մϴ�!!");
			System.out.println(">>�������� ������ ž���� ���� �Ƿε��� ȸ���Ҽ��ֽ��ϴ�.");
			System.out.println(">>��带 ���� �������� �޽��Ͻðڽ��ϱ�?");
			System.out.println("");
			System.out.println("�Ƿε� ���� :"+archer.Fatigue);
			System.out.println("");
			System.out.println("1. �� / 2. �ƴϿ�");
			int Num14 = 0;
			try {	
				Num14 = scan.nextInt();
			} catch (Exception e) {
				
				scan = new Scanner(System.in);
				
				System.out.println("");
			}
			if( Num14==1)
			{
				Town.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav", +6.0f);
			archer.Gold-=10;
			archer.Fatigue=0;
			System.out.println("10��带 ���� �޽��� ���մϴ�.");
			System.out.println("���� ������� : "+archer.Gold);
			System.out.println("���� �Ƿε�    : "+archer.Fatigue);
			System.out.println("");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			Town.Stop();
			try {
				Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�Ƿε�ȸ��.wav");
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			Town.Stop();
			}
		else if(Num14== 2)
		{
			System.out.println("������ ���ư��ϴ�.");
			System.out.println();
		}
		}
	
		public void Thi_in(Thief thief) {
			Media Town = new Media(); //���Ǿ����� ��ü�� test.setDaemon(true);


		System.out.println("");
		System.out.println(">>������ ���Ű��� ȯ���մϴ�!!");
		System.out.println(">>�������� ������ ž���� ���� �Ƿε��� ȸ���Ҽ��ֽ��ϴ�.");
		System.out.println(">>��带 ���� �������� �޽��Ͻðڽ��ϱ�?");
		System.out.println("");
		System.out.println("�Ƿε� ���� :"+thief.Fatigue);
		System.out.println("");
		System.out.println("1. �� / 2. �ƴϿ�");
		int Num13 = 0;
		try {	
			Num13 = scan.nextInt();
		} catch (Exception e) {
			
			scan = new Scanner(System.in);
			
			System.out.println("");
		}
		if( Num13==1)
		{
			Town.Volume("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/���Ҹ�.wav", +6.0f);
			thief.Gold-=10;
			thief.Fatigue=0;
			System.out.println("10��带 ���� �޽��� ���մϴ�.");
			System.out.println("���� ������� : "+thief.Gold);
			System.out.println("���� �Ƿε�    : "+thief.Fatigue);
			System.out.println("");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			Town.Stop();
			try {
				Town.One("C:/Users/KM-notebook/Desktop/�����/5���� �ڹ� ������/wav/�Ƿε�ȸ��.wav");
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			Town.Stop();
		}
		else if(Num13== 2)
		{
			System.out.println("������ ���ư��ϴ�.");
			System.out.println();
		}
	}
}
