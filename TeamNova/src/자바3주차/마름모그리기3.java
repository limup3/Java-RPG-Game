package �ڹ�3����;

import java.util.Scanner;

public class ������׸���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] Small = {"  ."," ...","  ."}; // ������ ����ũ��
		String[] Medium = {"  ."," ...","....."," ...","  ."}; // ������ �߰�ũ��
		String[] Large = {"   .","  ..."," .....","......."," .....","  ...","   ."}; // ������ ūũ��
		
		System.out.println("������ ũ��");
		System.out.println("1. Small / 2. Medium / 3. Large");
		
		Scanner sc = new Scanner(System.in);
		
		String Rhombus = sc.nextLine();
		
		int Rhombus_Num = Integer.parseInt(Rhombus);
		
		if(Rhombus_Num == 1) //������ ����ũ��
		{
			for(int i = 0; i <Small.length; i++ )
			{
				System.out.println(Small[i]);
			}
				
		}
		else if(Rhombus_Num == 2) // ������ �߰�ũ��
		{
			for(int i = 0; i <Medium.length; i++ )
			{
				System.out.println(Medium[i]);
			}
		}
		
		else if(Rhombus_Num == 3) // ������ ūũ��
		{
			for(int i = 0; i <Large.length; i++ )
			{
				System.out.println(Large[i]);
			}
			
		}
		else {
			System.out.println("�߸������̽��ϴ�.");
		}
	}

}
