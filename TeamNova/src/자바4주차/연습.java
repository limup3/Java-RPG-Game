package �ڹ�4����;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		NormalMonster normalMonster = new NormalMonster();//�븻���� Ŭ���� �ҷ�����
		Knight knight = new Knight(); // ��� Ŭ���� �ҷ�����
		System.out.println("�������!!");

		
		System.out.println("");
		System.out.println("######################");
		System.out.println("1. �����ϱ� / 2. �������â");

		int Num3 = scan.nextInt();

		
		while(true) {
			if(Num3 == 1)
			{	System.out.println("");
				System.out.println("������ �����Դϴ�.");
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
				System.out.println(" ����ü�� : "+knight.Hp);
				if(knight.Hp <=0)
				{	System.out.println("");
					System.out.println("������ �׾����ϴ�.");
					//����ü�� 1�� �����.
					knight.Hp = 1;
					System.out.println("������ ü�� 1�� ��Ȱ�Ͽ����ϴ�.");
					break;
				}
			}
			else if(Num3 ==2 )
			{
				System.out.println("���㽺��");
				normalMonster.Bat();
				System.out.println("1.�ڷΰ���");
				break;
				
			}
			else
			{
				System.out.println("�߸������̽��ϴ�.");
			}
		}
	}

}
