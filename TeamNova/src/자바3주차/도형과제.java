package �ڹ�3����;

import java.util.Scanner;

public class �������� {

	public static void main(String[] args) {

		System.out.println("�������� ũ�⸦ ������ �Է��ϼ��� .");
		System.out.print("�Է� : ");
		
		Scanner Rhombus_Scan = new Scanner(System.in);
		
		String Rhombus = Rhombus_Scan.nextLine();
		
		int Rhombus_Num = Integer.parseInt(Rhombus); //Rhombus = ������
		
		Rhombus_Num+=1; // 1�϶� ����� �ȳ��ͼ� 2���� ����
		
		for(int Tri = 0 ; Tri<Rhombus_Num ; Tri++) //������ �ﰢ�� Triangle
		{
			for(int Tri_Blank = Rhombus_Num ; Tri_Blank>Tri ; Tri_Blank--) //Tri ��ø���� �������� Num��ŭ �����ؼ� -1�� ����
			{
				System.out.print(" ");
			}
			
			for(int Tri_Dot = 0 ; Tri_Dot<Tri ; Tri_Dot++) // Tri ��ø���� 2��°�ٺ��� 1���� Tri������ŭ ����
			{
				System.out.print(".");
			}
			
			for(int Tri_Dot2 = 0 ;Tri_Dot2<Tri ; Tri_Dot2++) // Tri ��ø���� 2��°�ٺ��� 1���� Tri������ŭ ����
			{
				System.out.print(".");
			}
			System.out.println("."); // �� �ٲ𶧸��� 1���� ����
		}

		for (int Rev = 0 ; Rev<Rhombus_Num-1 ; Rev++) //������ ���ﰢ�� Reverse Triangle
		{		System.out.print(" ");					//�ﰢ���� 3�� ���ö� ���ﰢ���� 2�� ���;ߵǹǷ� -1
		
			for (int Rev_Blank = 0 ; Rev_Blank<=Rev ; Rev_Blank++) // ��ø���� �ٹٲ𶧸��� ���� 1���� ����
																															
			{
				System.out.print(" ");
			}
			for(int Rev_Dot = Rhombus_Num-2 ; Rev_Dot>Rev ; Rev_Dot--) // ���� Num���� Rev���� 1���� ����
			{
				System.out.print(".");
			}
			for(int Rev_Dot2 = Rhombus_Num-2 ; Rev_Dot2>Rev ; Rev_Dot2--) // ���� Num���� Rev���� 1���� ����
			{
				System.out.print(".");
			}
		
			System.out.println("."); //�� �ٲ𶧸��� 1���� ����
		}


		System.out.println("���� ũ�⸦ ������ �Է��ϼ��� .");
		System.out.print("�Է� : ");
		
		Scanner Star_Scan = new Scanner(System.in);
		
		String Star = Star_Scan.nextLine();
		
		int Star_Num = Integer.parseInt(Star); //Star = ��
	

		for(int Head=0; Head<Star_Num+3; Head++) //Star�� �Ӹ��κ� Head (���� 3���� , ���� 1����)
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
			for(int H_Two=0; H_Two<Head ; H_Two++)  // ù�κ��� �����ϰ� 2���� ����
			{
				System.out.print("aa");
			}
			if(Head==0)	//����� �ϳ� ����ϱ� ���ؼ� if�� ���
			{
				System.out.print("a");
			}
			System.out.println("");
		}

		for(int Body = 0 ; Body<Star_Num+2 ; Body++) //���� (���� 6���� ���� 2 ����)
		{	
			
			for(int B_Blank = 0 ; B_Blank<Body+3 ; B_Blank++) //������ ���� �ٹٲ𶧸��� 1ĭ�� ����
			{
				System.out.print(" ");
			}
			for(int B_Four= 0; B_Four<Body; B_Four++) //4ĭ�� ��� ��������
			{
				if(Body!=0) //0�� �����ϰ� 4ĭ�� ����
				{
					System.out.print("aaaa");	
				}
			}		
			for(int B_Six = Star_Num+2; B_Six>Body ; B_Six--) //6ĭ����� ��������
			{
				System.out.print("aaaaaa");
								
			}

			System.out.println("");
		}
		
		for(int Leg = 0 ; Leg<Star_Num+4 ; Leg++) //�ٸ� Leg
		{

			for(int L_Blank = Star_Num+4 ; L_Blank>Leg ; L_Blank--) // ���� 1���� ����
			{
				System.out.print(" ");
			}

			for(int L_Left = Star_Num+4 ; L_Left>Leg ; L_Left--)  //Num+4���� 1���� ����
			{
				System.out.print("a"); 			
			}

			for(int L_Left2 = Star_Num ; L_Left2>Leg ; L_Left2--) //Num���� 1�������� 
			{
				System.out.print("a"); 			
			}
			
			for(int L_Blank=0; L_Blank<1; L_Blank++) //������ Num���ڸ�ŭ 6���� , ������ 2���� 4������
			{
				System.out.print("  ");
				
			}	
			for(int L_Blank2 =0 ; L_Blank2<Leg ; L_Blank2++) //Leg�� Star_Num���� �۰ų������� 6������
			{
				if(Leg<=Star_Num) 
				{
					System.out.print("      ");
				}
				
			}
			for(int L_Blank3 =0 ; L_Blank3<Star_Num ; L_Blank3++) //Leg�� Star_Num���� Ŭ�� 6������
			{
				if(Leg>Star_Num)
				{
					System.out.print("      ");	
				}
				
			}		
			for(int L_Blank4 = Star_Num+1 ; L_Blank4<=Leg ; L_Blank4++) //������ 2��°�ٺ��� 4����
			{
				System.out.print("    ");
			}
			

			for(int L_Right = Star_Num+4 ; L_Right>Leg ; L_Right--) //�����ʴٸ�
			{
				System.out.print("a"); 			
			}
			for(int L_Right2 = Star_Num ; L_Right2>Leg ; L_Right2--) //�����ʴٸ�2
			{
				System.out.print("a"); 			
			}
			
			
			System.out.println("");
		}
		
	}

}
