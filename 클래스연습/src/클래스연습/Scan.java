package Ŭ��������;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stun
		System.out.println("����� ��ȯ���� �����ֽ��ϴ�.");
		System.out.println("��ȯ���� �� 3�����Դϴ�.");
		System.out.println("��ȯ���� ���� ������ �����ðڽ��ϱ�?");
		System.out.println("1. ��´� / 2. �ȵ�ڴ�.");
		int Num = 0;
		Scanner scan = new Scanner(System.in);
		Scan input = new Scan();
	
		
		while(true)
		{
			try {
				Num = scan.nextInt();
			} catch (Exception e) {
				
				scan = new Scanner(System.in);
				
				System.out.println("");
			}
		
		if(Num == 1)
		{
			System.out.println("");
			System.out.println("1. ��� : Į�� ����ϴ� �������� ��� �ҼӼ� �нú�� ü���� �����Ѵ�.");
			System.out.println("         1����ų : ������");
			System.out.println("         2����ų : �ϰ�");
			System.out.println("2. ���� : �߿��������� ���� ǳ�Ӽ� �нú�� ���Ͽ� ��ų�������� �����ϸ� "
									+   "�������� �̿��Ͽ� �ο����� ��ų�� �̿��Ͽ� ī��� ���� ��ġ���.");
			System.out.println("         1����ų : ī�峯����");
			System.out.println("         2����ų : ���� ����");
			System.out.println("3. �ü� : Ȱ�� �̿��Ͽ� ���� ��ġ��� �ü� �ҼӼ� �нú�� ���ݷ��� �����Ѵ� .");
			System.out.println("         1����ų : ����");
			System.out.println("         2����ų : ����ȭ��");
			System.out.println("");
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
		
		}
		
		

	
	
	
	
	}
	
		
		
	
	
	
	
	
	void Input(int i) {
		
	Scanner scan = new Scanner(System.in);

		try {
			i = scan.nextInt();
		} catch (Exception e) {
			
			scan = new Scanner(System.in);
			
			System.out.println("");
		}
	
	
		
		
	}
	}
	
