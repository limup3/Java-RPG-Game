package �ڹ�3����;

import java.util.Scanner;

public class ����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� ũ�⸦ ������ �Է��ϼ��� .");
		System.out.print("�Է� : ");
		
		Scanner Star_Scan = new Scanner(System.in);
		
		String Star = Star_Scan.nextLine();
		
		int Star_Num = Integer.parseInt(Star); //Star = ��
	

		for(int Head=0; Head<Star_Num+3; Head++) //Star�� �Ӹ��κ� Head
		{
			for(int H_Blank=Star_Num+3; H_Blank>Head; H_Blank--) //���� Num+3���� Head���� 2ĭ�� ���� �ٹٲ���� ȸ���� ����
			{
				System.out.print("  ");
			}
			for(int H_Blank2 =0; H_Blank2<1; H_Blank2++) // ���� 1ĭ������ 1ȸ�� (�Ʒ� ����� ���� ���߱����� ���)
			{
				System.out.print(" ");
			}
			for(int H_Blank3=0; H_Blank3<Head; H_Blank3++) // 0���� Head��ŭ ȸ���Ͽ� 2ĭ�� ����
			{
				System.out.print("  ");
			}
			for(int H_Blank4=Star_Num+3; H_Blank4>Head; H_Blank4--) //Four
			{		
				if(H_Blank4!=Head+1) // �������κ� ���� Num+3���� Head��ŭ ȸ���Ͽ� 1ĭ�� ����
				{
					System.out.print(" "); 
				}
			}
			for(int H_two=0; H_two<Head ; H_two++)  // ù�κ��� �����ϰ� 2���� ����
			{
				System.out.print("aa");
			}
			if(Head==0)	//����� �ϳ� ����ϱ� ���ؼ� if�� ���
			{
				System.out.print("a");
			}
			System.out.println("");
		}
	}

}
