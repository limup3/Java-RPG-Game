package Ŭ��������;

public class ����5 {

	public static void main(String[] args) {
		void store3(Archer archer) {
			Weapon weapon = new Weapon(); // ���� Ŭ���� ��ü����
			Armor armor = new Armor(); // �Ƹ� Ŭ���� ��ü����
			
			
			System.out.println("");
			System.out.println(">>������ ���Ű��� ȯ���մϴ�!!");
			System.out.println(">>�������� �ʿ��� ��ǰ�� ��带 �̿��� �� �� �ֽ��ϴ�.");
			System.out.println("");
			
			
			System.out.println("1. ���� / 2. ��");
			int List3 = scan.nextInt(); //��ĳ�� �Է�
			if(List3 == 1)
			{
				weapon.Bow(); // �����ǰ �ҷ�����
				System.out.println("");
				System.out.println("� ��ǰ�� ��ðڽ��ϱ�?");
				System.out.println("1. ���̾𺸿� / 2. �ǹ����� / 3. ��庸�� / 4. ���̾ƺ���");
				int Num11 = scan.nextInt(); //��ĳ�� �Է�
				if(Num11 == 1 )
				{
					
					if(archer.Gold>=100) //���̾𺸿� ����
					{
						System.out.println("���̾𺸿츦 100G�� �����ϼ̽��ϴ�.");
						System.out.println("�����Ͻ� ����� �ڵ������˴ϴ�.");
						archer.Gold-=100;
						archer.Power+=10;
						System.out.println("���� ������� : "+archer.Gold);
						System.out.println("���� ���ݷ�    : "+archer.Power);
					}
					else // ���� �����ҋ�
					{
						System.out.println("");
						System.out.println("�����Ͻ� ��尡 �����մϴ�. �������� �i�ܳ��ϴ�.");
					}
					System.out.println("");
				}
				else if(Num11 == 2)
				{
					if(archer.Gold>=200) //�ǹ����� ����
					{
						System.out.println("�ǹ����츦 200G�� �����ϼ̽��ϴ�.");
						System.out.println("�����Ͻ� ����� �ڵ������˴ϴ�.");
						archer.Gold-=200;
						archer.Power+=20;
						System.out.println("���� ������� : "+archer.Gold);
						System.out.println("���� ���ݷ�    : "+archer.Power);
					}
					else // ���� �����Ҷ�
					{
						System.out.println("");
						System.out.println("�����Ͻ� ��尡 �����մϴ�. �������� �i�ܳ��ϴ�.");
					}
					System.out.println("");
				}
				else if(Num11 == 3)
				{
					if(archer.Gold>=300) //��庸�� ����
					{
						System.out.println("��庸�츦 300G�� �����ϼ̽��ϴ�.");
						System.out.println("�����Ͻ� ����� �ڵ������˴ϴ�.");
						archer.Gold-=300;
						archer.Power+=30;
						System.out.println("���� ������� : "+archer.Gold);
						System.out.println("���� ���ݷ�    : "+archer.Power);
					}
					else // ���� �����Ҷ�
					{
						System.out.println("");
						System.out.println("�����Ͻ� ��尡 �����մϴ�. �������� �i�ܳ��ϴ�.");
					}
					System.out.println("");
				}
				else if(Num11 == 4)
				{
					if(archer.Gold>=400) //���̾ƺ��� ����
					{
						System.out.println("���̾ƺ��츦 400G�� �����ϼ̽��ϴ�.");
						System.out.println("�����Ͻ� ����� �ڵ������˴ϴ�.");
						archer.Gold-=400;
						archer.Power+=40;
						System.out.println("���� ������� : "+archer.Gold);
						System.out.println("���� ���ݷ�    : "+archer.Power);
					}
					else // ���� �����Ҷ�
					{
						System.out.println("");
						System.out.println("�����Ͻ� ��尡 �����մϴ�. �������� �i�ܳ��ϴ�.");
					}
					System.out.println("");
				}
			
			}
			else if(List3 == 2)
			{
				armor.Armor(); // �����ǰ �ҷ�����
				System.out.println("");
				System.out.println("� ��ǰ�� ��ðڽ��ϱ�?");
				System.out.println("1. ���̾�Ƹ� / 2. �ǹ��Ƹ� / 3. ���Ƹ� / 4. ���̾ƾƸ�");
				int Armor = scan.nextInt(); //��ĳ�� �Է�
				if(Armor == 1 )
				{
					
					if(archer.Gold>=100) //���̾�Ƹ� ����
					{
						System.out.println("���̾�ƸӸ� 100G�� �����ϼ̽��ϴ�.");
						System.out.println("�����Ͻ� ���� �ڵ������˴ϴ�.");
						archer.Gold-=100;
						archer.Depense+=10;
						System.out.println("���� ������� : "+archer.Gold);
						System.out.println("���� ����    : "+archer.Depense);
					}
					else // ���� �����ҋ�
					{
						System.out.println("");
						System.out.println("�����Ͻ� ��尡 �����մϴ�. �������� �i�ܳ��ϴ�.");
					}
					System.out.println("");
				}
				else if(Armor == 2)
				{
					if(archer.Gold>=200) //�ǹ��Ƹ� ����
					{
						System.out.println("�ǹ��ƸӸ� 200G�� �����ϼ̽��ϴ�.");
						System.out.println("�����Ͻ� ���� �ڵ������˴ϴ�.");
						archer.Gold-=200;
						archer.Depense+=20;
						System.out.println("���� ������� : "+archer.Gold);
						System.out.println("���� ����    : "+archer.Depense);
					}
					else // ���� �����Ҷ�
					{
						System.out.println("");
						System.out.println("�����Ͻ� ��尡 �����մϴ�. �������� �i�ܳ��ϴ�.");
					}
					System.out.println("");
				}
				else if(Armor == 3)
				{
					if(archer.Gold>=300) //���Ƹ� ����
					{
						System.out.println("���ƸӸ� 300G�� �����ϼ̽��ϴ�.");
						System.out.println("�����Ͻ� ���� �ڵ������˴ϴ�.");
						archer.Gold-=300;
						archer.Depense+=30;
						System.out.println("���� ������� : "+archer.Gold);
						System.out.println("���� ����    : "+archer.Depense);
					}
					else // ���� �����Ҷ�
					{
						System.out.println("");
						System.out.println("�����Ͻ� ��尡 �����մϴ�. �������� �i�ܳ��ϴ�.");
					}
					System.out.println("");
				}
				else if(Armor == 4)
				{
					if(archer.Gold>=400) //���̾ƾƸ� ����
					{
						System.out.println("���̾ƾƸӸ� 400G�� �����ϼ̽��ϴ�.");
						System.out.println("�����Ͻ� ���� �ڵ������˴ϴ�.");
						archer.Gold-=400;
						archer.Depense+=40;
						System.out.println("���� ������� : "+archer.Gold);
						System.out.println("���� ����    : "+archer.Depense);
					}
					else // ���� �����Ҷ�
					{
						System.out.println("");
						System.out.println("�����Ͻ� ��尡 �����մϴ�. �������� �i�ܳ��ϴ�.");
					}
					System.out.println("");
				}
			}
		
		}

	}

}
