package Ŭ��������;

import java.util.Scanner;

public class ����2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Knight knight = new Knight();//��� Ŭ���� �ν��Ͻ� ����
		NormalMonster normalMonster = new NormalMonster();//�븻���� Ŭ���� �ҷ�����
		System.out.println("");
		System.out.println("�������!!");
		System.out.println("");
		normalMonster.Bat();
		System.out.println("");
		System.out.println("######################");
		System.out.println("1. �����ϱ�");
		
		int Battle_Bat = scan.nextInt();
		
		while(true) { //���� �ݺ�
			if(Battle_Bat == 1)
			{	System.out.println("");
				System.out.println("��ȯ��"+"�� �����Դϴ�.");
				normalMonster.Attacked_Bat(knight.Attack());
				System.out.println("���� ü�� : "+normalMonster.Hp_Bat);

				//������ ü���� 0���� �۰ų� ���� ���				
				if(normalMonster.Hp_Bat<=0)
				{	
					System.out.println("");
					System.out.println("���㰡 �׾����ϴ�.");
					System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
					knight.Gold+=normalMonster.Gold;
					break;
				}
				System.out.println("");
				System.out.println("������ �����Դϴ�.");
				knight.Attacked(normalMonster.Attack());
				System.out.println("��ȯ��"+" ü�� : "+knight.Hp);
				if(knight.Hp <=0)
				{	System.out.println("");
					System.out.println("��ȯ��"+"�� �׾����ϴ�.");
					//����ü�� 1�� �����.
					knight.Hp = 1;
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
				normalMonster.Attacked_Snail(knight.Attack());
				System.out.println("������ ü�� : "+normalMonster.Hp_Snail);
				//������ ü���� 0���� �۰ų� ���� ���
				
				if(normalMonster.Hp_Snail<=0)
				{	
					System.out.println("");
					System.out.println("�����̰� �׾����ϴ�.");
					System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
					knight.Gold+=normalMonster.Gold;
					break;
				}
				System.out.println("");
				System.out.println("�������� �����Դϴ�.");
				System.out.println("");
				knight.Attacked(normalMonster.Attack());
				System.out.println("��ȯ��"+" ü�� : "+knight.Hp);
				if(knight.Hp <=0)
				{	System.out.println("");
					System.out.println("��ȯ��"+"�� �׾����ϴ�.");
					//����ü�� 1�� �����.
					knight.Hp = 1;
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
				normalMonster.Attacked_Rabbit(knight.Attack());
				System.out.println("�䳢 ü�� : "+normalMonster.Hp_Rabbit);
				//������ ü���� 0���� �۰ų� ���� ���
				
				if(normalMonster.Hp_Rabbit<=0)
				{	
					System.out.println("");
					System.out.println("�䳢�� �׾����ϴ�.");
					System.out.println("���Ͱ��"+normalMonster.Gold+"�� ȹ���ϼ̽��ϴ�.");
					knight.Gold+=normalMonster.Gold;
					break;
				}
				System.out.println("");
				System.out.println("�䳢�� �����Դϴ�.");
				knight.Attacked(normalMonster.Attack());
				System.out.println("��ȯ��"+" ü�� : "+knight.Hp);
				if(knight.Hp <=0)
				{	System.out.println("");
					System.out.println("��ȯ��"+"�� �׾����ϴ�.");
					//����ü�� 1�� �����.
					knight.Hp = 1;
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
		knight.Fatigue+=40;
		System.out.println(">>������ ž 1���� Ŭ�����ϼ̽��ϴ�!!!!");
		System.out.println(">>������ ���ϴ�.");
		System.out.println("");
		
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
			
			knight.knight();
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
			store.store(knight);
		}
			
		else if(Floor2 ==3) //����
		{
			Inn Inn = new Inn();
			Inn.inn(knight);
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
		
	}

}
